package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.minecraft.world.level.levelgen.Heightmap;

import java.util.List;

public final class OrderOfObsidianWorldgen {
    /** Taille maximale (en blocs) d'un patch d'end depthstone. */
    private static final int END_DEPTHSTONE_PATCH_SIZE = 33;
    /** Nombre de tentatives de patch par chunk. */
    private static final int END_DEPTHSTONE_PATCH_COUNT = 12;
    /** Nombre de tentatives de generation d'arbres Yew par chunk. */
    private static final int YEW_TREE_COUNT = 1;

    public static final ResourceKey<ConfiguredFeature<?, ?>> OXYS_ORE = configuredFeatureKey("oxys_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DEPTHSTONE_PATCH = configuredFeatureKey("end_depthstone_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YEW_TREE = configuredFeatureKey("yew_tree");

    public static final ResourceKey<PlacedFeature> OXYS_ORE_PLACED = placedFeatureKey("oxys_ore");
    public static final ResourceKey<PlacedFeature> END_DEPTHSTONE_PATCH_PLACED = placedFeatureKey("end_depthstone_patch");
    public static final ResourceKey<PlacedFeature> YEW_TREE_PLACED = placedFeatureKey("yew_tree");

    public static final ResourceKey<BiomeModifier> ADD_END_ORES = biomeModifierKey("add_end_ores");
    public static final ResourceKey<BiomeModifier> ADD_YEW_TREE = biomeModifierKey("add_yew_tree");

    private OrderOfObsidianWorldgen() {
    }

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> _context)
    {
        _context.register(OXYS_ORE, new ConfiguredFeature<>(ModFeatures.OXYS_ORE.get(), NoneFeatureConfiguration.INSTANCE));

        // Patch de roche plus dure : remplace uniquement l'end stone, jamais l'oxys deja pose.
        _context.register(END_DEPTHSTONE_PATCH, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                new BlockMatchTest(Blocks.END_STONE),
                ModBlocks.END_DEPHSTONE.get().defaultBlockState(),
                END_DEPTHSTONE_PATCH_SIZE
        )));

        _context.register(YEW_TREE, new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YEW_LOG.get()),
                new StraightTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.simple(Blocks.END_STONE)
        ).ignoreVines().build()));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> _context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = _context.lookup(Registries.CONFIGURED_FEATURE);


        _context.register(OXYS_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(OXYS_ORE),
                List.of(
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100)),
                        BiomeFilter.biome()
                )
        ));

        _context.register(END_DEPTHSTONE_PATCH_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(END_DEPTHSTONE_PATCH),
                List.of(
                        CountPlacement.of(END_DEPTHSTONE_PATCH_COUNT),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome()
                )
        ));


        _context.register(YEW_TREE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(YEW_TREE),
                List.of(
                        CountPlacement.of(YEW_TREE_COUNT),
                        InSquarePlacement.spread(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES),
                        BlockPredicateFilter.forPredicate(
                                BlockPredicate.matchesTag(new Vec3i(0, -1, 0), ModTags.Blocks.SUPPORTS_YEW)
                        ),
                        BiomeFilter.biome()
                )
        ));
    }

    public static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> _context)
    {
        HolderGetter<Biome> biomes = _context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = _context.lookup(Registries.PLACED_FEATURE);

        _context.register(ADD_END_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.END_HIGHLANDS),
                        biomes.getOrThrow(Biomes.END_MIDLANDS),
                        biomes.getOrThrow(Biomes.END_BARRENS),
                        biomes.getOrThrow(Biomes.SMALL_END_ISLANDS),
                        biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)
                ),
                HolderSet.direct(
                        placedFeatures.getOrThrow(END_DEPTHSTONE_PATCH_PLACED),
                        placedFeatures.getOrThrow(OXYS_ORE_PLACED)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        _context.register(ADD_YEW_TREE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(YEW_TREE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey(String _name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, OrderOfObsidian.id(_name));
    }

    private static ResourceKey<PlacedFeature> placedFeatureKey(String _name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, OrderOfObsidian.id(_name));
    }

    private static ResourceKey<BiomeModifier> biomeModifierKey(String _name)
    {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, OrderOfObsidian.id(_name));
    }
}

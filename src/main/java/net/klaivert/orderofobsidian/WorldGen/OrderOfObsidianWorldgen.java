package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FossilFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule;
import net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest;

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
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRACKEN_BUSH = configuredFeatureKey("bracken_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_BONE_FOSSIL = configuredFeatureKey("ancient_bone_fossil");

    public static final ResourceKey<PlacedFeature> OXYS_ORE_PLACED = placedFeatureKey("oxys_ore");
    public static final ResourceKey<PlacedFeature> END_DEPTHSTONE_PATCH_PLACED = placedFeatureKey("end_depthstone_patch");
    public static final ResourceKey<PlacedFeature> YEW_TREE_PLACED = placedFeatureKey("yew_tree");
    public static final ResourceKey<PlacedFeature> BRACKEN_BUSH_PLACED = placedFeatureKey("bracken_bush");
    public static final ResourceKey<PlacedFeature> ANCIENT_BONE_FOSSIL_PLACED = placedFeatureKey("ancient_bone_fossil");

    public static final ResourceKey<BiomeModifier> ADD_END_ORES = biomeModifierKey("add_end_ores");
    public static final ResourceKey<BiomeModifier> ADD_YEW_TREE = biomeModifierKey("add_yew_tree");
    public static final ResourceKey<BiomeModifier> ADD_BRACKEN_BUSH = biomeModifierKey("add_bracken_bush");
    public static final ResourceKey<BiomeModifier> ADD_ANCIENT_BONE_FOSSIL = biomeModifierKey("add_ancient_bone_fossil");
    public static final ResourceKey<StructureProcessorList> ANCIENT_BONE_PROCESSORS = ResourceKey.create(Registries.PROCESSOR_LIST, OrderOfObsidian.id("ancient_bone_fossil"));

    private OrderOfObsidianWorldgen() {
    }



    public static void bootstrapProcessorLists(BootstrapContext<StructureProcessorList> context) {
        context.register(
                ANCIENT_BONE_PROCESSORS,
                new StructureProcessorList(List.of(
                        new RuleProcessor(List.of(
                                new ProcessorRule(
                                        new BlockMatchTest(Blocks.BONE_BLOCK),
                                        AlwaysTrueTest.INSTANCE,
                                        ModBlocks.ANCIENT_BONE.get().defaultBlockState()
                                ),
                                new ProcessorRule(
                                        new BlockMatchTest(Blocks.COAL_ORE),
                                        AlwaysTrueTest.INSTANCE,
                                        ModBlocks.ANCIENT_BONE.get().defaultBlockState()
                                )
                        ))
                ))
        );
    }
    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> _context)
    {
        HolderGetter<StructureProcessorList> processorLists = _context.lookup(Registries.PROCESSOR_LIST);
        Holder<StructureProcessorList> ancientBoneProcessors = processorLists.getOrThrow(ANCIENT_BONE_PROCESSORS);

        _context.register(OXYS_ORE, new ConfiguredFeature<>(ModFeatures.OXYS_ORE.get(), NoneFeatureConfiguration.INSTANCE));

         _context.register(END_DEPTHSTONE_PATCH, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                new BlockMatchTest(Blocks.END_STONE),
                ModBlocks.END_DEPHSTONE.get().defaultBlockState(),
                END_DEPTHSTONE_PATCH_SIZE
        )));

        _context.register(
                YEW_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(ModBlocks.YEW_LOG.get()),
                                new BendingTrunkPlacer(8, 3, 2, 3, UniformInt.of(1, 3)),
                                BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                                new RandomSpreadFoliagePlacer(
                                        ConstantInt.of(2),
                                        ConstantInt.of(4),
                                        ConstantInt.of(3),
                                        60
                                ),
                                new TwoLayersFeatureSize(3, 1, 6),
                                BlockStateProvider.simple(Blocks.AIR)
                        ).ignoreVines().build()
                )
        );

        _context.register(BRACKEN_BUSH, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRACKEN_BUSH.get()))));


        _context.register(ANCIENT_BONE_FOSSIL, new ConfiguredFeature<>(Feature.FOSSIL,
                new FossilFeatureConfiguration(
                        List.of(
                                Identifier.withDefaultNamespace("fossil/spine_1"),
                                Identifier.withDefaultNamespace("fossil/spine_2"),
                                Identifier.withDefaultNamespace("fossil/spine_3"),
                                Identifier.withDefaultNamespace("fossil/spine_4"),
                                Identifier.withDefaultNamespace("fossil/skull_1"),
                                Identifier.withDefaultNamespace("fossil/skull_2"),
                                Identifier.withDefaultNamespace("fossil/skull_3"),
                                Identifier.withDefaultNamespace("fossil/skull_4")
                        ),
                        List.of(
                                Identifier.withDefaultNamespace("fossil/spine_1_coal"),
                                Identifier.withDefaultNamespace("fossil/spine_2_coal"),
                                Identifier.withDefaultNamespace("fossil/spine_3_coal"),
                                Identifier.withDefaultNamespace("fossil/spine_4_coal"),
                                Identifier.withDefaultNamespace("fossil/skull_1_coal"),
                                Identifier.withDefaultNamespace("fossil/skull_2_coal"),
                                Identifier.withDefaultNamespace("fossil/skull_3_coal"),
                                Identifier.withDefaultNamespace("fossil/skull_4_coal")
                        ),
                        ancientBoneProcessors,
                        ancientBoneProcessors,
                        4
                )
        ));
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


        _context.register(
                YEW_TREE_PLACED,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(YEW_TREE),
                        List.of(
                                CountPlacement.of(YEW_TREE_COUNT),
                                InSquarePlacement.spread(),
                                HeightmapPlacement.onHeightmap(
                                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
                                ),
                                BlockPredicateFilter.forPredicate(
                                        BlockPredicate.matchesTag(
                                                new Vec3i(0, -1, 0),
                                                ModTags.Blocks.SUPPORTS_YEW
                                        )
                                ),
                                BiomeFilter.biome()
                        )
                )
        );

        _context.register(BRACKEN_BUSH_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(BRACKEN_BUSH),
                List.of(
                        CountPlacement.of(4),
                        InSquarePlacement.spread(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES),
                        BlockPredicateFilter.forPredicate(
                                BlockPredicate.matchesTag(new Vec3i(0, -1, 0), ModTags.Blocks.SUPPORTS_YEW)
                        ),
                        BiomeFilter.biome()
                )
        ));

        _context.register(ANCIENT_BONE_FOSSIL_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(ANCIENT_BONE_FOSSIL),
                List.of(
                        CountPlacement.of(1),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)),
                        RarityFilter.onAverageOnceEvery(64),
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

        _context.register(ADD_BRACKEN_BUSH, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)),
                HolderSet.direct(placedFeatures.getOrThrow(BRACKEN_BUSH_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        _context.register(ADD_ANCIENT_BONE_FOSSIL, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.END_HIGHLANDS),
                        biomes.getOrThrow(Biomes.END_MIDLANDS),
                        biomes.getOrThrow(Biomes.END_BARRENS),
                        biomes.getOrThrow(Biomes.SMALL_END_ISLANDS),
                        biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(ANCIENT_BONE_FOSSIL_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_STRUCTURES
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

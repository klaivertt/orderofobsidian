package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public final class OrderOfObsidianWorldgen {
    /** Taille maximale (en blocs) d'un patch d'end depthstone. */
    private static final int END_DEPTHSTONE_PATCH_SIZE = 33;
    /** Nombre de tentatives de patch par chunk. */
    private static final int END_DEPTHSTONE_PATCH_COUNT = 12;

    public static final ResourceKey<ConfiguredFeature<?, ?>> OXYS_ORE = configuredFeatureKey("oxys_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DEPTHSTONE_PATCH = configuredFeatureKey("end_depthstone_patch");

    public static final ResourceKey<PlacedFeature> OXYS_ORE_PLACED = placedFeatureKey("oxys_ore");
    public static final ResourceKey<PlacedFeature> END_DEPTHSTONE_PATCH_PLACED = placedFeatureKey("end_depthstone_patch");

    public static final ResourceKey<BiomeModifier> ADD_OXYS_ORE = biomeModifierKey("add_oxys_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_DEPTHSTONE_PATCH = biomeModifierKey("add_end_depthstone_patch");

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
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> _context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = _context.lookup(Registries.CONFIGURED_FEATURE);


        _context.register(OXYS_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(OXYS_ORE),
                List.of(
                        InSquarePlacement.spread(),
                        BiomeFilter.biome()
                )
        ));

        // L'End va de y=0 a y=255 mais les iles tiennent dans la moitie basse : inutile de tirer plus haut.
        _context.register(END_DEPTHSTONE_PATCH_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(END_DEPTHSTONE_PATCH),
                List.of(
                        CountPlacement.of(END_DEPTHSTONE_PATCH_COUNT),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome()
                )
        ));
    }

    public static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> _context)
    {
        HolderGetter<Biome> biomes = _context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = _context.lookup(Registries.PLACED_FEATURE);

        _context.register(ADD_OXYS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.END_HIGHLANDS),
                        biomes.getOrThrow(Biomes.END_MIDLANDS),
                        biomes.getOrThrow(Biomes.END_BARRENS),
                        biomes.getOrThrow(Biomes.SMALL_END_ISLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(OXYS_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        _context.register(ADD_END_DEPTHSTONE_PATCH, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(END_DEPTHSTONE_PATCH_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
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

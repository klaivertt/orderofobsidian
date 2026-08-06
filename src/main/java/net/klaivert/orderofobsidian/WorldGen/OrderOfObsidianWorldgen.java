package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FossilFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.List;
import java.util.function.Supplier;

import static net.klaivert.orderofobsidian.WorldGen.ModOreData.*;

public final class OrderOfObsidianWorldgen {

    private static final int END_DEPTHSTONE_PATCH_SIZE = 33;
    private static final int END_DEPTHSTONE_PATCH_COUNT = 12;
    private static final int YEW_TREE_COUNT = 1;
    private static final int END_MOSS_GRASS_COUNT = 2;
    private static final int TWISTED_END_MOSS_GRASS_COUNT = 2;

    //Ore gen
    public static final ResourceKey<BiomeModifier> ADD_END_ORES =
            biomeModifierKey("add_end_ores");

    public static final RuleTest STONE_ORE_REPLACEABLES =
            new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

    public static final RuleTest DEEPSLATE_ORE_REPLACEABLES =
            new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

    //OXYS
    public static final ResourceKey<ConfiguredFeature<?, ?>> OXYS_ORE =
            configuredFeatureKey("oxys_ore");
    public static final ResourceKey<PlacedFeature> OXYS_ORE_PLACED =
            placedFeatureKey("oxys_ore");


    //DEPTHSTONE
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DEPTHSTONE_PATCH =
            configuredFeatureKey("end_depthstone_patch");

    public static final ResourceKey<PlacedFeature> END_DEPTHSTONE_PATCH_PLACED =
            placedFeatureKey("end_depthstone_patch");

    //TREE
    public static final ResourceKey<ConfiguredFeature<?, ?>> YEW_TREE =
            configuredFeatureKey("yew_tree");

    public static final ResourceKey<PlacedFeature> YEW_TREE_PLACED =
            placedFeatureKey("yew_tree");

    public static final ResourceKey<BiomeModifier> ADD_YEW_TREE =
            biomeModifierKey("add_yew_tree");

    //PLANT
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRACKEN_BUSH =
            configuredFeatureKey("bracken_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_MOSS_GRASS =
            configuredFeatureKey("end_moss_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TWISTED_END_MOSS_GRASS =
            configuredFeatureKey("twisted_end_moss_grass");

    public static final ResourceKey<PlacedFeature> BRACKEN_BUSH_PLACED =
            placedFeatureKey("bracken_bush");
    public static final ResourceKey<PlacedFeature> END_MOSS_GRASS_PLACED =
            placedFeatureKey("end_moss_grass");
    public static final ResourceKey<PlacedFeature> TWISTED_END_MOSS_GRASS_PLACED =
            placedFeatureKey("twisted_end_moss_grass");

    public static final ResourceKey<BiomeModifier> ADD_BRACKEN_BUSH =
            biomeModifierKey("add_bracken_bush");
    public static final ResourceKey<BiomeModifier> ADD_END_MOSS_GRASS =
            biomeModifierKey("add_end_moss_grass");
    public static final ResourceKey<BiomeModifier> ADD_TWISTED_END_MOSS_GRASS =
            biomeModifierKey("add_twisted_end_moss_grass");

    //ANCIENT BONE FOSSIL
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_BONE_FOSSIL =
            configuredFeatureKey("ancient_bone_fossil");

    public static final ResourceKey<PlacedFeature> ANCIENT_BONE_FOSSIL_PLACED =
            placedFeatureKey("ancient_bone_fossil");

    public static final ResourceKey<BiomeModifier> ADD_ANCIENT_BONE_FOSSIL =
            biomeModifierKey("add_ancient_bone_fossil");

    public static final ResourceKey<StructureProcessorList> ANCIENT_BONE_PROCESSORS =
            ResourceKey.create(Registries.PROCESSOR_LIST, OrderOfObsidian.id("ancient_bone_fossil"));

    //Ancient Iceberg
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_ICEBERG =
            configuredFeatureKey("ancient_iceberg");
    public static final ResourceKey<PlacedFeature> ANCIENT_ICEBERG_PLACED =
            placedFeatureKey("ancient_iceberg");
    public static final ResourceKey<BiomeModifier> ADD_ANCIENT_ICEBERG =
            biomeModifierKey("add_ancient_iceberg");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_ICE_POCKET =
            configuredFeatureKey("ancient_ice_pocket");
    public static final ResourceKey<PlacedFeature> ANCIENT_ICE_POCKET_PLACED =
            placedFeatureKey("ancient_ice_pocket");
    public static final ResourceKey<BiomeModifier> ADD_ANCIENT_ICE_POCKET =
            biomeModifierKey("add_ancient_ice_pocket");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ICY_END_STONE_OUTER_POCKET =
            configuredFeatureKey("icy_end_stone_outer_pocket");
    public static final ResourceKey<PlacedFeature> ICY_END_STONE_OUTER_POCKET_PLACED =
            placedFeatureKey("icy_end_stone_outer_pocket");
    public static final ResourceKey<BiomeModifier> ADD_ICY_END_STONE_OUTER_POCKET =
            biomeModifierKey("add_icy_end_stone_outer_pocket");


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

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> _context) {
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
                                new FancyTrunkPlacer(10, 6, 8),
                                BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                                new TwoLayersFeatureSize(0, 0, 0, java.util.OptionalInt.of(6)),
                                BlockStateProvider.simple(Blocks.END_STONE)
                        ).ignoreVines().build()
                )
        );

        _context.register(BRACKEN_BUSH, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRACKEN_BUSH.get()))));


        _context.register(END_MOSS_GRASS, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.END_MOSS_GRASS.get()))));


        _context.register(TWISTED_END_MOSS_GRASS, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TWISTED_END_MOSS_GRASS.get()))));


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

        registerOreConfigured(_context, ALUMINIUM);
        registerOreConfigured(_context, LEAD);
        registerOreConfigured(_context, SILVER);
        registerOreConfigured(_context, MITHRIL);

        WeightedStateProvider iceMixState = new WeightedStateProvider(
                WeightedList.<net.minecraft.world.level.block.state.BlockState>builder()
                        .add(ModBlocks.ANCIENT_ICE.get().defaultBlockState(), 4)
                        .add(ModBlocks.ANCIENT_PACKED_ICE.get().defaultBlockState(), 3)
                        .add(ModBlocks.ANCIENT_BLUE_ICE.get().defaultBlockState(), 2)
                        .build()
        );

        _context.register(ANCIENT_ICEBERG, new ConfiguredFeature<>(
                ModFeatures.ANCIENT_ICE_SPIKE.get(),
                NoneFeatureConfiguration.INSTANCE
        ));

        RuleTest endStoneTest = new BlockMatchTest(Blocks.END_STONE);

        _context.register(ICY_END_STONE_OUTER_POCKET, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                endStoneTest,
                ModBlocks.ICY_END_STONE.get().defaultBlockState(),
                42
        )));

        List<OreConfiguration.TargetBlockState> icePocketTargets = List.of(
                OreConfiguration.target(new BlockMatchTest(ModBlocks.ICY_END_STONE.get()), ModBlocks.ANCIENT_ICE.get().defaultBlockState()),
                OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ANCIENT_PACKED_ICE.get().defaultBlockState()),
                OreConfiguration.target(endStoneTest, ModBlocks.ANCIENT_BLUE_ICE.get().defaultBlockState())
        );

        _context.register(ANCIENT_ICE_POCKET, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(
                icePocketTargets,
                24
        )));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> _context) {
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

        _context.register(END_MOSS_GRASS_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(END_MOSS_GRASS),
                List.of(
                        CountPlacement.of(END_MOSS_GRASS_COUNT),
                        InSquarePlacement.spread(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES),
                        BlockPredicateFilter.forPredicate(
                                BlockPredicate.matchesTag(new Vec3i(0, -1, 0), ModTags.Blocks.SUPPORTS_END_MOSS_GRASS)
                        ),
                        BiomeFilter.biome()
                )
        ));


        _context.register(TWISTED_END_MOSS_GRASS_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(TWISTED_END_MOSS_GRASS),
                List.of(
                        CountPlacement.of(TWISTED_END_MOSS_GRASS_COUNT),
                        InSquarePlacement.spread(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES),
                        BlockPredicateFilter.forPredicate(
                                BlockPredicate.matchesTag(new Vec3i(0, -1, 0), ModTags.Blocks.SUPPORTS_END_MOSS_GRASS)
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

        HolderGetter<ConfiguredFeature<?, ?>> configured = _context.lookup(Registries.CONFIGURED_FEATURE);

        registerOrePlaced(_context, configured, ALUMINIUM);
        registerOrePlaced(_context, configured, LEAD);
        registerOrePlaced(_context, configured, SILVER);
        registerOrePlaced(_context, configured, MITHRIL);


        _context.register(ANCIENT_ICEBERG_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(ANCIENT_ICEBERG),
                List.of(
                        CountPlacement.of(3),
                        InSquarePlacement.spread(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES),
                        BiomeFilter.biome()
                )
        ));

        _context.register(ICY_END_STONE_OUTER_POCKET_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(ICY_END_STONE_OUTER_POCKET),
                List.of(
                        CountPlacement.of(8),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(60)),
                        BiomeFilter.biome()
                )
        ));


        _context.register(ANCIENT_ICE_POCKET_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(ANCIENT_ICE_POCKET),
                List.of(
                        CountPlacement.of(6),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(60)),
                        BiomeFilter.biome()
                )
        ));
    }

    public static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> _context) {
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

        _context.register(ADD_END_MOSS_GRASS, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.END_HIGHLANDS),
                        biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(END_MOSS_GRASS_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        _context.register(ADD_TWISTED_END_MOSS_GRASS, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.END_HIGHLANDS),
                        biomes.getOrThrow(ModBiomes.HEATHER_ISLANDS)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(TWISTED_END_MOSS_GRASS_PLACED)),
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

        registerOreBiomeModifier(_context, biomes, placedFeatures, ALUMINIUM);
        registerOreBiomeModifier(_context, biomes, placedFeatures, LEAD);
        registerOreBiomeModifier(_context, biomes, placedFeatures, SILVER);
        registerOreBiomeModifier(_context, biomes, placedFeatures, MITHRIL);

        _context.register(ADD_ANCIENT_ICEBERG, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(ModBiomes.FROZEN_END)),
                HolderSet.direct(placedFeatures.getOrThrow(ANCIENT_ICEBERG_PLACED)),
                GenerationStep.Decoration.SURFACE_STRUCTURES
        ));

        _context.register(ADD_ICY_END_STONE_OUTER_POCKET, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(ModBiomes.FROZEN_END)),
                HolderSet.direct(placedFeatures.getOrThrow(ICY_END_STONE_OUTER_POCKET_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        _context.register(ADD_ANCIENT_ICE_POCKET, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(ModBiomes.FROZEN_END)),
                HolderSet.direct(placedFeatures.getOrThrow(ANCIENT_ICE_POCKET_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static void registerOrePlaced(
            BootstrapContext<PlacedFeature> context,
            HolderGetter<ConfiguredFeature<?, ?>> configured,
            ModOreData ore
    ) {
        context.register(
                ore.placed(),
                new PlacedFeature(
                        configured.getOrThrow(ore.configured()),
                        List.of(
                                CountPlacement.of(ore.count()),
                                InSquarePlacement.spread(),
                                HeightRangePlacement.triangle(
                                        VerticalAnchor.absolute(ore.minY()),
                                        VerticalAnchor.absolute(ore.maxY())
                                ),
                                BiomeFilter.biome()
                        )
                )
        );
    }

    private static void registerOreConfigured(
            BootstrapContext<ConfiguredFeature<?, ?>> context,
            ModOreData ore
    ) {
        List<OreConfiguration.TargetBlockState> targets = List.of(
                OreConfiguration.target(
                        STONE_ORE_REPLACEABLES,
                        ore.stoneOre().get().defaultBlockState()
                ),
                OreConfiguration.target(
                        DEEPSLATE_ORE_REPLACEABLES,
                        ore.deepslateOre().get().defaultBlockState()
                )
        );

        context.register(
                ore.configured(),
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(targets, ore.veinSize())
                )
        );
    }

    private static void registerOreBiomeModifier(
            BootstrapContext<BiomeModifier> context,
            HolderGetter<Biome> biomes,
            HolderGetter<PlacedFeature> placed,
            ModOreData ore
    ) {
        context.register(
                ore.modifier(),
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                        HolderSet.direct(
                                placed.getOrThrow(ore.placed())
                        ),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
    }

    static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey(String _name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, OrderOfObsidian.id(_name));
    }

    static ResourceKey<PlacedFeature> placedFeatureKey(String _name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, OrderOfObsidian.id(_name));
    }

    static ResourceKey<BiomeModifier> biomeModifierKey(String _name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, OrderOfObsidian.id(_name));
    }
}

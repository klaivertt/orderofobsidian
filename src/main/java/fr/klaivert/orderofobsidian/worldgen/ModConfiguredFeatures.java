package fr.klaivert.orderofobsidian.worldgen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {


    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AIKIGITE_ORES_KEY = registerKey("aikigite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BAUHERITE_ORE_KEY = registerKey("bauherite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GRAPHITE_ORE_KEY = registerKey("graphite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AVENRONITE_ORE_KEY = registerKey("avenronite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EDRUELIUM_ORE_KEY = registerKey("edruelium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PENDORITE_ORE_KEY = registerKey("pendorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDSTONE_PENDORITE_ORE_KEY = registerKey("endstone_pendorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OXYS_ORE_KEY = registerKey("oxys_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldAikigiteOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.AIKIGITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_AIKIGITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlAluminiumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ALUMINIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlBauheriteOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.BAUHERITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_BAUHERITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlGraphiteOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.GRAPHITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlMithrilOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.MITHRIL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlSilverOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworlLeadOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_AIKIGITE_ORES_KEY, Feature.ORE, new OreConfiguration(overworldAikigiteOres, 6));
        register(context, OVERWORLD_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworlAluminiumOres, 9));
        register(context, OVERWORLD_BAUHERITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworlBauheriteOres, 5));
        register(context, OVERWORLD_GRAPHITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworlGraphiteOres, 11));
        register(context, OVERWORLD_MITHRIL_ORE_KEY, Feature.ORE, new OreConfiguration(overworlMithrilOres, 7));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworlSilverOres, 7));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworlLeadOres, 7));

        register(context, AVENRONITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.AVENRONITE_ORE.get().defaultBlockState(),4));

        register(context, EDRUELIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.EDRUELIUM_ORE.get().defaultBlockState(),4));

        register(context, PENDORITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.PENDORITE_ORE.get().defaultBlockState(),4));

        register(context, ENDSTONE_PENDORITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.ENDSTONE_PENDORITE_ORE.get().defaultBlockState(),5));

        register(context, OXYS_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.OXYS_ORE.get().defaultBlockState(),3));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(OrderOfObsidianMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

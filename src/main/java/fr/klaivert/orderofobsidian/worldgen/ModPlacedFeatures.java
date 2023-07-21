package fr.klaivert.orderofobsidian.worldgen;


import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> AIKIGITE_PLACED_KEY = createKey("aikigite_placed");
    public static final ResourceKey<PlacedFeature> ALUMINIUM_PLACED_KEY = createKey("aluminium_placed");
    public static final ResourceKey<PlacedFeature> BAUHERITE_PLACED_KEY = createKey("bauherite_placed");
    public static final ResourceKey<PlacedFeature> GRAPHITE_PLACED_KEY = createKey("graphite_placed");
    public static final ResourceKey<PlacedFeature> MITHRIL_PLACED_KEY = createKey("mithril_placed");
    public static final ResourceKey<PlacedFeature> SILVER_PLACED_KEY = createKey("silver_placed");
    public static final ResourceKey<PlacedFeature> LEAD_PLACED_KEY = createKey("lead_placed");

    public static final ResourceKey<PlacedFeature> AVENRONITE_PLACED_KEY = createKey("avenronite_placed");
    public static final ResourceKey<PlacedFeature> EDRUELIUM_PLACED_KEY = createKey("edruelium_placed");
    public static final ResourceKey<PlacedFeature> PENDORITE_PLACED_KEY = createKey("pendorite_placed");
    public static final ResourceKey<PlacedFeature> END_PENDORITE_PLACED_KEY = createKey("end_pendorite_placed");
    public static final ResourceKey<PlacedFeature> OXYS_ORE_KEY = createKey("oxys_placed");
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, AIKIGITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_AIKIGITE_ORES_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-94), VerticalAnchor.absolute(90))));

        register(context, ALUMINIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(100))));

        register(context, BAUHERITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BAUHERITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-104), VerticalAnchor.absolute(60))));

        register(context, GRAPHITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GRAPHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.absolute(115))));

        register(context, MITHRIL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MITHRIL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-104), VerticalAnchor.absolute(60))));

        register(context, SILVER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-94), VerticalAnchor.absolute(90))));

        register(context, LEAD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-94), VerticalAnchor.absolute(90))));

        register(context, AVENRONITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AVENRONITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(150))));

        register(context, EDRUELIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EDRUELIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(150))));

        register(context, PENDORITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PENDORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(150))));

        register(context, END_PENDORITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDSTONE_PENDORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));

        register(context, OXYS_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OXYS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));

    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(OrderOfObsidianMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

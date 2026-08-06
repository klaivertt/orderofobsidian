package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;

import java.util.function.Supplier;

import static net.klaivert.orderofobsidian.WorldGen.OrderOfObsidianWorldgen.*;

public record ModOreData(
        ResourceKey<ConfiguredFeature<?, ?>> configured,
        ResourceKey<PlacedFeature> placed,
        ResourceKey<BiomeModifier> modifier,
        Supplier<Block> stoneOre,
        Supplier<Block> deepslateOre,
        int veinSize,
        int count,
        int minY,
        int maxY
)
{
    public static final ModOreData ALUMINIUM = new ModOreData(
            configuredFeatureKey("aluminium_ore"),
            placedFeatureKey("aluminium_ore"),
            biomeModifierKey("add_aluminium_ore"),
            ModBlocks.ALUMINIUM_ORE,
            ModBlocks.DEEPSLATE_ALUMINIUM_ORE,
            8,
            10,
            -32,
            96
    );

    public static final ModOreData LEAD = new ModOreData(
            configuredFeatureKey("lead_ore"),
            placedFeatureKey("lead_ore"),
            biomeModifierKey("add_lead_ore"),
            ModBlocks.LEAD_ORE,
            ModBlocks.DEEPSLATE_LEAD_ORE,
            7,
            7,
            -64,
            48
    );

    public static final ModOreData SILVER = new ModOreData(
            configuredFeatureKey("silver_ore"),
            placedFeatureKey("silver_ore"),
            biomeModifierKey("add_silver_ore"),
            ModBlocks.SILVER_ORE,
            ModBlocks.DEEPSLATE_SILVER_ORE,
            6,
            4,
            -32,
            40
    );

    public static final ModOreData MITHRIL = new ModOreData(
            configuredFeatureKey("mithril_ore"),
            placedFeatureKey("mithril_ore"),
            biomeModifierKey("add_mithril_ore"),
            ModBlocks.MITHRIL_ORE,
            ModBlocks.DEEPSLATE_MITHRIL_ORE,
            3,
            2,
            -64,
            -32
    );

}
package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier OXYS = TierSortingRegistry.registerTier(
            new ForgeTier(7, 3200, 10f, 3.5f, 50,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.OXYS.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "oxys"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier AVENRONITE  = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2200, 8f, 2f, 30,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.AVENRONITE_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "avenronite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EDRUELIUM   = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2200, 8f, 2f, 30,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.EDRUELIUM_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "eduelium"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier PENDORITE    = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2250, 8.3f, 2.1f, 30,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.PENDORITE_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "pendorite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier AIKIGITE    = TierSortingRegistry.registerTier(
            new ForgeTier(3, 650, 9f, 1.4f, 30,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.AIKIGITE_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "aikigite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier BAUHERITE    = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1800, 5f, 2f, 50,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.BAUHERITE_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "bauherite"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier BONE    = TierSortingRegistry.registerTier(
            new ForgeTier(1, 150, 2f, 1f, 10,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.BONE)),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "bone"), List.of(Tiers.STONE), List.of());

    public static final Tier MITHRIL    = TierSortingRegistry.registerTier(
            new ForgeTier(3, 2200, 6f, 2f, 100,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "mithril"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier OBSIDIAN    = TierSortingRegistry.registerTier(
            new ForgeTier(3, 2000, 5.5f, 1.5f, 10,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.OBSIDIAN)),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "obsidian"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier STEEL    = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1000, 2f, 1.5f, 25,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "steel"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier WITHER    = TierSortingRegistry.registerTier(
            new ForgeTier(2, 750, 1.6f, 1.3f, 20,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.BONE)),
            new ResourceLocation(OrderOfObsidianMod.MOD_ID, "wither"), List.of(Tiers.IRON), List.of());
}
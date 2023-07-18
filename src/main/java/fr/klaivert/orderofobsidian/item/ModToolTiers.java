package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static Tier AIKIGITE;
    public static Tier AVENRONITE;
    public static Tier OXYS;
    public static Tier BAUHERITE;
    public static Tier BONE;
    public static Tier EDRUELIUM;

    public static Tier MITHRIL;
    public static Tier OBSIDIAN;
    public static Tier PENDORITE;
    public static Tier STEEL;
    static {

        AIKIGITE = TierSortingRegistry.registerTier(
                new ForgeTier(3, 1700, 4f, 2f, 20,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AIKIGITE_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "aikigite"), List.of(Tiers.DIAMOND), List.of());

        AVENRONITE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 2200, 8f, 2f, 20,
                        ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.AVENRONITE_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "avenronite"), List.of(Tiers.NETHERITE), List.of());

        BAUHERITE = TierSortingRegistry.registerTier(
                new ForgeTier(3, 2000, 5f, 2f, 20,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BAUHERITE_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "bauherite"), List.of(Tiers.DIAMOND), List.of());

        BONE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 750, 2f, 1.2f, 10,
                        BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.BONE)),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "bone"), List.of(Tiers.STONE), List.of());
        EDRUELIUM = TierSortingRegistry.registerTier(
                new ForgeTier(4, 2200, 2f, 2.5f, 25,
                        ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.EDRUELIUM_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "eduelium"), List.of(Tiers.NETHERITE), List.of());

        OXYS = TierSortingRegistry.registerTier(
                new ForgeTier(5, 3200, 10f, 3.5f, 50,
                        ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.OXYS.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "oxys"), List.of(Tiers.NETHERITE), List.of());

        MITHRIL = TierSortingRegistry.registerTier(
                new ForgeTier(3, 2000, 6.5f, 2.1f, 20,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BAUHERITE_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "mithril"), List.of(Tiers.DIAMOND), List.of());

        OBSIDIAN = TierSortingRegistry.registerTier(
                new ForgeTier(3, 1900, 6f, 1.8f, 20,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.OBSIDIAN)),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "obsidian"), List.of(Tiers.DIAMOND), List.of());
        PENDORITE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 2200, 8f, 2.5f, 25,
                        ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.EDRUELIUM_INGOT.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "pendorite"), List.of(Tiers.NETHERITE), List.of());

        STEEL = TierSortingRegistry.registerTier(
                new ForgeTier(3, 1200, 3f, 1.5f, 11,
                        BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.OXYS.get())),
                new ResourceLocation(OrderOfObsidianMod.MOD_ID, "steel"), List.of(Tiers.DIAMOND), List.of());

    }
}

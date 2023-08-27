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

}
package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, net.klaivert.orderofobsidian.OrderOfObsidian.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.Items.GEMS)
                .add(ModItems.getRK(ModItems.OXYS.get()));

        tag(Tags.Items.ORES)
                .add(ModItems.getRK(ModBlocks.OXYS_ORE.get().asItem()));

        tag(Tags.Items.STORAGE_BLOCKS)
                .add(ModItems.getRK(ModBlocks.OXYS_BLOCK.get().asItem()));

        tag(Tags.Items.END_STONES)
                .add(ModItems.getRK(ModBlocks.END_DEPHSTONE.get().asItem()));

        tag(Tags.Items.COBBLESTONES)
                .add(ModItems.getRK(ModBlocks.COBBLED_END_DEPHSTONE.get().asItem()));

        tag(Tags.Items.BRICKS)
                .add(ModItems.getRK(ModBlocks.END_DEPHSTONE_BRICKS.get().asItem()))
                .add(ModItems.getRK(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get().asItem()));

        tag(ItemTags.LOGS)
                .add(ModItems.getRK(ModBlocks.YEW_LOG.get().asItem()));

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModItems.getRK(ModBlocks.YEW_LOG.get().asItem()));

        tag(ItemTags.PLANKS)
                .add(ModItems.getRK(ModBlocks.YEW_PLANKS.get().asItem()));

        tag(ItemTags.LEAVES)
                .add(ModItems.getRK(ModBlocks.YEW_LEAVES.get().asItem()));

        tag(ItemTags.SAPLINGS)
                .add(ModItems.getRK(ModBlocks.YEW_SAPLING.get().asItem()));

        tag(ModTags.Items.OXYS_REPAIRABLE)
                .add(ModItems.getRK(ModItems.OXYS.get()));

        tag(ModTags.Items.OXYS_REPAIRABLE)
                .add(ModItems.getRK(ModItems.OXYS.get().asItem()));

        tag(ItemTags.SWORDS)
                .add(ModItems.getRK(ModItems.OXYS_SWORD.get().asItem()));

        tag(ItemTags.PICKAXES)
                .add(ModItems.getRK(ModItems.OXYS_PICKAXE.get().asItem()));

        tag(ItemTags.SHOVELS)
                .add(ModItems.getRK(ModItems.OXYS_SHOVEL.get().asItem()));

        tag(ItemTags.AXES)
                .add(ModItems.getRK(ModItems.OXYS_AXE.get().asItem()));

        tag(ItemTags.HOES)
                .add(ModItems.getRK(ModItems.OXYS_HOE.get().asItem()));

        tag(ItemTags.SPEARS)
                .add(ModItems.getRK(ModItems.OXYS_SPEAR.get().asItem()));

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.getRK(ModItems.OXYS_HELMET.get().asItem()));

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.getRK(ModItems.OXYS_CHESTPLATE.get().asItem()));

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.getRK(ModItems.OXYS_LEGGINGS.get().asItem()));

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.getRK(ModItems.OXYS_BOOTS.get().asItem()));

    }
}

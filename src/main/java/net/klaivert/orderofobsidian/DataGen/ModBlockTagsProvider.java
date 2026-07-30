package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, OrderOfObsidian.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.OXYS_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.OXYS_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES.get()))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get()))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_WALL.get())

                );

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES.get()))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get()))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_WALL.get())
                );

        tag(BlockTags.NEEDS_IRON_TOOL);
        tag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.OXYS_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.OXYS_BLOCK.get()));
    }
}
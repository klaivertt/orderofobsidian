package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    private static final TagKey<Block> LOGS_THAT_BURN = BlockTags.create(Identifier.withDefaultNamespace("logs_that_burn"));
    private static final TagKey<Block> SAPLINGS = BlockTags.create(Identifier.withDefaultNamespace("saplings"));

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
                .add(ModBlocks.getRK(ModBlocks.END_HEATHER_STONE.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_WALL.get())
                );

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.YEW_LOG.get()))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_YEW_LOG.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_PLANKS.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_BUTTON.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_PRESSURE_PLATE.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_DOOR.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_FENCE.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_FENCE_GATE.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_TRAPDOOR.get()));

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.getRK(ModBlocks.YEW_LEAVES.get()));

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
                .add(ModBlocks.getRK(ModBlocks.END_HEATHER_STONE.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_WALL.get())
                );


        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_OXYS_TOOL);

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.OXYS_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.OXYS_BLOCK.get()));

        tag(Tags.Blocks.ORES)
                .add(ModBlocks.getRK(ModBlocks.OXYS_ORE.get()));

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(ModBlocks.getRK(ModBlocks.OXYS_BLOCK.get()));

        tag(Tags.Blocks.END_STONES)
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE.get()));

        tag(Tags.Blocks.COBBLESTONES)
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE.get()));


        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_STAIRS.get()));


        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.YEW_SLAB.get()));

        tag(BlockTags.WALLS)
                .add(ModBlocks.getRK(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get()))
                .add(ModBlocks.getRK(ModBlocks.END_DEPHSTONE_TILES_WALL.get())
                );

        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.YEW_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.YEW_BUTTON.get()));

        tag(BlockTags.FENCES)
                .add(ModBlocks.getRK(ModBlocks.YEW_FENCE.get()));
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getRK(ModBlocks.YEW_FENCE_GATE.get()));
        tag(BlockTags.DOORS)
                .add(ModBlocks.getRK(ModBlocks.YEW_DOOR.get()));
        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.YEW_TRAPDOOR.get()));

        tag(BlockTags.LOGS)
                .add(ModBlocks.getRK(ModBlocks.YEW_LOG.get()))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_YEW_LOG.get()));

        tag(LOGS_THAT_BURN);

        tag(BlockTags.PLANKS)
                .add(ModBlocks.getRK(ModBlocks.YEW_PLANKS.get()));

        tag(BlockTags.LEAVES)
                .add(ModBlocks.getRK(ModBlocks.YEW_LEAVES.get()));

        tag(SAPLINGS)
                .add(ModBlocks.getRK(ModBlocks.YEW_SAPLING.get()));

        tag(ModTags.Blocks.SUPPORTS_YEW)
                .add(ModBlocks.getRK(Blocks.END_STONE))
                .add(ModBlocks.getRK(ModBlocks.END_HEATHER_STONE.get()));

        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.YEW_BUTTON.get()));

        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.getRK(ModBlocks.YEW_DOOR.get()));

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.getRK(ModBlocks.YEW_FENCE.get()));

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.YEW_PRESSURE_PLATE.get()));

        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.getRK(ModBlocks.YEW_SLAB.get()));

        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.getRK(ModBlocks.YEW_STAIRS.get()));

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.YEW_TRAPDOOR.get()));

    }
}
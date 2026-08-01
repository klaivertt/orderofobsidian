package net.klaivert.orderofobsidian.Blocks;

import net.klaivert.orderofobsidian.Blocks.Custom.YewSaplingBlock;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.WorldGen.ModTreeGrowers;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks blocks =
            DeferredRegister.createBlocks(OrderOfObsidian.MOD_ID);


    public static final DeferredBlock<Block> OXYS_BLOCK = RegisterBlock("oxys_block",
            properties -> new Block(
                    properties.strength(8.f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            )
    );

    public static final DeferredBlock<Block> OXYS_ORE = RegisterBlock("oxys_ore",
            properties -> new DropExperienceBlock(
                    UniformInt.of(12, 24),
                    properties.strength(8.f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            )
    );

    public static final DeferredBlock<Block> CRACKED_END_DEPHSTONE_BRICKS = RegisterBlock("cracked_end_depthstone_bricks",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> CRACKED_END_DEPHSTONE_TILES = RegisterBlock("cracked_end_depthstone_tiles",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE = RegisterBlock("end_depthstone",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> COBBLED_END_DEPHSTONE = RegisterBlock("cobbled_end_depthstone",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_BRICKS = RegisterBlock("end_depthstone_bricks",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_TILES = RegisterBlock("end_depthstone_tiles",
            properties -> new Block(
                    properties.strength(2.25f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> COBBLED_END_DEPHSTONE_STAIRS = RegisterBlock("cobbled_end_depthstone_stairs",
            properties -> new StairBlock(
                    ModBlocks.COBBLED_END_DEPHSTONE.get()
                            .defaultBlockState(),
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> COBBLED_END_DEPHSTONE_SLAB = RegisterBlock("cobbled_end_depthstone_slab",
            properties -> new SlabBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> COBBLED_END_DEPHSTONE_WALL = RegisterBlock("cobbled_end_depthstone_wall",
            properties -> new WallBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_TILES_STAIRS = RegisterBlock("end_depthstone_tiles_stairs",
            properties -> new StairBlock(
                    ModBlocks.END_DEPHSTONE_TILES.get()
                            .defaultBlockState(),
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_TILES_SLAB = RegisterBlock("end_depthstone_tiles_slab",
            properties -> new SlabBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_TILES_WALL = RegisterBlock("end_depthstone_tiles_wall",
            properties -> new WallBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_BRICKS_STAIRS = RegisterBlock("end_depthstone_bricks_stairs",
            properties -> new StairBlock(
                    ModBlocks.END_DEPHSTONE_BRICKS.get()
                            .defaultBlockState(),
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_BRICKS_SLAB = RegisterBlock("end_depthstone_bricks_slab",
            properties -> new SlabBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> END_DEPHSTONE_BRICKS_WALL = RegisterBlock("end_depthstone_bricks_wall",
            properties -> new WallBlock(
                    properties.strength(2.25f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> YEW_LOG = RegisterBlock("yew_log",
            properties -> new RotatedPillarBlock(
                    properties.strength(2.0f).sound(SoundType.WOOD).ignitedByLava()
            )
    );

    public static final DeferredBlock<Block> YEW_PLANKS = RegisterBlock("yew_planks",
            properties -> new Block(
                    properties.strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava()
            )
    );

    public static final DeferredBlock<Block> YEW_LEAVES = RegisterBlock("yew_leaves",
            properties -> new TintedParticleLeavesBlock(
                    0.01F,
                    properties.strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion().ignitedByLava()
            )
    );

    public static final DeferredBlock<Block> YEW_SAPLING = RegisterBlock("yew_sapling",
            properties -> new YewSaplingBlock(
                    ModTreeGrowers.YEW,
                    properties.noCollision().instabreak().randomTicks().sound(SoundType.GRASS)
            )
    );


    private static <T extends Block> DeferredBlock<T> RegisterBlock(String _name, Function<BlockBehaviour.Properties, T> _function) {
        DeferredBlock<T> toReturn = blocks.registerBlock(_name, _function);
        RegisterBlockItem(_name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void RegisterBlockItem(String _name, DeferredBlock<T> _block) {
        ModItems.items.registerItem(_name, properties -> new BlockItem(_block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }


    public static void Registered(IEventBus _eventBus) {
        blocks.register(_eventBus);
    }
}

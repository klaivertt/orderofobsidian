package net.klaivert.orderofobsidian.Blocks;

import net.klaivert.orderofobsidian.Blocks.Custom.*;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.WorldGen.ModTreeGrowers;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
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
            properties -> new YewLogBlock(
                    properties.strength(2.0f).sound(SoundType.WOOD)
            )
    );

    public static final DeferredBlock<Block> YEW_PLANKS = RegisterBlock("yew_planks",
            properties -> new Block(
                    properties.strength(2.0f, 3.0f).sound(SoundType.WOOD)
            )
    );

    public static final DeferredBlock<Block> STRIPPED_YEW_LOG = RegisterBlock("stripped_yew_log",
            properties -> new RotatedPillarBlock(
                    properties.strength(2.0f).sound(SoundType.WOOD)
            )
    );

    public static final DeferredBlock<Block> YEW_STAIRS = RegisterBlock("yew_stairs",
            properties -> new StairBlock(ModBlocks.YEW_PLANKS.get().defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD)));
    public static final DeferredBlock<Block> YEW_SLAB = RegisterBlock("yew_slab",
            properties -> new SlabBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<Block> YEW_PRESSURE_PLATE = RegisterBlock("yew_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties
                    .mapColor(MapColor.COLOR_PURPLE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                    .requiresCorrectToolForDrops().noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YEW_BUTTON = RegisterBlock("yew_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 20, properties
                    .noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> YEW_FENCE = RegisterBlock("yew_fence",
            properties -> new FenceBlock(properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<Block> YEW_FENCE_GATE = RegisterBlock("yew_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<Block> YEW_DOOR = RegisterBlock("yew_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD).noOcclusion()));
    public static final DeferredBlock<Block> YEW_TRAPDOOR = RegisterBlock("yew_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.CHERRY_WOOD).noOcclusion()));

    public static final DeferredBlock<Block> ANCIENT_BONE = RegisterBlock("ancient_bone",
            properties -> new RotatedPillarBlock(
                    properties.strength(2F)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.BONE_BLOCK))
    );

    public static final DeferredBlock<Block> BRACKEN_BUSH = RegisterBlock("bracken_bush",
            properties -> new BrackenBushBlock(
                    properties.noCollision().instabreak().replaceable()
                            .sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)
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

    public static final DeferredBlock<Block> END_HEATHER_STONE = RegisterBlock("end_heather_stone",
            properties -> new EndHeatherStoneBlock(
                    properties.strength(2.0f, 3.0f).sound(SoundType.STONE).randomTicks()
            )
    );

    //ancient Ice

    public static final DeferredBlock<Block> ICY_END_STONE  = RegisterBlock("icy_end_stone",
            properties -> new Block(
                    properties.strength(2.f, 3f).sound(SoundType.GLASS).friction(0.95f)
            )
    );

    public static final DeferredBlock<Block> ANCIENT_ICE = RegisterBlock("ancient_ice",
            properties -> new IceBlock(
                    properties.strength(1f, 2.0f).sound(SoundType.GLASS).friction(0.985f).noOcclusion()
            )
    );

    public static final DeferredBlock<Block> ANCIENT_PACKED_ICE = RegisterBlock("ancient_packed_ice",
            properties -> new Block(
                    properties.strength(1.5f, 2.2f).sound(SoundType.GLASS).friction(0.992f)
            )
    );

    public static final DeferredBlock<Block> ANCIENT_BLUE_ICE = RegisterBlock("ancient_blue_ice",
            properties -> new Block(
                    properties.strength(1.6f, 2.2f).sound(SoundType.GLASS).friction(0.996f)
            )
    );

    public static final DeferredBlock<Block> ICY_FIREFLY_BUSH = RegisterBlock("icy_firefly_bush",
            properties -> new IcyFireflyBushBlock(
                    properties.noCollision().instabreak().replaceable()
                            .sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)
            )
    );

    public static final DeferredBlock<Block> ALUMINIUM_ORE = RegisterBlock("aluminium_ore",
            properties -> new Block(
                    properties.strength(3.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINIUM_ORE = RegisterBlock("deepslate_aluminium_ore",
            properties -> new Block(
                    properties.strength(4.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );
    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = RegisterBlock("aluminium_block",
            properties -> new Block(
                    properties.strength(5.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RAW_ALUMINIUM_BLOCK = RegisterBlock("raw_aluminium_block",
            properties -> new Block(
                    properties.strength(5.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> LEAD_ORE = RegisterBlock("lead_ore",
            properties -> new Block(
                    properties.strength(3.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = RegisterBlock("deepslate_lead_ore",
            properties -> new Block(
                    properties.strength(5.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );
    public static final DeferredBlock<Block> LEAD_BLOCK = RegisterBlock("lead_block",
            properties -> new Block(
                    properties.strength(6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = RegisterBlock("raw_lead_block",
            properties -> new Block(
                    properties.strength(6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> SILVER_ORE = RegisterBlock("silver_ore",
            properties -> new Block(
                    properties.strength(3.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = RegisterBlock("deepslate_silver_ore",
            properties -> new Block(
                    properties.strength(5.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );
    public static final DeferredBlock<Block> SILVER_BLOCK = RegisterBlock("silver_block",
            properties -> new Block(
                    properties.strength(5.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = RegisterBlock("raw_silver_block",
            properties -> new Block(
                    properties.strength(5.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );

    public static final DeferredBlock<Block> MITHRIL_ORE = RegisterBlock("mithril_ore",
            properties -> new Block(
                    properties.strength(6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );
    public static final DeferredBlock<Block> DEEPSLATE_MITHRIL_ORE = RegisterBlock("deepslate_mithril_ore",
            properties -> new Block(
                    properties.strength(7.5f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );
    public static final DeferredBlock<Block> MITHRIL_BLOCK = RegisterBlock("mithril_block",
            properties -> new Block(
                    properties.strength(9.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.NETHERITE_BLOCK)
            )
    );
    public static final DeferredBlock<Block> RAW_MITHRIL_BLOCK = RegisterBlock("raw_mithril_block",
            properties -> new Block(
                    properties.strength(9.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)
            )
    );

    public static final DeferredBlock<Block> END_MOSS_GRASS = RegisterBlock("end_moss_grass",
            properties -> new EndMossGrassBlock(
                    properties.noCollision().instabreak().replaceable()
                            .sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)
            )
    );

    public static final DeferredBlock<Block> TWISTED_END_MOSS_GRASS = RegisterBlock("twisted_end_moss_grass",
            properties -> new Block(
                    properties.noCollision().instabreak().replaceable()
                            .sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)
            )
    );

    public static final DeferredBlock<Block> DURALUMIN_BLOCK = RegisterBlock("duralumin_block",
            properties -> new Block(
                    properties.strength(5.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> CRUSHER = RegisterBlock("crusher",
            properties -> new CrusherBlock(
                    properties.strength(3.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.WOOD)
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

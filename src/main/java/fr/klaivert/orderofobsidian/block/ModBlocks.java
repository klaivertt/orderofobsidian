package fr.klaivert.orderofobsidian.block;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.custom.chessgameblock;
import fr.klaivert.orderofobsidian.block.custom.eyesinbotlleblock;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.MOSS_BLOCK;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OrderOfObsidianMod.MOD_ID);



    public static final RegistryObject<Block> AIKIGITE_ORE = registerBlock("aikigite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_AIKIGITE_ORE = registerBlock("deepslate_aikigite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BAUHERITE_ORE = registerBlock("bauherite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_BAUHERITE_ORE = registerBlock("deepslate_bauherite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAPHITE_ORE = registerBlock("graphite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.5f, 0.05f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));

    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock("mithril_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));


    //nether ore
    public static final RegistryObject<Block> AVENRONITE_ORE = registerBlock("avenronite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)));

    public static final RegistryObject<Block> EDRUELIUM_ORE = registerBlock("edruelium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)));

    public static final RegistryObject<Block> PENDORITE_ORE = registerBlock("pendorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(7, 14)));
    //end nether ore
//end ore
    public static final RegistryObject<Block> ENDSTONE_PENDORITE_ORE = registerBlock("endstone_pendorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(10f).requiresCorrectToolForDrops(), UniformInt.of(7, 13)));

    public static final RegistryObject<Block> OXYS_ORE = registerBlock("oxys_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(18f).requiresCorrectToolForDrops(), UniformInt.of(15, 30)));

    public static final RegistryObject<Block> RAW_AIKIGITE_BLOCK = registerBlock("raw_aikigite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(0.9f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(0.7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_AVENRONTE_BLOCK = registerBlock("raw_avenronite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_BAUHERITE_BLOCK = registerBlock("raw_bauherite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_EDUELIUM_BLOCK = registerBlock("raw_edruelium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_PENDORITE_BLOCK = registerBlock("raw_pendorite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AIKIGITE_BLOCK = registerBlock("aikigite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(0.7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AVENRONITE_BLOCK = registerBlock("avenronite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BAUHERITE_BLOCK = registerBlock("bauherite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EDRUELIUM_BLOCK = registerBlock("edruelium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MITRHIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OXYS_BLOCK = registerBlock("oxys_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PENDORITE_BLOCK = registerBlock("pendorite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHEST_GAME = registerBlock("chessgame",
            () -> new chessgameblock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<Block> EYES_IN_BOTTLE = registerBlock("eyes_in_bottle",
            () -> new eyesinbotlleblock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.GLASS)
                    .strength(1f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    public static final RegistryObject<Block> MOSS_BRICKS = registerBlock("moss_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(MOSS_BLOCK)
                    .strength(0.5f)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

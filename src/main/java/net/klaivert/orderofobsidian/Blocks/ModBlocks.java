package net.klaivert.orderofobsidian.Blocks;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks
{
    public static final DeferredRegister.Blocks blocks =
            DeferredRegister.createBlocks(OrderOfObsidian.MOD_ID);


    public static final DeferredBlock<Block> OXYS_BLOCK = RegisterBlock( "oxys_block",
            properties -> new Block(
                    properties.strength(8.f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            )
            );

    public static final DeferredBlock<Block> OXYS_ORE = RegisterBlock( "oxys_ore",
            properties -> new DropExperienceBlock(
                    UniformInt.of(12,24),
                    properties.strength(8.f)

                            .requiresCorrectToolForDrops()
                            .sound(SoundType.ANCIENT_DEBRIS)
            )
            );

    private static <T extends Block> DeferredBlock<T> RegisterBlock(String _name, Function<BlockBehaviour.Properties, T> _function)
    {
        DeferredBlock<T> toReturn = blocks.registerBlock(_name, _function);
        RegisterBlockItem(_name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void RegisterBlockItem(String _name, DeferredBlock<T> _block)
    {
        ModItems.items.registerItem(_name,properties -> new BlockItem(_block.get(), properties.useBlockDescriptionPrefix()));
    }


    public static void Registered(IEventBus _eventBus)
    {
        blocks.register(_eventBus);
    }
}

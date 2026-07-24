package net.klaivert.orderofobsidian.Blocks;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks
{
    public static final DeferredRegister.Blocks blocks =
            DeferredRegister.createBlocks(OrderOfObsidian.MOD_ID);


    private static <T extends Block> DeferredBlock<T> registerBlock(String _name, Function<BlockBehaviour.Properties, T> _function)
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

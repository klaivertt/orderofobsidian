package net.klaivert.orderofobsidian.CreativeModTab;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrderOfObsidian.MOD_ID);

    public static final Supplier<CreativeModeTab> ORDER_OF_OBSIDIAN_TAB =
            CREATIVE_MODE_TABS.register("orderofobsidian_tab",
                    () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.OXYS.get()))
                            .title(Component.translatable("creativetab.orderofobsidian.orderofobsidian_tab"))
                            .displayItems((itemDisplayParameters, output) ->
                            {
                                StoreItems(output);
                            })
                            .withSearchBar()
                            .build());

    public static void Register(IEventBus _eventBus)
    {
        CREATIVE_MODE_TABS.register(_eventBus);
    }

    protected static void StoreItems(CreativeModeTab.Output _output)
    {
        _output.accept(ModItems.OXYS);
        _output.accept(ModBlocks.OXYS_ORE);
        _output.accept(ModBlocks.OXYS_BLOCK);

        _output.accept(ModBlocks.END_DEPHSTONE);
        _output.accept(ModBlocks.COBBLED_END_DEPHSTONE);
        _output.accept(ModBlocks.END_DEPHSTONE_BRICKS);
        _output.accept(ModBlocks.END_DEPHSTONE_TILES);
        _output.accept(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS);
        _output.accept(ModBlocks.CRACKED_END_DEPHSTONE_TILES);

        _output.accept(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS);
        _output.accept(ModBlocks.COBBLED_END_DEPHSTONE_SLAB);
        _output.accept(ModBlocks.COBBLED_END_DEPHSTONE_WALL);

        _output.accept(ModBlocks.END_DEPHSTONE_BRICKS_SLAB);
        _output.accept(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS);
        _output.accept(ModBlocks.END_DEPHSTONE_BRICKS_WALL);

        _output.accept(ModBlocks.END_DEPHSTONE_TILES_SLAB);
        _output.accept(ModBlocks.END_DEPHSTONE_TILES_STAIRS);
        _output.accept(ModBlocks.END_DEPHSTONE_TILES_WALL);

        _output.accept(ModBlocks.YEW_LOG);
        _output.accept(ModBlocks.YEW_PLANKS);
        _output.accept(ModBlocks.YEW_LEAVES);
        _output.accept(ModBlocks.YEW_SAPLING);

        _output.accept(ModItems.OXYS_SWORD);
        _output.accept(ModItems.OXYS_PICKAXE);
        _output.accept(ModItems.OXYS_SHOVEL);
        _output.accept(ModItems.OXYS_AXE);
        _output.accept(ModItems.OXYS_HOE);
        _output.accept(ModItems.OXYS_SPEAR);

        _output.accept(ModItems.OXYS_HELMET);
        _output.accept(ModItems.OXYS_CHESTPLATE);
        _output.accept(ModItems.OXYS_LEGGINGS);
        _output.accept(ModItems.OXYS_BOOTS);
    }
}

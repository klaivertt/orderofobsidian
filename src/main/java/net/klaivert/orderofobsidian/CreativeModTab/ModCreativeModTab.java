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
        OxysRegistered(_output);
        AluminiumRegistered(_output);
        LeadRegistered(_output);
        MithrilRegistered(_output);
        SilverRegistered(_output);
        DephstoneRegistered(_output);
        AncientIceRegistered(_output);
        _output.accept(ModBlocks.ANCIENT_BONE);
        YewRegistered(_output);
        OxysToolsRegistered(_output);
    }

    protected static void OxysRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModItems.OXYS);
        _output.accept(ModBlocks.OXYS_ORE);
        _output.accept(ModBlocks.OXYS_BLOCK);
    }

    protected static void OxysToolsRegistered(CreativeModeTab.Output _output)
    {
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

    protected static void YewRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.YEW_LOG);
        _output.accept(ModBlocks.YEW_PLANKS);
        _output.accept(ModBlocks.YEW_LEAVES);
        _output.accept(ModBlocks.YEW_SAPLING);

        _output.accept(ModBlocks.YEW_STAIRS);
        _output.accept(ModBlocks.YEW_SLAB);
        _output.accept(ModBlocks.YEW_PRESSURE_PLATE);
        _output.accept(ModBlocks.YEW_BUTTON);
        _output.accept(ModBlocks.YEW_FENCE);
        _output.accept(ModBlocks.YEW_FENCE_GATE);
        _output.accept(ModBlocks.YEW_DOOR);
        _output.accept(ModBlocks.YEW_TRAPDOOR);
    }

    protected static void DephstoneRegistered(CreativeModeTab.Output _output)
    {
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
    }

    protected static void AncientIceRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.ANCIENT_ICE);
        _output.accept(ModBlocks.ANCIENT_PACKED_ICE);
        _output.accept(ModBlocks.ANCIENT_BLUE_ICE);
    }

    protected static void AluminiumRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.ALUMINIUM_ORE);
        _output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
        _output.accept(ModBlocks.ALUMINIUM_BLOCK);
        _output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK);
        _output.accept(ModItems.ALUMINIUM_INGOT);
        _output.accept(ModItems.RAW_ALUMINIUM);
    }

    protected static void SilverRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.SILVER_ORE);
        _output.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
        _output.accept(ModBlocks.SILVER_BLOCK);
        _output.accept(ModItems.RAW_SILVER);
        _output.accept(ModItems.SILVER_INGOT);
    }

    protected static void MithrilRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.MITHRIL_ORE);
        _output.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        _output.accept(ModBlocks.MITHRIL_BLOCK);
        _output.accept(ModItems.RAW_MITHRIL);
        _output.accept(ModItems.MITHRIL_INGOT);
    }

    protected static void LeadRegistered(CreativeModeTab.Output _output)
    {
        _output.accept(ModBlocks.LEAD_ORE);
        _output.accept(ModBlocks.DEEPSLATE_LEAD_ORE);
        _output.accept(ModBlocks.LEAD_BLOCK);
        _output.accept(ModItems.RAW_LEAD);
        _output.accept(ModItems.LEAD_INGOT);
    }


}

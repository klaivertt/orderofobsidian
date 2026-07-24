package net.klaivert.orderofobsidian.CreativeModTab;

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
                                output.accept(ModItems.OXYS);
                            })
                            .withSearchBar()
                            .build());

    public static void Register(IEventBus _eventBus)
    {
        CREATIVE_MODE_TABS.register(_eventBus);
    }
}

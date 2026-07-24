package net.klaivert.orderofobsidian.items;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items items = DeferredRegister.createItems(OrderOfObsidian.MOD_ID);

    public static final DeferredItem<Item> OXYS = items.registerSimpleItem("oxys");

    public static void Register(IEventBus _eventBus)
    {
        items.register(_eventBus);
    }

    public static ResourceKey<Item> getRK(Item item)
    {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}

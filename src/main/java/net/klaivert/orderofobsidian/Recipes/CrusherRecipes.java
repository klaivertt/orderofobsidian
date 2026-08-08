package net.klaivert.orderofobsidian.Recipes;

import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Map;

public class CrusherRecipes {
    public static Map<Item, Item> CRUSHING_MAP;

    public static Map<Item, Item> get() {
        if (CRUSHING_MAP == null) {
            CRUSHING_MAP = Map.ofEntries(
                    Map.entry(ModItems.RAW_ALUMINIUM.get(), ModItems.ALUMINIUM_DUST.get()),
                    Map.entry(ModItems.RAW_LEAD.get(), ModItems.LEAD_DUST.get()),
                    Map.entry(ModItems.RAW_MITHRIL.get(), ModItems.MITHRIL_DUST.get()),
                    Map.entry(ModItems.RAW_SILVER.get(), ModItems.SILVER_DUST.get()),
                    Map.entry(Items.RAW_IRON, ModItems.IRON_DUST.get()),
                    Map.entry(Items.RAW_GOLD, ModItems.GOLD_DUST.get()),
                    Map.entry(Items.RAW_COPPER, ModItems.COPPER_DUST.get())
            );
        }
        return CRUSHING_MAP;
    }
}
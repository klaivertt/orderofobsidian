package net.klaivert.orderofobsidian.items;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items items = DeferredRegister.createItems(OrderOfObsidian.MOD_ID);

    public static final DeferredItem<Item> OXYS = items.registerSimpleItem("oxys");
    public static final DeferredItem<Item> OXYS_UPGRADE_SMITHING_TEMPLATE = items.registerSimpleItem("oxys_upgrade_smithing_template");

    public static final DeferredItem<Item> OXYS_SWORD = items.registerItem("oxys_sword",
            properties -> new Item(properties.sword(ModToolTiers.OXYS, 5.f, -2.4f)));
    public static final DeferredItem<Item> OXYS_PICKAXE = items.registerItem("oxys_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.OXYS, 1, -2.8f)));
    public static final DeferredItem<Item> OXYS_SHOVEL = items.registerItem("oxys_shovel",
            properties -> new ShovelItem(ModToolTiers.OXYS, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> OXYS_AXE = items.registerItem("oxys_axe",
            properties -> new AxeItem(ModToolTiers.OXYS, 7.5f, -3.2f, properties));
    public static final DeferredItem<Item> OXYS_HOE = items.registerItem("oxys_hoe",
            properties -> new HoeItem(ModToolTiers.OXYS, 0, -3.0f, properties));
    public static final DeferredItem<Item> OXYS_SPEAR = items.registerItem("oxys_spear",
            properties -> new Item(properties.spear(ModToolTiers.OXYS, 0.95f, 1.2f, 0.7f,
                    3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f)));

    public static final DeferredItem<Item> OXYS_HELMET = items.registerItem("oxys_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.OXYS_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> OXYS_CHESTPLATE = items.registerItem("oxys_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.OXYS_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> OXYS_LEGGINGS = items.registerItem("oxys_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.OXYS_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> OXYS_BOOTS = items.registerItem("oxys_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.OXYS_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> ALUMINIUM_INGOT = items.registerSimpleItem("aluminium_ingot");
    public static final DeferredItem<Item> RAW_ALUMINIUM = items.registerSimpleItem("raw_aluminium");
    public static final DeferredItem<Item> ALUMINIUM_DUST = items.registerSimpleItem("aluminium_dust");

    public static final DeferredItem<Item> LEAD_INGOT = items.registerSimpleItem("lead_ingot");
    public static final DeferredItem<Item> RAW_LEAD = items.registerSimpleItem("raw_lead");
    public static final DeferredItem<Item> LEAD_DUST = items.registerSimpleItem("lead_dust");

    public static final DeferredItem<Item> MITHRIL_INGOT = items.registerSimpleItem("mithril_ingot");
    public static final DeferredItem<Item> RAW_MITHRIL = items.registerSimpleItem("raw_mithril");
    public static final DeferredItem<Item> MITHRIL_DUST = items.registerSimpleItem("mithril_dust");
    public static final DeferredItem<Item> MITHRIL_SCRAP = items.registerSimpleItem("mithril_scrap");

    public static final DeferredItem<Item> SILVER_INGOT = items.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> RAW_SILVER = items.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> SILVER_DUST = items.registerSimpleItem("silver_dust");

    public static final DeferredItem<Item> DURALUMIN_INGOT = items.registerSimpleItem("duralumin_ingot");
    public static final DeferredItem<Item> DURALUMIN_DUST = items.registerSimpleItem("duralumin_dust");

    public static final DeferredItem<Item> IRON_DUST = items.registerSimpleItem("iron_dust");
    public static final DeferredItem<Item> COPPER_DUST = items.registerSimpleItem("copper_dust");
    public static final DeferredItem<Item> GOLD_DUST = items.registerSimpleItem("gold_dust");
    public static final DeferredItem<Item> NETHERITE_DUST = items.registerSimpleItem("netherite_dust");


    public static final DeferredItem<Item> LEAD_BOOTS = items.registerItem("lead_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void Register(IEventBus _eventBus)
    {
        items.register(_eventBus);
    }

    public static ResourceKey<Item> getRK(Item item)
    {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}

package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrderOfObsidianMod.MOD_ID);

    //raw and ingot

    public static final RegistryObject<Item> RAW_AIKIGITE = ITEMS.register("raw_aikigite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AIKIGITE_INGOT = ITEMS.register("aikigite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_AVENRONITE = ITEMS.register("raw_avenronite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AVENRONITE_INGOT = ITEMS.register("avenronite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BAUHERITE = ITEMS.register("raw_bauherite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAUHERITE_INGOT = ITEMS.register("bauherite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_EDRUELIUM = ITEMS.register("raw_edruelium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EDRUELIUM_INGOT = ITEMS.register("edruelium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PENDORITE = ITEMS.register("raw_pendorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PENDORITE_INGOT = ITEMS.register("pendorite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUST_STEEL = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    //end raw and ingot


    //oxys
    public static final RegistryObject<Item> OXYS = ITEMS.register("oxys",
            () -> new Item(new Item.Properties()));
    //End Oxys

    //plate
    public static final RegistryObject<Item> ALUMINIUM_PLATE = ITEMS.register("aluminium_plate",
            () -> new Item(new Item.Properties()));
    //end plate
    //Stick
    public static final RegistryObject<Item> OXYS_STICK = ITEMS.register("oxys_stick",
            () -> new Item(new Item.Properties()));
    //End Stick

    //Aikigite

    public static final RegistryObject<Item> AIKIGITE_BOW = ITEMS.register("aikigite_bow",
            () -> new BowItem(new Item.Properties().durability(600)));

    public static final RegistryObject<ArmorItem> AIKIGITE_HELMET = ITEMS.register("aikigite_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.AIKIGITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> AIKIGITE_CHESTPLATE = ITEMS.register("aikigite_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.AIKIGITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> AIKIGITE_LEGGING = ITEMS.register("aikigite_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.AIKIGITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> AIKIGITE_BOOTS = ITEMS.register("aikigite_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.AIKIGITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> AIKIGITE_SWORD = ITEMS.register("aikigite_sword",
            () -> new SwordItem(ModToolTiers.AIKIGITE, 6, 1.7f,
                    new Item.Properties()));
    public static final RegistryObject<Item> AIKIGITE_PICKAXE = ITEMS.register("aikigite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AIKIGITE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> AIKIGITE_SHOVEL = ITEMS.register("aikigite_shovel",
            () -> new ShovelItem(ModToolTiers.AIKIGITE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> AIKIGITE_AXE = ITEMS.register("aikigite_axe",
            () -> new AxeItem(ModToolTiers.AIKIGITE, 7, 1f,
                    new Item.Properties()));

    //end Aikigite
    //aluminum
    public static final RegistryObject<ArmorItem> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.ALUMINUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.ALUMINUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.ALUMINUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.ALUMINUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));
    //end aluminum
    //avenronite
    public static final RegistryObject<ArmorItem> AVENRONITE_HELMET = ITEMS.register("avenronite_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.AVENRONITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> AVENRONITE_CHESTPLATE = ITEMS.register("avenronite_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.AVENRONITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> AVENRONITE_LEGGING = ITEMS.register("avenronite_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.AVENRONITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> AVENRONITE_BOOTS = ITEMS.register("avenronite_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.AVENRONITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_SWORD = ITEMS.register("avenronite_sword",
            () -> new SwordItem(ModToolTiers.AVENRONITE, 8, 1.7f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_PICKAXE = ITEMS.register("avenronite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_SHOVEL = ITEMS.register("avenronite_shovel",
            () -> new ShovelItem(ModToolTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_AXE = ITEMS.register("avenronite_axe",
            () -> new AxeItem(ModToolTiers.AVENRONITE, 9, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_HOE = ITEMS.register("avenronite_hoe",
            () -> new HoeItem(ModToolTiers.AVENRONITE, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> AVENRONITE_BOW = ITEMS.register("avenronite_bow",
            () -> new BowItem(new Item.Properties().fireResistant().durability(800)));

    //end avenronite
    //bauherite
    public static final RegistryObject<ArmorItem> BAUHERITE_HELMET = ITEMS.register("bauherite_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.BAUHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BAUHERITE_CHESTPLATE = ITEMS.register("bauherite_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.BAUHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BAUHERITE_LEGGING = ITEMS.register("bauherite_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.BAUHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BAUHERITE_BOOTS = ITEMS.register("bauherite_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.BAUHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BAUHERITE_SWORD = ITEMS.register("bauherite_sword",
            () -> new SwordItem(ModToolTiers.BAUHERITE, 6, 1.7f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BAUHERITE_PICKAXE = ITEMS.register("bauherite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BAUHERITE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BAUHERITE_SHOVEL = ITEMS.register("bauherite_shovel",
            () -> new ShovelItem(ModToolTiers.BAUHERITE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BAUHERITE_AXE = ITEMS.register("bauherite_axe",
            () -> new AxeItem(ModToolTiers.BAUHERITE, 7, 1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> BAUHERITE_HOE = ITEMS.register("bauherite_hoe",
            () -> new HoeItem(ModToolTiers.BAUHERITE, 0, 1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> BAUHERITE_BOW = ITEMS.register("bauherite_bow",
            () -> new BowItem(new Item.Properties().durability(650)));
    //end bauherite
    //bone
    public static final RegistryObject<ArmorItem> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.BONE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.BONE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BONE_LEGGING = ITEMS.register("bone_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.BONE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.BONE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModToolTiers.BONE, 4, 1.7f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BONE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new ShovelItem(ModToolTiers.BONE, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new AxeItem(ModToolTiers.BONE, 5, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new HoeItem(ModToolTiers.BONE, 0, 1f,
                    new Item.Properties()));



    //end bone
    //candy apple
    public static final RegistryObject<Item> CANDY_APPLE = ITEMS.register("candy_apple",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_APPLE)));
    //end candy apple
    //chips

    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips",
            () -> new Item(new Item.Properties().food(ModFoods.CHIPS)));
    //end chips
    //diamond
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.DIAMOND_APPLE)));
    //end diamond
    //edruelium
    public static final RegistryObject<ArmorItem> EDRUELIUM_HELMET = ITEMS.register("edruelium_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.EDRUELIUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> EDRUELIUM_CHESTPLATE = ITEMS.register("edruelium_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.EDRUELIUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> EDRUELIUM_LEGGING = ITEMS.register("edruelium_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.EDRUELIUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> EDRUELIUM_BOOTS = ITEMS.register("edruelium_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.EDRUELIUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_SWORD = ITEMS.register("edruelium_sword",
            () -> new SwordItem(ModToolTiers.EDRUELIUM, 8, 1.7f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_PICKAXE = ITEMS.register("edruelium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_SHOVEL = ITEMS.register("edruelium_shovel",
            () -> new ShovelItem(ModToolTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_AXE = ITEMS.register("edruelium_axe",
            () -> new AxeItem(ModToolTiers.EDRUELIUM, 9, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_HOE = ITEMS.register("edruelium_hoe",
            () -> new HoeItem(ModToolTiers.EDRUELIUM, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EDRUELIUM_BOW = ITEMS.register("edruelium_bow",
            () -> new BowItem(new Item.Properties().fireResistant().durability(800)));
    //end edruelium
    //emelard
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).food(ModFoods.EMERALD_APPLE)));
    //end emerald

    //fried Egg
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_EGG)));
    //end Fried Egg


    //mithril


    public static final RegistryObject<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.MITHRIL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.MITHRIL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.MITHRIL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.MITHRIL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, 7, 1.7f,
                    new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, 8, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, 0, 1f,
                    new Item.Properties()));


    //end mithril
    //netherite
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorItem(13,"netherite", new Item.Properties().fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant().food(ModFoods.NETHERITE_APPLE)));
    //end netherite
    //netherrack
    //end netherrack
    //obsidian

    public static final RegistryObject<Item> OBSIDIAN_APPLE = ITEMS.register("obsidian_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).food(ModFoods.OBSIDIAN_APPLE)));

    public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.OBSIDIAN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModToolTiers.OBSIDIAN, 7, 1.7f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModToolTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ModToolTiers.OBSIDIAN, 8, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModToolTiers.OBSIDIAN, 0, 1f,
                    new Item.Properties().fireResistant()));

    //end Obsidian
    //oxys
    public static final RegistryObject<ArmorItem> OXYS_HELMET = ITEMS.register("oxys_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.OXYS,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OXYS_CHESTPLATE = ITEMS.register("oxys_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.OXYS,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OXYS_LEGGING = ITEMS.register("oxys_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.OXYS,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> OXYS_BOOTS = ITEMS.register("oxys_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.OXYS,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OXYS_HORSE_ARMOR = ITEMS.register("oxys_horse_armor",
            () -> new HorseArmorItem(23,"oxys", new Item.Properties().fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> OXYS_SWORD = ITEMS.register("oxys_sword",
            () -> new SwordItem(ModToolTiers.OXYS, 14, 1.7f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OXYS_BOW = ITEMS.register("oxys_bow",
            () -> new BowItem(new Item.Properties().fireResistant().durability(1200)));

    public static final RegistryObject<Item> OXYS_PICKAXE = ITEMS.register("oxys_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OXYS, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OXYS_SHOVEL = ITEMS.register("oxys_shovel",
            () -> new ShovelItem(ModToolTiers.OXYS, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OXYS_AXE = ITEMS.register("oxys_axe",
            () -> new AxeItem(ModToolTiers.OXYS, 15, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OXYS_HOE = ITEMS.register("oxys_hoe",
            () -> new HoeItem(ModToolTiers.OXYS, 0, 1f,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> OXYS_APPLE = ITEMS.register("oxys_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant().food(ModFoods.OXYS_APPLE)));

    //end oxys
    //pendorite
    public static final RegistryObject<ArmorItem> PENDORITE_HELMET = ITEMS.register("pendorite_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.PENDORITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> PENDORITE_CHESTPLATE = ITEMS.register("pendorite_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.PENDORITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> PENDORITE_LEGGING = ITEMS.register("pendorite_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.PENDORITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> PENDORITE_BOOTS = ITEMS.register("pendorite_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.PENDORITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PENDORITE_SWORD = ITEMS.register("pendorite_sword",
            () -> new SwordItem(ModToolTiers.PENDORITE, 7, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PENDORITE_PICKAXE = ITEMS.register("pendorite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PENDORITE, 1, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PENDORITE_SHOVEL = ITEMS.register("pendorite_shovel",
            () -> new ShovelItem(ModToolTiers.PENDORITE, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item>PENDORITE_AXE = ITEMS.register("pendorite_axe",
            () -> new AxeItem(ModToolTiers.PENDORITE, 8, 0f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PENDORITE_HOE = ITEMS.register("pendorite_hoe",
            () -> new HoeItem(ModToolTiers.PENDORITE, 0, 0f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PENDORITE_HORSE_ARMOR = ITEMS.register("pendorite_horse_armor",
            () -> new HorseArmorItem(15,"pendorite", new Item.Properties().fireResistant().stacksTo(1)));
    public static final RegistryObject<Item> PENDORITE_APPLE = ITEMS.register("pendorite_apple",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant().food(ModFoods.PENDORITE_APPLE)));

    //end pendorite
    //rice

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> COOKED_RICE = ITEMS.register("cooked_rice",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_RICE)));

    //end rice
    //steel
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.STEEL,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.STEEL,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.STEEL,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.STEEL,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 5, 1.7f,
                    new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 0, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 6, 1f,
                    new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 0, 1f,
                    new Item.Properties()));
    //end steel
    //sushi
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi",
            () -> new Item(new Item.Properties().food(ModFoods.SUSHI)));
    //end sushi
    //Stone
    //end stone
    //woden

    //end woden

    public static final RegistryObject<Item> BAR_BRAWL = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(8, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2460));
    public static final RegistryObject<Item> CAT_REMIX = ITEMS.register("cat_remix_music_disc",
            () -> new RecordItem(8, ModSounds.CAT_REMIX, new Item.Properties().stacksTo(1), 6400));
    public static final RegistryObject<Item> LITTLE_ADVENTURES = ITEMS.register("little_adventures_music_disc",
            () -> new RecordItem(8, ModSounds.LITTLE_ADVENTURES, new Item.Properties().stacksTo(1), 3120));
    public static final RegistryObject<Item> PARADISE = ITEMS.register("paradise_music_disc",
            () -> new RecordItem(8, ModSounds.PARADISE, new Item.Properties().stacksTo(1), 2440));




    public static final RegistryObject<Item> MOSS_HORSE_ARMROR = ITEMS.register("moss_horse_armor",
            () -> new HorseArmorItem(6, "moss", new Item.Properties().stacksTo(1)));

    //wither
    public static final RegistryObject<ArmorItem> WITHER_HELMET = ITEMS.register("wither_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.WITHER,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> WITHER_CHESTPLATE = ITEMS.register("wither_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.WITHER,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> WITHER_LEGGING = ITEMS.register("wither_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.WITHER,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> WITHER_BOOTS = ITEMS.register("wither_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.WITHER,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> WITHER_SWORD = ITEMS.register("wither_sword",
            () -> new SwordItem(ModToolTiers.WITHER, 5, 1.7f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> WITHER_PICKAXE = ITEMS.register("wither_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WITHER, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> WITHER_SHOVEL = ITEMS.register("wither_shovel",
            () -> new ShovelItem(ModToolTiers.WITHER, 0, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> WITHER_AXE = ITEMS.register("wither_axe",
            () -> new AxeItem(ModToolTiers.WITHER, 6, 1f,
                    new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> WITHER_HOE = ITEMS.register("wither_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 0, 1f,
                    new Item.Properties().fireResistant()));

    //end wither

    public static final RegistryObject<Item> MOSS_WHEAT = ITEMS.register("wheat_with_moss",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_SKELETON_SHARD = ITEMS.register("wither_skeleton_shard",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

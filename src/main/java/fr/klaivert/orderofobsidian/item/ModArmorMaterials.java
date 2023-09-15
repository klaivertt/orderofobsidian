package fr.klaivert.orderofobsidian.item;


import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    OXYS("oxys", 300, new int[]{ 15, 18, 18, 15 }, 50,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 8f, 0.5f, () -> Ingredient.of(ModItems.OXYS.get())),
    AIKIGITE ("aikigite", 21, new int[]{ 3, 5, 6, 3 }, 20,
    SoundEvents.ARMOR_EQUIP_IRON, 1.5f, 0f, () -> Ingredient.of(ModItems.AIKIGITE_INGOT.get())),
    AVENRONITE("avenronite", 114, new int[]{ 10, 13, 13, 10 }, 40,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.3f, () -> Ingredient.of(ModItems.AVENRONITE_INGOT.get())),

    EDRUELIUM("edruelium", 114, new int[]{ 10, 13, 13, 10 }, 40,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.3f, () -> Ingredient.of(ModItems.EDRUELIUM_INGOT.get())),

    PENDORITE("pendorite", 114, new int[]{ 10, 13, 13, 10 }, 40,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.3f, () -> Ingredient.of(ModItems.PENDORITE_INGOT.get())),
    BAUHERITE ("bauherite", 40, new int[]{ 4, 8, 7, 3 }, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.1f, () -> Ingredient.of(ModItems.BAUHERITE_INGOT.get())),

    BONE("bone", 9, new int[]{ 2, 4, 4, 2 }, 10,
            SoundEvents.BONE_BLOCK_PLACE, 0f, 0f, () -> Ingredient.of(Items.BONE)),

    WITHER("wither", 15, new int[]{ 3, 5, 4, 3 }, 20,
            SoundEvents.BONE_BLOCK_PLACE, 0f, 0f, () -> Ingredient.of(Items.BONE)),

    ALUMINUM ("aluminum", 11, new int[]{ 2, 4, 3, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT.get())),

    MITHRIL ("mithril", 48, new int[]{ 2, 4, 3, 2 }, 50,
            SoundEvents.ARMOR_EQUIP_IRON, 8f, -0.1f, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),

    OBSIDIAN("obsidian", 38, new int[]{ 3, 6, 6, 2 }, 20,
            SoundEvents.GILDED_BLACKSTONE_PLACE, 2f, 0.2f, () -> Ingredient.of(Items.OBSIDIAN)),
    STEEL ("mithril", 32, new int[]{ 3, 6, 5, 2 }, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.STEEL_INGOT.get()));


    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return OrderOfObsidianMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
package fr.klaivert.orderofobsidian.tiers;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorMaterial implements ArmorMaterial {

    private final String name;
    private final float toughness;
    private final int enchantability;
    private final int[] durabilityForType;
    private final int[] defenseForType;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    public ModArmorMaterial(int[] durabilityForType, int[] defenseForType, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, String name, float toughness, float knockbackResistance){
        this.durabilityForType = durabilityForType;
        this.defenseForType = defenseForType;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }
    public int getDurabilityForType (ArmorItem.Type pType){return  this.defenseForType[pType.ordinal()];}

    public int getDefenseForType (ArmorItem.Type pType){
        return  this.durabilityForType[pType.ordinal()];
    }
    public int getEnchantmentValue() {return this.enchantability;}

    public SoundEvent getEquipSound () {return this.equipSound;}

    public Ingredient getRepairIngredient () {return  this.repairMaterial.get();}

    public String getName () {return OrderOfObsidianMod.MOD_ID + ":" +this.name;}

    public float getToughness () {return  this.toughness;}

    public  float getKnockbackResistance () {return 0;}
}

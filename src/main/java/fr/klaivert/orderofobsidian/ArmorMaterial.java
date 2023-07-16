package fr.klaivert.orderofobsidian;

import fr.klaivert.orderofobsidian.item.ModItems;
import fr.klaivert.orderofobsidian.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterial {

    public static final ModArmorMaterial OXYS_ARMOR = new ModArmorMaterial(
            new int[] {15, 18, 18, 15}, //Helmet, Chest, leggings, boots
            new int [] {2500, 3600, 3000, 2200},
            50,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ()-> Ingredient.of(ModItems.OXYS.get()),
            "oxys",
            8f,
            0.5f
    );

    public static final ModArmorMaterial AIKIGITE_ARMOR = new ModArmorMaterial(
            new int[] {3, 6, 6, 2}, //Helmet, Chest, leggings, boots
            new int [] {210, 350, 320, 240},
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ()-> Ingredient.of(ModItems.AIKIGITE_INGOT.get()),
            "aikigite",
            1.5f,
            0.1f
    );

    public static final ModArmorMaterial AVENRONITE_ARMOR = new ModArmorMaterial(
            new int[] {10, 13, 13, 10}, //Helmet, Chest, leggings, boots
            new int [] {1250, 1800, 1500, 1100},
            40,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ()-> Ingredient.of(ModItems.AVENRONITE_INGOT.get()),
            "avenronite",
            4f,
            0.3f
    );
    public static final ModArmorMaterial BAUHERITE_ARMOR = new ModArmorMaterial(
            new int[] {3, 8, 8, 3}, //Helmet, Chest, leggings, boots
            new int [] {400, 550, 530, 450},
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ()-> Ingredient.of(ModItems.BAUHERITE_INGOT.get()),
            "bauherite",
            2f,
            0.1f
    );

    public static final ModArmorMaterial BONE_ARMOR = new ModArmorMaterial(
            new int[] {2, 5, 4, 2}, //Helmet, Chest, leggings, boots
            new int [] {150, 230, 210, 180},
            10,
            SoundEvents.BONE_BLOCK_PLACE,
            ()-> Ingredient.of(Items.BONE),
            "bone",
            0f,
            0f
    );


    public static final ModArmorMaterial EDRUELIUM_ARMOR = new ModArmorMaterial(
            new int[] {10, 13, 13, 10}, //Helmet, Chest, leggings, boots
            new int [] {1250, 1800, 1500, 1100},
            40,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            ()-> Ingredient.of(ModItems.AVENRONITE_INGOT.get()),
            "edruelium",
            4f,
            0.3f
    );

    public static final ModArmorMaterial ALUMINUM_ARMOR = new ModArmorMaterial(
            new int[] {2, 4, 3, 1}, //Helmet, Chest, leggings, boots
            new int [] {78, 113, 106, 92},
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            ()-> Ingredient.of(Items.BONE),
            "aluminum",
            0f,
            0f
    );
}


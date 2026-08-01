package net.klaivert.orderofobsidian.items;

import com.google.common.collect.Maps;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> OXYS_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(OrderOfObsidian.MOD_ID, "oxys"));

    public static final ArmorMaterial OXYS_ARMOR_MATERIAL = new ArmorMaterial(1200,
            makeDefense(6, 8, 10, 6, 15), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.5f, 0.2f, ModTags.Items.OXYS_REPAIRABLE, OXYS_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}

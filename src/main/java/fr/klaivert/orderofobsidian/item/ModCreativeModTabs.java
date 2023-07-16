package fr.klaivert.orderofobsidian.item;

import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrderOfObsidianMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("order_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OXYS.get()))
                    .title(Component.translatable("creativetab.order_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.RAW_AIKIGITE.get());
                        pOutput.accept(ModItems.AIKIGITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_ALUMINIUM.get());
                        pOutput.accept(ModItems.ALUMINIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_AVENRONITE.get());
                        pOutput.accept(ModItems.AVENRONITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_BAUHERITE.get());
                        pOutput.accept(ModItems.BAUHERITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_EDRUELIUM.get());
                        pOutput.accept(ModItems.EDRUELIUM_INGOT.get());
                        pOutput.accept(ModItems.GRAPHITE_DUST.get());
                        pOutput.accept(ModItems.GRAPHITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModItems.LEAD_INGOT.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.RAW_PENDORITE.get());
                        pOutput.accept(ModItems.PENDORITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModItems.DUST_STEEL.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());

                        pOutput.accept(ModItems.OXYS.get());
                        pOutput.accept(ModItems.ALUMINIUM_PLATE.get());
                        pOutput.accept(ModItems.OXYS_STICK.get());
                        pOutput.accept(ModItems.WITHER_SKELETON_SHARD.get());
                        pOutput.accept(ModItems.MOSS_WHEAT.get());

                        pOutput.accept(ModBlocks.AIKIGITE_BLOCK.get());
                        pOutput.accept(ModBlocks.AIKIGITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_AIKIGITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_AIKIGITE_BLOCK.get());

                        pOutput.accept(ModBlocks.ALUMINIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.ALUMINIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
                        pOutput.accept(ModBlocks.RAW_ALUMINIUM_BLOCK.get());

                        pOutput.accept(ModBlocks.AVENRONITE_BLOCK.get());
                        pOutput.accept(ModBlocks.AVENRONITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_AVENRONTE_BLOCK.get());

                        pOutput.accept(ModBlocks.BAUHERITE_BLOCK.get());
                        pOutput.accept(ModBlocks.BAUHERITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_BAUHERITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_BAUHERITE_BLOCK.get());

                        pOutput.accept(ModBlocks.EDRUELIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.EDRUELIUM_ORE.get());
                        pOutput.accept(ModBlocks.RAW_EDUELIUM_BLOCK.get());

                        pOutput.accept(ModBlocks.GRAPHITE_ORE.get());

                        pOutput.accept(ModBlocks.LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
                        pOutput.accept(ModBlocks.RAW_LEAD_BLOCK.get());

                        pOutput.accept(ModBlocks.MITRHIL_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());

                        pOutput.accept(ModBlocks.PENDORITE_ORE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_PENDORITE_ORE.get());
                        pOutput.accept(ModBlocks.PENDORITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PENDORITE_BLOCK.get());

                        pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.SILVER_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());

                        pOutput.accept(ModBlocks.OXYS_BLOCK.get());
                        pOutput.accept(ModBlocks.OXYS_ORE.get());


                        pOutput.accept(ModItems.AIKIGITE_SWORD.get());
                        pOutput.accept(ModItems.AIKIGITE_PICKAXE.get());
                        pOutput.accept(ModItems.AIKIGITE_SHOVEL.get());
                        pOutput.accept(ModItems.AIKIGITE_AXE.get());
                        pOutput.accept(ModItems.AIKIGITE_BOW.get());

                        pOutput.accept(ModItems.AVENRONITE_SWORD.get());
                        pOutput.accept(ModItems.AVENRONITE_PICKAXE.get());
                        pOutput.accept(ModItems.AVENRONITE_SHOVEL.get());
                        pOutput.accept(ModItems.AVENRONITE_AXE.get());
                        pOutput.accept(ModItems.AVENRONITE_HOE.get());
                        pOutput.accept(ModItems.AVENRONITE_BOW.get());

                        pOutput.accept(ModItems.BAUHERITE_SWORD.get());
                        pOutput.accept(ModItems.BAUHERITE_PICKAXE.get());
                        pOutput.accept(ModItems.BAUHERITE_SHOVEL.get());
                        pOutput.accept(ModItems.BAUHERITE_AXE.get());
                        pOutput.accept(ModItems.BAUHERITE_HOE.get());
                        pOutput.accept(ModItems.BAUHERITE_BOW.get());

                        pOutput.accept(ModItems.BONE_SWORD.get());
                        pOutput.accept(ModItems.BONE_PICKAXE.get());
                        pOutput.accept(ModItems.BONE_SHOVEL.get());
                        pOutput.accept(ModItems.BONE_AXE.get());
                        pOutput.accept(ModItems.BONE_HOE.get());

                        pOutput.accept(ModItems.EDRUELIUM_SWORD.get());
                        pOutput.accept(ModItems.EDRUELIUM_PICKAXE.get());
                        pOutput.accept(ModItems.EDRUELIUM_SHOVEL.get());
                        pOutput.accept(ModItems.EDRUELIUM_AXE.get());
                        pOutput.accept(ModItems.EDRUELIUM_HOE.get());
                        pOutput.accept(ModItems.EDRUELIUM_BOW.get());

                        pOutput.accept(ModItems.MITHRIL_SWORD.get());
                        pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MITHRIL_AXE.get());
                        pOutput.accept(ModItems.MITHRIL_HOE.get());

                        pOutput.accept(ModItems.OBSIDIAN_SWORD.get());
                        pOutput.accept(ModItems.OBSIDIAN_PICKAXE.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHOVEL.get());
                        pOutput.accept(ModItems.OBSIDIAN_AXE.get());
                        pOutput.accept(ModItems.OBSIDIAN_HOE.get());

                        pOutput.accept(ModItems.OXYS_SWORD.get());
                        pOutput.accept(ModItems.OXYS_PICKAXE.get());
                        pOutput.accept(ModItems.OXYS_SHOVEL.get());
                        pOutput.accept(ModItems.OXYS_AXE.get());
                        pOutput.accept(ModItems.OXYS_HOE.get());
                        pOutput.accept(ModItems.OXYS_BOW.get());

                        pOutput.accept(ModItems.PENDORITE_SWORD.get());
                        pOutput.accept(ModItems.PENDORITE_PICKAXE.get());
                        pOutput.accept(ModItems.PENDORITE_SHOVEL.get());
                        pOutput.accept(ModItems.PENDORITE_AXE.get());
                        pOutput.accept(ModItems.PENDORITE_HOE.get());

                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());

                        pOutput.accept(ModItems.AIKIGITE_HELMET.get());
                        pOutput.accept(ModItems.AIKIGITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.AIKIGITE_LEGGING.get());
                        pOutput.accept(ModItems.AIKIGITE_BOOTS.get());

                        pOutput.accept(ModItems.ALUMINUM_HELMET.get());
                        pOutput.accept(ModItems.ALUMINUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.ALUMINUM_LEGGINGS.get());
                        pOutput.accept(ModItems.ALUMINUM_BOOTS.get());

                        pOutput.accept(ModItems.AVENRONITE_HELMET.get());
                        pOutput.accept(ModItems.AVENRONITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.AVENRONITE_LEGGING.get());
                        pOutput.accept(ModItems.AVENRONITE_BOOTS.get());

                        pOutput.accept(ModItems.BAUHERITE_HELMET.get());
                        pOutput.accept(ModItems.BAUHERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BAUHERITE_LEGGING.get());
                        pOutput.accept(ModItems.BAUHERITE_BOOTS.get());

                        pOutput.accept(ModItems.BONE_HELMET.get());
                        pOutput.accept(ModItems.BONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BONE_LEGGING.get());
                        pOutput.accept(ModItems.BONE_BOOTS.get());

                        pOutput.accept(ModItems.EDRUELIUM_HELMET.get());
                        pOutput.accept(ModItems.EDRUELIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.EDRUELIUM_LEGGING.get());
                        pOutput.accept(ModItems.EDRUELIUM_BOOTS.get());

                        pOutput.accept(ModItems.OXYS_HELMET.get());
                        pOutput.accept(ModItems.OXYS_CHESTPLATE.get());
                        pOutput.accept(ModItems.OXYS_LEGGING.get());
                        pOutput.accept(ModItems.OXYS_BOOTS.get());

                        pOutput.accept(ModItems.RICE.get());

                        pOutput.accept(ModItems.CHIPS.get());
                        pOutput.accept(ModItems.FRIED_EGG.get());
                        pOutput.accept(ModItems.COOKED_RICE.get());
                        pOutput.accept(ModItems.SUSHI.get());

                        pOutput.accept(ModItems.CANDY_APPLE.get());
                        pOutput.accept(ModItems.EMERALD_APPLE.get());
                        pOutput.accept(ModItems.OBSIDIAN_APPLE.get());
                        pOutput.accept(ModItems.DIAMOND_APPLE.get());
                        pOutput.accept(ModItems.PENDORITE_APPLE.get());
                        pOutput.accept(ModItems.NETHERITE_APPLE.get());
                        pOutput.accept(ModItems.OXYS_APPLE.get());

                        pOutput.accept(ModItems.MOSS_HORSE_ARMROR.get());
                        pOutput.accept(ModItems.PENDORITE_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.NETHERITE_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.OXYS_HORSE_ARMOR.get());

                        pOutput.accept(ModItems.BAR_BRAWL.get());
                        pOutput.accept(ModItems.CAT_REMIX.get());
                        pOutput.accept(ModItems.LITTLE_ADVENTURES.get());
                        pOutput.accept(ModItems.PARADISE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

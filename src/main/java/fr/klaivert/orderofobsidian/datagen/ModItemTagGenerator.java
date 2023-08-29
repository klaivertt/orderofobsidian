package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, OrderOfObsidianMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AIKIGITE_HELMET.get(),
                        ModItems.AIKIGITE_CHESTPLATE.get(),
                        ModItems.AIKIGITE_LEGGING.get(),
                        ModItems.AIKIGITE_BOOTS.get(),
                        ModItems.ALUMINUM_HELMET.get(),
                        ModItems.ALUMINUM_CHESTPLATE.get(),
                        ModItems.ALUMINUM_LEGGINGS.get(),
                        ModItems.ALUMINUM_BOOTS.get(),
                        ModItems.AVENRONITE_HELMET.get(),
                        ModItems.AVENRONITE_CHESTPLATE.get(),
                        ModItems.AVENRONITE_LEGGING.get(),
                        ModItems.AVENRONITE_BOOTS.get(),
                        ModItems.BAUHERITE_HELMET.get(),
                        ModItems.BAUHERITE_CHESTPLATE.get(),
                        ModItems.BAUHERITE_LEGGING.get(),
                        ModItems.BAUHERITE_BOOTS.get(),
                        ModItems.EDRUELIUM_HELMET.get(),
                        ModItems.EDRUELIUM_CHESTPLATE.get(),
                        ModItems.EDRUELIUM_LEGGING.get(),
                        ModItems.EDRUELIUM_BOOTS.get(),
                        ModItems.MITHRIL_HELMET.get(),
                        ModItems.MITHRIL_CHESTPLATE.get(),
                        ModItems.MITHRIL_LEGGINGS.get(),
                        ModItems.MITHRIL_BOOTS.get(),
                        ModItems.OBSIDIAN_HELMET.get(),
                        ModItems.OBSIDIAN_CHESTPLATE.get(),
                        ModItems.OBSIDIAN_LEGGINGS.get(),
                        ModItems.OBSIDIAN_BOOTS.get(),
                        ModItems.OXYS_HELMET.get(),
                        ModItems.OXYS_CHESTPLATE.get(),
                        ModItems.OXYS_LEGGING.get(),
                        ModItems.OXYS_BOOTS.get(),
                        ModItems.PENDORITE_HELMET.get(),
                        ModItems.PENDORITE_CHESTPLATE.get(),
                        ModItems.PENDORITE_LEGGING.get(),
                        ModItems.PENDORITE_BOOTS.get(),
                        ModItems.STEEL_HELMET.get(),
                        ModItems.STEEL_CHESTPLATE.get(),
                        ModItems.STEEL_LEGGINGS.get(),
                        ModItems.STEEL_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL.get(),
                        ModItems.CAT_REMIX.get(),
                        ModItems.LITTLE_ADVENTURES.get(),
                        ModItems.PARADISE.get());

        this.tag(Tags.Items.DUSTS)
                .add(ModItems.DUST_STEEL.get(),
                        ModItems.GRAPHITE_DUST.get());

        this.tag(Tags.Items.INGOTS)
                .add(ModItems.AIKIGITE_INGOT.get(),
                        ModItems.ALUMINIUM_INGOT.get(),
                        ModItems.AVENRONITE_INGOT.get(),
                        ModItems.BAUHERITE_INGOT.get(),
                        ModItems.EDRUELIUM_INGOT.get(),
                        ModItems.GRAPHITE_INGOT.get(),
                        ModItems.LEAD_INGOT.get(),
                        ModItems.MITHRIL_INGOT.get(),
                        ModItems.PENDORITE_INGOT.get(),
                        ModItems.SILVER_INGOT.get(),
                        ModItems.STEEL_INGOT.get());

        this.tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_AIKIGITE.get(),
                        ModItems.RAW_ALUMINIUM.get(),
                        ModItems.RAW_AVENRONITE.get(),
                        ModItems.RAW_BAUHERITE.get(),
                        ModItems.RAW_EDRUELIUM.get(),
                        ModItems.RAW_LEAD.get(),
                        ModItems.RAW_MITHRIL.get(),
                        ModItems.RAW_PENDORITE.get(),
                        ModItems.RAW_SILVER.get());

        this.tag(Tags.Items.GEMS)
                .add(ModItems.OXYS.get());

        this.tag(Tags.Items.ARMORS_HELMETS)
                .add(ModItems.AIKIGITE_HELMET.get(),
                        ModItems.ALUMINUM_HELMET.get(),
                        ModItems.AVENRONITE_HELMET.get(),
                        ModItems.BONE_HELMET.get(),
                        ModItems.BAUHERITE_HELMET.get(),
                        ModItems.EDRUELIUM_HELMET.get(),
                        ModItems.MITHRIL_HELMET.get(),
                        ModItems.OBSIDIAN_HELMET.get(),
                        ModItems.OXYS_HELMET.get(),
                        ModItems.PENDORITE_HELMET.get(),
                        ModItems.WITHER_HELMET.get(),
                        ModItems.STEEL_HELMET.get());

        this.tag(Tags.Items.ARMORS_CHESTPLATES)
                .add(ModItems.AIKIGITE_CHESTPLATE.get(),
                        ModItems.ALUMINUM_CHESTPLATE.get(),
                        ModItems.AVENRONITE_CHESTPLATE.get(),
                        ModItems.BAUHERITE_CHESTPLATE.get(),
                        ModItems.BONE_CHESTPLATE.get(),
                        ModItems.STEEL_CHESTPLATE.get(),
                        ModItems.PENDORITE_CHESTPLATE.get(),
                        ModItems.OXYS_CHESTPLATE.get(),
                        ModItems.EDRUELIUM_CHESTPLATE.get(),
                        ModItems.MITHRIL_CHESTPLATE.get(),
                        ModItems.WITHER_CHESTPLATE.get(),
                        ModItems.OBSIDIAN_CHESTPLATE.get());

        this.tag(Tags.Items.ARMORS_LEGGINGS)
                .add(ModItems.AIKIGITE_LEGGING.get(),
                        ModItems.STEEL_BOOTS.get(),
                        ModItems.PENDORITE_LEGGING.get(),
                        ModItems.BONE_LEGGING.get(),
                        ModItems.OXYS_LEGGING.get(),
                        ModItems.OBSIDIAN_LEGGINGS.get(),
                        ModItems.MITHRIL_LEGGINGS.get(),
                        ModItems.EDRUELIUM_LEGGING.get(),
                        ModItems.BAUHERITE_LEGGING.get(),
                        ModItems.AVENRONITE_LEGGING.get(),
                        ModItems.WITHER_LEGGING.get(),
                        ModItems.ALUMINUM_LEGGINGS.get());

        this.tag(Tags.Items.ARMORS_BOOTS)
                .add(ModItems.AIKIGITE_BOOTS.get(),
                        ModItems.STEEL_LEGGINGS.get(),
                        ModItems.OXYS_BOOTS.get(),
                        ModItems.BONE_BOOTS.get(),
                        ModItems.OBSIDIAN_BOOTS.get(),
                        ModItems.MITHRIL_BOOTS.get(),
                        ModItems.EDRUELIUM_BOOTS.get(),
                        ModItems.BAUHERITE_BOOTS.get(),
                        ModItems.AVENRONITE_BOOTS.get(),
                        ModItems.ALUMINUM_BOOTS.get(),
                        ModItems.WITHER_BOOTS.get(),
                        ModItems.PENDORITE_BOOTS.get());

        this.tag(Tags.Items.ARMORS)
                .add(ModItems.AIKIGITE_BOOTS.get(),
                        ModItems.STEEL_LEGGINGS.get(),
                        ModItems.OXYS_BOOTS.get(),
                        ModItems.BONE_BOOTS.get(),
                        ModItems.OBSIDIAN_BOOTS.get(),
                        ModItems.MITHRIL_BOOTS.get(),
                        ModItems.EDRUELIUM_BOOTS.get(),
                        ModItems.BAUHERITE_BOOTS.get(),
                        ModItems.AVENRONITE_BOOTS.get(),
                        ModItems.ALUMINUM_BOOTS.get(),
                        ModItems.WITHER_BOOTS.get(),
                        ModItems.PENDORITE_BOOTS.get(),
                        ModItems.AIKIGITE_LEGGING.get(),
                        ModItems.STEEL_BOOTS.get(),
                        ModItems.PENDORITE_LEGGING.get(),
                        ModItems.BONE_LEGGING.get(),
                        ModItems.OXYS_LEGGING.get(),
                        ModItems.OBSIDIAN_LEGGINGS.get(),
                        ModItems.MITHRIL_LEGGINGS.get(),
                        ModItems.EDRUELIUM_LEGGING.get(),
                        ModItems.BAUHERITE_LEGGING.get(),
                        ModItems.AVENRONITE_LEGGING.get(),
                        ModItems.WITHER_LEGGING.get(),
                        ModItems.ALUMINUM_LEGGINGS.get(),
                        ModItems.AIKIGITE_CHESTPLATE.get(),
                        ModItems.ALUMINUM_CHESTPLATE.get(),
                        ModItems.AVENRONITE_CHESTPLATE.get(),
                        ModItems.BAUHERITE_CHESTPLATE.get(),
                        ModItems.BONE_CHESTPLATE.get(),
                        ModItems.STEEL_CHESTPLATE.get(),
                        ModItems.PENDORITE_CHESTPLATE.get(),
                        ModItems.OXYS_CHESTPLATE.get(),
                        ModItems.EDRUELIUM_CHESTPLATE.get(),
                        ModItems.MITHRIL_CHESTPLATE.get(),
                        ModItems.WITHER_CHESTPLATE.get(),
                        ModItems.OBSIDIAN_CHESTPLATE.get(),
                        ModItems.AIKIGITE_HELMET.get(),
                        ModItems.ALUMINUM_HELMET.get(),
                        ModItems.AVENRONITE_HELMET.get(),
                        ModItems.BONE_HELMET.get(),
                        ModItems.BAUHERITE_HELMET.get(),
                        ModItems.EDRUELIUM_HELMET.get(),
                        ModItems.MITHRIL_HELMET.get(),
                        ModItems.OBSIDIAN_HELMET.get(),
                        ModItems.OXYS_HELMET.get(),
                        ModItems.PENDORITE_HELMET.get(),
                        ModItems.WITHER_HELMET.get(),
                        ModItems.STEEL_HELMET.get());

        this.tag(Tags.Items.TOOLS)
                .add(ModItems.AVENRONITE_SWORD.get(),
                        ModItems.AVENRONITE_PICKAXE.get(),
                        ModItems.AVENRONITE_SHOVEL.get(),
                        ModItems.AVENRONITE_AXE.get(),
                        ModItems.AVENRONITE_HOE.get(),
                        ModItems.EDRUELIUM_SWORD.get(),
                        ModItems.EDRUELIUM_PICKAXE.get(),
                        ModItems.EDRUELIUM_SHOVEL.get(),
                        ModItems.EDRUELIUM_AXE.get(),
                        ModItems.EDRUELIUM_HOE.get(),
                        ModItems.OXYS_SWORD.get(),
                        ModItems.OXYS_PICKAXE.get(),
                        ModItems.OXYS_SHOVEL.get(),
                        ModItems.OXYS_AXE.get(),
                        ModItems.OXYS_HOE.get(),
                        ModItems.OXYS_SWORD.get(),
                        ModItems.WITHER_SWORD.get(),
                        ModItems.WITHER_PICKAXE.get(),
                        ModItems.WITHER_SHOVEL.get(),
                        ModItems.WITHER_AXE.get(),
                        ModItems.WITHER_HOE.get(),
                        ModItems.STEEL_SWORD.get(),
                        ModItems.STEEL_PICKAXE.get(),
                        ModItems.STEEL_SHOVEL.get(),
                        ModItems.STEEL_AXE.get(),
                        ModItems.STEEL_HOE.get(),
                        ModItems.OBSIDIAN_SWORD.get(),
                        ModItems.OBSIDIAN_PICKAXE.get(),
                        ModItems.OBSIDIAN_SHOVEL.get(),
                        ModItems.OBSIDIAN_AXE.get(),
                        ModItems.OBSIDIAN_HOE.get(),
                        ModItems.MITHRIL_HOE.get(),
                        ModItems.MITHRIL_AXE.get(),
                        ModItems.MITHRIL_SHOVEL.get(),
                        ModItems.MITHRIL_PICKAXE.get(),
                        ModItems.MITHRIL_SWORD.get(),
                        ModItems.BONE_SWORD.get(),
                        ModItems.BONE_PICKAXE.get(),
                        ModItems.BONE_SHOVEL.get(),
                        ModItems.BONE_AXE.get(),
                        ModItems.BONE_HOE.get(),
                        ModItems.BAUHERITE_SWORD.get(),
                        ModItems.BAUHERITE_PICKAXE.get(),
                        ModItems.BAUHERITE_SHOVEL.get(),
                        ModItems.BAUHERITE_AXE.get(),
                        ModItems.BAUHERITE_HOE.get(),
                        ModItems.AIKIGITE_SWORD.get(),
                        ModItems.AIKIGITE_PICKAXE.get(),
                        ModItems.AIKIGITE_SHOVEL.get(),
                        ModItems.AIKIGITE_AXE.get(),
                        ModItems.PENDORITE_SWORD.get(),
                        ModItems.PENDORITE_PICKAXE.get(),
                        ModItems.PENDORITE_SHOVEL.get(),
                        ModItems.PENDORITE_AXE.get(),
                        ModItems.PENDORITE_HOE.get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.AVENRONITE_PICKAXE.get(),
                        ModItems.EDRUELIUM_PICKAXE.get(),
                        ModItems.OXYS_PICKAXE.get(),
                        ModItems.AIKIGITE_PICKAXE.get(),
                        ModItems.MITHRIL_PICKAXE.get(),
                        ModItems.OBSIDIAN_PICKAXE.get(),
                        ModItems.STEEL_PICKAXE.get(),
                        ModItems.WITHER_PICKAXE.get(),
                        ModItems.OBSIDIAN_PICKAXE.get(),
                        ModItems.BONE_PICKAXE.get(),
                        ModItems.BAUHERITE_PICKAXE.get(),
                        ModItems.PENDORITE_PICKAXE.get());

        this.tag(ItemTags.SHOVELS)
                .add(ModItems.AVENRONITE_SHOVEL.get(),
                        ModItems.EDRUELIUM_SHOVEL.get(),
                        ModItems.OXYS_SHOVEL.get(),
                        ModItems.AIKIGITE_SHOVEL.get(),
                        ModItems.MITHRIL_SHOVEL.get(),
                        ModItems.OBSIDIAN_SHOVEL.get(),
                        ModItems.STEEL_SHOVEL.get(),
                        ModItems.WITHER_SHOVEL.get(),
                        ModItems.OBSIDIAN_SHOVEL.get(),
                        ModItems.BONE_SHOVEL.get(),
                        ModItems.BAUHERITE_SHOVEL.get(),
                        ModItems.PENDORITE_SHOVEL.get());

        this.tag(ItemTags.HOES)
                .add(ModItems.AVENRONITE_HOE.get(),
                        ModItems.EDRUELIUM_HOE.get(),
                        ModItems.OXYS_HOE.get(),
                        ModItems.MITHRIL_HOE.get(),
                        ModItems.OBSIDIAN_HOE.get(),
                        ModItems.STEEL_HOE.get(),
                        ModItems.WITHER_HOE.get(),
                        ModItems.OBSIDIAN_HOE.get(),
                        ModItems.BONE_HOE.get(),
                        ModItems.BAUHERITE_HOE.get(),
                        ModItems.PENDORITE_HOE.get());

        this.tag(ItemTags.AXES)
                .add(ModItems.AVENRONITE_AXE.get(),
                        ModItems.EDRUELIUM_AXE.get(),
                        ModItems.OXYS_AXE.get(),
                        ModItems.AIKIGITE_AXE.get(),
                        ModItems.MITHRIL_AXE.get(),
                        ModItems.OBSIDIAN_AXE.get(),
                        ModItems.STEEL_AXE.get(),
                        ModItems.WITHER_AXE.get(),
                        ModItems.OBSIDIAN_AXE.get(),
                        ModItems.BONE_AXE.get(),
                        ModItems.BAUHERITE_AXE.get(),
                        ModItems.PENDORITE_AXE.get());

        this.tag(ItemTags.SWORDS)
                .add(ModItems.AVENRONITE_SWORD.get(),
                        ModItems.EDRUELIUM_SWORD.get(),
                        ModItems.OXYS_SWORD.get(),
                        ModItems.AIKIGITE_SWORD.get(),
                        ModItems.MITHRIL_SWORD.get(),
                        ModItems.OBSIDIAN_SWORD.get(),
                        ModItems.STEEL_SWORD.get(),
                        ModItems.WITHER_SWORD.get(),
                        ModItems.OBSIDIAN_SWORD.get(),
                        ModItems.BONE_SWORD.get(),
                        ModItems.BAUHERITE_SWORD.get(),
                        ModItems.PENDORITE_SWORD.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL.get(),
                        ModItems.CAT_REMIX.get(),
                        ModItems.LITTLE_ADVENTURES.get(),
                        ModItems.PARADISE.get());
    }
}

package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
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
    }
}

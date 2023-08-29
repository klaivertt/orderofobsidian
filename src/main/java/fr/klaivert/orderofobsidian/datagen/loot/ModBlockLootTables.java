package fr.klaivert.orderofobsidian.datagen.loot;

import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RAW_AIKIGITE_BLOCK.get());
        this.dropSelf(ModBlocks.AIKIGITE_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_AVENRONTE_BLOCK.get());
        this.dropSelf(ModBlocks.AVENRONITE_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_BAUHERITE_BLOCK.get());
        this.dropSelf(ModBlocks.BAUHERITE_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_EDUELIUM_BLOCK.get());
        this.dropSelf(ModBlocks.EDRUELIUM_BLOCK.get());

        this.dropSelf(ModBlocks.GRAPHITE_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        this.dropSelf(ModBlocks.MITRHIL_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_PENDORITE_BLOCK.get());
        this.dropSelf(ModBlocks.PENDORITE_BLOCK.get());

        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());

        this.dropSelf(ModBlocks.OXYS_BLOCK.get());

        this.dropSelf(ModBlocks.STEEL_BLOCK.get());

        this.add(ModBlocks.AIKIGITE_ORE.get(),
                block -> createOreDrop(ModBlocks.AIKIGITE_ORE.get(), ModItems.RAW_AIKIGITE.get()));
        this.add(ModBlocks.DEEPSLATE_AIKIGITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_AIKIGITE_ORE.get(), ModItems.RAW_AIKIGITE.get()));

        this.add(ModBlocks.ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));
        this.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));

        this.add(ModBlocks.BAUHERITE_ORE.get(),
                block -> createOreDrop(ModBlocks.BAUHERITE_ORE.get(), ModItems.RAW_BAUHERITE.get()));
        this.add(ModBlocks.DEEPSLATE_BAUHERITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_BAUHERITE_ORE.get(), ModItems.RAW_BAUHERITE.get()));

        this.add(ModBlocks.GRAPHITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.GRAPHITE_ORE.get(), ModItems.GRAPHITE_DUST.get()));

        this.add(ModBlocks.MITHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        this.add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER .get()));

        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD .get()));

        this.add(ModBlocks.AVENRONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.AVENRONITE_ORE.get(), ModItems.RAW_AVENRONITE.get()));

        this.add(ModBlocks.EDRUELIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.EDRUELIUM_ORE.get(), ModItems.RAW_EDRUELIUM.get()));

        this.add(ModBlocks.PENDORITE_ORE.get(),
                block -> createOreDrop(ModBlocks.PENDORITE_ORE.get(), ModItems.RAW_PENDORITE.get()));
        this.add(ModBlocks.ENDSTONE_PENDORITE_ORE.get(),
                block -> createOreDrop(ModBlocks.ENDSTONE_PENDORITE_ORE.get(), ModItems.RAW_PENDORITE .get()));

        this.add(ModBlocks.OXYS_ORE.get(),
                block -> createOreDrop(ModBlocks.OXYS_ORE.get(), ModItems.OXYS.get()));

        this.dropSelf(ModBlocks.CHEST_GAME.get());
        this.dropSelf(ModBlocks.EYES_IN_BOTTLE.get());
        this.dropSelf(ModBlocks.BLAST_FURNACE.get());

        this.dropSelf(ModBlocks.BLACKSTONE_LANTERN.get());
        this.dropSelf(ModBlocks.MITHRIL_LANTERN.get());
        this.dropSelf(ModBlocks.MITHRIL_CHAIN.get());
        this.dropSelf(ModBlocks.OBSIDIAN_LANTERN.get());
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_LANTERN.get());
        this.dropSelf(ModBlocks.CRIMSON_STEM_LANTERN.get());
        this.dropSelf(ModBlocks.END_STONE_LANTERN.get());
        this.dropSelf(ModBlocks.WARPED_STEM_LANTERN.get());
        this.dropSelf(ModBlocks.GRAPHITE_LANTERN.get());
        this.dropSelf(ModBlocks.CUT_GRAPHITE.get());
        this.dropSelf(ModBlocks.CUT_GRAPHITE_STAIR.get());
        this.dropSelf(ModBlocks.CUT_GRAPHITE_WALL.get());
        this.dropSelf(ModBlocks.GRAPHITE_BLOCK_STAIR.get());
        this.dropSelf(ModBlocks.GRAPHITE_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.CRAKED_END_DEPHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRAKED_END_DEPHSTONE_TILES.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_STAIR.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_WALL.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_TILES.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_TILES_STAIR.get());
        this.dropSelf(ModBlocks.END_DEPHSTONE_TILES_WALL.get());
        this.dropSelf(ModBlocks.BRAZIER.get());
        this.dropSelf(ModBlocks.SOUL_BRAZIER.get());
        this.dropSelf(ModBlocks.MITHRIL_BRAZIER.get());
        this.dropSelf(ModBlocks.MITHRIL_SOUL_BRAZIER.get());
        this.dropSelf(ModBlocks.CHANDELIER.get());
        this.dropSelf(ModBlocks.SOUL_CHANDELIER.get());
        this.dropSelf(ModBlocks.LEAD_CHAIN.get());
        this.add(ModBlocks.CUT_GRAPHITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_GRAPHITE_SLAB.get()));

        this.add(ModBlocks.GRAPHITE_BLOCK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAPHITE_BLOCK_SLAB.get()));

        this.add(ModBlocks.END_DEPHSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_DEPHSTONE_SLAB.get()));

        this.add(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.END_DEPHSTONE_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_DEPHSTONE_TILES_SLAB.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

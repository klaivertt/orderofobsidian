package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(ModBlocks.OXYS_ORE.get(), createNoFortuneOreDrop(ModBlocks.OXYS_ORE.get(), ModItems.OXYS.get()));

        add(ModBlocks.ALUMINIUM_ORE.get(), createOreDrop(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));
        add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));

        add(ModBlocks.LEAD_ORE.get(), createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        add(ModBlocks.DEEPSLATE_LEAD_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));

        add(ModBlocks.MITHRIL_ORE.get(), createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));

        add(ModBlocks.SILVER_ORE.get(), createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
//        add(ModBlocks.OXYS_ORE.get(), createOreDrop(ModBlocks.OXYS_ORE.get(), ModItems.OXYS.get()));

        dropSelf(ModBlocks.OXYS_BLOCK.get());
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());

        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());

        dropSelf(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get());
        dropOther(ModBlocks.END_DEPHSTONE.get(), ModBlocks.COBBLED_END_DEPHSTONE.get());
        dropSelf(ModBlocks.END_DEPHSTONE_BRICKS.get());
        dropSelf(ModBlocks.END_DEPHSTONE_TILES.get());

        dropSelf(ModBlocks.COBBLED_END_DEPHSTONE.get());
        dropSelf(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get());
        dropSelf(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get());
        dropSelf(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get());

        dropSelf(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get());
        dropSelf(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get());

        dropSelf(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get());
        dropSelf(ModBlocks.END_DEPHSTONE_TILES_SLAB.get());
        dropSelf(ModBlocks.END_DEPHSTONE_TILES_WALL.get());

        dropSelf(ModBlocks.YEW_LOG.get());
        dropSelf(ModBlocks.STRIPPED_YEW_LOG.get());
        dropSelf(ModBlocks.YEW_PLANKS.get());
        add(ModBlocks.YEW_LEAVES.get(), createLeavesDrops(ModBlocks.YEW_LEAVES.get(), ModBlocks.YEW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.YEW_SAPLING.get());
        dropSelf(ModBlocks.END_HEATHER_STONE.get());

        add(ModBlocks.YEW_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.YEW_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.YEW_BUTTON.get());
        dropSelf(ModBlocks.YEW_FENCE.get());
        dropSelf(ModBlocks.YEW_STAIRS.get());
        dropSelf(ModBlocks.YEW_FENCE_GATE.get());
        dropSelf(ModBlocks.YEW_TRAPDOOR.get());

        add(ModBlocks.YEW_DOOR.get(), this::createDoorTable);

        dropSelf(ModBlocks.ANCIENT_BONE.get());
        dropSelf(ModBlocks.BRACKEN_BUSH.get());
        dropSelf(ModBlocks.END_MOSS_GRASS.get());
        dropSelf(ModBlocks.TWISTED_END_MOSS_GRASS.get());

        dropWhenSilkTouch(ModBlocks.ANCIENT_ICE.get());
        dropWhenSilkTouch(ModBlocks.ANCIENT_PACKED_ICE.get());
        dropWhenSilkTouch(ModBlocks.ANCIENT_BLUE_ICE.get());

    }

    protected LootTable.Builder createNoFortuneOreDrop(Block block, Item item) {
        return createSilkTouchDispatchTable(
                block,
                applyExplosionDecay(block, LootItem.lootTableItem(item))
        );
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.blocks.getEntries().stream().map(Holder::value)::iterator;
    }
}

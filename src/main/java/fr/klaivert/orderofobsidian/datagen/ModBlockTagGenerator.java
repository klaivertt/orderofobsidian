package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OrderOfObsidianMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.AIKIGITE_ORE.get(),
                        ModBlocks.DEEPSLATE_AIKIGITE_ORE.get(),

                        ModBlocks.ALUMINIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),

                        ModBlocks.BAUHERITE_ORE.get(),
                        ModBlocks.DEEPSLATE_BAUHERITE_ORE.get(),

                        ModBlocks.GRAPHITE_ORE.get(),

                        ModBlocks.MITHRIL_ORE.get(),
                        ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),

                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),

                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),

                        ModBlocks.AVENRONITE_ORE.get(),

                        ModBlocks.EDRUELIUM_ORE.get(),

                        ModBlocks.PENDORITE_ORE.get(),

                        ModBlocks.ENDSTONE_PENDORITE_ORE.get(),

                        ModBlocks.OXYS_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AIKIGITE_ORE.get(),
                        ModBlocks.DEEPSLATE_AIKIGITE_ORE.get(),
                        ModBlocks.ALUMINIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                        ModBlocks.BAUHERITE_ORE.get(),
                        ModBlocks.DEEPSLATE_BAUHERITE_ORE.get(),
                        ModBlocks.GRAPHITE_ORE.get(),
                        ModBlocks.MITHRIL_ORE.get(),
                        ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.AVENRONITE_ORE.get(),
                        ModBlocks.EDRUELIUM_ORE.get(),
                        ModBlocks.PENDORITE_ORE.get(),
                        ModBlocks.ENDSTONE_PENDORITE_ORE.get(),
                        ModBlocks.OXYS_ORE.get(),
                        ModBlocks.RAW_AIKIGITE_BLOCK.get(),
                        ModBlocks.RAW_ALUMINIUM_BLOCK.get(),

                        ModBlocks.RAW_AVENRONTE_BLOCK.get(),

                        ModBlocks.RAW_BAUHERITE_BLOCK.get(),

                        ModBlocks.RAW_EDUELIUM_BLOCK.get(),

                        ModBlocks.RAW_LEAD_BLOCK.get(),

                        ModBlocks.RAW_MITHRIL_BLOCK.get(),

                        ModBlocks.RAW_PENDORITE_BLOCK.get(),

                        ModBlocks.RAW_SILVER_BLOCK.get(),

                        ModBlocks.AIKIGITE_BLOCK.get(),

                        ModBlocks.ALUMINIUM_BLOCK.get(),

                        ModBlocks.AVENRONITE_BLOCK.get(),

                        ModBlocks.BAUHERITE_BLOCK.get(),

                        ModBlocks.EDRUELIUM_BLOCK.get(),

                        ModBlocks.GRAPHITE_BLOCK.get(),

                        ModBlocks.LEAD_BLOCK.get(),

                        ModBlocks.MITRHIL_BLOCK.get(),

                        ModBlocks.OXYS_BLOCK.get(),

                        ModBlocks.PENDORITE_BLOCK.get(),

                        ModBlocks.SILVER_BLOCK.get(),

                        ModBlocks.STEEL_BLOCK.get(),

                        ModBlocks.EYES_IN_BOTTLE.get(),

                        ModBlocks.BLAST_FURNACE.get(),

                        ModBlocks.BLACKSTONE_LANTERN.get(),

                        ModBlocks.MITHRIL_LANTERN.get(),
                        ModBlocks.MITHRIL_CHAIN.get(),

                        ModBlocks.OBSIDIAN_LANTERN.get(),

                        ModBlocks.COBBLED_DEEPSLATE_LANTERN.get(),

                        ModBlocks.END_STONE_LANTERN.get(),

                        ModBlocks.GRAPHITE_LANTERN.get(),
                        ModBlocks.CUT_GRAPHITE.get(),
                        ModBlocks.CUT_GRAPHITE_SLAB.get(),
                        ModBlocks.CUT_GRAPHITE_STAIR.get(),
                        ModBlocks.CUT_GRAPHITE_WALL.get(),
                        ModBlocks.GRAPHITE_BLOCK_SLAB.get(),
                        ModBlocks.GRAPHITE_BLOCK_STAIR.get(),
                        ModBlocks.GRAPHITE_BLOCK_WALL.get(),

                        ModBlocks.CRAKED_END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.CRAKED_END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE.get(),
                        ModBlocks.END_DEPHSTONE_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_WALL.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(),
                        ModBlocks.END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE_TILES_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_TILES_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_TILES_WALL.get(),
                        ModBlocks.CHANDELIER.get(),
                        ModBlocks.SOUL_CHANDELIER.get(),
                        ModBlocks.LEAD_CHAIN.get(),
                        ModBlocks.BRAZIER.get(),
                        ModBlocks.SOUL_BRAZIER.get(),

                        ModBlocks.MITHRIL_BRAZIER.get(),
                        ModBlocks.MITHRIL_SOUL_BRAZIER.get());

        this.tag(Tags.Blocks.END_STONES)
                .add(ModBlocks.CRAKED_END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.CRAKED_END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE.get(),
                        ModBlocks.END_DEPHSTONE_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_WALL.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(),
                        ModBlocks.END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE_TILES_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_TILES_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_TILES_WALL.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.CHEST_GAME.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AIKIGITE_ORE.get(),
                        ModBlocks.DEEPSLATE_AIKIGITE_ORE.get(),
                        ModBlocks.AIKIGITE_BLOCK.get(),

                        ModBlocks.RAW_AIKIGITE_BLOCK.get(),

                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                        ModBlocks.RAW_LEAD_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.CHANDELIER.get(),
                        ModBlocks.SOUL_CHANDELIER.get(),
                        ModBlocks.LEAD_CHAIN.get(),

                        ModBlocks.STEEL_BLOCK.get(),

                        ModBlocks.CRAKED_END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.CRAKED_END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE.get(),
                        ModBlocks.END_DEPHSTONE_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_WALL.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(),
                        ModBlocks.END_DEPHSTONE_TILES.get(),
                        ModBlocks.END_DEPHSTONE_TILES_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_TILES_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_TILES_WALL.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BAUHERITE_ORE.get(),
                        ModBlocks.DEEPSLATE_BAUHERITE_ORE.get(),
                        ModBlocks.RAW_BAUHERITE_BLOCK.get(),
                        ModBlocks.BAUHERITE_BLOCK.get(),

                        ModBlocks.MITHRIL_ORE.get(),
                        ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                        ModBlocks.RAW_MITHRIL_BLOCK.get(),
                        ModBlocks.MITRHIL_BLOCK.get(),
                        ModBlocks.MITHRIL_BRAZIER.get(),
                        ModBlocks.MITHRIL_SOUL_BRAZIER.get(),
                        ModBlocks.MITHRIL_LANTERN.get(),
                        ModBlocks.MITHRIL_CHAIN.get(),

                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.SILVER_BLOCK.get(),

                        ModBlocks.AVENRONITE_ORE.get(),
                        ModBlocks.RAW_AVENRONTE_BLOCK.get(),
                        ModBlocks.AVENRONITE_BLOCK.get(),

                        ModBlocks.EDRUELIUM_ORE.get(),
                        ModBlocks.RAW_EDUELIUM_BLOCK.get(),
                        ModBlocks.EDRUELIUM_BLOCK.get(),

                        ModBlocks.PENDORITE_ORE.get(),
                        ModBlocks.RAW_PENDORITE_BLOCK.get(),
                        ModBlocks.PENDORITE_BLOCK.get(),

                        ModBlocks.OBSIDIAN_LANTERN.get(),

                        ModBlocks.ENDSTONE_PENDORITE_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add( ModBlocks.ALUMINIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                        ModBlocks.RAW_ALUMINIUM_BLOCK.get(),
                        ModBlocks.ALUMINIUM_BLOCK.get(),

                        ModBlocks.GRAPHITE_ORE.get(),
                        ModBlocks.GRAPHITE_BLOCK.get(),
                        ModBlocks.BLACKSTONE_LANTERN.get(),

                        ModBlocks.END_STONE_LANTERN.get(),
                        ModBlocks.COBBLED_DEEPSLATE_LANTERN.get(),

                        ModBlocks.GRAPHITE_LANTERN.get(),
                        ModBlocks.CUT_GRAPHITE.get(),
                        ModBlocks.CUT_GRAPHITE_SLAB.get(),
                        ModBlocks.CUT_GRAPHITE_STAIR.get(),
                        ModBlocks.CUT_GRAPHITE_WALL.get(),
                        ModBlocks.GRAPHITE_BLOCK_SLAB.get(),
                        ModBlocks.GRAPHITE_BLOCK_STAIR.get(),
                        ModBlocks.GRAPHITE_BLOCK_WALL.get(),

                        ModBlocks.EYES_IN_BOTTLE.get(),

                        ModBlocks.BRAZIER.get(),
                        ModBlocks.SOUL_BRAZIER.get());




        this.tag(BlockTags.FENCES)
                ;
        this.tag(BlockTags.FENCE_GATES)
                ;
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.END_DEPHSTONE_TILES_WALL.get(),
                ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(),
                ModBlocks.END_DEPHSTONE_WALL.get(),
                ModBlocks.GRAPHITE_BLOCK_WALL.get(),
                ModBlocks.CUT_GRAPHITE_WALL.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.CUT_GRAPHITE_STAIR.get(),
                        ModBlocks.GRAPHITE_BLOCK_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get(),
                        ModBlocks.END_DEPHSTONE_TILES_STAIR.get());

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.CUT_GRAPHITE_SLAB.get(),
                        ModBlocks.GRAPHITE_BLOCK_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(),
                        ModBlocks.END_DEPHSTONE_TILES_SLAB.get());


    }
}

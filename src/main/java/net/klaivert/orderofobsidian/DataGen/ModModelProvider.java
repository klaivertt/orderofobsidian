package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput output)
    {
        super(output, OrderOfObsidian.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.OXYS.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.TEST_TRIM_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        //Blocks
        _blockModels.createTrivialCube(ModBlocks.OXYS_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.OXYS_BLOCK.get());

        _blockModels.createTrivialCube(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get());
        _blockModels.createTrivialCube(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get());
        _blockModels.createTrivialBlock(ModBlocks.END_DEPHSTONE.get(), TexturedModel.COLUMN_ALT);

        _blockModels.family(ModBlocks.COBBLED_END_DEPHSTONE.get())
                .stairs(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get())
                .slab(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get())
                .wall(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get()
                );

        _blockModels.family(ModBlocks.END_DEPHSTONE_BRICKS.get())
                .stairs(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get())
                .slab(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get())
                .wall(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get()
                );

        _blockModels.family(ModBlocks.END_DEPHSTONE_TILES.get())
                .stairs(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get())
                .slab(ModBlocks.END_DEPHSTONE_TILES_SLAB.get())
                .wall(ModBlocks.END_DEPHSTONE_TILES_WALL.get()
                );


    }
}

package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
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
    }
}

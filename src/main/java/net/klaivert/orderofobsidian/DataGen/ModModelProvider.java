package net.klaivert.orderofobsidian.DataGen;

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
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        itemModels.generateFlatItem(ModItems.OXYS.get(), ModelTemplates.FLAT_ITEM);
    }
}

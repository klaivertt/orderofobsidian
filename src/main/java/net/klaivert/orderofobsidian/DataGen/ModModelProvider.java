package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.items.ModArmorMaterials;
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
        _itemModels.generateFlatItem(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        _itemModels.generateFlatItem(ModItems.OXYS_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        _itemModels.generateFlatItem(ModItems.OXYS_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        _itemModels.generateFlatItem(ModItems.OXYS_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        _itemModels.generateFlatItem(ModItems.OXYS_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        _itemModels.generateFlatItem(ModItems.OXYS_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        _itemModels.generateSpear(ModItems.OXYS_SPEAR.get());

        _itemModels.generateTrimmableItem(ModItems.OXYS_HELMET.get(), ModArmorMaterials.OXYS_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        _itemModels.generateTrimmableItem(ModItems.OXYS_CHESTPLATE.get(), ModArmorMaterials.OXYS_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        _itemModels.generateTrimmableItem(ModItems.OXYS_LEGGINGS.get(), ModArmorMaterials.OXYS_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        _itemModels.generateTrimmableItem(ModItems.OXYS_BOOTS.get(), ModArmorMaterials.OXYS_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        

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

        _blockModels.createRotatedPillarWithHorizontalVariant(
                ModBlocks.YEW_LOG.get(),
                TexturedModel.COLUMN,
                TexturedModel.COLUMN_HORIZONTAL
        );

        _blockModels.createRotatedPillarWithHorizontalVariant(
                ModBlocks.STRIPPED_YEW_LOG.get(),
                TexturedModel.COLUMN,
                TexturedModel.COLUMN_HORIZONTAL
        );

        _blockModels.family(ModBlocks.YEW_PLANKS.get())
                .stairs(ModBlocks.YEW_STAIRS.get())
                .slab(ModBlocks.YEW_SLAB.get())
                .pressurePlate(ModBlocks.YEW_PRESSURE_PLATE.get())
                .button(ModBlocks.YEW_BUTTON.get())
                .fence(ModBlocks.YEW_FENCE.get())
                .fenceGate(ModBlocks.YEW_FENCE_GATE.get())
                .door(ModBlocks.YEW_DOOR.get())
                .trapdoor(ModBlocks.YEW_TRAPDOOR.get());

        _blockModels.createTrivialCube(ModBlocks.YEW_LEAVES.get());
        _blockModels.createCrossBlockWithDefaultItem(ModBlocks.YEW_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        _blockModels.createTrivialBlock(ModBlocks.END_HEATHER_STONE.get(), TexturedModel.CUBE_TOP);
    }
}

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
import org.jspecify.annotations.NonNull;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, OrderOfObsidian.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        registerOxysModels(_blockModels, _itemModels);
        registerEndDephstoneModels(_blockModels);
        registerYewModels(_blockModels);
        registerHeatherIslandsModels(_blockModels);
        registerFrozenEndModels(_blockModels);

        _blockModels.createRotatedPillarWithHorizontalVariant(
                ModBlocks.ANCIENT_BONE.get(),
                TexturedModel.COLUMN,
                TexturedModel.COLUMN_HORIZONTAL
        );


        _blockModels.createCrossBlockWithDefaultItem(
                ModBlocks.END_MOSS_GRASS.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
        _blockModels.createCrossBlockWithDefaultItem(
                ModBlocks.TWISTED_END_MOSS_GRASS.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );

        registerAluminiumModels(_blockModels, _itemModels);
        registerLeadModels(_blockModels, _itemModels);
        registerSilverModels(_blockModels, _itemModels);
        registerMithrilModels(_blockModels, _itemModels);
        registerDuraluminModels(_blockModels,_itemModels);
        registerDustModels(_itemModels);

    }

    private void registerOxysModels(@NonNull BlockModelGenerators _blockModels, ItemModelGenerators _itemModels) {
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

        _blockModels.createTrivialCube(ModBlocks.OXYS_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.OXYS_BLOCK.get());
    }


    private void registerEndDephstoneModels(BlockModelGenerators _blockModels) {
        _blockModels.createTrivialCube(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get());
        _blockModels.createTrivialCube(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get());
        _blockModels.createTrivialBlock(ModBlocks.END_DEPHSTONE.get(), TexturedModel.COLUMN_ALT);

        _blockModels.family(ModBlocks.COBBLED_END_DEPHSTONE.get())
                .stairs(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get())
                .slab(ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get())
                .wall(ModBlocks.COBBLED_END_DEPHSTONE_WALL.get());

        _blockModels.family(ModBlocks.END_DEPHSTONE_BRICKS.get())
                .stairs(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get())
                .slab(ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get())
                .wall(ModBlocks.END_DEPHSTONE_BRICKS_WALL.get());

        _blockModels.family(ModBlocks.END_DEPHSTONE_TILES.get())
                .stairs(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get())
                .slab(ModBlocks.END_DEPHSTONE_TILES_SLAB.get())
                .wall(ModBlocks.END_DEPHSTONE_TILES_WALL.get());
    }

    private void registerYewModels(BlockModelGenerators _blockModels) {
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
    }

    private void registerHeatherIslandsModels(BlockModelGenerators _blockModels)
    {
        _blockModels.createTrivialBlock(ModBlocks.END_HEATHER_STONE.get(), TexturedModel.CUBE_TOP);

        _blockModels.createCrossBlockWithDefaultItem(
                ModBlocks.BRACKEN_BUSH.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
    }

    private void registerFrozenEndModels(BlockModelGenerators _blockModels)
    {
        _blockModels.createTrivialBlock(ModBlocks.ICY_END_STONE.get(), TexturedModel.CUBE);
        _blockModels.createTrivialBlock(ModBlocks.ANCIENT_ICE.get(), TexturedModel.CUBE);
        _blockModels.createTrivialBlock(ModBlocks.ANCIENT_PACKED_ICE.get(), TexturedModel.CUBE);
        _blockModels.createTrivialBlock(ModBlocks.ANCIENT_BLUE_ICE.get(), TexturedModel.CUBE);

        _blockModels.createCrossBlockWithDefaultItem(
                ModBlocks.ICY_FIREFLY_BUSH.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
    }

    private void registerAluminiumModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.ALUMINIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.RAW_ALUMINIUM.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.ALUMINIUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        _blockModels.createTrivialCube(ModBlocks.ALUMINIUM_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.ALUMINIUM_BLOCK.get());
        _blockModels.createTrivialCube(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
    }

    private void registerLeadModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.LEAD_INGOT.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.LEAD_DUST.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateTrimmableItem(ModItems.LEAD_BOOTS.get(), ModArmorMaterials.LEAD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        _blockModels.createTrivialCube(ModBlocks.LEAD_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.DEEPSLATE_LEAD_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.LEAD_BLOCK.get());
        _blockModels.createTrivialCube(ModBlocks.RAW_LEAD_BLOCK.get());
    }

    private void registerSilverModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.SILVER_INGOT.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.RAW_SILVER.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.SILVER_DUST.get(), ModelTemplates.FLAT_ITEM);
        _blockModels.createTrivialCube(ModBlocks.SILVER_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SILVER_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.SILVER_BLOCK.get());
        _blockModels.createTrivialCube(ModBlocks.RAW_SILVER_BLOCK.get());
    }

    private void registerMithrilModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.MITHRIL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.MITHRIL_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.RAW_MITHRIL.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.MITHRIL_DUST.get(), ModelTemplates.FLAT_ITEM);
        _blockModels.createTrivialCube(ModBlocks.MITHRIL_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
        _blockModels.createTrivialCube(ModBlocks.MITHRIL_BLOCK.get());
        _blockModels.createTrivialCube(ModBlocks.RAW_MITHRIL_BLOCK.get());
    }

    private void registerDuraluminModels(BlockModelGenerators _blockModels, ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.DURALUMIN_INGOT.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.DURALUMIN_DUST.get(), ModelTemplates.FLAT_ITEM);
        _blockModels.createTrivialCube(ModBlocks.DURALUMIN_BLOCK.get());
    }

    private void registerDustModels(ItemModelGenerators _itemModels)
    {
        _itemModels.generateFlatItem(ModItems.COPPER_DUST.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.IRON_DUST.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.GOLD_DUST.get(), ModelTemplates.FLAT_ITEM);
        _itemModels.generateFlatItem(ModItems.NETHERITE_DUST.get(), ModelTemplates.FLAT_ITEM);
    }
}
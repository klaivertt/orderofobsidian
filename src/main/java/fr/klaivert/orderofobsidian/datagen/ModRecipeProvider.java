package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> AIKIGITE_SMELTABLES = List.of(ModItems.RAW_AIKIGITE.get(),
            ModBlocks.AIKIGITE_ORE.get(), ModBlocks.DEEPSLATE_AIKIGITE_ORE.get());
    private static final List<ItemLike> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM.get(),
            ModBlocks.ALUMINIUM_ORE.get(), ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
    private static final List<ItemLike> AVENRONITE_SMELTABLES = List.of(ModItems.RAW_AVENRONITE.get(),
            ModBlocks.AVENRONITE_ORE.get());
    private static final List<ItemLike> BAUHERITE_SMELTABLES = List.of(ModItems.RAW_BAUHERITE .get(),
            ModBlocks.BAUHERITE_ORE.get(), ModBlocks.DEEPSLATE_BAUHERITE_ORE.get());
    private static final List<ItemLike> EDRUELIUM_SMELTABLES = List.of(ModItems.RAW_EDRUELIUM.get(),
            ModBlocks.EDRUELIUM_ORE.get());

    private static final List<ItemLike> GRAPHITE_SMELTABLES = List.of(ModItems.GRAPHITE_DUST .get());

    private static final List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD .get(),
            ModBlocks.LEAD_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get());

    private static final List<ItemLike> MITHRIL_SMELTABLES = List.of(ModItems.RAW_MITHRIL .get(),
            ModBlocks.MITHRIL_ORE.get(), ModBlocks.DEEPSLATE_MITHRIL_ORE.get());

    private static final List<ItemLike> PENDORITE_SMELTABLES = List.of(ModItems.RAW_PENDORITE .get(),
            ModBlocks.PENDORITE_ORE.get(), ModBlocks.ENDSTONE_PENDORITE_ORE.get());

    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER .get(),
            ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get());
    private static final List<ItemLike> STEEL_SMELTABLES = List.of(ModItems.DUST_STEEL .get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, AIKIGITE_SMELTABLES, RecipeCategory.MISC, ModItems.AIKIGITE_INGOT.get(), 0.25f, 200, "aikigite_ingot");
        oreBlasting(pWriter, AIKIGITE_SMELTABLES, RecipeCategory.MISC, ModItems.AIKIGITE_INGOT.get(), 0.25f, 100, "aikigite_ingot");

        oreSmelting(pWriter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f, 200, "aluminium_ingot");
        oreBlasting(pWriter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 0.25f, 100, "aluminium_ingot");

        oreSmelting(pWriter, AVENRONITE_SMELTABLES, RecipeCategory.MISC, ModItems.AVENRONITE_INGOT.get(), 1.25f, 250, "avenronite_ingot");
        oreBlasting(pWriter, AVENRONITE_SMELTABLES, RecipeCategory.MISC, ModItems.AVENRONITE_INGOT.get(), 1.25f, 125, "avenronite_ingot");

        oreSmelting(pWriter, BAUHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.BAUHERITE_INGOT.get(), 0.25f, 200, "bauherite_ingot");
        oreBlasting(pWriter, BAUHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.BAUHERITE_INGOT.get(), 0.25f, 100, "bauherite_ingot");

        oreSmelting(pWriter, EDRUELIUM_SMELTABLES, RecipeCategory.MISC, ModItems.EDRUELIUM_INGOT.get(), 1.25f, 250, "edruelium_ingot");
        oreBlasting(pWriter, EDRUELIUM_SMELTABLES, RecipeCategory.MISC, ModItems.EDRUELIUM_INGOT.get(), 1.25f, 125, "edruelium_ingot");

        oreSmelting(pWriter, GRAPHITE_SMELTABLES, RecipeCategory.MISC, ModItems.GRAPHITE_INGOT.get(), 0.25f, 180, "graphite_ingot");
        oreBlasting(pWriter, GRAPHITE_SMELTABLES, RecipeCategory.MISC, ModItems.GRAPHITE_INGOT.get(), 0.25f, 90, "graphite_ingot");

        oreSmelting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.8f, 200, "lead_ingot");
        oreBlasting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.8f, 100, "lead_ingot");

        oreSmelting(pWriter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.2f, 200, "mithril_ingot");
        oreBlasting(pWriter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.2f, 100, "mithril_ingot");

        oreSmelting(pWriter, PENDORITE_SMELTABLES, RecipeCategory.MISC, ModItems.PENDORITE_INGOT.get(), 1.25f, 250, "pendorite_ingot");
        oreBlasting(pWriter, PENDORITE_SMELTABLES, RecipeCategory.MISC, ModItems.PENDORITE_INGOT.get(), 1.25f, 125, "pendorite_ingot");

        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.1f, 200, "silver_ingot");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.1f, 100, "silver_ingot");

        oreSmelting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.8f, 200, "steel_ingot");
        oreBlasting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.8f, 100, "steel_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AIKIGITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AIKIGITE_INGOT.get(), 9)
                .requires(ModBlocks.AIKIGITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AIKIGITE_BLOCK.get()), has(ModBlocks.AIKIGITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AVENRONITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AVENRONITE_INGOT.get(), 9)
                .requires(ModBlocks.AVENRONITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AVENRONITE_BLOCK.get()), has(ModBlocks.AVENRONITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAUHERITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BAUHERITE_INGOT.get(), 9)
                .requires(ModBlocks.BAUHERITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BAUHERITE_BLOCK.get()), has(ModBlocks.BAUHERITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EDRUELIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EDRUELIUM_INGOT.get(), 9)
                .requires(ModBlocks.EDRUELIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.EDRUELIUM_BLOCK.get()), has(ModBlocks.EDRUELIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAPHITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GRAPHITE_INGOT.get(), 9)
                .requires(ModBlocks.GRAPHITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GRAPHITE_BLOCK.get()), has(ModBlocks.GRAPHITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEAD_BLOCK.get()), has(ModBlocks.LEAD_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MITRHIL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 9)
                .requires(ModBlocks.MITRHIL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MITRHIL_BLOCK.get()), has(ModBlocks.MITRHIL_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXYS_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OXYS.get(), 9)
                .requires(ModBlocks.OXYS_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.OXYS_BLOCK.get()), has(ModBlocks.OXYS_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PENDORITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PENDORITE_INGOT.get(), 9)
                .requires(ModBlocks.PENDORITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PENDORITE_BLOCK.get()), has(ModBlocks.PENDORITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AVENRONITE_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AVENRONITE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AVENRONITE_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AVENRONITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_BOW.get())
                .pattern("SA")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .define('A', Items.BOW)
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ALUMINUM_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ALUMINUM_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ALUMINUM_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ALUMINUM_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AVENRONITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.AVENRONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.AVENRONITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BONE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.BONE)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BONE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.BONE)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BONE_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.BONE)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BONE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.BONE)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EDRUELIUM_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EDRUELIUM_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EDRUELIUM_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EDRUELIUM_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EDRUELIUM_BOW.get())
                .pattern("SA")
                .define('S', ModItems.EDRUELIUM_INGOT.get())
                .define('A', Items.BOW)
                .unlockedBy(getHasName(ModItems.EDRUELIUM_INGOT.get()), has(ModItems.EDRUELIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OXYS_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OXYS_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OXYS_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OXYS_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_BOW.get())
                .pattern("SA")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.BOW)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_LEGGING.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PENDORITE_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PENDORITE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PENDORITE_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PENDORITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUST_STEEL.get())
                .pattern("SA")
                .define('S', Items.IRON_INGOT)
                .define('A', ItemTags.COALS)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_BOW.get())
                .pattern("SA")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .define('A', Items.BOW)
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_BOW.get())
                .pattern("SA")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.BOW)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CANDY_APPLE.get())
                .pattern(" S ")
                .pattern("SAS")
                .pattern(" S ")
                .define('S', Items.SUGAR)
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.DIAMOND_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.DIAMOND)
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EMERALD_APPLE.get())
                .pattern(" S ")
                .pattern("SAS")
                .pattern(" S ")
                .define('S', Items.EMERALD)
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.OBSIDIAN_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.NETHERITE_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.NETHERITE_INGOT)
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.OXYS_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PENDORITE_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SADDLE)
                .pattern("SSS")
                .pattern("SAS")
                .pattern(" E ")
                .define('S', Items.LEATHER)
                .define('A', Items.STRING)
                .define('E', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GUNPOWDER)
                .pattern("SA")
                .define('S', ModItems.GRAPHITE_DUST.get())
                .define('A', ItemTags.COALS)
                .unlockedBy(getHasName(ModItems.GRAPHITE_DUST.get()), has(ModItems.GRAPHITE_DUST.get()))
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR)
                .pattern("  S")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.GOLD_INGOT)
                .define('A', Items.SADDLE)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR)
                .pattern("  S")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.IRON_INGOT)
                .define('A', Items.SADDLE)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR)
                .pattern("  S")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.DIAMOND)
                .define('A', Items.SADDLE)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PENDORITE_HORSE_ARMOR.get())
                .pattern("  S")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.PENDORITE_INGOT.get())
                .define('A', Items.SADDLE)
                .unlockedBy(getHasName(ModItems.PENDORITE_INGOT.get()), has(ModItems.PENDORITE_INGOT.get()))
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.NETHERITE_HORSE_ARMOR.get())
                .pattern("SA")
                .define('S', Items.NETHERITE_INGOT)
                .define('A', Items.DIAMOND_HORSE_ARMOR)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .unlockedBy(getHasName(Items.DIAMOND_HORSE_ARMOR), has(Items.DIAMOND_HORSE_ARMOR))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OXYS_HORSE_ARMOR.get())
                .pattern("  S")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.OXYS.get())
                .define('A', Items.SADDLE)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS.get()))
                .unlockedBy(getHasName(Items.SADDLE), has(Items.SADDLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOSS_HORSE_ARMROR.get())
                .pattern("SA")
                .define('S', Items.MOSS_BLOCK)
                .define('A', Items.IRON_HORSE_ARMOR)
                .unlockedBy(getHasName(Items.MOSS_BLOCK), has(Items.MOSS_BLOCK))
                .unlockedBy(getHasName(Items.IRON_HORSE_ARMOR), has(Items.IRON_HORSE_ARMOR))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WITHER_SKELETON_SKULL)
                .pattern("AEA")
                .pattern("ESE")
                .pattern("AEA")
                .define('S', Items.DIAMOND)
                .define('A', Items.BONE)
                .define('E', ModItems.WITHER_SKELETON_SHARD.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                .pattern("SAS")
                .pattern("A A")
                .define('S', Items.IRON_NUGGET)
                .define('A', Items.CHAIN)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                .pattern("S S")
                .pattern("AAA")
                .pattern("SAS")
                .define('S', Items.IRON_NUGGET)
                .define('A', Items.CHAIN)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                .pattern("SAS")
                .pattern("A A")
                .pattern("S S")
                .define('S', Items.IRON_NUGGET)
                .define('A', Items.CHAIN)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                .pattern("S S")
                .pattern("A A")
                .define('S', Items.IRON_NUGGET)
                .define('A', Items.CHAIN)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WITHER_HELMET.get())
                .pattern("SA")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_HELMET.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .unlockedBy(getHasName(ModItems.BONE_HELMET.get()), has(ModItems.BONE_HELMET.get()) )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WITHER_CHESTPLATE.get())
                .pattern("SA")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_CHESTPLATE.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .unlockedBy(getHasName(ModItems.BONE_HELMET.get()), has(ModItems.BONE_HELMET.get()) )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WITHER_LEGGING.get())
                .pattern("SA")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_LEGGING.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .unlockedBy(getHasName(ModItems.BONE_HELMET.get()), has(ModItems.BONE_HELMET.get()) )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WITHER_BOOTS.get())
                .pattern("SA")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_BOOTS.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .unlockedBy(getHasName(ModItems.BONE_HELMET.get()), has(ModItems.BONE_HELMET.get()) )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LEAD_CHAIN.get())
                .pattern("S")
                .pattern("S")
                .define('S', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()) )
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHANDELIER.get())
                .pattern(" A ")
                .pattern("ASA")
                .pattern("SSS")
                .define('S', ModItems.LEAD_INGOT.get())
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOUL_CHANDELIER.get())
                .pattern(" A ")
                .pattern("ASA")
                .pattern("SSS")
                .define('S', ModItems.LEAD_INGOT.get())
                .define('A', Items.SOUL_TORCH)
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .unlockedBy(getHasName(Items.SOUL_TORCH), has(Items.SOUL_TORCH))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_BRAZIER.get())
                .pattern("SAS")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.CAMPFIRE)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .unlockedBy(getHasName(Items.CAMPFIRE), has(Items.CAMPFIRE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_SOUL_BRAZIER.get())
                .pattern("SAS")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.SOUL_CAMPFIRE)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .unlockedBy(getHasName(Items.SOUL_CAMPFIRE), has(Items.SOUL_CAMPFIRE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BRAZIER.get())
                .pattern("SAS")
                .define('S', Items.IRON_INGOT)
                .define('A', Items.SOUL_CAMPFIRE)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.SOUL_CAMPFIRE), has(Items.SOUL_CAMPFIRE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOUL_BRAZIER.get())
                .pattern("SAS")
                .define('S', Items.IRON_INGOT)
                .define('A', Items.SOUL_CAMPFIRE)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.SOUL_CAMPFIRE), has(Items.SOUL_CAMPFIRE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHEST_GAME.get())
                .pattern("ABC")
                .pattern(" D ")
                .define('A', Items.BLACK_DYE)
                .define('B', Items.CLAY_BALL)
                .define('C', Items.WHITE_DYE)
                .define('D', ItemTags.WOODEN_SLABS)
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                .unlockedBy(getHasName(Items.WHITE_DYE), has(Items.WHITE_DYE))
                .unlockedBy(getHasName(Items.BLACK_DYE), has(Items.BLACK_DYE))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAPHITE_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', ModItems.GRAPHITE_INGOT.get())
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_STEM_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.WARPED_STEM)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.WARPED_STEM), has(Items.WARPED_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_STONE_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.END_STONE)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.END_STONE), has(Items.END_STONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_STEM_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.CRIMSON_STEM)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.CRIMSON_STEM), has(Items.CRIMSON_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COBBLED_DEEPSLATE_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.COBBLED_DEEPSLATE)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.COBBLED_DEEPSLATE), has(Items.COBBLED_DEEPSLATE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OBSIDIAN_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_LANTERN.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('S', Items.BLACKSTONE)
                .define('A', Items.TORCH)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.EYES_IN_BOTTLE.get())
                .pattern("ESE")
                .pattern("SAS")
                .pattern("ESE")
                .define('E', ModItems.LEAD_INGOT.get())
                .define('A', Items.ENDER_EYE)
                .define('S', Items.GLASS)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_LANTERN.get())
                .pattern("ESE")
                .pattern("SAS")
                .pattern("ESE")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.TORCH)
                .define('E', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_CHAIN.get())
                .pattern("E")
                .pattern("S")
                .pattern("E")
                .define('E', Items.IRON_INGOT)
                .define('S', ModItems.MITHRIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_SLAB.get())
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE.get()), has(ModBlocks.END_DEPHSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_STAIR.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE.get()), has(ModBlocks.END_DEPHSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_WALL.get())
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE.get()), has(ModBlocks.END_DEPHSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_BRICKS.get())
                .pattern("EE")
                .pattern("EE")
                .define('E', ModBlocks.END_DEPHSTONE.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE.get()), has(ModBlocks.END_DEPHSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get())
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_BRICKS_STAIR.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_BRICKS_WALL.get())
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_TILES.get())
                .pattern("EE")
                .pattern("EE")
                .define('E', ModBlocks.END_DEPHSTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_TILES_SLAB.get())
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_TILES.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_TILES.get()), has(ModBlocks.END_DEPHSTONE_TILES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_TILES_STAIR.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_TILES.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_TILES.get()), has(ModBlocks.END_DEPHSTONE_TILES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.END_DEPHSTONE_TILES_WALL.get())
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModBlocks.END_DEPHSTONE_TILES.get())
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_TILES.get()), has(ModBlocks.END_DEPHSTONE_TILES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CUT_GRAPHITE.get())
                .pattern("EE")
                .pattern("EE")
                .define('E', ModBlocks.GRAPHITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GRAPHITE_BLOCK.get()), has(ModBlocks.GRAPHITE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CUT_GRAPHITE_SLAB.get())
                .pattern("EEE")
                .define('E', ModBlocks.CUT_GRAPHITE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_GRAPHITE.get()), has(ModBlocks.CUT_GRAPHITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CUT_GRAPHITE_STAIR.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .define('E', ModBlocks.CUT_GRAPHITE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_GRAPHITE.get()), has(ModBlocks.CUT_GRAPHITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CUT_GRAPHITE_WALL.get())
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModBlocks.CUT_GRAPHITE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_GRAPHITE.get()), has(ModBlocks.CUT_GRAPHITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAPHITE_BLOCK_SLAB.get())
                .pattern("EEE")
                .define('E', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAPHITE_BLOCK_STAIR.get())
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .define('E', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAPHITE_BLOCK_WALL.get())
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.GRAPHITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.GRAPHITE_INGOT.get()), has(ModItems.GRAPHITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AIKIGITE_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AIKIGITE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AIKIGITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AIKIGITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AIKIGITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.AIKIGITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.AIKIGITE_INGOT.get()), has(ModItems.AVENRONITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAUHERITE_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAUHERITE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAUHERITE_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BAUHERITE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BAUHERITE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.BAUHERITE_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BAUHERITE_INGOT.get()), has(ModItems.BAUHERITE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BONE_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', Items.BONE)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BONE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', Items.BONE)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BONE_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', Items.BONE)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BONE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', Items.BONE)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BONE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', Items.BONE)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.MITHRIL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', Items.OBSIDIAN)
                .define('A', Items.STICK)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_AXE.get())
                .pattern("SS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STEEL_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("A")
                .define('S', ModItems.STEEL_INGOT.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WITHER_AXE.get())
                .pattern("AS")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_AXE.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WITHER_SHOVEL.get())
                .pattern("AS")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_SHOVEL.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WITHER_HOE.get())
                .pattern("AS")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_HOE.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.WITHER_PICKAXE.get())
                .pattern("AS")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_PICKAXE.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WITHER_SWORD.get())
                .pattern("AS")
                .define('S', ModItems.WITHER_SKELETON_SHARD.get())
                .define('A', ModItems.BONE_SWORD.get())
                .unlockedBy(getHasName(ModItems.WITHER_SKELETON_SHARD.get()), has(ModItems.WITHER_SKELETON_SHARD.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  OrderOfObsidianMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

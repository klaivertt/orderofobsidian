package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
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
                .define('S', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
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

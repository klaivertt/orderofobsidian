package fr.klaivert.orderofobsidian.datagen;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
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

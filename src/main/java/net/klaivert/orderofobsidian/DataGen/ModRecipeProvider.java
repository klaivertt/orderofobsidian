package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Order Of Obsidian Recipes";
        }
    }


    private static final String OXYS_GROUP = "oxys";

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXYS_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS))
                .group(OXYS_GROUP)
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.OXYS.get(), 9)
                .requires(ModBlocks.OXYS_BLOCK)
                .unlockedBy(getHasName(ModBlocks.OXYS_BLOCK.get()), has(ModBlocks.OXYS_BLOCK))
                .group(OXYS_GROUP)
                .save(output);

        List<ItemLike> OXYS_SMELTABLES = List.of(ModBlocks.OXYS_ORE);

        oreSmelting(OXYS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OXYS.get(), 10.f, 450, OXYS_GROUP);
        oreBlasting(OXYS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OXYS.get(), 10.f, 250, OXYS_GROUP);

    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for (ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, OrderOfObsidian.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}

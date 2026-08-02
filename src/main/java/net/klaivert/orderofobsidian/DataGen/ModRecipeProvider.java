package net.klaivert.orderofobsidian.DataGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
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
    private static final String OXYS_UPGRADE_GROUP = "oxys_upgrade_template";

    private static final String END_DEPHSTONE_GROUP = "end_depthstone";
    private static final String YEW_GROUP = "yew";

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



        shaped(RecipeCategory.MISC, ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("SDS")
                .pattern("ONO")
                .pattern("SDS")
                .define('O', ModItems.OXYS.get())
                .define('D', Items.DIAMOND)
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModItems.OXYS.get()), has(ModItems.OXYS))
                .group(OXYS_UPGRADE_GROUP)
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .requires(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get())
                .requires(Items.DIAMOND)
                .requires(Items.NETHERITE_SCRAP, 2)
                .requires( ModItems.OXYS.get())
                .unlockedBy(getHasName(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE))
                .group(OXYS_UPGRADE_GROUP)
                .save(output, OrderOfObsidian.MOD_ID + ":oxys_upgrade_smithing_template_duplicate");

        shapeless(RecipeCategory.MISC, ModItems.OXYS.get(), 9)
                .requires(ModBlocks.OXYS_BLOCK)
                .unlockedBy(getHasName(ModBlocks.OXYS_BLOCK.get()), has(ModBlocks.OXYS_BLOCK))
                .group(OXYS_GROUP)
                .save(output);

        List<ItemLike> OXYS_SMELTABLES = List.of(ModBlocks.OXYS_ORE);

        oreSmelting(OXYS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OXYS.get(), 10.f, 450, OXYS_GROUP);
        oreBlasting(OXYS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OXYS.get(), 10.f, 250, OXYS_GROUP);

        oxysSmithing(Items.NETHERITE_SWORD, RecipeCategory.COMBAT, ModItems.OXYS_SWORD.get());
        oxysSmithing(Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.OXYS_PICKAXE.get());
        oxysSmithing(Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.OXYS_SHOVEL.get());
        oxysSmithing(Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.OXYS_AXE.get());
        oxysSmithing(Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.OXYS_HOE.get());

        oxysSmithing(Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.OXYS_HELMET.get());
        oxysSmithing(Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.OXYS_CHESTPLATE.get());
        oxysSmithing(Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.OXYS_LEGGINGS.get());
        oxysSmithing(Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.OXYS_BOOTS.get());
        oxysSmithing(Items.NETHERITE_SPEAR, RecipeCategory.COMBAT, ModItems.OXYS_SPEAR.get());

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.END_DEPHSTONE)
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE.get()), has(ModBlocks.END_DEPHSTONE))
                .group(END_DEPHSTONE_GROUP)
                .save(output);


        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.END_DEPHSTONE_BRICKS)
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS))
                .group(END_DEPHSTONE_GROUP)
                .save(output);

        smeltingResultFromBase(ModBlocks.CRACKED_END_DEPHSTONE_BRICKS.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());
        smeltingResultFromBase(ModBlocks.CRACKED_END_DEPHSTONE_TILES.get(), ModBlocks.END_DEPHSTONE_TILES.get());

        stairBuilder(ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get(), Ingredient.of(ModBlocks.COBBLED_END_DEPHSTONE))
                .unlockedBy(getHasName(ModBlocks.COBBLED_END_DEPHSTONE.get()), has(ModBlocks.COBBLED_END_DEPHSTONE))
                .group(END_DEPHSTONE_GROUP).save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get(), ModBlocks.COBBLED_END_DEPHSTONE.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_END_DEPHSTONE_WALL.get(), ModBlocks.COBBLED_END_DEPHSTONE.get());

        stairBuilder(ModBlocks.END_DEPHSTONE_TILES_STAIRS.get(), Ingredient.of(ModBlocks.END_DEPHSTONE_TILES))
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_TILES.get()), has(ModBlocks.END_DEPHSTONE_TILES))
                .group(END_DEPHSTONE_GROUP).save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES_SLAB.get(), ModBlocks.END_DEPHSTONE_TILES.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES_WALL.get(), ModBlocks.END_DEPHSTONE_TILES.get());

        stairBuilder(ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get(), Ingredient.of(ModBlocks.END_DEPHSTONE_BRICKS))
                .unlockedBy(getHasName(ModBlocks.END_DEPHSTONE_BRICKS.get()), has(ModBlocks.END_DEPHSTONE_BRICKS))
                .group(END_DEPHSTONE_GROUP).save(output);

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());

        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS.get(), ModBlocks.END_DEPHSTONE.get());

        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_END_DEPHSTONE_STAIRS.get(), ModBlocks.COBBLED_END_DEPHSTONE.get());
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_END_DEPHSTONE_SLAB.get(), ModBlocks.COBBLED_END_DEPHSTONE.get(), 2);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_END_DEPHSTONE_WALL.get(), ModBlocks.COBBLED_END_DEPHSTONE.get());

        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS_STAIRS.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS_SLAB.get(), ModBlocks.END_DEPHSTONE_BRICKS.get(), 2);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_BRICKS_WALL.get(), ModBlocks.END_DEPHSTONE_BRICKS.get());

        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES_STAIRS.get(), ModBlocks.END_DEPHSTONE_TILES.get());
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES_SLAB.get(), ModBlocks.END_DEPHSTONE_TILES.get(), 2);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_DEPHSTONE_TILES_WALL.get(), ModBlocks.END_DEPHSTONE_TILES.get());

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_PLANKS.get(), 4)
                .requires(ModBlocks.YEW_LOG.get())
                .unlockedBy(getHasName(ModBlocks.YEW_LOG.get()), has(ModBlocks.YEW_LOG))
                .group(YEW_GROUP)
                .save(output);

        stairBuilder(ModBlocks.YEW_STAIRS.get(), Ingredient.of(ModBlocks.YEW_PLANKS))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_SLAB.get(), ModBlocks.YEW_PLANKS.get());

        buttonBuilder(ModBlocks.YEW_BUTTON.get(), Ingredient.of(ModBlocks.YEW_PLANKS))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);
        pressurePlate(ModBlocks.YEW_PRESSURE_PLATE.get(), ModBlocks.YEW_PLANKS.get());

        fenceBuilder(ModBlocks.YEW_FENCE.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);
        fenceGateBuilder(ModBlocks.YEW_FENCE_GATE.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);

        doorBuilder(ModBlocks.YEW_DOOR.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);
        trapdoorBuilder(ModBlocks.YEW_TRAPDOOR.get(), Ingredient.of(ModBlocks.YEW_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.YEW_PLANKS.get()), has(ModBlocks.YEW_PLANKS))
                .group(YEW_GROUP).save(output);
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


    private void stonecutting(RecipeCategory category, ItemLike result, ItemLike base) {
        stonecutting(category, result, base, 1);
    }

    private void stonecutting(RecipeCategory category, ItemLike result, ItemLike base, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), category, result, count)
                .unlockedBy(getHasName(base), has(base))
                .save(output, OrderOfObsidian.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(base) + "_stonecutting");
    }

    private void oxysSmithing(ItemLike base, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(base),
                        Ingredient.of(ModItems.OXYS.get()),
                        category,
                        result
                )
                .unlocks(getHasName(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.OXYS_UPGRADE_SMITHING_TEMPLATE))
                .save(output, OrderOfObsidian.MOD_ID + ":" + getItemName(result) + "_smithing");
    }
}

package com.game.chess.datagen;

import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;
/* CRRecipes
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *      Create Recipes need to get items in survival
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Modified for chess, created stonecutter recipies for chess pieces and board pieces
 */
public class CRRecipes extends RecipeProvider {
    public CRRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_BRASS.get()),
                        Registration.BRASS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_BRASS.get()))
                .save(consumer);
        //ShapedRecipe blackTileRecipe = ShapedRecipe.
        /*ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(Items.CALCITE)
        .requires(Ingredient.of(Registration.WHITE_TILE_ITEM.get()))
                .unlockedBy("has_calcite", has(Items.CALCITE))
        .save (consumer);*/
        //ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(Registration.RAW_BRASS.get())
                //.requires(Ingredient.of(Registration.BRASS_INGOT.get()))
               // .unlockedBy("has_iron", has(Items.RAW_IRON))
                //.save (consumer);



    }
}

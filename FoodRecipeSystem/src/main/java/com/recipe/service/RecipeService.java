package com.recipe.service;

import java.util.List;

import com.recipe.entity.Recipe;

public interface RecipeService {
	List<Recipe> getAllRecipe();
	Recipe getAllRecipeId(long id);
	
	void deleteRecipe(Long id);
	Recipe getRescipe(Recipe recipe);
	Recipe getRecipeById(Long id);
	Recipe saveRecipe(Recipe recipe);
}

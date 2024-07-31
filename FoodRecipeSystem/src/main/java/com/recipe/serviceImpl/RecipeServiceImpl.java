package com.recipe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.entity.Recipe;
import com.recipe.repository.RecipeRepository;
import com.recipe.service.RecipeService;

@Service

public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public List<Recipe> getAllRecipe() {
		// TODO Auto-generated method stub
		return recipeRepository.findAll();
	}

	@Override
	public Recipe getAllRecipeId(long id) {
		// TODO Auto-generated method stub
		return recipeRepository.findById(id).orElse(null);
	}

	@Override
	public Recipe getRescipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return recipeRepository.save(recipe);
	}

	@Override
	public void deleteRecipe(Long id) {
		// TODO Auto-generated method stub
		recipeRepository.deleteById(id);
		
	}

	@Override
	public Recipe getRecipeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe saveRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

}

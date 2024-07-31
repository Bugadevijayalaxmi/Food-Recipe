package com.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.entity.Recipe;
import com.recipe.service.RecipeService;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping
	public List<Recipe>getAllRecipe(){
		return recipeService.getAllRecipe();
		
	}
	@GetMapping("{/id}")
	public Recipe getRecipeById(@PathVariable Long id) {
		return recipeService.getRecipeById(id);
		
	}
	
	@PostMapping
	public Recipe createRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
		return recipeService.saveRecipe(recipe);
	
	}
	@PutMapping("/{id}")
	public Recipe updateRecipe(@PathVariable Long id,@RequestBody Recipe recipe) {
		Recipe existingRecipe= recipeService.getAllRecipeId(id);
		if (existingRecipe !=null) {
			recipe.setRecipeId(id);
			return recipeService.saveRecipe(recipe);
	}
	
		return null;
		
	}
	@DeleteMapping("{/id}")
	public void deleteRecipe(@PathVariable Long id) {
		recipeService.deleteRecipe(id);
	}
}






















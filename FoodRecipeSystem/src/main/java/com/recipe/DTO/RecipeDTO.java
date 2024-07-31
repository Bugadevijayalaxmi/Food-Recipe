package com.recipe.DTO;

import java.util.List;

import lombok.Data;
@Data

public class RecipeDTO {
	private Long id;
	private String recipeName;
	private String description;
	private String recipeType;
	private String quantity;
	private String regional;
	private boolean isVeg;
	private List<IngredientDTO> ingredients;
	

}

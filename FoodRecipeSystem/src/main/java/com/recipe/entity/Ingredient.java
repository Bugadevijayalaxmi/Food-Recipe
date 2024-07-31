package com.recipe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class Ingredient {
	
	@Id
	@GeneratedValue
	
	private Long ingredientId;
	private String ingname;
	private String ingType;
	private String ingAmount;
	
	@ManyToOne
	@JoinColumn(name="recipe_id")
	private Recipe recipe;

}

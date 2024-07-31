package com.recipe.entity;
import java.util.List;
import java.util.Locale.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long ireciped;
	private String description;
	private String recipeType;
	private String quantity;
	private String regional;
	private boolean isveg;
	
	
	@ManyToMany
	@JoinColumn(name = "category_id")
	private Category category;
	
   @OneToMany(mappedBy ="recipe", cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	
	private List<Ingredient> ingredients;

public void setRecipeId(Long id) {
	// TODO Auto-generated method stub
	
}

}

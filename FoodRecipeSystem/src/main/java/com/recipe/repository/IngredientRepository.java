package com.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recipe.entity.Ingredient;



@Repository

public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
}

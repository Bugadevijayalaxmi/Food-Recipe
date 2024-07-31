package com.recipe.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity

public class User {
	
	@Id
	@GeneratedValue
	private Long userId;
	private String password;
	private String signAccount;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Recipe> recipe;

}

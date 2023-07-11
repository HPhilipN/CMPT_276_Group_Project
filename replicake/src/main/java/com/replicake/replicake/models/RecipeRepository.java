package com.replicake.replicake.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe findById(int uid);
}

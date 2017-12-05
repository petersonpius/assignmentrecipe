package com.peter.recipe.assignmentrecipe.Repository;

import com.peter.recipe.assignmentrecipe.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepo extends CrudRepository<Ingredient,Long> {

}

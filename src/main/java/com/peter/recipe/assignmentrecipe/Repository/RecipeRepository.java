package com.peter.recipe.assignmentrecipe.Repository;

import com.peter.recipe.assignmentrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}

package com.peter.recipe.assignmentrecipe.Repository;

import com.peter.recipe.assignmentrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}

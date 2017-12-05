package com.peter.recipe.assignmentrecipe.Repository;

import com.peter.recipe.assignmentrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
   Optional<Category> findByDescription(String description);
}

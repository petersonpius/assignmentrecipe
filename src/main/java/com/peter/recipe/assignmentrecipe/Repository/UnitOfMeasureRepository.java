package com.peter.recipe.assignmentrecipe.Repository;

import com.peter.recipe.assignmentrecipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>{
    Optional<UnitOfMeasure> findByDescription(String description);
}

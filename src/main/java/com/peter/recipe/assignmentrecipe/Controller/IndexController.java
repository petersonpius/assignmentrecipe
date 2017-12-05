package com.peter.recipe.assignmentrecipe.Controller;

import com.peter.recipe.assignmentrecipe.Repository.CategoryRepository;
import com.peter.recipe.assignmentrecipe.Repository.UnitOfMeasureRepository;
import com.peter.recipe.assignmentrecipe.domain.Category;
import com.peter.recipe.assignmentrecipe.domain.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional=categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Pinch");
        System.out.println("UOM id "+ unitOfMeasureOptional.get().getId());
        System.out.println("Cat id "+ categoryOptional.get().getId());
        return "index";
    }
}

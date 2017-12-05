package com.peter.recipe.assignmentrecipe.BootStrap;

import com.peter.recipe.assignmentrecipe.Enumerations.Difficulty;
import com.peter.recipe.assignmentrecipe.Repository.CategoryRepository;
import com.peter.recipe.assignmentrecipe.Repository.RecipeRepository;
import com.peter.recipe.assignmentrecipe.Repository.UnitOfMeasureRepository;
import com.peter.recipe.assignmentrecipe.domain.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class RecipeBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private RecipeRepository recipeRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private CategoryRepository categoryRepository;

    public RecipeBootStrap(RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();

    }
    private void initData(){
        UnitOfMeasure eachUOM=new UnitOfMeasure();
        eachUOM.setDescription("Each");

        unitOfMeasureRepository.save(eachUOM);

        Ingredient avacado=new Ingredient("Avacado",new BigDecimal(0.3),eachUOM);

        Notes avacadoNote=new Notes();
        avacadoNote.setRecipeNotes("bla avacado notes");

        Optional<Category> AmericanCategoryOptional=categoryRepository.findByDescription("American");
        System.out.println("American catrgory option ########"+ AmericanCategoryOptional.get().getId());
        Recipe avacadoRecipe=new Recipe();
        Set<Ingredient> IngredientsList=new HashSet();
        IngredientsList.add(avacado);
        System.out.println("Ingredirnt size ***********************"+IngredientsList.size());
        avacadoRecipe.setIngredients(IngredientsList);

        Set<Category> avacadoCategory=new HashSet<>();
        avacadoCategory.add(AmericanCategoryOptional.get());
        avacadoRecipe.setCategories(avacadoCategory);

        avacadoRecipe.setNotes(avacadoNote);
        avacadoRecipe.setDirections("hsadkjds");
        avacadoRecipe.setDescription("djsgs");
        avacadoRecipe.setDifficulty(Difficulty.EASY);

        recipeRepository.save(avacadoRecipe);






    }
}

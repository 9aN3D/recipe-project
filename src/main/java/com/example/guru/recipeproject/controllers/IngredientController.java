package com.example.guru.recipeproject.controllers;

import com.example.guru.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IngredientController {

    private final RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    @RequestMapping("/recipe/{id}/ingredients")
    public String getListIngredients(@PathVariable String id, Model model){
        log.debug("Getting ingredient list for recipe id: " + id);

        //-->>findCommandById()
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "recipe/ingredient/list";
    }

}

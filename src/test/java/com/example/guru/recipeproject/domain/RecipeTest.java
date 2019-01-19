package com.example.guru.recipeproject.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RecipeTest {
    private static final Long RECIPE_ID = 1L;
    private static final Integer COOK_TIME = Integer.valueOf("5");
    private static final Integer PREP_TIME = Integer.valueOf("7");
    private static final String DESCRIPTION = "My Recipe";
    private static final String DIRECTIONS = "Directions";
    private static final Difficulty DIFFICULTY = Difficulty.EASY;
    private static final Integer SERVINGS = Integer.valueOf("3");
    private static final String SOURCE = "Source";
    private static final String URL = "Some URL";
    private static final Set<Ingredient> INGREDIENTS = new HashSet<>();
    private static final Notes NOTES = new Notes();
    private static final Set<Category> CATEGORIES = new HashSet<>();
    private static final Ingredient INGREDIENT = new Ingredient();

    private Recipe recipe;

    @Before
    public void setUp() throws Exception {
        recipe = new Recipe();
    }

    @Test
    public void SetNotes() {
        recipe.setNotes(NOTES);

        assertEquals(NOTES, recipe.getNotes());
        assertEquals(NOTES.getRecipe(),recipe);
    }

    @Test
    public void testNullSetNotes() {
        recipe.setNotes(null);

        assertNull(recipe.getNotes());
    }

    @Test
    public void addIngredient() {
        recipe.addIngredient(INGREDIENT);

        assertTrue(recipe.getIngredients().contains(INGREDIENT));
        assertEquals(1,recipe.getIngredients().size());
    }

    @Test
    public void getId() {
        recipe.setId(RECIPE_ID);

        assertEquals(RECIPE_ID,recipe.getId());
    }

    @Test
    public void getDescription() {
        recipe.setDescription(DESCRIPTION);

        assertEquals(DESCRIPTION,recipe.getDescription());
    }

    @Test
    public void getPrepTime() {
        recipe.setPrepTime(PREP_TIME);

        assertEquals(PREP_TIME, recipe.getPrepTime());
    }

    @Test
    public void getCookTime() {
        recipe.setCookTime(COOK_TIME);

        assertEquals(COOK_TIME, recipe.getCookTime());
    }

    @Test
    public void getServings() {
        recipe.setServings(SERVINGS);

        assertEquals(SERVINGS, recipe.getServings());
    }

    @Test
    public void getSource() {
        recipe.setSource(SOURCE);

        assertEquals(SOURCE, recipe.getSource());
    }

    @Test
    public void getUrl() {
        recipe.setUrl(URL);

        assertEquals(URL, recipe.getUrl());
    }

    @Test
    public void getDirections() {
        recipe.setDirections(DIRECTIONS);

        assertEquals(DIRECTIONS, recipe.getDirections());
    }

    @Test
    public void getDifficulty() {
        recipe.setDifficulty(DIFFICULTY);

        assertEquals(DIFFICULTY, recipe.getDifficulty());
    }

    @Test
    public void getIngredients() {
        recipe.setIngredients(INGREDIENTS);

        assertEquals(INGREDIENTS, recipe.getIngredients());
    }

    @Test
    public void getNotes() {
        recipe.setNotes(NOTES);

        assertEquals(NOTES, recipe.getNotes());
    }

    @Test
    public void getCategories() {
        recipe.setCategories(CATEGORIES);

        assertEquals(CATEGORIES, recipe.getCategories());
    }
}
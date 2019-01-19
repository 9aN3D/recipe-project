package com.example.guru.recipeproject.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private static final Long INGREDIENT_ID = new Long("1");
    private static final String DESCRIPTION = "description";
    private static final BigDecimal AMOUNT = new BigDecimal("1");
    private static final UnitOfMeasure UOM = new UnitOfMeasure();
    private static final Recipe RECIPE = new Recipe();

    private Ingredient ingredient;

    @Before
    public void setUp() throws Exception {
        ingredient = new Ingredient();
    }

    @Test
    public void getId() throws Exception {
        ingredient.setId(INGREDIENT_ID);

        assertEquals(INGREDIENT_ID,ingredient.getId());
    }

    @Test
    public void getDescription() throws Exception {
        ingredient.setDescription(DESCRIPTION);

        assertEquals(DESCRIPTION,ingredient.getDescription());
    }

    @Test
    public void getAmount() throws Exception {
        ingredient.setAmount(AMOUNT);

        assertEquals(AMOUNT,ingredient.getAmount());
    }

    @Test
    public void getUom() throws Exception {
        ingredient.setUom(UOM);

        assertEquals(UOM,ingredient.getUom());
    }

    @Test
    public void getRecipe() throws Exception {
        ingredient.setRecipe(RECIPE);

        assertEquals(RECIPE,ingredient.getRecipe());
    }
}
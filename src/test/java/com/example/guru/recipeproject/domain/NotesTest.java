package com.example.guru.recipeproject.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotesTest {

    private static final Long NOTES_ID = 1L;
    private static final String RECIPE_NOTES = "recipe notes";
    private static final Recipe RECIPE = new Recipe();

    private Notes notes;

    @Before
    public void setUp() throws Exception {
        notes = new Notes();
    }

    @Test
    public void getId() throws Exception {
        notes.setId(NOTES_ID);

        assertEquals(NOTES_ID,notes.getId());
    }

    @Test
    public void getRecipe() throws Exception {
        notes.setRecipe(RECIPE);

        assertEquals(RECIPE,notes.getRecipe());
    }

    @Test
    public void getRecipeNotes() throws Exception {
        notes.setRecipeNotes(RECIPE_NOTES);

        assertEquals(RECIPE_NOTES,notes.getRecipeNotes());
    }
}
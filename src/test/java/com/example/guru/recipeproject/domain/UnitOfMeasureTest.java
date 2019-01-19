package com.example.guru.recipeproject.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitOfMeasureTest {

    private static final Long UOM_ID = 1L;
    private static final String DESCRIPTION = "My Recipe";

    private UnitOfMeasure uom;

    @Before
    public void setUp() throws Exception {
        uom = new UnitOfMeasure();
    }

    @Test
    public void getId() throws Exception {
        uom.setId(UOM_ID);

        assertEquals(UOM_ID, uom.getId());
    }

    @Test
    public void getDescription() throws Exception {
        uom.setDescription(DESCRIPTION);

        assertEquals(DESCRIPTION, uom.getDescription());
    }
}
package com.octo.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @Test
    void PizzaDeuxFromages() {
        assertEquals("Gorgonzola-Chevre-Pate", new Pate(new Chevre(new Gorgonzola(null))).cook());
    }

    @Test
    void PizzaDoubleChevre() {
        assertEquals("Chevre-Chevre-Pate", new Pate(new DoubleChevre(null)).cook());
    }

    @Test
    void cookedThreeCheesePizza() {
        assertEquals("Gorgonzola-Mozzarella-Chevre-Pate", Recipes.cookedPizza3Cheeses());
    }
}

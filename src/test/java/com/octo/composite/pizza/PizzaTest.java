package com.octo.composite.pizza;

import com.octo.composite.pizza.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @Test
    void pizza2Fromages() {
        assertEquals("Gorgonzola-Chevre-Pate", new Pate(new Chevre(new Gorgonzola(null))).cuire());
    }

    @Test
    void pizzaDoubleChevre() {
        assertEquals("Chevre-Chevre-Pate", new Pate(new DoubleChevre(null)).cuire());
    }

    @Test
    void pizza3FromagesCuite() {
        assertEquals("Gorgonzola-Mozzarella-Chevre-Pate", Recettes.Pizza3FromagesCuite());
    }
}

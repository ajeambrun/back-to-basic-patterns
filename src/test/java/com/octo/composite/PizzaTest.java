package com.octo.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @Test
    void TroisFromagesPizza() {
        assertEquals("Gorgonzola-Mozzarella-Chevre-Pate", Pizza.pizza3Fromages());
    }

    @Test
    void PizzaDeuxFromages() {
        assertEquals("Gorgonzola-Chevre-Pate", new Pate(new Chevre(new Gorgonzola(null))).compose(""));
    }
    @Test
    void PizzaDoubleChevre() {
        assertEquals("Chevre-Chevre-Pate", new Pate(new DoubleChevre(null)).compose(""));
    }
}

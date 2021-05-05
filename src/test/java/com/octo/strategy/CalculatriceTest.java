package com.octo.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    @Test
    void should_do_addition() {
        Assertions.assertEquals(3, new Calculatrice().compute(1,2, "+"));
    }

    @Test
    void should_do_soustraction() {
        Assertions.assertEquals(2, new Calculatrice().compute(4,2, "-"));
    }
}

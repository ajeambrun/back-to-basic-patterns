package com.octo.composite;

public class Mozzarella extends AbstractIngredient {
    public Mozzarella(Ingredient nextIngredient) {
        super(nextIngredient, "Mozzarella");
    }
}

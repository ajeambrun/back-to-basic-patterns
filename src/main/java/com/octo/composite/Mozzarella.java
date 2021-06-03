package com.octo.composite;

public class Mozzarella extends Ingredient {
    public Mozzarella(Ingredient nextIngredient) {
        super(nextIngredient, "Mozzarella");
    }
}

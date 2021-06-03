package com.octo.composite;

public class Pate extends Ingredient implements Cookable {
    public Pate(Ingredient nextIngredient) {
        super(nextIngredient, "Pate");
    }

    @Override
    public String cook() {
        return this.compose("");
    }
}

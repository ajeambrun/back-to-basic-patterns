package com.octo.composite.pizza;

public class Pate extends Ingredient implements Cuisinable {
    public Pate(Ingredient ingredientSuivant) {
        super(ingredientSuivant, "Pate");
    }

    @Override
    public String cuire() {
        return this.compose("");
    }
}

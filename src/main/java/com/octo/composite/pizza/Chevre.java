package com.octo.composite.pizza;

public class Chevre extends Ingredient {
    public Chevre(Ingredient ingredientSuivant) {
        super(ingredientSuivant, "Chevre");
    }
}

class DoubleChevre extends Ingredient {

    public DoubleChevre(Ingredient ingredientSuivant) {
        super(new Chevre(new Chevre(ingredientSuivant)), "");
    }

    @Override
    public String compose(String valeur) {
        return ingredientSuivant.compose(valeur);
    }
}

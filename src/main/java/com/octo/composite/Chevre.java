package com.octo.composite;

public class Chevre extends AbstractIngredient {
    public Chevre(Ingredient nextIngredient) {
        super(nextIngredient, "Chevre");
    }
}

class DoubleChevre extends AbstractIngredient {

    public DoubleChevre(Ingredient nextIngredient) {
        super(new Chevre(new Chevre(nextIngredient)), "");
    }

    @Override
    public String compose(String value) {
        return nextIngredient.compose(value);
    }
}

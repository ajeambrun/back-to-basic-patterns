package com.octo.composite;

public abstract class Ingredient {
    protected final String name;
    Ingredient nextIngredient;

    protected Ingredient(Ingredient nextIngredient, String name) {
        this.nextIngredient = nextIngredient;
        this.name = name;
    };

    public String compose(String value) {
        final var result = name + (!value.equals("") ? "-" : "") + value;
        return (nextIngredient!=null?nextIngredient.compose(result): result);
    }

}

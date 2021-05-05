package com.octo.composite;

public abstract class AbstractIngredient implements Ingredient {
    protected final String name;
    Ingredient nextIngredient;

    protected  AbstractIngredient(Ingredient nextIngredient, String name) {
        this.nextIngredient = nextIngredient;
        this.name = name;
    };

    @Override
    public String compose(String value) {
        final var result = name + (!value.equals("") ? "-" : "") + value;
        return (nextIngredient!=null?nextIngredient.compose(result): result);
    }

}

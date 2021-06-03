package com.octo.composite.pizza;

public abstract class Ingredient {
    protected final String nom;
    Ingredient ingredientSuivant;

    protected Ingredient(Ingredient ingredientSuivant, String nom) {
        this.ingredientSuivant = ingredientSuivant;
        this.nom = nom;
    };

    public String compose(String valeur) {
        final var resultat = nom + (!valeur.equals("") ? "-" : "") + valeur;
        return (ingredientSuivant !=null? ingredientSuivant.compose(resultat): resultat);
    }

}

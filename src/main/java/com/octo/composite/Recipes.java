package com.octo.composite;

public class Recipes {

    public static String cookedPizza3Cheeses() {
        return new Pate(new Chevre(new Mozzarella(new Gorgonzola(null)))).cook();
    }

}

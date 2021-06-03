package com.octo.composite;

public class Recettes {

    public static String Pizza3FromagesCuite() {
        return new Pate(new Chevre(new Mozzarella(new Gorgonzola(null)))).cuire();
    }

}

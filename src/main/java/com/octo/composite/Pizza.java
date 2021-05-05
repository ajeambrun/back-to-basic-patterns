package com.octo.composite;

public class Pizza {

    public static String pizza3Fromages() {
        return new Pate(new Chevre(new Mozzarella(new Gorgonzola(null)))).compose("");
    }
}

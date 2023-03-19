package com.daw.builder;

public class Main {
    public static void main(String[] args) {
        Pizzas pizzaFavorita = new Pizzas("masa pan", true, 1,  true, "barbacoa",
                false, false, true, false, true, false);

        Pizzas pizzaDos = new Pizzas("normal", false, 2, true,"salsa sin gluten", false, true, true, false, true,true);

        Pizzas pizzaTres = new Pizzas("fina", true, 3,false, "solo tomate", false, false, true, true, true,true);


        System.out.println("Información de la pizza favorita:");
        System.out.println(pizzaFavorita.toString());
        System.out.println("Información de la pizza Dos:");
        System.out.println(pizzaDos.toString());
        System.out.println("Información de la pizza Tres:");
        System.out.println(pizzaTres.toString());



    }
}
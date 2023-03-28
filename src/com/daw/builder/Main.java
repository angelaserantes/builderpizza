package com.daw.builder;

public class Main {
    public static void main(String[] args) {
      /*  Pizzas pizzaFavorita = new Pizzas("masa pan", true, 1,  true, "barbacoa",
                false, false, true, false, true, false);

        Pizzas pizzaDos = new Pizzas("normal", false, 2, true,"salsa sin gluten", false, true, true, false, true,true);

        Pizzas pizzaTres = new Pizzas("fina", true, 3,false, "solo tomate", false, false, true, true, true,true);


        System.out.println("Información de la pizza favorita:");
        System.out.println(pizzaFavorita.toString());
        System.out.println("Información de la pizza Dos:");
        System.out.println(pizzaDos.toString());
        System.out.println("Información de la pizza Tres:");
        System.out.println(pizzaTres.toString());
*/

        Coche coche1 = new CocheBuilder()
                .setMarca("Audi")
                .setModelo("A3")
                .setCaballos(300)
                .setAnio(2018)
                .build();

        Coche coche2 = new CocheBuilder()
                .setMarca("Citroen")
                .setModelo("c3")
                .setCaballos(100)
                .setAnio(2010)
                .build();

        System.out.println(coche2.toString());

    }
}
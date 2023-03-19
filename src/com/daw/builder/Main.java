package com.daw.builder;

public class Main {
    public static void main(String[] args) {



        Pizzas builder = new PizzaBuilder().build();
        Pizzas sintaxisEncadenada = new PizzaBuilder()
                .setRelleno(true)
                .setTipo(Pizzas.NORMAL)
                .setSalsa(true)
                .setTipoSalsa(Pizzas.BARBACOA)
                .setCebolla(true)
                .setSinGluten(false)
                .setExtraQueso(true)
                .setPinha(true)
                .setChampinhones(true)
                .setJamon(true)
                .build();
        System.out.println(builder.toString());
        System.out.println(sintaxisEncadenada.toString());
    }
}
package com.daw.builder;

public class PizzaBuilder {
    protected Pizzas _pizza;
    public Pizzas build() {
        return this._pizza;
    }

    public PizzaBuilder() {
        _pizza = new Pizzas();
    }


    public PizzaBuilder setmasa(int masa) {
        _pizza.setMasa(masa);
        return this;
    }

    public PizzaBuilder setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public PizzaBuilder setTipo(int tipo) {
        _pizza.setTipo(tipo);
        return this;
    }

    public PizzaBuilder setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public PizzaBuilder setTipoSalsa(int tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public PizzaBuilder setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public PizzaBuilder setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public PizzaBuilder setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public PizzaBuilder setPinha(boolean pinha) {
        _pizza.setPinha(pinha);
        return this;
    }

    public PizzaBuilder setChampinhones(boolean champinhones) {
        _pizza.setChampinhones(champinhones);
        return this;
    }

    public PizzaBuilder setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }







}

package com.daw.builder;

public class Pizzas {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private  boolean cebolla;
    private  boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhones;
    private boolean jamon;

    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pinha, boolean champinhones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pinha= pinha;
        this.champinhones= champinhones;
        this.jamon = jamon;
    }

    @Override
    public String toString(){
        return "Pizza " +
                "masa='" + masa + '\'' +
                ", relleno=" + (relleno ? "si" : "no") +
                ", tipo=" + tipo +
                ", salsa=" + (salsa ? "si" : "no") +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", cebolla=" + (cebolla ? "si" : "no") +
                ", sinGluten=" + (sinGluten  ? "si" : "no") +
                ", extraQueso=" + (extraQueso ? "si" : "no") +
                ", piña=" + (pinha ? "si" : "no") +
                ", champiñones=" + (champinhones ? "si" : "no") +
                ", jamon=" + (jamon ? "si" : "no");
    }

}
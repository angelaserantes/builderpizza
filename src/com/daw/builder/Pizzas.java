package com.daw.builder;

public class Pizzas {
    private int masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private int tipoSalsa;
    private  boolean cebolla;
    private  boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhones;
    private boolean jamon;

    //tipo de masa

    public static final int NORMAL = 0;
    public static final int INTEGRAL = 1;
    public static final int FINA = 2;
    public static final int MASA_PAN = 3;

    //tipo de pizza
    public static final int FAMILIAR = 1;
    public static final int MEDIANA = 2;
    public static final int PEQUENHA = 3;

    //tipo de salsa
    public static final int BARBACOA = 1;
    public static final int SOLO_TOMATE = 2;
    public static final int SALSA_SIN_GLUTEN = 3;

    public Pizzas(){
        this.masa = NORMAL;
        this.relleno = true;
        this.tipo = FAMILIAR;
        this.salsa = true;
        this.tipoSalsa =BARBACOA;
        this.cebolla = true;
        this.sinGluten = true;
        this.extraQueso = false;
        this.pinha= true;
        this.champinhones= true;
        this.jamon = true;
    }
    public Pizzas(int masa, boolean relleno, int tipo, boolean salsa, int tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pinha, boolean champinhones, boolean jamon) {
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

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhones() {
        return champinhones;
    }

    public void setChampinhones(boolean champinhones) {
        this.champinhones = champinhones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
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
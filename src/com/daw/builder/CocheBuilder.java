package com.daw.builder;

public class CocheBuilder {
    private String marca;
    private String modelo;
    private int caballos;
    private int anio;

    public CocheBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public CocheBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CocheBuilder setCaballos(int caballos) {
        this.caballos = caballos;
        return this;
    }

    public CocheBuilder setAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public Coche build() {
        return new Coche(marca, modelo, caballos, anio);
    }
}

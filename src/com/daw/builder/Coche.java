package com.daw.builder;

public class Coche {
        private String marca;
        private String modelo;
        private int caballos;
        private int anio;
        public Coche(String marca, String modelo, int caballos, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.caballos = caballos;
            this.anio=anio;
        }

        public String getMarca(){
            return marca;
        }

        public void setMarca(){
            this.marca = marca;
    }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(){
        this.modelo = modelo;
    }
        public int getCaballos(){
            return caballos;
        }

        public void setCaballos(int caballos){
        this.caballos = caballos;
    }

        public int getAnio(){
        return anio;
    }
        public void setAnio(int anio){
            this.anio = anio;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", caballos=" + caballos +
                ", anio=" + anio +
                '}';
    }
}


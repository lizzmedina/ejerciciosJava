package org.example.ejercicioMateoCarro;

public class Vehiculos {
    private int numRuedas;
    private String marca;
    private String modelo;

    public Vehiculos(int numRuedas, String marca, String modelo) {
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "numRuedas= " + this.numRuedas +
                ", marca=' " + this.marca + '\'' +
                ", modelo=' " + this.modelo + '\'' +
                '}';
    }
}

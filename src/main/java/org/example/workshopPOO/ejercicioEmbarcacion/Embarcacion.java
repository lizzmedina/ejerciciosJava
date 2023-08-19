package org.example.workshopPOO.ejercicioEmbarcacion;

abstract class Embarcacion  {
    private Capitan capitan;
    private long precioBase;
    private long valorAdicional;
    private int anioFabricacion;
    private double slora;

    public Embarcacion(Capitan capitan, long precioBase, long valorAdicional, int anioFabricacion, double slora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.slora = slora;
    }

    abstract double calcularAlquiler();

    public Capitan getCapitan() {
        return capitan;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public long getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getSlora() {
        return slora;
    }
}

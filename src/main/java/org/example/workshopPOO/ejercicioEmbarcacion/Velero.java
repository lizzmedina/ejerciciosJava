package org.example.workshopPOO.ejercicioEmbarcacion;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, long precioBase, long valorAdicional, int anioFabricacion, double slora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande(){
        boolean esGrande = false;
        if (cantidadMastiles > 4){
            esGrande = true;
        }
        return esGrande;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }
    @Override
    double calcularAlquiler() {
        double valorAPagar = 0;
        if (getAnioFabricacion() > 2020){
            valorAPagar =  getPrecioBase() + getValorAdicional();
        } else {
            valorAPagar = getPrecioBase();
        }
        return valorAPagar;
    }
}
package org.example.workshopPOO.ejercicioEmbarcacion;

public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, long precioBase, long valorAdicional, int anioFabricacion, double slora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidadCamarotes = cantidadCamarotes;
    }
    public long comprarYate() {
        long precioVenta = 100000000;
        long precioAdicionalXLujoso = 150000;

        if (getCantidadCamarotes() > 7 ){
            precioVenta += precioAdicionalXLujoso;
        }
        return precioVenta;
    }
    public int getCantidadCamarotes() {
        return cantidadCamarotes;
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
package org.example.ejercicioMateoCarro;

public class Automovil extends Vehiculos implements Conducible{
    private int numPuertas;
    private String tipoCombustible;

    public Automovil(int numRuedas, String marca, String modelo, int numPuertas, String tipoCombustible) {
        super( numRuedas,  marca, modelo);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    @Override
    public String toString() {
        return "Automovil { " +
                super.toString() +
                "numPuertas=  " + this.numPuertas +
                ", tipoCombustible=' " + this.tipoCombustible + '\'' +
                '}';
    }

    @Override
    public String conducir() {
        return "Conduciendo desde Automovil";
    }
}

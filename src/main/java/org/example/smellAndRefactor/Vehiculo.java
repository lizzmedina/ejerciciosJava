package org.example.smellAndRefactor;

abstract class Vehiculo {

    private String tipoVehiculo;
    private int limiteInferior;
    private int limiteInferiorIntermedio;
    private int limiteSuperior;

    public Vehiculo() {

    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}

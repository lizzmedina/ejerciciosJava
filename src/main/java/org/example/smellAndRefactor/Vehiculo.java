package org.example.smellAndRefactor;

public abstract class Vehiculo {
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public int calcularComparendo(int velocidad) {
        if (velocidad <= limiteInferior) {
            return 0;
        } else if (velocidad >= limiteInferiorIntermedio && velocidad <= limiteSuperior) {
            return 1;
        }
        return 2;
    }
}
package org.example.smellAndRefactor;

public class Mula extends Vehiculo{
    private String tipoVehiculo = "mula";
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    public Mula(int limiteInferiorMula, int limiteInferiorIntermedioMula, int limiteSuperiorMula) {
        this.limiteInferiorMula = limiteInferiorMula;
        this.limiteInferiorIntermedioMula = limiteInferiorIntermedioMula;
        this.limiteSuperiorMula = limiteSuperiorMula;
    }

    public Mula(int limiteInferiorMula) {
        this.limiteInferiorMula = limiteInferiorMula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getLimiteInferiorMula() {
        return limiteInferiorMula;
    }

    public void setLimiteInferiorMula(int limiteInferiorMula) {
        this.limiteInferiorMula = limiteInferiorMula;
    }

    public int getLimiteInferiorIntermedioMula() {
        return limiteInferiorIntermedioMula;
    }

    public void setLimiteInferiorIntermedioMula(int limiteInferiorIntermedioMula) {
        this.limiteInferiorIntermedioMula = limiteInferiorIntermedioMula;
    }

    public int getLimiteSuperiorMula() {
        return limiteSuperiorMula;
    }

    public void setLimiteSuperiorMula(int limiteSuperiorMula) {
        this.limiteSuperiorMula = limiteSuperiorMula;
    }

    @Override
    public String toString() {
        return "Mula{" +
                "tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}

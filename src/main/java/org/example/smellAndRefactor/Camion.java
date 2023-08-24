package org.example.smellAndRefactor;

public class Camion extends Vehiculo{
    private String tipoVehiculo = "camion";
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;

    public Camion(int limiteInferiorCamion, int limiteInferiorIntermedioCamion, int limiteSuperiorCamion) {
        this.limiteInferiorCamion = limiteInferiorCamion;
        this.limiteInferiorIntermedioCamion = limiteInferiorIntermedioCamion;
        this.limiteSuperiorCamion = limiteSuperiorCamion;
    }

    public Camion(int limiteInferiorCamion) {
        this.limiteInferiorCamion = limiteInferiorCamion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getLimiteInferiorCamion() {
        return limiteInferiorCamion;
    }

    public void setLimiteInferiorCamion(int limiteInferiorCamion) {
        this.limiteInferiorCamion = limiteInferiorCamion;
    }

    public int getLimiteInferiorIntermedioCamion() {
        return limiteInferiorIntermedioCamion;
    }

    public void setLimiteInferiorIntermedioCamion(int limiteInferiorIntermedioCamion) {
        this.limiteInferiorIntermedioCamion = limiteInferiorIntermedioCamion;
    }

    public int getLimiteSuperiorCamion() {
        return limiteSuperiorCamion;
    }

    public void setLimiteSuperiorCamion(int limiteSuperiorCamion) {
        this.limiteSuperiorCamion = limiteSuperiorCamion;
    }
}

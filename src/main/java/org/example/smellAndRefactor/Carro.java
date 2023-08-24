package org.example.smellAndRefactor;

public class Carro extends Vehiculo{
    private String tipoVehiculo = "carro";
    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;

    public Carro() {
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getLimiteInferiorCarro() {
        return limiteInferiorCarro;
    }

    public int getLimiteInferiorIntermedioCarro() {
        return limiteInferiorIntermedioCarro;
    }

    public int getLimiteSuperiorCarro() {
        return limiteSuperiorCarro;
    }

    public void setLimiteInferiorCarro(int limiteInferiorCarro) {
        this.limiteInferiorCarro = limiteInferiorCarro;
    }

    public void setLimiteInferiorIntermedioCarro(int limiteInferiorIntermedioCarro) {
        this.limiteInferiorIntermedioCarro = limiteInferiorIntermedioCarro;
    }

    public void setLimiteSuperiorCarro(int limiteSuperiorCarro) {
        this.limiteSuperiorCarro = limiteSuperiorCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}

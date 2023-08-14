package org.example.herencia.ejercicios;

public class Circulo extends FiguraGeometricaBase{
    private double radio;
    public Circulo(int radio){
        super(0,0);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return (Math.PI * (radio * radio));
    }
    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI * radio);
    }
}
package org.example.herencia.ejercicios;

class Cuadrado extends FiguraGeometricaBase {
    public Cuadrado(int lado) {
        super(lado, lado);
    }
    @Override
    public double calcularArea() {
        return (alto * ancho);
    }
    @Override
    public double calcularPerimetro() {
        return (4 * alto);
    }
}

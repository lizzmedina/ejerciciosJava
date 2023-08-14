package org.example.herencia.ejercicios;

class Triangulo extends FiguraGeometricaBase {
    public Triangulo(int base, int altura) {
        super(altura, base);
    }
    @Override
    public double calcularArea() {
        return (0.5 * alto * ancho);
    }
    @Override
    public double calcularPerimetro() {
        // El perímetro de un triángulo depende de su tipo y no se puede calcular solo con alto y ancho.
        return -1;
    }
}
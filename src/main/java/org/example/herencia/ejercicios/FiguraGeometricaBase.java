package org.example.herencia.ejercicios;

abstract class FiguraGeometricaBase implements FiguraGeometrica {
    protected int alto;
    protected int ancho;

    public FiguraGeometricaBase(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
}

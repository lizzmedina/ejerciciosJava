package org.example.ejercicioSebastianMesa5;

abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
}

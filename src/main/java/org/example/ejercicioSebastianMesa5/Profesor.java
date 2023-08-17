package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class Profesor extends Persona{
    private String titulo;
    private ArrayList<String> materias;

    public Profesor(String nombre, int edad, String genero, String tutulo, ArrayList<String> materias) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

abstract class Curso {
    protected String nombreCurso;
    protected Profesor profesor;
    protected ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                '}';
    }
}

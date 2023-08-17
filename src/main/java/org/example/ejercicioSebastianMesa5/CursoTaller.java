package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class CursoTaller extends Curso{
    public CursoTaller(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        super(nombreCurso, profesor, estudiantes);
    }

    @Override
    public String toString() {
        return "CursoTaller{" +
                "nombreCurso='" + nombreCurso + '\'' +
                '}';
    }
}

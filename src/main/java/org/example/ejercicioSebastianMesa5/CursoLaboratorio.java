package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class CursoLaboratorio extends Curso{
    public CursoLaboratorio(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        super( nombreCurso,profesor, estudiantes);
    }

    @Override
    public String toString() {
        return "CursoLaboratorio{" +
                "nombreCurso='" + nombreCurso + '\''+
                '}';
    }
}

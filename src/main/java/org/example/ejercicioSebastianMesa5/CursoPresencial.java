package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class CursoPresencial extends Curso{
    private String horario;

    public CursoPresencial(String horario,  String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        super(nombreCurso, profesor, estudiantes);
        this.horario = horario;
    }

    public double calcularAsistenciaPromedio(){
        double sum = 0;
        for (Estudiante estudiante : estudiantes) {
            sum += estudiante.getAsistencia();
        }
        return sum / estudiantes.size();
    }
}

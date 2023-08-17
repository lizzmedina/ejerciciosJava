package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class CursoVirtual extends Curso{
    private String plataforma;

    public CursoVirtual(String plataforma, String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        super(nombreCurso, profesor, estudiantes);
        this.plataforma = plataforma;
    }

    public double calcularParticipacionPromedio(){
        double sum = 0;
        for (Estudiante estudiante : estudiantes) {
            sum += estudiante.getParticipación();
        }
        return  sum / estudiantes.size();
    }
}

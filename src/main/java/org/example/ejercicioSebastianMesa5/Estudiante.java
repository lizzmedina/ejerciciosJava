package org.example.ejercicioSebastianMesa5;

import java.util.Arrays;

public class Estudiante extends Persona implements Estadisticas{

    private String carnet;
    private double[] notas;
    private double asistencia;
    private double participación;

    public Estudiante(String nombre, int edad, String genero, String carnet, double[] notas) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
    }

    public Estudiante(String nombre, int edad, String genero, String carnet, double[] notas, double asistencia, double participación) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
        this.asistencia= asistencia;
        this.participación = participación;
    }

    @Override
    public double calcularPromedio() {
        double suma = 0;
        for (double nota: notas) {
            suma += nota;
        }
        return suma / notas.length ;
    }

    @Override
    public double calcularMaximo() {
        double maximo = 0;
        for (double nota: notas) {
            if (maximo < nota) {
                maximo = nota;
            }
        }
        return maximo ;
    }
    @Override
    public double calcularMinimo() {
        double minimo = notas[0];
        for (double nota: notas) {
            if (minimo > nota) {
                minimo = nota;
            }
        }
        return minimo ;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    public double getParticipación() {
        return participación;
    }

    public void setParticipación(double participación) {
        this.participación = participación;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

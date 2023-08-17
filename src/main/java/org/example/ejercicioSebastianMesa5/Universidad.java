package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class Universidad implements Gestionable {
    private ArrayList<Curso> cursos;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    public Universidad(ArrayList<Curso> cursos, ArrayList<Estudiante> estudiantes, ArrayList<Profesor> profesores) {
        this.cursos = cursos;
        this.estudiantes = estudiantes;
        this.profesores = profesores;
    }

    @Override
    public void inscribirEstudiante(Estudiante estudiante, Curso curso) {
        if (cursos.contains(curso)) {
            curso.estudiantes.add(estudiante);
        }
    }

    public void retirarEstudiante(Estudiante estudiante, Curso curso) {
        if (cursos.contains(curso)) {
            curso.estudiantes.remove(estudiante);
        }
    }
    public void mostrarInformacionCompleta() {

        for (Curso curso : cursos) {
            boolean bandera = false;
            System.out.println("Curso: " + curso.nombreCurso);
            System.out.println("Profesor: " + curso.profesor.nombre);
            System.out.println("Estudiantes:");
            if (bandera == false){
                for (int i = 0; i <= estudiantes.size()/2; i++) {
                    System.out.println("- " + estudiantes.get(i).getNombre());
                }
                bandera = true;
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "cursos=" + cursos +
                ", estudiantes=" + estudiantes +
                ", profesores=" + profesores +
                '}';
    }
}

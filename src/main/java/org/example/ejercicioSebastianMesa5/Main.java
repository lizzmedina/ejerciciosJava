package org.example.ejercicioSebastianMesa5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creamos notas para estudiantes
        double[] notasjavier =  {2.5, 5.0, 3.5, 5.0};
        double[] notasKevin =  {4.5, 5.0, 4.5, 5.0};
        //creamos estudiantes
        Estudiante estudianteJavier = new Estudiante("Javier",  25, "masculino", "skdjhaskldjj", notasjavier, 20, 8 );
        Estudiante estudianteKevin = new Estudiante("Kevin", 19, "masculino", "estudiante", notasKevin, 10, 40 );

        //creamos materias  para profesor1
        ArrayList<String> materiasOrlando = new ArrayList<>();
        materiasOrlando.add("fundamentos de ciencias" );
        materiasOrlando.add("ciencias avanzadas I");
        materiasOrlando.add( "ciencias avanzadas II");
        //creamos profesor1
        Profesor profesorOrlando = new Profesor("Orlando", 35, "masculino", "Licenciado en ciencias", materiasOrlando);

        //creamos materias  para profesor2
        ArrayList<String> materiasMartha = new ArrayList<>();
        materiasOrlando.add("fundamentos de carpinteria" );
        materiasOrlando.add("marketing");
        //creamos profesor2
        Profesor profesorMartha = new Profesor("Martha", 40, "femenino", "Mercadotecnia y carpinteria", materiasMartha);

        //creamos lista de estudiantes para el curso presencial
        ArrayList<Estudiante> estudiantesCursoDeCocinaPresencial = new ArrayList<>();
        //añadimos estudiantes a la lista anterior
        estudiantesCursoDeCocinaPresencial.add(estudianteJavier);
        estudiantesCursoDeCocinaPresencial.add(estudianteKevin);

        //creamos cursos de to-do tipo
        CursoPresencial cursoDeCocinaPresencial = new CursoPresencial("Lunes a Jueves", "curso de cocina " , profesorOrlando, estudiantesCursoDeCocinaPresencial);
        CursoVirtual cursoDeFinanzasVirtual = new CursoVirtual("meet", "curso de finanzas " , profesorOrlando, estudiantesCursoDeCocinaPresencial);
        CursoLaboratorio cursoLaboratorioBacterias = new CursoLaboratorio( "curso de bacterias " , profesorOrlando, estudiantesCursoDeCocinaPresencial);
        CursoTaller cursoTallerCarpinteria = new CursoTaller("curso de carpinteria " , profesorOrlando, estudiantesCursoDeCocinaPresencial);

        //creamos una lista de cusos
        ArrayList<Curso> cursos = new ArrayList<>();
        //añadimos los cursos a la lista
        cursos.add(cursoDeCocinaPresencial);
        cursos.add(cursoLaboratorioBacterias);
        cursos.add(cursoDeFinanzasVirtual);
        cursos.add(cursoTallerCarpinteria);

        // creamos una lista de los estudiantes existentes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        //agregamos los estudiantes
        estudiantes.add(estudianteJavier);
        estudiantes.add(estudianteKevin);

        //creamos una lista de profesores
        ArrayList<Profesor> profesores = new ArrayList<>();
        //agregamos profesores a la lista
        profesores.add(profesorMartha);
        profesores.add(profesorOrlando);

        //creamos una universidad
        Universidad universidadCataluña = new Universidad(cursos, estudiantes, profesores);

        // ------------------- CASOS DE PRUEBA ------------------------------------------------------

        //mostramos los datos que tiene la universidad (cursos, estudiantes y profesores)
        //System.out.println(universidadCataluña); // usando el toString
        universidadCataluña.mostrarInformacionCompleta(); // usando el método

        //calculamos las notas minimas, maximas y promedios de los estudiantes 1 y 2

        System.out.println("nota minima Javier: " + estudianteJavier.calcularMaximo());
        System.out.println("nota maxima Javier: " + estudianteJavier.calcularMinimo());
        System.out.println("promedio notas Javier: " + estudianteJavier.calcularPromedio());

        System.out.println("nota minima kevin: " + estudianteKevin.calcularMaximo());
        System.out.println("nota maxima kevin: " + estudianteKevin.calcularMinimo());
        System.out.println("promedio notas kevin: " + estudianteKevin.calcularPromedio());

        // calculamos la asistencia y participación de los cursos presencial y virtual
        System.out.println("la asistencia promedio fue de: " + cursoDeCocinaPresencial.calcularAsistenciaPromedio());
        System.out.println("la participación promedio fue de: " + cursoDeFinanzasVirtual.calcularParticipacionPromedio());

    }
}

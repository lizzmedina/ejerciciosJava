package org.example.composicion.banco;

public class Persona {

        //ATRIBUTOS
        //modificador de acceso - Tipo de dato - nombreAtributo
        private String nombre;
        private int edad;
        private String identificacion;

        //CONSTRUCTORES
        public Persona (String nombre){
            this.nombre = nombre;
        }

        // modificador acceso - Nombre clase - argumentos
        public Persona(String nombre, int edad, String identificacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.identificacion = identificacion;
        }

        //METODOS
        public boolean esMayorDeEdad() {
            if (this.edad > 18){
                return true;
            }else {
                return false;
            }
        }

        public void imprimirInformacion(){
            System.out.println("Mi nombre es : " + this.nombre + " mi edad es : " + this.edad);
        }

        //GETTER Y SETTER
        public String getNombre(){
            return this.nombre;
        }

        //SETER
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public static void imprimirNombre(){
            System.out.println("HOLA");
        }
    }
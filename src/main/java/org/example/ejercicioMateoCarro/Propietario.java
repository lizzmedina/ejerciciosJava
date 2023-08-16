package org.example.ejercicioMateoCarro;

public class Propietario {
    private String nombre;
    private String apellido;
    private Vehiculos vehiculo;

    public Propietario(String nombre, String apellido, Vehiculos vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}

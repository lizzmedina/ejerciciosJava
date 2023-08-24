package org.example.smellAndRefactor;

public class Notificador {
    public String enviarCorreoFotomulta(Vehiculo vehiculo) {

        if(true ) {
            String cuerpoMensaje = "//enviando correo para el tipo " + vehiculo.toString();
            String asunto = "//asunto: comparendo " + vehiculo.toString();
            return   asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }
}

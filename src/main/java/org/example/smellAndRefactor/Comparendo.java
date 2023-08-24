package org.example.smellAndRefactor;

public class Comparendo {
    public void construirFotoMulta(int velocidad, Vehiculo vehiculo) {
        int cpa = vehiculo.calcularComparendo(velocidad);
        String txt = enviarCorreoFotomulta(vehiculo.getClass().getSimpleName(), cpa);
        System.out.println("----el tipo de comparendo es: " + cpa + " ----cuerpo del correo" + txt);
    }

    private String obtenerAsunto(String tipoVehiculo) {
        return "//asunto: comparendo " + tipoVehiculo.toLowerCase();
    }

    public String enviarCorreoFotomulta(String tipoVehiculo, int cpa) {
        if (cpa == -1) {
            return "enviando correo con vehiculo desconocido";
        }

        String cuerpoMensaje = "//enviando correo para el tipo " + tipoVehiculo.toLowerCase() + ".";
        return obtenerAsunto(tipoVehiculo) + cuerpoMensaje;
    }
}

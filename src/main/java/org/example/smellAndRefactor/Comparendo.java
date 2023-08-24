package org.example.smellAndRefactor;

public class Comparendo {
    private Carro carro;
    private Mula mula;
    private Camion camion;
    private Calculador calculador;
    private Notificador notificador;

    public Comparendo(){
    }

    public void construirFotoMulta(int velocidad, Vehiculo vehiculo) {
          int cpa = calculador.calcularComparendo(velocidad, vehiculo);
//        String txt = notificador.enviarCorreoFotomulta(vehiculo);
//        if(cpa == -1){
//            System.out.println("no hay calculo para el tipo de vehiculo" + vehiculo + "corre: " + txt);
//        }else {
//            System.out.println("----el tipo de comparendo es: " + cpa + " ----cuerpo del correo" + txt);
//        }
        System.out.println("hola tienes una multa");
    }
}

package org.example.workshopPOO.ejercicioEmbarcacion;

public class MainEmbarcacion {
    public static void main(String[] args) {
        // creamos un par de capitanes
        Capitan capitanVelero = new Capitan("Martin", "Rodriguez", "TJM123");
        Capitan capitanYate = new Capitan("Francisco", "Medina", "WTR098");

        // creamos un par de veleros
        Velero veleroCoronado = new Velero(capitanVelero, 150000, 30000, 2021,5.7, 5);
        Velero veleroBueno = new Velero(capitanVelero, 120000, 25000, 1998,4.0, 3);

        // creamos un par de yates
        Yate yateBlanco = new Yate(capitanYate, 300000, 50000, 2020, 5.4, 5);
        Yate yateMorado = new Yate(capitanYate, 450000, 90000, 2022, 6.0, 8);

        // calculamos el alquiler de las embarciones creadas
        System.out.println("El alquiler del velero coronado es de: " + veleroCoronado.calcularAlquiler());
        System.out.println("El alquiler del velero bueno es de: " + veleroBueno.calcularAlquiler());
        System.out.println("El alquiler del yate morado es de: " +yateMorado.calcularAlquiler());
        System.out.println("El alquiler del yate blanco es de: " +yateBlanco.calcularAlquiler());

        // probamos el método comprar
        System.out.println("Usted ha comprado el yate morado por un valor de: " + yateMorado.comprarYate());

        //probamos el metodo de si es grande
        System.out.println("el velero bueno es grande?" + veleroBueno.esGrande());
        System.out.println("el velero coronado es grande?" + veleroCoronado.esGrande());
    }
}

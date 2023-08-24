package org.example.smellAndRefactor;

public class MainComparendo {

        public static void main(String[] args) {
            Comparendo comparendo =  new Comparendo();

            Carro carro = new Carro();
            Vehiculo mula = new Mula();
            Vehiculo camion = new Camion();

            comparendo.construirFotoMulta(80, carro);
            comparendo.construirFotoMulta(200, mula);
            comparendo.construirFotoMulta(40, camion);
        }
}

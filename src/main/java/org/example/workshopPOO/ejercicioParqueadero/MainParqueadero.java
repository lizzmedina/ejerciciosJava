package org.example.workshopPOO.ejercicioParqueadero;

public class MainParqueadero {
    public static void main(String[] args) {
        //Crea una instancia de la clase Parqueadero.
            Carro[][] carros = new Carro[6][12];
            Parqueadero parqueaderoHotel =  new Parqueadero(200, carros );
        // Crea varios objetos de la clase Carro con diferentes placas, marcas y modelos.
            Carro carro1 = new Carro("ABC12", "Nissan", "2021");
            Carro carro2 = new Carro("AEI09", "Honda", "2020");
            Carro carro3 = new Carro("ASD124", "Chevrolet", "2000");
            Carro carro4 = new Carro("DGF547", "Audi", "2023");
            Carro carro5 = new Carro("HFK745", "Ford", "2015");
            Carro carro6 = new Carro("GDT059", "VMW", "2022");
            Carro carro7 = new Carro("GLD495", "KYA", "2019");

        //Estaciona algunos carros en diferentes posiciones del parqueadero, verificando si el
                //estacionamiento fue exitoso.

            System.out.println("Estado inicial del parqueadero:");
            System.out.println(parqueaderoHotel.mostrarEstadoParqueadero());

            parqueaderoHotel.parquearCarro(carro1, 3,3);
            parqueaderoHotel.parquearCarro(carro2, 1, 1);
            parqueaderoHotel.parquearCarro(carro3, 2,2);
            parqueaderoHotel.parquearCarro(carro4, 0,0);
            parqueaderoHotel.parquearCarro(carro5, 5,5);
            parqueaderoHotel.parquearCarro(carro6, 5,11);

        //Intenta estacionar un carro en un espacio ya ocupado y muestra el mensaje correspondiente.
            parqueaderoHotel.parquearCarro(carro7, 5,11);

        //Realiza el cálculo del costo por TIempo de estacionamiento para algunos carros y muestra el resultado.
        System.out.println("el carro 1 deberá pagar por 5 horas: " + parqueaderoHotel.cobrarPorTiempo(carro1, 5));
        System.out.println("el carro 2 deberá pagar por 3 horas: " + parqueaderoHotel.cobrarPorTiempo(carro2, 3));
        System.out.println("el carro 6 deberá pagar por 12 horas: " + parqueaderoHotel.cobrarPorTiempo(carro6, 12));
        System.out.println("el carro 4 deberá pagar por 9 horas: " + parqueaderoHotel.cobrarPorTiempo(carro4, 9));

        //Muestra el estado del parqueadero después de algunas operaciones.
        System.out.println("Estado actual del parqueadero:");
        System.out.println(parqueaderoHotel.mostrarEstadoParqueadero());
    }
}

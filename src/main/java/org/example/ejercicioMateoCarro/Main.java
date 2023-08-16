package org.example.ejercicioMateoCarro;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(4, "Nissan", "abvc123", 4, "gasolina" );
        Automovil auto2 = new Automovil(4, "Ford", "zt", 4, "gasolina");
        Motocicleta moto1 = new Motocicleta(2, "honda", "primera", "400", "manual");
        Motocicleta moto2 = new Motocicleta(2, "zuzuki", "pza", "600", "manual");
        Propietario propietarioJuan = new Propietario("Juan", "perencejo", auto1);
        Propietario propietarioLiza = new Propietario("Liza", "Medina", moto2);
        System.out.println(propietarioLiza);
        System.out.println(propietarioJuan);
        System.out.println(auto1.conducir());
    }
}

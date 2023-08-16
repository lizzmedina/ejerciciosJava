package org.example.ejercicioMateoCarro;

public class Motocicleta extends Vehiculos implements Conducible{
    private String cilindrada;
    private String tipoManejo;

    public Motocicleta(int numRuedas, String marca, String modelo, String cilindrada,String tipoManejo ) {
        super(numRuedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoManejo = tipoManejo;
    }

    @Override
    public String toString() {
        return "Motocicleta{ " +
                "cilindrada=' " + cilindrada + '\'' +
                ", tipoManejo=' " + tipoManejo + '\'' +
                '}';
    }
    @Override
    public String conducir() {
        return "Conduciendo desde la motocicleta";
    }
}

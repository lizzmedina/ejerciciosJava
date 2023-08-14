package org.example.composicion.banco;


import java.time.LocalDate;

public class Dorada extends TarjetaCredito{
    private String emisor; // visa, masterCard, american Express
    private long cupo;
    private String numeroTarjeta;
    private Integer cvv;
    private LocalDate fechaVencimiento;

    public Dorada(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento, long cupo1, String numeroTarjeta1, Integer cvv1, LocalDate fechaVencimiento1) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.cupo = cupo1;
        this.numeroTarjeta = numeroTarjeta1;
        this.cvv = cvv1;
        this.fechaVencimiento = fechaVencimiento1;
    }

    @Override
    public String toString() {
        return "Dorada{" +
                "cupo=" + cupo +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", cvv=" + cvv +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

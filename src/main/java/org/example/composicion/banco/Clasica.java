package org.example.composicion.banco;

import java.time.LocalDate;

public class Clasica extends TarjetaCredito{
    private String emisor; // visa, masterCard, american Express
    private long cupo;
    private String numeroTarjeta;
    private Integer cvv;
    private LocalDate fechaVencimiento;
    public Clasica(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.emisor = emisor;
    }

    @Override
    public String toString() {
        return "Clasica{" +
                "cupo=" + cupo +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", cvv=" + cvv +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

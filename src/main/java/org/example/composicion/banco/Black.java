package org.example.composicion.banco;

import java.time.LocalDate;

public class Black extends TarjetaCredito {
    private String emisor; // visa, masterCard, american Express
    private long cupo;
    private String numeroTarjeta;
    private Integer cvv;
    private LocalDate fechaVencimiento;

    public Black(String emisor, long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento, long cupo1, String numeroTarjeta1, Integer cvv1, LocalDate fechaVencimiento1) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.cupo = cupo1;
        this.numeroTarjeta = numeroTarjeta1;
        this.cvv = cvv1;
        this.fechaVencimiento = fechaVencimiento1;
    }

    @Override
    public String toString() {
        return "Black{" +
                "cupo=" + cupo +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", cvv=" + cvv +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

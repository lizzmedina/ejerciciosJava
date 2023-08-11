package org.example;

import java.util.Random;
public class Cuenta {
    private double saldoCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(double saldoCuenta, String nombreDelTitular, long numeroDeCuenta) {
        this.saldoCuenta = saldoCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public Cuenta(double saldoCuenta, String nombreDelTitular) {
        Random random = new Random(); // crea nmro
        this.saldoCuenta = saldoCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = random.nextLong();
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public String getDatosCuenta() {
        return (nombreDelTitular + saldoCuenta + numeroDeCuenta);
    }
    public long getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }
    public void setIngresos(double saldoCuenta) {
        this.saldoCuenta += saldoCuenta;
    }
    public void setRetiro(double saldoCuenta) {
        this.saldoCuenta -= saldoCuenta;
    }
}
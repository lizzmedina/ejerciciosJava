package org.example.composicion.banco;

import java.util.Random;
public class Cuenta {
    private double saldoCuenta;
    private Persona persona;
    private long numeroDeCuenta;

    public Cuenta(double saldoCuenta, Persona persona, long numeroDeCuenta) {
        this.saldoCuenta = saldoCuenta;
        this.persona = persona;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public Cuenta(double saldoCuenta, Persona persona) {
        Random random = new Random(); // crea nmro cuenta
        this.saldoCuenta = saldoCuenta;
        this.persona = persona;
        this.numeroDeCuenta = random.nextLong();
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public String getDatosCuenta() {
        return (persona.getNombre() + saldoCuenta + numeroDeCuenta);
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
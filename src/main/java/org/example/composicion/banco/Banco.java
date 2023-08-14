package org.example.composicion.banco;

public class Banco {
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void realizarTransferenciaEntreCuentas(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto){
        if (cuentaOrigen.getSaldoCuenta() >= monto){
            cuentaOrigen.setRetiro(monto);
            cuentaDestino.setIngresos(monto);
            System.out.println("Transferencia existosa: $" + monto + " de la cuenta"
                                + cuentaOrigen.getNumeroDeCuenta() + " a la cuenta "
                                + cuentaDestino.getNumeroDeCuenta());
        }
    }
    public String imprimirNumeroCuentas(Cuenta cuenta1, Cuenta cuenta2){
        return "El número de la cuenta1 es: " + cuenta1.getNumeroDeCuenta() + " " +
       " El número de la cuenta2 es: " + cuenta2.getNumeroDeCuenta();
    }
}

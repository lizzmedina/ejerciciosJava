package org.example.composicion.banco;

public class MainBanco {
    public static void main(String[] args) {

        Persona liza = new Persona("liza", 27, "111365987");
        Persona daneris = new Persona("daneris", 18, "118971187");

        Cuenta cuentaLiza = new Cuenta(123, liza );
        Cuenta cuentaDaneris = new Cuenta(456, daneris );

        Banco banco = new Banco(cuentaLiza, cuentaDaneris);

        banco.realizarTransferenciaEntreCuentas(cuentaLiza, cuentaDaneris, 300);

        System.out.println("Saldo cuenta 1 después de la transferencia: $" + cuentaLiza.getSaldoCuenta());
        System.out.println("Saldo cuenta 2 después de la transferencia: $" + cuentaDaneris.getSaldoCuenta());

    }
}

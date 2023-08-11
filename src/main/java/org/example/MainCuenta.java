package org.example;

import java.util.Random;

public class MainCuenta {
    public static void main(String[] args){
        Random random = new Random();

        Cuenta cuentaPepito = new Cuenta(200000, "pepito", 123456789);

        Cuenta cuentaOtro = new Cuenta(500000, "Catalina", random.nextLong() );

        long numeroCuentaPepito = cuentaPepito.getNumeroDeCuenta();
        System.out.println("El numero de cuenta de pepito es: " + numeroCuentaPepito);

        long numroCuentOtro = cuentaOtro.getNumeroDeCuenta();
        System.out.println("numero de cuenta:" + numroCuentOtro);
    }
}

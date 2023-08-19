package org.example.workshopPOO.ejercicioParqueadero;

public class Parqueadero {
    private Carro[][] carros; //debe tener dimensiones fijas por ejemplo 5 filas y 10 columnas
    private double tarifaPorHora;

    public Parqueadero(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    public Parqueadero(double tarifaPorHora, Carro[][] carros) {
        this.carros = carros;
        this.tarifaPorHora = tarifaPorHora;
    }
        public boolean parquearCarro(Carro carro, int fila, int columna) {
            if (fila < 0 || fila >= carros.length || columna < 0 || columna >= carros[0].length) {
                System.out.println("Límites excedidos, no se puede estacionar");
                return false;
            }
            if (carros[fila][columna] != null) {
                System.out.println("Espacio ocupado, no se puede estacionar");
                return false;
            }
            carros[fila][columna] = carro;
            System.out.println("Carro estacionado exitosamente");
            return true; // Estacionar exitosamente
    }

    public double cobrarPorTiempo(Carro carro, int horas){
        double valorAPagar = tarifaPorHora * horas;
        return valorAPagar;
    }
    public String mostrarEstadoParqueadero() {
        StringBuilder estado = new StringBuilder();

        for (int i = 0; i < carros.length ; i++) {
            for (int j = 0; j < carros[i].length ; j++) {
                if (carros[i][j] != null) {
                    estado.append("X|"); // Espacio ocupado por un carro
                } else {
                    estado.append(" |"); // Espacio vacío
                }
            }
            estado.append("\n"); // Nueva línea al final de cada fila
        }
        return estado.toString();
    }
}
package org.example.smellAndRefactor;

public class Calculador {
    public int calcularComparendo(int ve, Vehiculo vehiculo) {
        if(vehiculo.getTipoVehiculo() == vehiculo.getTipoVehiculo()) {
            if(ve<= vehiculo.getLimiteInferior()) {
                return 0;
            }else if (ve >= vehiculo.getLimiteInferiorIntermedio() && ve<= vehiculo.getLimiteSuperior()) {
                return 1;
            }
            return 2;
        }
//        if(vehiculo == camion) {
//            if(ve<= camion.getLimiteInferiorCamion()) {
//                return 0;
//            }else if (ve >= camion.getLimiteInferiorIntermedioCamion() && ve<= camion.getLimiteSuperiorCamion()) {
//                return 1;
//            }
//            return 2;
//        }
//        if(vehiculo == mula) {
//            if(ve<= mula.getLimiteInferiorMula()) {
//                return 0;
//            }else if (ve >= mula.getLimiteInferiorIntermedioMula() && ve<= mula.getLimiteSuperiorMula()) {
//                return 1;
//            }
//            return 2;
//        }
        return -1;
    }


}

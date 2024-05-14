package com.mycompany.busquedaexhaustiva;

public class BusquedaExhaustiva {

    public static void main(String[] args) {
        double[] espacioDeBusqueda = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6}; //Se declara con un arreglo el espacio de búsqueda
        double objetivo = 0.5; //Esto debe ser reemplazado por un dato recogido con un scanner

        double Solucion = buscarSolucionExhaustiva(espacioDeBusqueda, objetivo);
        System.out.println("La solución encontrada es: " + Solucion);
    }

    public static double buscarSolucionExhaustiva(double[] espacioDeBusqueda, double objetivo) {
        double Solucion = Double.MAX_VALUE;
        for (double punto : espacioDeBusqueda) {
            double diferencia = Math.abs(punto - objetivo);
            if (diferencia < Solucion) {
                Solucion = diferencia;
            }
        }
        return objetivo - Solucion;
    }
}

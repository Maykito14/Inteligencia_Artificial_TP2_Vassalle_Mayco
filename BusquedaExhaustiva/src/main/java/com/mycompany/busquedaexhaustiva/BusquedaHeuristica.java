package com.mycompany.busquedaexhaustiva;


public class BusquedaHeuristica {
    
    public static void main(String[] args) {
        double[] espacioDeBusqueda = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6}; //Se declara con un arreglo el espacio de búsqueda
        double objetivo = 0.5; //Esto debe ser reemplazado por un dato recogido con un scanner

        double Solucion = buscarSolucionHeuristica(espacioDeBusqueda, objetivo);
        System.out.println("La solución encontrada es: " + Solucion);
    }

    public static double buscarSolucionHeuristica(double[] espacioDeBusqueda, double objetivo) {
        double Solucion = Double.MAX_VALUE;
        double distanciaMinima = Double.MAX_VALUE; //A diferencia de la busqueda exhaustiva, evalúa la mejor posibilidad calculando la distancia minima
        for (double punto : espacioDeBusqueda) {
            double diferencia = Math.abs(punto - objetivo);
            if (diferencia < distanciaMinima) {
                Solucion = punto;
                distanciaMinima = diferencia;
            }
        }
        return Solucion;
    }
}

package caso1.app;

import caso1.model.ConexionDB;
import caso1.model. ConexionPool;

//Santiago Benjamin Huaman Reyes

public class MainCaso1 {
    public static void main(String[] args) {
        ConexionPool pool = new ConexionPool(3);

        System.out.println("\n--- Solicitudes 1, 2 y 3 ---");
        ConexionDB c1 = pool.obtenerConexion();
        ConexionDB c2 = pool.obtenerConexion();
        ConexionDB c3 = pool.obtenerConexion();

        System.out.println("\n--- Solicitud 4 (pool lleno) ---");
        pool.obtenerConexion();

        System.out.println("\n--- Liberar conexion #2 ---");
        pool.liberarConexion(c2);

        System.out.println("\n--- Solicitud 5 (reutiliza la liberada) ---");
        ConexionDB c5 = pool.obtenerConexion();

        System.out.println("\n--- Liberar todo ---");
        pool.liberarConexion(c1);
        pool.liberarConexion(c3);
        pool.liberarConexion(c5);
    }
}

/*
    Justificacion:

Se necesita reutilizar conexiones costosas de crear y limitar
 * su cantidad maxima. El pool presta objetos existentes y los recupera al
 * liberarlos, evitando crear y destruir conexiones en cada solicitud.
*/
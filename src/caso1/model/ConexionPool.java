package caso1.model;

import java.util.ArrayList;
import java.util.List;

public class ConexionPool {

    private List<ConexionDB> disponibles = new ArrayList<>();

    public ConexionPool(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            disponibles.add(new ConexionDB(i));
        }
        System.out.println("[Pool] Creado con " + cantidad + " conexiones.");
    }

    public ConexionDB obtenerConexion() {
        if (disponibles.isEmpty()) {
            System.out.println("  [Pool] No hay conexiones disponibles.");
            return null;
        }
        ConexionDB conexion = disponibles.remove(0);
        conexion.abrir();
        return conexion;
    }

    public void liberarConexion(ConexionDB conexion) {
        if (conexion != null) {
            conexion.cerrar();
            disponibles.add(conexion);
        }
    }
}

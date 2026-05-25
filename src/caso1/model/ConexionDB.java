package caso1.model;

public class ConexionDB {
    private int id;

    public ConexionDB(int id) {
        this.id = id;
    }

    public void abrir() {
        System.out.println("  Conexion #" + id + " asignada.");
    }

    public void cerrar() {
        System.out.println("  Conexion #" + id + " liberada.");
    }

    public int getId() {
        return id;
    }
}
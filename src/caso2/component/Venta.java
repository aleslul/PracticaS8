package caso2.component;

public class Venta {
    private String id;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private String destino;

    public Venta(String id, String producto, int cantidad, double precioUnitario, String destino) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.destino = destino;
    }

    public String getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getDestino() {
        return destino;
    }

    public double getTotal(){
        return cantidad * precioUnitario;
    }
}

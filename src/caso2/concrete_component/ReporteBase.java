package caso2.concrete_component;

import caso2.component.Reporte;
import caso2.component.Venta;

import java.util.ArrayList;
import java.util.List;

public class ReporteBase implements Reporte {
    private List<Venta> ventas;

    public ReporteBase() {
        this.ventas = new ArrayList<>();
        ventas.add(new Venta("V-001", "Laptop", 1, 1200.0, "Lima"));
        ventas.add(new Venta("V-002", "Zapatillas", 2, 80.0, "Arequipa"));
        ventas.add(new Venta("V-003", "Cafetera", 3, 50.0, "Trujillo"));
    }

    @Override
    public List<Venta> getVentas() {
        return ventas;
    }

    @Override
    public String generar() {
        String resultado = "=== " + getDescription() + " ===\n";
        resultado += String.format("%-10s | %-20s | %-10s | %-10s | %-10s\n",
                "ID", "Producto", "Cant.", "Precio U.", "Destino");
        resultado += "----------------------------------------------------------------------\n";

        for (Venta venta : ventas) {
            resultado += String.format("%-10s | %-20s | %-10d | $%-9.2f | %-10s\n",
                    venta.getId(), venta.getProducto(), venta.getCantidad(), venta.getPrecioUnitario(), venta.getDestino());
        }
        return resultado;
    }

    @Override
    public String getDescription() {
        return "REPORTE BASE DE VENTAS";
    }


}

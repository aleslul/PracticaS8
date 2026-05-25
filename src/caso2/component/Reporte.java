package caso2.component;

import java.util.List;

public interface Reporte {
    String generar();
    String getDescription();
    List<Venta> getVentas();
}

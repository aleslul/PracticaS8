package caso2.concrete_decorator;

import caso2.component.Reporte;
import caso2.component.Venta;
import caso2.decorator.ReporteDecorator;

public class SeccionTotales extends ReporteDecorator {
    public SeccionTotales(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        double totalGeneral = 0;
        for (Venta venta : getVentas()) {
            totalGeneral = totalGeneral + venta.getTotal();
        }
        return super.generar() +
                "\nSECCION FINANCZAS: TOTALES\n" +
                "Monto total de ventas: S/." + String.format("%.2f", totalGeneral) + "\n";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Totales";
    }
}

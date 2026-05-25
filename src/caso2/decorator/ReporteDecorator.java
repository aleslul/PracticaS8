package caso2.decorator;

import caso2.component.Reporte;
import caso2.component.Venta;

import java.util.List;

public class ReporteDecorator implements Reporte {
    protected final Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String generar() {
        return reporte.generar();
    }

    @Override
    public String getDescription() {
        return reporte.getDescription();
    }

    @Override
    public List<Venta> getVentas(){
        return reporte.getVentas();
    }
}

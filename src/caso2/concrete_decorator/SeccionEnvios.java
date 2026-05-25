package caso2.concrete_decorator;

import caso2.component.Reporte;
import caso2.component.Venta;
import caso2.decorator.ReporteDecorator;

public class SeccionEnvios extends ReporteDecorator {
    public SeccionEnvios(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        String destinos = "";
        for (Venta venta : getVentas()) {
            destinos = destinos + "- " + venta.getDestino() + "\n";
        }
        return super.generar() +
                "\nSECCION DE LOGISTICA: DETALLE DE LOS ENVIOS\n" +
                "Destinos programados: \n" + destinos;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Envios";
    }
}

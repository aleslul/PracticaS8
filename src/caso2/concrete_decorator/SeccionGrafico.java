package caso2.concrete_decorator;

import caso2.component.Reporte;
import caso2.decorator.ReporteDecorator;

public class SeccionGrafico extends ReporteDecorator {
    public SeccionGrafico(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return super.generar() +
                "\nSECCION DE MARKETING: GRAFICOS\n" +
                "(GRAAFICO DE BARRAS)";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Graficos";
    }
}

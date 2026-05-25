package caso2;

import caso2.component.Reporte;
import caso2.concrete_component.ReporteBase;
import caso2.concrete_decorator.SeccionEnvios;
import caso2.concrete_decorator.SeccionGrafico;
import caso2.concrete_decorator.SeccionTotales;

//Alessandro Becerra Montenegro

public class MainCaso2 {
    static void imprimir(Reporte reporte) {
        System.out.println("Tipo de reporte: " + reporte.getDescription());
        System.out.println(reporte.generar() + "\n");
    }

    public static void main(String[] args) {
        Reporte r1 = new ReporteBase();
        imprimir(r1);

        Reporte r2 = new SeccionTotales(new ReporteBase());
        imprimir(r2);

        Reporte r3 = new SeccionGrafico(new ReporteBase());
        imprimir(r3);

        Reporte r4 = new SeccionEnvios(new ReporteBase());
        imprimir(r4);
    }
}

/*
    Justificacion:

    Se aplicó el patrón Decorator para evitar la explosión de clases por cada combinación posible, permitiendo añadir secciones de forma dinámica y modular. Este enfoque permite extender las funcionalidades del reporte sin modificar el código base original, resolviendo el problema de mantenimiento y garantizando que el sistema sea escalable y flexible ante nuevos requerimientos.
*/
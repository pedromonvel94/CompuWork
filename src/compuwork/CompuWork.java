/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuwork;

import compuwork.models.ReporteDesempeno;
import compuwork.models.TipoReportes;

/**
 *
 * @author user
 */
public class CompuWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReporteDesempeno type = new ReporteDesempeno();        

        type.seleccionarTipoReporte(TipoReportes.DEPARTAMENTO);
        type.generarReporte();
        System.out.println("El tipo de reporte es: " + type.getTipoReporte());
    }   
}

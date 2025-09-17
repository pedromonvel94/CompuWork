/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuwork;

import compuwork.models.ReporteDesempeno;
import compuwork.models.TipoReportes;
import compuwork.models.Departamento;
import compuwork.models.Empleado;
import java.util.LinkedList;
import java.time.LocalDate;

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
        System.out.println("El tipo de reporte es: " + type.getTipoReporte() + "\n");
        
        // 1. Creamos la lista de empleados vacía
        LinkedList<Empleado> listaEmpleados = new LinkedList<>();
        
        // 2. Creamos el departamento
        Departamento dptoTI = new Departamento(1, "Tecnología", "Departamento de desarrollo de software", listaEmpleados);
        
        // 3. Creamos algunos empleados
        Empleado emp1 = new Empleado();
        emp1.setNombre("Juan");
        emp1.setApellido("Montoya");
        emp1.setDocumento("12345");
        emp1.setFechaIngreso(LocalDate.of(2025, 1, 10));
        emp1.setFechaVinculacion(LocalDate.of(2025, 1, 15));
        emp1.setTipo_empleado("Permanente");
        emp1.setSalario(3500000);

        Empleado emp2 = new Empleado();
        emp2.setNombre("Ana");
        emp2.setApellido("Gómez");
        emp2.setDocumento("67890");
        emp2.setFechaIngreso(LocalDate.of(2025, 2, 1));
        emp2.setFechaVinculacion(LocalDate.of(2025, 2, 5));
        emp2.setTipo_empleado("Temporal");
        emp2.setSalario(1800000);
        
        Empleado emp3 = new Empleado();
        emp3.setNombre("Carlos");
        emp3.setApellido("Ramírez");
        emp3.setDocumento("11223");
        emp3.setFechaIngreso(LocalDate.of(2025, 3, 1));
        emp3.setFechaVinculacion(LocalDate.of(2025, 3, 5));
        emp3.setTipo_empleado("Contratista");
        emp3.setSalario(2500000);

        Empleado emp4 = new Empleado();
        emp4.setNombre("Laura");
        emp4.setApellido("Hernández");
        emp4.setDocumento("44556");
        emp4.setFechaIngreso(LocalDate.of(2025, 4, 10));
        emp4.setFechaVinculacion(LocalDate.of(2025, 4, 12));
        emp4.setTipo_empleado("Tiempo Completo");
        emp4.setSalario(4000000);

        Empleado emp5 = new Empleado();
        emp5.setNombre("Miguel");
        emp5.setApellido("Torres");
        emp5.setDocumento("77889");
        emp5.setFechaIngreso(LocalDate.of(2025, 5, 20));
        emp5.setFechaVinculacion(LocalDate.of(2025, 5, 25));
        emp5.setTipo_empleado("Medio Tiempo");
        emp5.setSalario(1500000);

        // 4. Agregamos empleados al departamento
        dptoTI.agregarEmpleado(emp1);
        dptoTI.agregarEmpleado(emp2);
        dptoTI.agregarEmpleado(emp3);
        dptoTI.agregarEmpleado(emp4);
        dptoTI.agregarEmpleado(emp5);

        
        
        System.out.println("Empleados en el departamento de Tecnología:");
        System.out.println(dptoTI.listarEmpleadosDepartamento());
        
        // 6. Buscar un empleado por ID
        Empleado encontrado = dptoTI.buscarEmpleado(1);
        System.out.println("Empleado encontrado por ID: " + (encontrado != null ? encontrado.getNombre() : "No existe"));

        // 7. Actualizar empleado (ejemplo: cambiar salario a Ana)
        emp2.setSalario(2000000);
        dptoTI.actualizarEmpleado(emp2.getIdEmpleado(), emp2);

        // 8. Remover empleado
        dptoTI.removerEmpleado(emp1.getIdEmpleado());
        System.out.println("\nDespués de remover a Juan:");
        System.out.println(dptoTI.listarEmpleadosDepartamento());
    }   
}

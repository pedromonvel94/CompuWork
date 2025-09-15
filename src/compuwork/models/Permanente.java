/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Permanente extends Empleado{
    private String planBeneficios;

    public Permanente() {
    }

    public Permanente(String planBeneficios, int idEmpleado, String nombre, String apellido, int documento, LocalDate fechaVinculacion, LocalDate fechaIngreso, String tipo_empleado, double salario) {
        super(idEmpleado, nombre, apellido, documento, fechaVinculacion, fechaIngreso, tipo_empleado, salario);
        this.planBeneficios = planBeneficios;
    }

    public String getPlanBeneficios() {
        return planBeneficios;
    }

    public void setPlanBeneficios(String planBeneficios) {
        this.planBeneficios = planBeneficios;
    }
}

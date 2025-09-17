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
public class Empleado {
    private static int contadorEmpleados = 1;
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String documento;
    private LocalDate fechaVinculacion;
    private LocalDate fechaIngreso;
    private String tipo_empleado;
    private double salario;

    public Empleado() {
        this.idEmpleado = Empleado.contadorEmpleados; 
        this.nombre = "";
        this.apellido = "";        
        this.documento = "";
        this.fechaVinculacion = null;
        this.fechaIngreso = null;
        this.tipo_empleado = "";
        this.salario = 0;
        contadorEmpleados++;
    }
    
    public Empleado(int idEmpleado, String nombre, String apellido, String documento, LocalDate fechaVinculacion, LocalDate fechaIngreso, String tipo_empleado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaVinculacion = fechaVinculacion;
        this.fechaIngreso = fechaIngreso;
        this.tipo_empleado = tipo_empleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(LocalDate fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return "EMPLEADO " + idEmpleado + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Documento: " + documento + "\n" +
               "Fecha vinculacion: " + fechaVinculacion + "\n" +
               "Fecha ingreso: " + fechaIngreso + "\n" +
               "Tipo empleado: " + tipo_empleado+ "\n" +
               "Salario: " + salario + "\n";
    }
}

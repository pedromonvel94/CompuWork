/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork.models;
import java.util.LinkedList;
/**
 *
 * @author user
 */
public class Departamento {
    private int idDepartamento;    
    private String nombre;
    private String descripcion;
    private LinkedList<Empleado> empleado;

    public Departamento() {
    }
    
    public Departamento(int idDepartamento, String nombre, String descripcion, LinkedList<Empleado> empleado) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleado = empleado;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LinkedList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(LinkedList<Empleado> empleado) {
        this.empleado = empleado;
    }
}

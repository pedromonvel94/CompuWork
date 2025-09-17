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
    private static int contadorDepartamentos = 1;
    private int idDepartamento;    
    private String nombre;
    private String descripcion;
    private LinkedList<Empleado> empleados;

    public Departamento() {
        this.idDepartamento = contadorDepartamentos;
        this.nombre = "";
        this.descripcion = "";
    }
    
    public Departamento(int idDepartamento, String nombre, String descripcion, LinkedList<Empleado> empleado) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleados = empleado;
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
        return empleados;
    }

    public void setEmpleado(LinkedList<Empleado> empleado) {
        this.empleados = empleado;
    }
    
    public boolean agregarEmpleado(Empleado empleado){
        return this.empleados.add(empleado);
    }
    
    public Empleado buscarEmpleado (Empleado empleado){
        for(int i = 0; i < this.empleados.size(); i++){
            Empleado varTempEmpleado = this.empleados.get(i);
            if(varTempEmpleado.equals(empleado)){
                return varTempEmpleado;
            }
        }
        return null;
    }
    
    //Sobrecarga de metodo
    public Empleado buscarEmpleado (int idEmpleado){
        for(int i = 0; i < this.empleados.size(); i++){
            Empleado varTempEmpleado = this.empleados.get(i);
            if(varTempEmpleado.getIdEmpleado() == idEmpleado){
                return varTempEmpleado;
            }
        }
        return null;
    }
    
    public int buscarIndiceEmpleado(int idEmpleado){
        for(int i = 0; i < this.empleados.size(); i++){
            Empleado varTempEmpleado = this.empleados.get(i);
            if(varTempEmpleado.getIdEmpleado() == idEmpleado){
                return i;
            }
        }
        return -1;
    }
    
    public Empleado removerEmpleado (int idEmpleado){
        int indice = this.buscarIndiceEmpleado(idEmpleado);
        if(indice < 0){
            return null;
        }
        return this.empleados.remove(indice);
    }
    
    public Empleado actualizarEmpleado(int idEmpleado, Empleado empleado){//Aqui le paso el producto completo para mas adelante
	int indice = this.buscarIndiceEmpleado(idEmpleado);
	if (indice < 0){
		return null;
	}
	return this.empleados.set(indice, empleado); 
    }
    
    public String listarEmpleadosDepartamento(){
        String empleadosDepartamento = ""; 
        for(int i = 0; i < this.empleados.size(); i++){
		Empleado varTempEmpleado = this.empleados.get(i);
		empleadosDepartamento += varTempEmpleado.toString() + "\n"; 
	}
	return empleadosDepartamento;
    }
}



package Lógica.Personas.Empleados;

import Lógica.Personas.Persona;

public abstract class Empleado extends Persona {
    protected int antiguedad;
    protected int legajo;
    
    //Constructor
    public Empleado(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion, int antiguedad, int legajo) {
        super(id, nombre, apellido, dni, fechaNacimiento, direccion);
        this.antiguedad = antiguedad;
        this.legajo = legajo;
    }
    
    //Getters
    public int getAntiguedad() {
        return antiguedad;
    }

    public int getLegajo() {
        return legajo;
    }
    
    //Setters
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    //Métodos 
    public void mostrarInfo() {
        System.out.println("Antigüedad: "+antiguedad); //Verificar si es meses o años 
        System.out.println("Legajo: "+legajo);
    }
    
}

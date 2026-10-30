
package Lógica.Personas.Empleados;

public class Administrativo extends Empleado{
    private String tarea;
    private String area;
    
    //Constructor 
    public Administrativo(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion, int antiguedad, int legajo, String tarea, String area) {
        super(id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo);
        this.tarea = tarea;
        this.area = area;
    }
    
    //Getters 
    public String getTarea() {
        return tarea;
    }

    public String getArea() {
        return area;
    }
    
    //Setters
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    //Métodos
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tarea: "+tarea);
        System.out.println("Area: "+area);
    }
    
    public String soyUn() {
        return "administrativo";
    }
    
}

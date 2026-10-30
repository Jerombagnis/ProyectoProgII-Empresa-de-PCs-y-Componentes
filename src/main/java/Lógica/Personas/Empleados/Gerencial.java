
package Lógica.Personas.Empleados;

public class Gerencial extends Empleado {
    private String cargo;
    
    //Constructor
    public Gerencial(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion, int antiguedad, int legajo, String cargo) {
        super(id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo);
        this.cargo = cargo;
    }
    
    //Getter 
    public String getCargo() {
        return cargo;
    }
    
    //Stter 

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Métodos
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cargo: "+cargo);
    }
    
    public String soyUn() {
        return "gerencial";
    }
}
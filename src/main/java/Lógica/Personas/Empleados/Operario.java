
package Lógica.Personas.Empleados;

public class Operario extends Empleado {
    private String sector;
    
    //Constructor 
    public Operario(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion, int antiguedad, int legajo, String sector) {
        super(id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo);
        this.sector = sector;
    }
    
    
    //Getter
    public String getSector() {
        return sector;
    }
    
    //Setter
    public void setSector(String sector) {
        this.sector = sector;
    }
    
    //Métodos 
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Sector: "+sector);
    }
    
    public String soyUn() {
        return "operario";
    }
}

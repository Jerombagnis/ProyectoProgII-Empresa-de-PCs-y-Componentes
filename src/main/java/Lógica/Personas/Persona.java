package Lógica.Personas; 

public abstract class Persona implements Comparable <Persona>{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String fechaNacimiento;
    protected String direccion;
    
    //Constructor
    public Persona(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Método para comparar nombres y ordenar 
    @Override
    public int compareTo(Persona persona) {
        return this.apellido.compareToIgnoreCase(persona.getApellido());
    }
    
    //Método para mostrar info
    
    public void mostrarInfo() {
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento);
        System.out.println("Dirección: "+direccion);
    }
    
    //Método para identificar tipo 
    
    public abstract String soyUn(); 
    
}

package Lógica.Componentes; 

public abstract class Componente {
    protected int id; 
    protected String modelo;
    protected double precio;
    protected String descripcion; 
    
    
    //Constructor
    public Componente (int id, String modelo, double precio, String descripcion) {
        this.id=id;
        this.modelo=modelo; 
        this.precio=precio; 
        this.descripcion=descripcion;
    }
    
    //Getters
    public int getId(){return id;} 
    public String getModelo () {return modelo;} 
    public double getPrecio () {return precio;}  
    public String getDescripcion () {return descripcion;}
    
    //Setters 
    public void setId (int id) {this.id=id;}
    public void setModelo (String modelo) {this.modelo=modelo;}
    public void setPrecio (double precio) {this.precio=precio;}
    public void setDescripcion (String descripcion) {this.descripcion=descripcion;} 
    
    //Métodos
    public void mostrarInfo () {
        System.out.println("ID: "+id); 
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
        System.out.println("Descripción: "+descripcion);
    }
    
    //Identificador de componente
    public abstract String soyUn(); 
    
    //Soporta procesador
    public boolean soportaProcesador (int idProcesador) {
        return false; 
    }
    
    
}

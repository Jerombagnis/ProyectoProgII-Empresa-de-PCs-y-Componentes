
package Lógica.Componentes;

public class DiscoDuro extends Componente{
    private int velocidadRotacion; 
    private int capacidadGb; 
    private String tipo; //ssd-hdd
    
    //Constructor 
    public DiscoDuro(int id, String modelo, double precio, String descripcion, int velocidadRotacion, int capacidadGb, String tipo) {
        super(id, modelo, precio, descripcion);
        this.velocidadRotacion = velocidadRotacion;
        this.capacidadGb = capacidadGb;
        this.tipo = tipo;
    }
    
    //Getters 
    public int getVelocidadRotacion() {
        return velocidadRotacion;
    }

    public int getCapacidadGb() {
        return capacidadGb;
    }

    public String getTipo() {
        return tipo;
    }
    
    //Setters
    public void setVelocidadRotacion(int velocidadRotacion) {
        this.velocidadRotacion = velocidadRotacion;
    }

    public void setCapacidadGb(int capacidadGb) {
        this.capacidadGb = capacidadGb;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Métodos 
    
    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Velocidad de rotación (Rpm): "+velocidadRotacion);
        System.out.println("Capacidad (Gb): "+capacidadGb);
        System.out.println("Tipo: "+tipo);
    }
    
    public String soyUn() {
       return "disco duro";
    }
    
    
}

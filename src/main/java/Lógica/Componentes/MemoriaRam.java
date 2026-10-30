
package Lógica.Componentes;

public class MemoriaRam extends Componente {
    
    private String tecnologia; //ddr3-4
    private int velocidadMhz; 
    private int capacidadGb; 

    
    //Constructor
    public MemoriaRam(int id, String modelo, double precio, String descripcion, String tecnologia, int velocidadMhz, int capacidadGb) {
        super(id, modelo, precio, descripcion);
        this.tecnologia = tecnologia;
        this.velocidadMhz = velocidadMhz;
        this.capacidadGb = capacidadGb;
    }
    
    //Getters 
    public String getTecnologia() {
        return tecnologia;
    }

    public int getVelocidadMhz() {
        return velocidadMhz;
    }

    public int getCapacidadGb() {
        return capacidadGb;
    }
 
    //Setters 
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setVelocidadMhz(int velocidadMhz) {
        this.velocidadMhz = velocidadMhz;
    }

    public void setCapacidadGb(int capacidadGb) {
        this.capacidadGb = capacidadGb;
    }
    
    //Métodos 
    
    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Velocidad (Mhz): "+velocidadMhz);
        System.out.println("Capacidad (Gb): "+capacidadGb);
    }
    
    public String soyUn() {
       return "memoria ram";
    }
    
}

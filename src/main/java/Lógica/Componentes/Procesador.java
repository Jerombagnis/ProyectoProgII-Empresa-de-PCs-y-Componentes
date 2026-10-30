package Lógica.Componentes;

public class Procesador extends Componente {
    private double velocidadGhz; 
    private int memoriaCacheMb; 

    
    //Consturctor
    public Procesador(int id, String modelo, double precio, String descripcion, double velocidadGhz, int memoriaCacheMb) {
        super(id, modelo, precio, descripcion);
        this.velocidadGhz = velocidadGhz;
        this.memoriaCacheMb = memoriaCacheMb;
    }
    
    //Getters
    public double getVelocidadGhz() {
        return velocidadGhz;
    }

    public int getMemoriaCacheMb() {
        return memoriaCacheMb;
    }
    
    //Setters 
    public void setVelocidadGhz(double velocidadGhz) {
        this.velocidadGhz = velocidadGhz;
    }

    public void setMemoriaCacheMb(int memoriaCacheMb) {
        this.memoriaCacheMb = memoriaCacheMb;
    }
    
    //Métodos
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Velocidad (Ghz): "+velocidadGhz);
        System.out.println("Memoria caché (Mb): "+memoriaCacheMb);
    }
    
   public String soyUn() {
       return "procesador";
    }
}

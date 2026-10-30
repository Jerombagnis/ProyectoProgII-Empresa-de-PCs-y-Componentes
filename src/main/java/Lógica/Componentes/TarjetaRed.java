
package Lógica.Componentes;

import Lógica.Componentes.Componente;

public class TarjetaRed extends Componente {
    private double velocidadTransmision; 
    private String mac; 
    
    //Constructor
    public TarjetaRed(int id, String modelo, double precio, String descripcion, double velocidadTransmision, String mac) {
        super(id, modelo, precio, descripcion);
        this.velocidadTransmision = velocidadTransmision;
        this.mac = mac;
    }
    
    //Getters 
    public double getVelocidadTransmision() {
        return velocidadTransmision;
    }

    public String getMac() {
        return mac;
    }
    
    //Setters 
    public void setVelocidadTransmision(double velocidadTransmision) {
        this.velocidadTransmision = velocidadTransmision;
    }
    
    public void setMac(String Mac) {
        this.mac = mac;
    }
    
    //Métodos 
    
    @Override
    public void mostrarInfo () {
        super.mostrarInfo (); 
        System.out.println("Velocidad de transimisón (bps): "+velocidadTransmision);
        System.out.println("Mac: "+mac);
    }
    
    public String soyUn() {
       return "tarjeta de red";
    }
    
}

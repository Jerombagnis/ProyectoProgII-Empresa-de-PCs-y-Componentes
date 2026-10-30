
package Lógica.Componentes;


public class Fuente extends Componente {
    private int watts; 
    
    //Constructor 
    public Fuente(int id, String modelo, double precio, String descripcion, int watts) {
        super(id, modelo, precio, descripcion);
        this.watts = watts;
    }
    
    //Getter 
    public int getWatts() {
        return watts;
    }
    
    //Setter
    public void setWatts (int watts) {
        this.watts=watts;
    }
    
    //Métodos 
    
    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Watts: "+watts); 
    }
    
    public String soyUn() {
       return "fuente";
    }
}

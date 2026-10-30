
package Lógica.Componentes;
import java.util.ArrayList;


public class PlacaMadre extends Componente{
    private int cantidadRanuras; 
    private ArrayList <Integer> procesadoresCompatibles; 
    
  
    //Constructor
    public PlacaMadre(int id, String modelo, double precio, String descripcion, int cantidadRanuras, ArrayList<Integer> procesadoresCompatibles) {
        super(id, modelo, precio, descripcion);
        this.cantidadRanuras = cantidadRanuras;
        this.procesadoresCompatibles = procesadoresCompatibles;
    }

    //Getters
    public int getCantidadRanuras() {
        return cantidadRanuras;
    }


    public ArrayList<Integer> getProcesadoresCompatibles() {
        return procesadoresCompatibles;
    }

    //Setters
    public void setCantidadRanuras(int cantidadRanuras) {
        this.cantidadRanuras = cantidadRanuras;
    }
    
    public void setProcesadoresCompatibles(ArrayList<Integer> procesadoresCompatibles) {
        this.procesadoresCompatibles = procesadoresCompatibles;
    }
    
    //Métodos 
    
    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Cantidad de ranuras: "+cantidadRanuras);
        System.out.println("Procesadores compatibles: ");
        for (Integer i : procesadoresCompatibles){
            System.out.println(i);
        } 
    }
    
    public String soyUn() {
        return "placa madre"; 
    }
    
    //Método para corroborar si un id pertenece a procesador compatile
    public boolean soportaProcesador (int idProcesador) {
        return this.procesadoresCompatibles.contains(idProcesador);
    }
    
}

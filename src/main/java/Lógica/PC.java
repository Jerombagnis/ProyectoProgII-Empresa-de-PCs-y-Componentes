package Lógica;


import java.util.ArrayList;


public class PC {
    private int id; 
    private ArrayList<Integer> idsComponentes;
    private String fechaArmado;
    private int idCliente;

    
    //Constructor
    public PC(int id, ArrayList<Integer> idsComponentes, String fechaArmado, int idCliente) {
        this.id=id;
        this.idsComponentes = idsComponentes;
        this.fechaArmado = fechaArmado;
        this.idCliente = idCliente;
    }
    
    //Getters
    public int getId() {
        return id;
    }
    
    public ArrayList<Integer> getIdsComponentes() {
        return idsComponentes;
    }

    public String getFechaArmado() {
        return fechaArmado;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    
    //Setters
    public void setId(int id) {
        this.id=id;
    }
    
    public void setIdsComponentes(ArrayList<Integer> idsComponentes) {
        this.idsComponentes = idsComponentes;
    }

    public void setFechaArmado(String fechaArmado) {
        this.fechaArmado = fechaArmado;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    //Métodos
    public void mostrarInfo() {
        System.out.println("ID PC: "+id);
        System.out.println("ID Cliente: "+idCliente);
        System.out.println("IDs componentes usados: ");
        for (Integer i : idsComponentes) {
            System.out.println(" - ID Componente: " + i);
        }
    }
    
    
}

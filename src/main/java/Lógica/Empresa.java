package Lógica;

import Lógica.Componentes.Componente;
import Lógica.Componentes.PlacaMadre;
import Lógica.Componentes.Procesador;
import Lógica.Personas.Cliente;
import Lógica.Personas.Empleados.Empleado;
import java.util.ArrayList;
import java.util.Scanner;


public class Empresa {
    private ArrayList<Componente> componentes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<PC> pcs;
    
    
    //Constuctor 
    public Empresa() {
       componentes = new ArrayList<>();
       clientes = new ArrayList<>();
       empleados = new ArrayList<>();
       pcs = new ArrayList<>();
    }
    
    //Getters 
    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<PC> getPcs() {
        return pcs;
    }
    
    
    //Métodos 
    
    
    //Altas 
    public boolean altaCliente (Cliente nuevoCliente){
        
        if(buscarCliente(nuevoCliente.getId())!=null){
            System.out.println("Error: ya existe un cliente con el ID " + nuevoCliente.getId());
            return false; 
        }
        clientes.add(nuevoCliente);
        System.out.println("Cliente agregado de forma exitosa.");
        return true; 
    }   
    
    public boolean altaEmpleado (Empleado nuevoEmpleado) {
       if(buscarEmpleado(nuevoEmpleado.getId(), nuevoEmpleado.getLegajo())!=null){
            System.out.println("Error: ya existe un empleado con el ID " + nuevoEmpleado.getId() + "o con el Legajo " + nuevoEmpleado.getLegajo());
            return false;
        }
     
       empleados.add(nuevoEmpleado); 
       System.out.println("Empleado agregado de forma exitosa.");
       return true; 
    }
    
    public boolean altaComponente (Componente nuevoComponente) {
        if(buscarComponente (nuevoComponente.getId())!=null){
            System.out.println("Error: ya existe un componente con el ID " + nuevoComponente.getId());
            return false; 
        }
        componentes.add(nuevoComponente); 
        System.out.println("Componente agregado de forma exitosa.");
        return true; 
    }
    
    public void altaPc (PC nuevaPc) {   
        pcs.add(nuevaPc);
    }
    
    //Búsqueda
    public Cliente buscarCliente (int id) {
        for(Cliente c : clientes){
            if(c.getId() == id){
                return c;
                }
            }
        return null; 
    }
    
    public Empleado buscarEmpleado (int id, int legajo) {
        for(Empleado e : empleados){
            if(e.getId() == id || e.getLegajo() == legajo){
                return e;
            }
        }
        return null; 
    } 
    
    public Componente buscarComponente (int id) {
        for (Componente c : componentes) {
            if (c.getId()== id) {
                return c;
            }
        } 
        return null;  
    }
    
    public PC buscarPc (int id) {
        for (PC pc : pcs) {
            if(pc.getId() == id){
                return pc; 
            }
        }
        return null; 
    }
    
    //Dar de baja un componente
    public boolean eliminarComponente(int id) {
        Componente comp = buscarComponente(id); 
        
        if (comp !=null) {
            componentes.remove(comp);
            System.out.println("Componente con ID " + id +"("+comp.getModelo()+") eliminado correctamente");
            return true; 
        } else {
            System.out.println("Error: no se encontró ningún componente con ID "+comp.getId() + "para eliminar");
            return false; 
        }
    } 
    
    //Listado de componentes, empleados y clientes 
    public void listarComponentes() {
        System.out.println("\n----------LISTADO DE COMPONENTES----------");
        if(componentes.isEmpty()){
            System.out.println("No hay componentes cargados en el sistema.");
        } else {
            for (Componente c : componentes) {
                c.mostrarInfo();
                System.out.println("------------------------------------");
            }
        }
    }
    
    public void listarEmpleados() {
        System.out.println("\n----------LISTADO DE EMPLEADOS----------");
        if(empleados.isEmpty()){
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInfo();
                System.out.println("------------------------------------");
            }
        }   
    }
    
    public void listarPcs() {
        System.out.println("\n----------LISTADO DE COMPUTADORAS ARMADAS----------");
        if(pcs.isEmpty()){
            System.out.println("No se ha construido ninguna PC aún en el sistema.");
        } else {
            for (PC pc : pcs) {
                pc.mostrarInfo();
                System.out.println("------------------------------------");
            }
        }
    }
    
    //Construir una PC
    public boolean contruirPC(int idPC, String fecha, int idCliente, ArrayList<Integer> idsComponentes) {
        //Control ID PCs armadas 
        for (PC pc : pcs) {
            if(pc.getId()== idPC) {
                System.out.println("Error: ya existe una PC armada con el ID "+idPC);
                return false; 
            }
        }
        
        //Control validación de cliente
        Cliente cliente = buscarCliente(idCliente); 
        if (cliente == null){
            System.out.println("Error: cliente con ID "+idCliente+" no encontrado.");
            return false;
        }
        
        //Control validación de componentes
        for (Integer idComp : idsComponentes) {
            Componente comp = buscarComponente(idComp); 
            
            if(comp == null) {
                System.out.println("Error: componente con ID "+idComp+" no encontrado.");
                return false;
            }
        } 
        
        //Identificación placa madre-procesador y módulos ram entre componentes elegidos
        int idProcesadorElegido= -1; 
        PlacaMadre placaMadreElegida= null;  
        int contadorRam=0; 
        
        for (Integer idComp : idsComponentes) {
            Componente comp = buscarComponente(idComp); 
            
           if(comp.soyUn().equalsIgnoreCase("procesador")){
               idProcesadorElegido = comp.getId(); 
           } else {
               if (comp.soyUn().equalsIgnoreCase("placa madre")) {
                   placaMadreElegida=(PlacaMadre) comp;
               } else {
                   if (comp.soyUn().equalsIgnoreCase("memoria ram")){
                       contadorRam++; 
                   } 
               }
           }
        }
        
        if (placaMadreElegida == null) {
            System.out.println("Error: No se pudo identificar la placa madre");
            return false;
        }
        
        if (idProcesadorElegido == -1) {
            System.out.println("Error: No se pudo identificar el procesador");
            return false;
        }
        
        //Control compatibilidad placa madre-procesador
        if(!placaMadreElegida.soportaProcesador(idProcesadorElegido)){
            System.out.println("Error de compatibilidad: La placa madre no soporta el procesador seleccionado.");
            return false; 
        }
        
        if (contadorRam > placaMadreElegida.getCantidadRanuras()) {
            System.out.println("Error: La cantidad de memorias RAM elegidas (" + contadorRam + ") " + "supera las ranuras disponibles de la placa madre (" + placaMadreElegida.getCantidadRanuras() + ").");
            return false;
        }
        
        //Registro de pc nueva
        PC nuevaPC= new PC(idPC, idsComponentes, fecha, idCliente);
        pcs.add(nuevaPC); 
        System.out.println("PC ID " + idPC + " construída y registrada exitosamente.");
        
        return true; 
    }     
}

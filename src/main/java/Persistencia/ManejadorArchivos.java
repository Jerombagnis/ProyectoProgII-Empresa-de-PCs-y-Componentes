package Persistencia;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import Lógica.Empresa;
import Lógica.Componentes.Componente;
import Lógica.Componentes.DiscoDuro;
import Lógica.Componentes.Fuente;
import Lógica.Componentes.MemoriaRam;
import Lógica.Componentes.PlacaMadre;
import Lógica.Componentes.Procesador;
import Lógica.Componentes.TarjetaRed;
import Lógica.PC;
import Lógica.Personas.Cliente;
import Lógica.Personas.Empleados.Administrativo;
import Lógica.Personas.Empleados.Empleado;
import Lógica.Personas.Empleados.Gerencial;
import Lógica.Personas.Empleados.Operario;
import Lógica.Personas.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ManejadorArchivos {
    private String rutaComponentes; 
    private String rutaPersonas;
    private String rutaPcs; 
    
    //Constructor
    public ManejadorArchivos () {
        this.rutaComponentes="componente.txt";
        this.rutaPersonas= "personas.txt";
        this.rutaPcs= "pcs.txt";
    }
    
    //Métodos escritura
    public void guardarComponentes (Empresa empresa) {
        
        File f = new File (rutaComponentes); 
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            
            if(f.canWrite()){
                fw = new FileWriter (f); 
                bw = new BufferedWriter (fw); 
                
                for (Componente comp : empresa.getComponentes()){
                    String linea= comp.soyUn() + ";"+comp.getId() + ";" + comp.getModelo() + ";" + comp.getPrecio() + ";" + comp.getDescripcion();
                    if(comp.soyUn().equalsIgnoreCase("placa madre")){
                        PlacaMadre placa = (PlacaMadre) comp; 
                        linea+=";" + placa.getCantidadRanuras();
                        ArrayList<Integer> compatibles = placa.getProcesadoresCompatibles();
                        if (!compatibles.isEmpty()) {
                            linea += ";"; 
                            for (int i = 0; i < compatibles.size(); i++) {
                                linea += compatibles.get(i);
                                if (i < compatibles.size() - 1) {
                                    linea += ",";
                                }
                            }
                        }
                    }else if(comp.soyUn().equalsIgnoreCase("procesador")){
                        Procesador proc = (Procesador) comp; 
                       linea+=";" + proc.getVelocidadGhz() + ";"+proc.getMemoriaCacheMb();
                    }else if(comp.soyUn().equalsIgnoreCase("memoria ram")){
                        MemoriaRam ram= (MemoriaRam) comp; 
                        linea+=";" + ram.getTecnologia() + ";"+ram.getVelocidadMhz() + ";" + ram.getCapacidadGb();
                    }else if (comp.soyUn().equalsIgnoreCase("tarjeta de red")){
                        TarjetaRed red= (TarjetaRed) comp; 
                        linea+=";" + red.getVelocidadTransmision() + ";"+red.getMac();
                    }else if(comp.soyUn().equalsIgnoreCase("disco duro")){
                        DiscoDuro disco= (DiscoDuro) comp; 
                        linea+=";" + disco.getVelocidadRotacion() + ";"+disco.getCapacidadGb() + ";"+disco.getTipo();
                    }else if(comp.soyUn().equalsIgnoreCase("fuente")){
                        Fuente fuente= (Fuente) comp; 
                        linea+=";" + fuente.getWatts();
                    }
                    bw.write(linea);
                    bw.newLine();
                } 
            }else System.out.println("Error: sin permiso de escritura.");
            System.out.println("Componentes guardados exitosamente.");
        }catch (IOException e) {
            System.out.println("Error al intentar guardar los datos: "+e.getMessage());
        }finally {
            try {
                if (bw != null) {
                    bw.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
    
    public void guardarPersona(Empresa empresa) {
        File f = new File (rutaPersonas); 

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            if(!f.exists()){
                f.createNewFile();
            }

            if(f.canWrite()){
                fw = new FileWriter (f); 
                bw = new BufferedWriter (fw); 
                
                //Guardar clientes
                for(Cliente cliente : empresa.getClientes()){
                    String linea = cliente.soyUn() + ";" +cliente.getId() + ";" + cliente.getNombre() + ";" + cliente.getApellido() + ";" + cliente.getDni() + ";" + cliente.getFechaNacimiento() + ";" + cliente.getDireccion() + ";" + cliente.getMail() + ";" + cliente.getCuil() + ";" + cliente.getNacionalidad();
                    bw.write(linea);
                    bw.newLine();
                }
                
                //Guardar empleado 
                for (Empleado emp : empresa.getEmpleados()){
                    String linea = emp.soyUn() + ";" + emp.getId() + ";" + emp.getNombre() + ";" + emp.getApellido() + ";" + emp.getDni() + ";" + emp.getFechaNacimiento() + ";" + emp.getDireccion() + ";" + emp.getAntiguedad() + ";" + emp.getLegajo();
                    if (emp.soyUn().equalsIgnoreCase("administrativo")) {
                        Administrativo admin = (Administrativo) emp;
                        linea += ";" + admin.getTarea() + ";" + admin.getArea();
                    } else if (emp.soyUn().equalsIgnoreCase("operario")) {
                        Operario operario = (Operario) emp;
                        linea += ";" + operario.getSector(); 
                    }else if (emp.soyUn().equalsIgnoreCase("gerencial")) {
                        Gerencial gerencial = (Gerencial) emp;
                        linea += ";" + gerencial.getCargo(); 
                    }
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Personas (Clientes y Empleados) guardadas exitosamente.");
            }else System.out.println("Error: sin permiso de escritura.");
        }catch (IOException e) {
            System.out.println("Error al intentar guardar los datos: "+e.getMessage());
        }finally {
            try {
                if (bw != null) {
                    bw.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
    
    public void guardarPcs(Empresa empresa) {
        File f = new File(rutaPcs); 

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            if (f.canWrite()) {
                fw = new FileWriter(f); 
                bw = new BufferedWriter(fw);
                for (PC pc : empresa.getPcs()) {
                    String linea = pc.getId() + ";" + pc.getFechaArmado() + ";" + pc.getIdCliente() + ";";
                    ArrayList<Integer> componentes = pc.getIdsComponentes();
                    for (int i = 0; i < componentes.size(); i++) {
                        linea += componentes.get(i);
                        if (i < componentes.size() - 1) {
                            linea += ",";
                        }
                    }                    
                    bw.write(linea);
                    bw.newLine();
                }                
                System.out.println("PCs armadas guardadas exitosamente.");
            } else {
                System.out.println("Error: sin permiso de escritura.");
            }
        } catch (IOException e) {
            System.out.println("Error al intentar guardar las PCs: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close(); 
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }        
    }
    
    //Métodos lectura 
    public void cargarComponentes (Empresa empresa) {
        File f= new File (rutaComponentes); 
        FileReader fr= null;
        BufferedReader br= null; 
        
        if (f.exists()) {
            if(f.canRead()){
                try {
                    fr= new FileReader (f);
                    br= new BufferedReader (fr);
                    
                    String linea; 
                    
                    while ((linea = br.readLine())!=null){
                        String datos [] = linea.split(";");
                        String tipo = datos[0]; 
                        int id= Integer.parseInt(datos[1]);
                        String modelo= datos [2]; 
                        double precio= Double.parseDouble(datos[3]);
                        String descripcion= datos [4]; 
                        
                        if (tipo.equalsIgnoreCase("placa madre")){
                            int ranuras=Integer.parseInt(datos[5]);
                            
                            //Lista temporal para llenar con los id y poder instanciar la placa madre después
                            ArrayList<Integer> procsCompatiblesTmp = new ArrayList<Integer>(); 
  
                            if (datos.length > 6 && !datos[6].trim().isEmpty()) {
                                String idsCompatiblesStr []= datos[6].split(",");
                                for (String idStr : idsCompatiblesStr) {
                                    int idProcCompatible = Integer.parseInt(idStr.trim());
                                    procsCompatiblesTmp.add(idProcCompatible); 
                                }
                            }
                            
                            PlacaMadre placa = new PlacaMadre(id, modelo, precio, descripcion, ranuras, procsCompatiblesTmp);
                            empresa.altaComponente(placa);
                        } else if(tipo.equalsIgnoreCase("procesador")) {
                            double velocidad = Double.parseDouble(datos [5]);
                            int cache = Integer.parseInt(datos[6]); 
                            
                            Procesador proc = new Procesador(id, modelo, precio, descripcion, velocidad, cache);
                            empresa.altaComponente(proc);
                        } else if(tipo.equalsIgnoreCase("memoria ram")) {
                            String tecnologia=datos[5];
                            int velocidad= Integer.parseInt(datos[6]);
                            int capacidad= Integer.parseInt(datos[7]);
                            
                            MemoriaRam ram= new MemoriaRam(id, modelo, precio, descripcion, tecnologia, velocidad, capacidad);
                            empresa.altaComponente(ram); 
                        } else if (tipo.equalsIgnoreCase("tarjeta de red")){
                            double velocidad= Double.parseDouble(datos[5]);
                            String mac = datos[6];
                            
                            TarjetaRed red= new TarjetaRed(id, modelo, precio, descripcion,velocidad,mac);
                            empresa.altaComponente(red);
                        } else if (tipo.equalsIgnoreCase("disco duro")){
                            int velocidad= Integer.parseInt(datos[5]);
                            int capacidad= Integer.parseInt(datos[6]);
                            String tipoDisco= datos[7];
                            
                            DiscoDuro disco= new DiscoDuro (id, modelo, precio, descripcion, velocidad, capacidad, tipoDisco);
                            empresa.altaComponente(disco);
                        } else if (tipo.equalsIgnoreCase("fuente")){
                            int watts= Integer.parseInt(datos[5]);
                            
                            Fuente fuente = new Fuente (id, modelo, precio, descripcion, watts);
                            empresa.altaComponente(fuente);
                        }
                    }
                    System.out.println("Componentes cargados de forma exitosa.");
                }catch (IOException e){
                    System.out.println("Error: "+ e.getMessage());
                }finally {
                    try {
                        if (br != null) {
                            br.close();
                        }
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el archivo: " + e.getMessage());
                    }
                }
            } else System.out.println("Error al intentar leer el archivo.");
        }else System.out.println("Error: no se encontró el archivo.");
    }
    
    public void cargarPersonas (Empresa empresa) {
        
        File f = new File (rutaPersonas); 
        
        FileReader fr = null; 
        BufferedReader br = null; 
        
        if (f.exists()){
            if (f.canRead()) {
                try {
                    fr= new FileReader (f);
                    br=new BufferedReader(fr);
                    
                    String linea; 
                    
                    while ((linea=br.readLine())!=null){
                        String datos []= linea.split(";");
                        
                        String tipo= datos [0];
                        int id= Integer.parseInt(datos[1]);
                        String nombre= datos [2];
                        String apellido= datos [3];
                        String dni= datos [4]; 
                        String fechaNac= datos [5];
                        String direccion= datos [6];
                        
                        if(tipo.equalsIgnoreCase("cliente")){
                            String mail= datos [7];
                            String cuil = datos [8]; 
                            String nacionalidad = datos [9];
                            
                            Cliente cliente = new Cliente (id, nombre, apellido, dni, fechaNac, direccion, mail, cuil, nacionalidad);
                            empresa.altaCliente(cliente);
                        } else {
                            int antiguedad= Integer.parseInt(datos [7]);
                            int legajo = Integer.parseInt(datos[8]); 
                            
                            if(tipo.equalsIgnoreCase("administrativo")){
                                String tarea= datos[9];
                                String area= datos[10];
                                
                                Administrativo admiin = new Administrativo (id, nombre, apellido, dni, fechaNac, direccion, antiguedad, legajo, tarea, area);
                                empresa.altaEmpleado(admiin);
                            } else if(tipo.equalsIgnoreCase("operario")){
                                String sector= datos [9];
                                
                                Operario operario= new Operario (id, nombre, apellido, dni, fechaNac, direccion, antiguedad, legajo, sector);
                                empresa.altaEmpleado(operario);
                            } else if (tipo.equalsIgnoreCase("gerencial")){
                                String cargo= datos [9];
                                
                                Gerencial gerencial= new Gerencial(id, nombre, apellido, dni, fechaNac, direccion, antiguedad, legajo, cargo);
                                empresa.altaEmpleado(gerencial);
                            } 
                        }   
                    }
                    System.out.println("Personas (clientes y empleados) cargados exitosamente.");
                }catch (IOException e){
                    System.out.println("Error: "+ e.getMessage());
                }finally {
                    try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                    }
                }
            }else System.out.println("Error al intentar leer el archivo.");
        }else System.out.println("Error: no se encontró el archivo.");
    }
    
    public void cargarPcs (Empresa empresa) {
        
        File f = new File (rutaPcs);
        
        FileReader fr = null;
        BufferedReader br = null; 
        
        if(f.exists()){
            if(f.canRead()){
                try{
                    fr= new FileReader (f);
                    br= new BufferedReader (fr);
                    
                    String linea;
                    
                    while((linea=br.readLine())!=null){
                        String datos [] = linea.split(";");
                        
                        int idPc = Integer.parseInt(datos[0]);
                        String fechaArmado= datos [1];
                        int idCliente= Integer.parseInt(datos[2]);
                        
                        
                        //Lista temporal para llenar con los id y poder instanciar PC después
                        ArrayList<Integer>iDsComponentesTmp= new ArrayList <Integer> (); 
                        
                        if (datos.length > 3 && !datos[3].trim().isEmpty()) {
                            String idsCompStr []= datos[3].split(",");
                            
                            for (String idStr : idsCompStr) {
                                int idComp=Integer.parseInt(idStr.trim());
                                iDsComponentesTmp.add(idComp); 
                            }
                            
                            PC pc = new PC (idPc, iDsComponentesTmp, fechaArmado, idCliente);
                            empresa.altaPc(pc);
                        }
                    }
                    System.out.println("PCs armadas cargadas exitosamente.");
                }catch (IOException e) {
                    System.out.println("Error: "+ e.getMessage());
                }finally {
                    try {
                    if (br != null) {
                        br.close();
                    }
                    } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo de PCs: " + e.getMessage());
                    }
                }
            } else System.out.println("Error al intentar leer el archivo.");
        }else System.out.println("Error: no se encontró el archivo."); 
    }
    
    public void cargarTodo(Empresa empresa) {
        cargarComponentes(empresa);
        cargarPersonas(empresa);
        cargarPcs(empresa);
    }
    
    public void guardarTodo (Empresa empresa) {
        guardarComponentes(empresa);
        guardarPersona (empresa);
        guardarPcs (empresa);
    }
}

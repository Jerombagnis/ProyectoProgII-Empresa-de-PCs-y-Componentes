package Lógica;

import Interfaz.VentanaPrincipal;
import Lógica.Personas.Cliente;
import Persistencia.ManejadorArchivos;
import java.util.Scanner;


public class TrabajoFinal {

    public static void main(String[] args) {
        
        Empresa gestor = new Empresa();
        ManejadorArchivos manejador = new ManejadorArchivos();
        
        manejador.cargarTodo(gestor);
        
        new VentanaPrincipal(gestor, manejador).setVisible(true);
    }
}

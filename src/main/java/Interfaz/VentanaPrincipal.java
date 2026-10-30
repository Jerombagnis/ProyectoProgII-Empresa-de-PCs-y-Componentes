package Interfaz;

import Lógica.Empresa;
import Persistencia.ManejadorArchivos;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private Empresa empresa;
    private ManejadorArchivos manejador;
    

    public VentanaPrincipal(Empresa empresa, ManejadorArchivos manejador) {
        
        this.empresa = empresa;
        this.manejador = manejador;
        
        initComponents();
        
        this.setLocationRelativeTo(null); 
        this.setTitle("Sistema de Gestión - Empresa de Computación"); 
    }

    //No modificar este método
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuOpciones = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemGuardarDatos = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        itemGestionComponentes = new javax.swing.JMenuItem();
        itemGestionClientes = new javax.swing.JMenuItem();
        itemGestionEmpleados = new javax.swing.JMenuItem();
        menuArmado = new javax.swing.JMenu();
        itemRegistrarPC = new javax.swing.JMenuItem();
        itemVerHistorialPcs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuArchivo.setText("Archivo");

        itemGuardarDatos.setText("Guardar datos");
        itemGuardarDatos.addActionListener(this::itemGuardarDatosActionPerformed);
        menuArchivo.add(itemGuardarDatos);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(this::itemSalirActionPerformed);
        menuArchivo.add(itemSalir);

        MenuOpciones.add(menuArchivo);

        menuGestion.setText("Gestión");

        itemGestionComponentes.setText("Componentes");
        itemGestionComponentes.addActionListener(this::itemGestionComponentesActionPerformed);
        menuGestion.add(itemGestionComponentes);

        itemGestionClientes.setText("Clientes");
        itemGestionClientes.addActionListener(this::itemGestionClientesActionPerformed);
        menuGestion.add(itemGestionClientes);

        itemGestionEmpleados.setText("Empleados");
        itemGestionEmpleados.addActionListener(this::itemGestionEmpleadosActionPerformed);
        menuGestion.add(itemGestionEmpleados);

        MenuOpciones.add(menuGestion);

        menuArmado.setText("Armado");

        itemRegistrarPC.setText("Registrar nueva PC");
        itemRegistrarPC.addActionListener(this::itemRegistrarPCActionPerformed);
        menuArmado.add(itemRegistrarPC);

        itemVerHistorialPcs.setText("Ver historial");
        itemVerHistorialPcs.addActionListener(this::itemVerHistorialPcsActionPerformed);
        menuArmado.add(itemVerHistorialPcs);

        MenuOpciones.add(menuArmado);

        setJMenuBar(MenuOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios y salir del sistema?", "Cerrar Aplicación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                ManejadorArchivos manejador = new ManejadorArchivos();
                manejador.guardarTodo(empresa);
                System.out.println("Datos guardados en archivos .txt exitosamente al cerrar.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage(), "Error de Persistencia", javax.swing.JOptionPane.ERROR_MESSAGE);
            } finally {
                System.exit(0);
            }
        } if (confirmacion == JOptionPane.NO_OPTION) {
            System.exit(0);  
        }
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarDatosActionPerformed

        manejador.guardarTodo(empresa);
    }//GEN-LAST:event_itemGuardarDatosActionPerformed

    private void itemGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionClientesActionPerformed
        // TODO add your handling code here:
        Interfaz.DialogGestionClientes ventanaClientes = new Interfaz.DialogGestionClientes(this, true, this.empresa);
        ventanaClientes.setVisible(true);
    }//GEN-LAST:event_itemGestionClientesActionPerformed
    
    
    //Para que al cerrar el programa realice un guardado de todos los archivos 
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios y salir del sistema?", "Cerrar Aplicación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                ManejadorArchivos manejador = new ManejadorArchivos();
                manejador.guardarTodo(empresa);
                System.out.println("Datos guardados en archivos .txt exitosamente al cerrar.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage(), "Error de Persistencia", javax.swing.JOptionPane.ERROR_MESSAGE);
            } finally {
                System.exit(0);
            }
        } if (confirmacion == JOptionPane.NO_OPTION) {
            System.exit(0);  
        }
    }//GEN-LAST:event_formWindowClosing

    private void itemGestionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionEmpleadosActionPerformed
        // TODO add your handling code here:
        DialogGestionEmpleados ventanaEmp = new DialogGestionEmpleados(this, true, this.empresa);
        ventanaEmp.setVisible(true);
    }//GEN-LAST:event_itemGestionEmpleadosActionPerformed

    private void itemGestionComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionComponentesActionPerformed
        // TODO add your handling code here:
        DialogGestionComponentes dialogoComp = new DialogGestionComponentes(this, true, this.empresa);
        dialogoComp.setVisible(true);
    }//GEN-LAST:event_itemGestionComponentesActionPerformed

    private void itemRegistrarPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarPCActionPerformed
        // TODO add your handling code here:
        DialogArmadoPC dialogoArmado = new DialogArmadoPC(this, true, this.empresa, this.manejador);
        dialogoArmado.setVisible(true);
    }//GEN-LAST:event_itemRegistrarPCActionPerformed

    private void itemVerHistorialPcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerHistorialPcsActionPerformed
        // TODO add your handling code here:
        DialogHistorialPCs dialogoHistorial = new DialogHistorialPCs(this, true, this.empresa);
        dialogoHistorial.setVisible(true);
    }//GEN-LAST:event_itemVerHistorialPcsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuOpciones;
    private javax.swing.JMenuItem itemGestionClientes;
    private javax.swing.JMenuItem itemGestionComponentes;
    private javax.swing.JMenuItem itemGestionEmpleados;
    private javax.swing.JMenuItem itemGuardarDatos;
    private javax.swing.JMenuItem itemRegistrarPC;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVerHistorialPcs;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuArmado;
    private javax.swing.JMenu menuGestion;
    // End of variables declaration//GEN-END:variables
}

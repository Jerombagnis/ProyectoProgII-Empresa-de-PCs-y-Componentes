
package Interfaz;

import Lógica.Componentes.Componente;
import Lógica.Empresa;
import Lógica.PC;
import Persistencia.ManejadorArchivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogArmadoPC extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogArmadoPC.class.getName());
    private Empresa empresa;
    private ManejadorArchivos manejador;
    private DefaultTableModel modeloCatalogo;
    private DefaultTableModel modeloPcElegidos;
    public DialogArmadoPC(java.awt.Frame parent, boolean modal, Empresa empresa, ManejadorArchivos manejador) {
        super(parent, modal);
        this.empresa = empresa;
        this.manejador = manejador;
        
        initComponents();
        
        this.setLocationRelativeTo(parent);
        this.setTitle("Armado y Registro de Computadoras");
        configurarTablas();
        llenarCatalogo();
        limpiarCampos();
    }
    //No modificar este método
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosPC = new javax.swing.JPanel();
        labelIdPc = new javax.swing.JLabel();
        txtIdPC = new javax.swing.JTextField();
        labelFechaArmado = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        labelIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        panelSelectorComponentes = new javax.swing.JPanel();
        scrollCatalogo = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        scrollArmado = new javax.swing.JScrollPane();
        tablaPcElegidos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        panelResumen = new javax.swing.JPanel();
        labelMontoTotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDatosPC.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos  del Registro"));

        labelIdPc.setText("ID PC:");

        labelFechaArmado.setText("Fecha de armado:");

        labelIdCliente.setText("ID Cliente:");

        txtIdCliente.addActionListener(this::txtIdClienteActionPerformed);

        javax.swing.GroupLayout panelDatosPCLayout = new javax.swing.GroupLayout(panelDatosPC);
        panelDatosPC.setLayout(panelDatosPCLayout);
        panelDatosPCLayout.setHorizontalGroup(
            panelDatosPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIdPc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdPC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelFechaArmado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelIdCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panelDatosPCLayout.setVerticalGroup(
            panelDatosPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdPc)
                    .addComponent(txtIdPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechaArmado)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelSelectorComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Selector de Componentes"));

        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollCatalogo.setViewportView(tablaCatalogo);

        tablaPcElegidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollArmado.setViewportView(tablaPcElegidos);

        btnAgregar.setText("Agregar >>");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnQuitar.setText("<< Quitar");
        btnQuitar.addActionListener(this::btnQuitarActionPerformed);

        javax.swing.GroupLayout panelSelectorComponentesLayout = new javax.swing.GroupLayout(panelSelectorComponentes);
        panelSelectorComponentes.setLayout(panelSelectorComponentesLayout);
        panelSelectorComponentesLayout.setHorizontalGroup(
            panelSelectorComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelectorComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSelectorComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollArmado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSelectorComponentesLayout.setVerticalGroup(
            panelSelectorComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelectorComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelectorComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollArmado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelSelectorComponentesLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnQuitar)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        panelResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Resúmen y Acciones"));
        panelResumen.setToolTipText("");

        labelMontoTotal.setText("Monto total PC:");

        labelTotal.setText("$0.00");

        btnConfirmar.setText("Confirmar armado");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        btnCancelar.setText("Cancelar armado");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout panelResumenLayout = new javax.swing.GroupLayout(panelResumen);
        panelResumen.setLayout(panelResumenLayout);
        panelResumenLayout.setHorizontalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResumenLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMontoTotal)
                .addGap(18, 18, 18)
                .addComponent(labelTotal)
                .addGap(82, 82, 82))
        );
        panelResumenLayout.setVerticalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontoTotal)
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSelectorComponentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosPC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSelectorComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Configuración tablas
    private void configurarTablas() {
        String titulos [] = {"ID", "Tipo", "Modelo", "Precio"};
        modeloCatalogo = new DefaultTableModel(titulos, 0) {    
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tablaCatalogo.setModel(modeloCatalogo);

        modeloPcElegidos = new DefaultTableModel(titulos, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tablaPcElegidos.setModel(modeloPcElegidos);
    }
    
    //Llenado tabla cátalogo
    private void llenarCatalogo() {
        modeloCatalogo.setRowCount(0); 
        
        for (Componente comp : empresa.getComponentes()) {
            Object fila []= {
                comp.getId(),
                comp.soyUn(),
                comp.getModelo(),
                comp.getPrecio()
            };
            modeloCatalogo.addRow(fila); 
        }
    }
    
    //Limpiar campos 
    private void limpiarCampos() {
        txtIdPC.setText("");
        txtIdCliente.setText("");
        java.time.LocalDate hoy = java.time.LocalDate.now();
        java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtFecha.setText(hoy.format(formato));
        
        modeloPcElegidos.setRowCount(0);
        actualizarTotal();
    }
    
    //Actuailzar total precio
    private void actualizarTotal() {
        double total = 0.0;
        int filas = modeloPcElegidos.getRowCount();

        for (int i = 0; i < filas; i++) {
            total += (double) modeloPcElegidos.getValueAt(i, 3); 
        }

        labelTotal.setText(String.format("$%.2f", total));
    }
    
    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaCatalogo.getSelectedRow();
    
        if (filaSeleccionada >= 0) {
            Object id = modeloCatalogo.getValueAt(filaSeleccionada, 0);
            Object tipo = modeloCatalogo.getValueAt(filaSeleccionada, 1);
            Object modelo = modeloCatalogo.getValueAt(filaSeleccionada, 2);
            Object precio = modeloCatalogo.getValueAt(filaSeleccionada, 3);

            Object nuevaFila [] = {id, tipo, modelo, precio};
            modeloPcElegidos.addRow(nuevaFila);

            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un componente del catálogo de la izquierda para agregarlo.", "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    //Listado de ids componentes seleccionados 
    private ArrayList<Integer> obtenerIdsComponentesSeleccionados() {
        ArrayList<Integer> listaDeIds = new ArrayList<>();
        int filas = modeloPcElegidos.getRowCount();

        for (int i = 0; i < filas; i++) {
            int idComponente = (int) modeloPcElegidos.getValueAt(i, 0);
            listaDeIds.add(idComponente);
        }
        return listaDeIds;
    }
    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        try {
            String idPCStr = txtIdPC.getText().trim();
            String idClienteStr = txtIdCliente.getText().trim();
            String fecha = txtFecha.getText().trim();

            if (idPCStr.isEmpty() || idClienteStr.isEmpty() || fecha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Campos Incompletos", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idPC = Integer.parseInt(idPCStr);
            int idCliente = Integer.parseInt(idClienteStr);
            
            
            if (empresa.buscarPc(idPC)!= null) {
                JOptionPane.showMessageDialog(this, "El ID de PC ya existe, ingrese otro.", "Error ID PC", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (modeloPcElegidos.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "El armado debe contener al menos un componente.", "Carrito Vacío", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (empresa.buscarCliente(idCliente) == null) {
                JOptionPane.showMessageDialog(this, "El ID de Cliente ingresado no se encuentra registrado en el sistema.", "Cliente Inexistente", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            ArrayList<Integer> idsComponentes = obtenerIdsComponentesSeleccionados();
            if (idsComponentes == null || idsComponentes.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar todos los componentes para armar la PC (Placa Madre, Procesador, RAM, Fuente, etc.).", "Faltan Componentes", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            boolean exitoAlta = empresa.contruirPC(idPC, fecha, idCliente, idsComponentes);

            if (exitoAlta) {
                manejador.guardarTodo(empresa);

                JOptionPane.showMessageDialog(this, "¡La computadora ha sido armada y registrada de manera exitosa!", "Operación Exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                limpiarCampos();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, 
                "No se pudo registrar el armado de la PC.\n\n"
                + "Asegúrese de cumplir con los siguientes requisitos:\n"
                + "1- Debe incluir una Placa Madre y un Procesador.\n"
                + "2- El procesador debe ser compatible con la Placa Madre elegida.\n"
                + "3- La cantidad de memorias RAM no debe superar las ranuras de la Placa Madre.", 
                "Error de Validación Técnica", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los campos de ID (PC y Cliente) deben ser únicamente valores numéricos enteros.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaPcElegidos.getSelectedRow();
        
        if (filaSeleccionada >= 0) {
            modeloPcElegidos.removeRow(filaSeleccionada);
            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un componente de la lista de la derecha para quitarlo.", "Atención", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JLabel labelFechaArmado;
    private javax.swing.JLabel labelIdCliente;
    private javax.swing.JLabel labelIdPc;
    private javax.swing.JLabel labelMontoTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelDatosPC;
    private javax.swing.JPanel panelResumen;
    private javax.swing.JPanel panelSelectorComponentes;
    private javax.swing.JScrollPane scrollArmado;
    private javax.swing.JScrollPane scrollCatalogo;
    private javax.swing.JTable tablaCatalogo;
    private javax.swing.JTable tablaPcElegidos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPC;
    // End of variables declaration//GEN-END:variables
}

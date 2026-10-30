package Interfaz;

import Lógica.Componentes.Componente;
import Lógica.Empresa;
import Lógica.PC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogHistorialPCs extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogHistorialPCs.class.getName());
    private Empresa empresa; 
    private DefaultTableModel modeloHistorial; 
    private DefaultTableModel modeloDetalle;   
    
    public DialogHistorialPCs(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.empresa=empresa;
        
        initComponents();
        
        this.setLocationRelativeTo(parent); 
        this.setTitle("Historial de Computadoras Armadas");
        modeloHistorial = (DefaultTableModel) tablaHistorial.getModel();
        modeloDetalle = (DefaultTableModel) tablaComponentes.getModel();
        
        llenarTablaHistorial();
    }
    
    
    //No modificar este método
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPasoDos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        labelPasoUno1 = new javax.swing.JLabel();
        btnVerDetalles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComponentes = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelPasoDos.setText("2. Listado de componentes que integran la PC seleccionada: ");

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID PC", "ID Cliente", "Fecha de armado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHistorial);

        labelPasoUno1.setText("1. Selecione una PC del historial de armados:");

        btnVerDetalles.setText("Ver detalle de equipamiento");
        btnVerDetalles.addActionListener(this::btnVerDetallesActionPerformed);

        tablaComponentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Componente", "Tipo Componente", "Modelo / Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaComponentes);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPasoDos)
                            .addComponent(btnVerDetalles))
                        .addGap(0, 167, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelPasoUno1)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerDetalles)
                .addGap(26, 26, 26)
                .addComponent(labelPasoDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelPasoUno1)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Llenar tabla historial 
    private void llenarTablaHistorial() {
        modeloHistorial.setRowCount(0); 
        ArrayList<PC> listaPcs = empresa.getPcs(); 
        
        for (PC pc : listaPcs) {
            Object fila [] = new Object[3];
            fila[0] = pc.getId();        
            fila[1] = pc.getIdCliente();     
            fila[2] = pc.getFechaArmado();    
            modeloHistorial.addRow(fila); 
        }
    }
    
    private void btnVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetallesActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaHistorial.getSelectedRow();
        
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,"Por favor, seleccione una PC de la lista superior para ver sus detalles.", "Selección Requerida", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int idPCSelected = (int) modeloHistorial.getValueAt(filaSeleccionada, 0);
        PC pcElegida = null;
        
        for (PC pc : empresa.getPcs()) {
            if (pc.getId() == idPCSelected) {
                pcElegida = pc;
                break;
            }
        }
        modeloDetalle.setRowCount(0);
        
        if (pcElegida != null) {
            ArrayList<Integer> idsComponentes = pcElegida.getIdsComponentes();
            for (Integer idComp : idsComponentes) {
                Componente comp = empresa.buscarComponente(idComp);
                
                if (comp != null) {
                    Object[] filaDetalle = new Object[3];
                    filaDetalle[0] = comp.getId();        
                    filaDetalle[1] = comp.soyUn();       
                    filaDetalle[2] = comp.getModelo();   
                    modeloDetalle.addRow(filaDetalle); 
                }
            }
        }
    }//GEN-LAST:event_btnVerDetallesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVerDetalles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPasoDos;
    private javax.swing.JLabel labelPasoUno1;
    private javax.swing.JTable tablaComponentes;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}

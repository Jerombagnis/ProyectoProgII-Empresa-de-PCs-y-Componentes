
package Interfaz;

import Lógica.Empresa;
import Lógica.Personas.Cliente;
import javax.swing.table.DefaultTableModel;
import java.util.Collections;
import javax.swing.JOptionPane;


public class DialogGestionClientes extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogGestionClientes.class.getName());
    private Empresa empresa; 
    private DefaultTableModel modeloTabla; 
    
    public DialogGestionClientes(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.empresa = empresa;
        
        initComponents();
        
        this.setLocationRelativeTo(parent);     
        this.setTitle("Gestión de Clientes");
        configurarTabla();
        llenarTabla();
    }

    //No modificar este método
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        panelBuscarCliente = new javax.swing.JPanel();
        labelIngresarId = new javax.swing.JLabel();
        txtIdBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelAltaCliente = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelCuil = new javax.swing.JLabel();
        labelNacionalidad = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        labelNacimiento = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        btnOrdenarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        panelBuscarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda y Selección "));

        labelIngresarId.setText("Ingresear ID:");

        txtIdBusqueda.addActionListener(this::txtIdBusquedaActionPerformed);

        btnBuscar.setText("Buscar cliente");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIngresarId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        panelBuscarClienteLayout.setVerticalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngresarId)
                    .addComponent(txtIdBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        panelAltaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        labelId.setText("ID: ");

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelDni.setText("DNI:");

        labelDireccion.setText("Dirección:");

        labelMail.setText("Mail:");

        labelCuil.setText("CUIL:");

        labelNacionalidad.setText("Nacionalidad:");

        txtDni.addActionListener(this::txtDniActionPerformed);

        txtCuil.addActionListener(this::txtCuilActionPerformed);

        txtNacionalidad.addActionListener(this::txtNacionalidadActionPerformed);

        btnAgregarCliente.setText("Agregar cliente");
        btnAgregarCliente.addActionListener(this::btnAgregarClienteActionPerformed);

        labelNacimiento.setText("Fecha de nacimiento:");

        txtNacimiento.addActionListener(this::txtNacimientoActionPerformed);

        javax.swing.GroupLayout panelAltaClienteLayout = new javax.swing.GroupLayout(panelAltaCliente);
        panelAltaCliente.setLayout(panelAltaClienteLayout);
        panelAltaClienteLayout.setHorizontalGroup(
            panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAltaClienteLayout.createSequentialGroup()
                            .addComponent(labelId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAltaClienteLayout.createSequentialGroup()
                            .addComponent(labelDni)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDni)))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelCuil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAltaClienteLayout.createSequentialGroup()
                        .addComponent(labelNacionalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAltaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAltaClienteLayout.setVerticalGroup(
            panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCuil)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMail)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNacimiento)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente)
                .addContainerGap())
        );

        btnOrdenarTabla.setText("Ordenar clientes");
        btnOrdenarTabla.addActionListener(this::btnOrdenarTablaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAltaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOrdenarTabla)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenarTabla)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAltaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Configuración tabla 
    private void configurarTabla() {
        modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) { 
            return false;
            }
        };
        
        //Creación de columnas con los atributos de cliente
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("CUIL");
        modeloTabla.addColumn("Nacionalidad");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("F. Nacimiento"); 
        
        tablaClientes.setModel(modeloTabla);
        tablaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);  
        tablaClientes.getColumnModel().getColumn(1).setPreferredWidth(100); 
        tablaClientes.getColumnModel().getColumn(2).setPreferredWidth(100); 
        tablaClientes.getColumnModel().getColumn(3).setPreferredWidth(90);  
        tablaClientes.getColumnModel().getColumn(4).setPreferredWidth(100); 
        tablaClientes.getColumnModel().getColumn(5).setPreferredWidth(100); 
        tablaClientes.getColumnModel().getColumn(6).setPreferredWidth(180); 
        tablaClientes.getColumnModel().getColumn(7).setPreferredWidth(180); 
        tablaClientes.getColumnModel().getColumn(8).setPreferredWidth(90);  
    }
    
    //Limpiar campos 
    private void limpiarCamposAlta() {
    
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtCuil.setText("");
        txtNacionalidad.setText("");
        txtDireccion.setText("");
        txtMail.setText("");
        txtNacimiento.setText("");
    }
    
    //Carga de tabla clientes
    private void llenarTabla() {
        modeloTabla.setRowCount(0);
        
        for (Cliente c : this.empresa.getClientes()) {
            
            modeloTabla.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getApellido(),
                c.getDni(),
                c.getCuil(),
                c.getNacionalidad(),
                c.getDireccion(),
                c.getMail(),
                c.getFechaNacimiento()
            });
        }
    }
    
    private void mostrarClienteBuscado(Lógica.Personas.Cliente c) {
        
        modeloTabla.setRowCount(0);

        modeloTabla.addRow(new Object[]{
            c.getId(),
            c.getNombre(),
            c.getApellido(),
            c.getDni(),
            c.getCuil(),
            c.getNacionalidad(),
            c.getDireccion(),
            c.getMail(),
            c.getFechaNacimiento()
        });
}
    
    private void txtIdBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBusquedaActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed
        
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        try {

            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String dni = txtDni.getText().trim();
            String cuil = txtCuil.getText().trim();
            String nacionalidad = txtNacionalidad.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String mail = txtMail.getText().trim();
            String fechaNacimiento = txtNacimiento.getText().trim();
            
            if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || 
                cuil.isEmpty() || nacionalidad.isEmpty() || direccion.isEmpty() || 
                mail.isEmpty() || fechaNacimiento.isEmpty()) {
     
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, complete la ficha del cliente.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);

                return;
            }
            
            Cliente nuevoCliente = new Cliente(id, nombre, apellido, dni, fechaNacimiento, direccion, mail, cuil, nacionalidad);

            boolean guardadoExitoso= this.empresa.altaCliente(nuevoCliente);
            
            if (guardadoExitoso){
                llenarTabla();
                limpiarCamposAlta();
                JOptionPane.showMessageDialog(this, "Cliente registrado de forma exitosa.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Error: Ya existe un cliente registrado con el ID " + id + ".", "ID Duplicado", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) { //excepción por si el usuario ingresa un no int en campo id
            JOptionPane.showMessageDialog(this, "El campo ID debe ser un número entero válido.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtCuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuilActionPerformed

    private void txtNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacimientoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            String textoId = txtIdBusqueda.getText().trim();

            if (textoId.isEmpty()) {
                llenarTabla(); 
                return;
            }

            int idBusqueda = Integer.parseInt(textoId);

            Cliente clienteEncontrado = empresa.buscarCliente(idBusqueda);

            if (clienteEncontrado != null) {
                mostrarClienteBuscado(clienteEncontrado);

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con el ID " + idBusqueda + ".", "Sin resultados", javax.swing.JOptionPane.WARNING_MESSAGE);
                llenarTabla();
            }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de búsqueda debe ser un número entero válido.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOrdenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarTablaActionPerformed
        // TODO add your handling code here:
        if (this.empresa.getClientes().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay clientes registrados para ordenar.", "Tabla vacía", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        
        java.util.Collections.sort(this.empresa.getClientes());
        
        llenarTabla();
        
        JOptionPane.showMessageDialog(this, "Lista de clientes ordenada por apellido exitosamente.", "Orden aplicado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnOrdenarTablaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdenarTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCuil;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIngresarId;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelNacimiento;
    private javax.swing.JLabel labelNacionalidad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel panelAltaCliente;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdBusqueda;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

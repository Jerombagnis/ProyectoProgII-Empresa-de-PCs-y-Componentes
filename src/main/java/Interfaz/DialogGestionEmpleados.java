package Interfaz;

import Lógica.Empresa;
import Lógica.Personas.Empleados.Administrativo;
import Lógica.Personas.Empleados.Empleado;
import Lógica.Personas.Empleados.Gerencial;
import Lógica.Personas.Empleados.Operario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogGestionEmpleados extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogGestionEmpleados.class.getName());
    private Empresa empresa;
    private DefaultTableModel modeloTabla; 
    
    public DialogGestionEmpleados(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.empresa = empresa; 
        
        initComponents();
        
        this.setLocationRelativeTo(parent);
        this.setTitle("Gestión de Empleados");
        configurarTabla();
        llenarTabla();
    }

    //No modificar este método 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosEmpleados = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelLegajo = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        labelDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        labelNacimiento = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        labelAntiguedad = new javax.swing.JLabel();
        txtAntiguedad = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        panelAtributosCategoria = new javax.swing.JPanel();
        labelTarea = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        labelSector = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        txtTarea = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDatosEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Personal"));

        labelId.setText("ID:");

        txtId.addActionListener(this::txtIdActionPerformed);

        labelLegajo.setText("Legajo:");

        txtLegajo.addActionListener(this::txtLegajoActionPerformed);

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelDni.setText("DNI:");

        txtDni.addActionListener(this::txtDniActionPerformed);

        labelNacimiento.setText("Fecha de nacimiento:");

        labelDireccion.setText("Dirección:");

        txtDireccion.addActionListener(this::txtDireccionActionPerformed);

        labelAntiguedad.setText("Antigüedad (años):");

        labelCategoria.setText("Categoría:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Operario", "Gerencial" }));
        cmbCategoria.addActionListener(this::cmbCategoriaActionPerformed);

        panelAtributosCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos por Categoría"));

        labelTarea.setText("Tarea (admin):");

        labelArea.setText("Área (admin):");

        labelSector.setText("Sector (operario):");

        labelCargo.setText("Cargo específico (gerencial): ");

        txtTarea.setEnabled(false);

        txtArea.setEnabled(false);

        txtSector.setEnabled(false);

        txtCargo.setEnabled(false);

        javax.swing.GroupLayout panelAtributosCategoriaLayout = new javax.swing.GroupLayout(panelAtributosCategoria);
        panelAtributosCategoria.setLayout(panelAtributosCategoriaLayout);
        panelAtributosCategoriaLayout.setHorizontalGroup(
            panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                        .addComponent(labelTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                        .addComponent(labelArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                        .addComponent(labelSector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                        .addComponent(labelCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAtributosCategoriaLayout.setVerticalGroup(
            panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributosCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTarea)
                    .addComponent(txtTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSector)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtributosCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegistrarEmpleado.setText("Registrar empleado");
        btnRegistrarEmpleado.addActionListener(this::btnRegistrarEmpleadoActionPerformed);

        javax.swing.GroupLayout panelDatosEmpleadosLayout = new javax.swing.GroupLayout(panelDatosEmpleados);
        panelDatosEmpleados.setLayout(panelDatosEmpleadosLayout);
        panelDatosEmpleadosLayout.setHorizontalGroup(
            panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                        .addComponent(panelAtributosCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                        .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                .addComponent(labelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelLegajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLegajo))
                            .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelNacimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelDireccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelAntiguedad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelDni)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                                        .addComponent(labelApellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEmpleadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarEmpleado)
                .addContainerGap())
        );
        panelDatosEmpleadosLayout.setVerticalGroup(
            panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLegajo)
                    .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNacimiento)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAntiguedad)
                    .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelDatosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAtributosCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEmpleado)
                .addGap(8, 8, 8))
        );

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelDatosEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Legajo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Antigüedad");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("F. Nacimiento");
        modeloTabla.addColumn("Categoría");
        modeloTabla.addColumn("Detalles Específicos");

        tablaEmpleados.setModel(modeloTabla);
        tablaEmpleados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(50);   
        tablaEmpleados.getColumnModel().getColumn(1).setPreferredWidth(70);  
        tablaEmpleados.getColumnModel().getColumn(2).setPreferredWidth(100);  
        tablaEmpleados.getColumnModel().getColumn(3).setPreferredWidth(100);  
        tablaEmpleados.getColumnModel().getColumn(4).setPreferredWidth(90); 
        tablaEmpleados.getColumnModel().getColumn(5).setPreferredWidth(85);   
        tablaEmpleados.getColumnModel().getColumn(6).setPreferredWidth(150); 
        tablaEmpleados.getColumnModel().getColumn(7).setPreferredWidth(90);  
        tablaEmpleados.getColumnModel().getColumn(8).setPreferredWidth(100); 
        tablaEmpleados.getColumnModel().getColumn(9).setPreferredWidth(250); 
    }   
    
    //Llenar tabla 
    private void llenarTabla() {
        modeloTabla.setRowCount(0); 

        for (Empleado e : this.empresa.getEmpleados()) {
            String tipoEmpleado = e.soyUn(); 
            String detalles = "";

            if (tipoEmpleado.equalsIgnoreCase("Administrativo")) {
                Administrativo a = (Administrativo) e;
                detalles = "Área: " + a.getArea() + " | Tarea: " + a.getTarea();

            } else if (tipoEmpleado.equalsIgnoreCase("Operario")) {
                Operario o = (Operario) e;
                detalles = "Sector: " + o.getSector();

            } else if (tipoEmpleado.equalsIgnoreCase("Gerencial")) { 
                Gerencial g = (Gerencial) e;
                detalles = "Cargo: " + g.getCargo();
            }

            modeloTabla.addRow(new Object[]{
                e.getId(),
                e.getLegajo(),
                e.getNombre(),
                e.getApellido(),
                e.getDni(),
                e.getAntiguedad() + " años",
                e.getDireccion(),
                e.getFechaNacimiento(),
                tipoEmpleado,
                detalles
            });
        }
    }
    
    private void limpiarCamposAlta() {
        
        txtId.setText("");
        txtLegajo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtNacimiento.setText("");
        txtAntiguedad.setText("");
       
        txtTarea.setText("");
        txtArea.setText("");
        txtSector.setText("");
        txtCargo.setText("");
        
        cmbCategoria.setSelectedIndex(0);
        
        txtTarea.setEnabled(false);
        txtArea.setEnabled(false);
        txtSector.setEnabled(false);
        txtCargo.setEnabled(false);
    }
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLegajoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(txtId.getText().trim());
            int legajo = Integer.parseInt(txtLegajo.getText().trim());
            int antiguedad = Integer.parseInt(txtAntiguedad.getText().trim());
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String dni = txtDni.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String fechaNacimiento = txtNacimiento.getText().trim();
            
            if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || 
                direccion.isEmpty() || fechaNacimiento.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos comunes son obligatorios.", "Datos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Empleado nuevoEmpleado = null;
            String categoria = cmbCategoria.getSelectedItem().toString();
            
            if (categoria.equals("Administrativo")) {
                String tarea = txtTarea.getText().trim();
                String area = txtArea.getText().trim();

                if (tarea.isEmpty() || area.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, complete la Tarea y el Área del administrativo.", "Datos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                nuevoEmpleado = new Administrativo(id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo, tarea, area);  
                
            } else if (categoria.equals("Operario")) {
                String sector= txtSector.getText().trim();
                
                if (sector.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Por favor, complete el Sector del operario.", "Datos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                nuevoEmpleado = new Operario (id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo, sector);
            
            } else if (categoria.equals("Gerencial")) {
                String cargo= txtCargo.getText().trim();
                
                if(cargo.isEmpty()){
                  JOptionPane.showMessageDialog(this, "Por favor, complete el Cargo del gerencial.", "Datos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
                  return;  
                }
                
                nuevoEmpleado = new Gerencial (id, nombre, apellido, dni, fechaNacimiento, direccion, antiguedad, legajo, cargo);
            }
            
            boolean guardadoExitoso = this.empresa.altaEmpleado(nuevoEmpleado);
            
            if (guardadoExitoso) {
                llenarTabla(); 
                limpiarCamposAlta(); 
                JOptionPane.showMessageDialog(this, "Personal registrado de forma exitosa.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: El ID o el Legajo ingresado ya pertenecen a otro empleado.", "Datos Duplicados", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los campos ID, Legajo y Antigüedad deben ser números enteros válidos.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        String seleccion = cmbCategoria.getSelectedItem().toString();
        
        txtTarea.setEnabled(false);
        txtArea.setEnabled(false);
        txtSector.setEnabled(false);
        txtCargo.setEnabled(false);
        
        txtTarea.setText("");
        txtArea.setText("");
        txtSector.setText("");
        txtCargo.setText("");
        
        if (seleccion.equals("Administrativo")) {
        txtTarea.setEnabled(true);
        txtArea.setEnabled(true);
        } else if (seleccion.equals("Operario")) {
            txtSector.setEnabled(true);
        } else if (seleccion.equals("Gerencial")) {
            txtCargo.setEnabled(true);
        }
        
    }//GEN-LAST:event_cmbCategoriaActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAntiguedad;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLegajo;
    private javax.swing.JLabel labelNacimiento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSector;
    private javax.swing.JLabel labelTarea;
    private javax.swing.JPanel panelAtributosCategoria;
    private javax.swing.JPanel panelDatosEmpleados;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtAntiguedad;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtTarea;
    // End of variables declaration//GEN-END:variables
}

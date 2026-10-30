
package Interfaz;

import Lógica.Componentes.Componente;
import Lógica.Componentes.DiscoDuro;
import Lógica.Componentes.Fuente;
import Lógica.Componentes.MemoriaRam;
import Lógica.Componentes.PlacaMadre;
import Lógica.Componentes.Procesador;
import Lógica.Componentes.TarjetaRed;
import Lógica.Empresa;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogGestionComponentes extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DialogGestionComponentes.class.getName());
    private Empresa empresa;
    private DefaultTableModel modeloTabla; 

    
    public DialogGestionComponentes(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.empresa = empresa;
        
        initComponents();
        
        this.setLocationRelativeTo(parent);
        this.setTitle("Gestión de Componentes de Hardware");
        
        configurarTabla();
        llenarTabla();
        actualizarVisibilidadPaneles();
    }

    //No modificar este método
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneAltaComponentes = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTipoComponente = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cmbTipoComponente = new javax.swing.JComboBox<>();
        panelAtributosEspecificos = new javax.swing.JPanel();
        subPanelPlacaMadre = new javax.swing.JPanel();
        labelRanuras = new javax.swing.JLabel();
        labelCpus = new javax.swing.JLabel();
        txtRanuras = new javax.swing.JTextField();
        txtCpus = new javax.swing.JTextField();
        labelInfoIdsCpus = new javax.swing.JLabel();
        subPanelProcesador = new javax.swing.JPanel();
        labelVelocidad = new javax.swing.JLabel();
        labelCache = new javax.swing.JLabel();
        txtVelocidadGhz = new javax.swing.JTextField();
        txtCacheMb = new javax.swing.JTextField();
        subPanelMemoriaRam = new javax.swing.JPanel();
        labelTecnologia = new javax.swing.JLabel();
        labelVelocidadMhz = new javax.swing.JLabel();
        labelCapacidad = new javax.swing.JLabel();
        cmbTecnologiaRam = new javax.swing.JComboBox<>();
        txtVelocidadMhz = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        subPanelTarjetaRed = new javax.swing.JPanel();
        labelVelocidadTransmision = new javax.swing.JLabel();
        txtVelocidadTransmision = new javax.swing.JTextField();
        labelMac = new javax.swing.JLabel();
        txtMac = new javax.swing.JTextField();
        subPanelDiscoDuro = new javax.swing.JPanel();
        labelTipoDisco = new javax.swing.JLabel();
        cmbTipoDisco = new javax.swing.JComboBox<>();
        labelCapacidadDisco = new javax.swing.JLabel();
        txtCapacidadDisco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVelocidadRotacion = new javax.swing.JTextField();
        subPanelFuente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtWatts = new javax.swing.JTextField();
        btnRegistrarComponente = new javax.swing.JButton();
        panelBusquedaBajaComponentes = new javax.swing.JPanel();
        labelComponenteId = new javax.swing.JLabel();
        txtIdComponenteOperacion = new javax.swing.JTextField();
        btnBuscarComponente = new javax.swing.JButton();
        btnEliminarComponente = new javax.swing.JButton();
        panelTablaComponentes = new javax.swing.JScrollPane();
        tablaComponentes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        paneAltaComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Componente"));

        labelId.setText("ID:");

        labelModelo.setText("Modelo:");

        labelPrecio.setText("Precio:");

        jLabel4.setText("Descripción:");

        labelTipoComponente.setText("Tipo de componente:");

        txtId.addActionListener(this::txtIdActionPerformed);

        txtModelo.addActionListener(this::txtModeloActionPerformed);

        cmbTipoComponente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo...", "Placa Madre", "Procesador", "Memoria RAM", "Tarjeta de Red", "Disco Duro", "Fuente", " " }));
        cmbTipoComponente.addActionListener(this::cmbTipoComponenteActionPerformed);

        panelAtributosEspecificos.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos específicos"));

        subPanelPlacaMadre.setOpaque(false);

        labelRanuras.setText("Ranuras:");

        labelCpus.setText("IDs CPUs Soportados:");

        txtCpus.setForeground(new java.awt.Color(153, 153, 153));
        txtCpus.setToolTipText("Ejemplo: 101,102,105");
        txtCpus.addActionListener(this::txtCpusActionPerformed);

        labelInfoIdsCpus.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelInfoIdsCpus.setForeground(new java.awt.Color(102, 102, 102));
        labelInfoIdsCpus.setText("* Ingrese solo los IDs separados por comas, sin espacios.");

        javax.swing.GroupLayout subPanelPlacaMadreLayout = new javax.swing.GroupLayout(subPanelPlacaMadre);
        subPanelPlacaMadre.setLayout(subPanelPlacaMadreLayout);
        subPanelPlacaMadreLayout.setHorizontalGroup(
            subPanelPlacaMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelPlacaMadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelPlacaMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelPlacaMadreLayout.createSequentialGroup()
                        .addComponent(labelCpus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpus))
                    .addGroup(subPanelPlacaMadreLayout.createSequentialGroup()
                        .addComponent(labelRanuras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRanuras, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(subPanelPlacaMadreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelInfoIdsCpus, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                .addContainerGap())
        );
        subPanelPlacaMadreLayout.setVerticalGroup(
            subPanelPlacaMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelPlacaMadreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelPlacaMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRanuras)
                    .addComponent(txtRanuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelPlacaMadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpus)
                    .addComponent(txtCpus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfoIdsCpus)
                .addGap(30, 30, 30))
        );

        subPanelProcesador.setOpaque(false);

        labelVelocidad.setText("Velocidad Ghz:");

        labelCache.setText("Caché Mb:");

        javax.swing.GroupLayout subPanelProcesadorLayout = new javax.swing.GroupLayout(subPanelProcesador);
        subPanelProcesador.setLayout(subPanelProcesadorLayout);
        subPanelProcesadorLayout.setHorizontalGroup(
            subPanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelProcesadorLayout.createSequentialGroup()
                        .addComponent(labelVelocidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVelocidadGhz, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelProcesadorLayout.createSequentialGroup()
                        .addComponent(labelCache)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCacheMb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        subPanelProcesadorLayout.setVerticalGroup(
            subPanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelProcesadorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(subPanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidad)
                    .addComponent(txtVelocidadGhz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCache)
                    .addComponent(txtCacheMb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        subPanelMemoriaRam.setOpaque(false);

        labelTecnologia.setText("Tecnología:");

        labelVelocidadMhz.setText("Velocidad Mhz:");

        labelCapacidad.setText("Capacidad:");

        cmbTecnologiaRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ddr3", "ddr4" }));

        javax.swing.GroupLayout subPanelMemoriaRamLayout = new javax.swing.GroupLayout(subPanelMemoriaRam);
        subPanelMemoriaRam.setLayout(subPanelMemoriaRamLayout);
        subPanelMemoriaRamLayout.setHorizontalGroup(
            subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelMemoriaRamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelMemoriaRamLayout.createSequentialGroup()
                        .addComponent(labelTecnologia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTecnologiaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelMemoriaRamLayout.createSequentialGroup()
                        .addComponent(labelVelocidadMhz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVelocidadMhz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelMemoriaRamLayout.createSequentialGroup()
                        .addComponent(labelCapacidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        subPanelMemoriaRamLayout.setVerticalGroup(
            subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelMemoriaRamLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTecnologia)
                    .addComponent(cmbTecnologiaRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidadMhz)
                    .addComponent(txtVelocidadMhz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subPanelTarjetaRed.setOpaque(false);

        labelVelocidadTransmision.setText("Velocidad transmisión:");

        labelMac.setText("MAC:");

        javax.swing.GroupLayout subPanelTarjetaRedLayout = new javax.swing.GroupLayout(subPanelTarjetaRed);
        subPanelTarjetaRed.setLayout(subPanelTarjetaRedLayout);
        subPanelTarjetaRedLayout.setHorizontalGroup(
            subPanelTarjetaRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelTarjetaRedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelTarjetaRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelTarjetaRedLayout.createSequentialGroup()
                        .addComponent(labelVelocidadTransmision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVelocidadTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelTarjetaRedLayout.createSequentialGroup()
                        .addComponent(labelMac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMac, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        subPanelTarjetaRedLayout.setVerticalGroup(
            subPanelTarjetaRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelTarjetaRedLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(subPanelTarjetaRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidadTransmision)
                    .addComponent(txtVelocidadTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelTarjetaRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMac)
                    .addComponent(txtMac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        subPanelDiscoDuro.setOpaque(false);

        labelTipoDisco.setText("Tipo de disco:");

        cmbTipoDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ssd", "hhd" }));

        labelCapacidadDisco.setText("Capacidad:");

        jLabel1.setText("Velocidad Rotación:");

        javax.swing.GroupLayout subPanelDiscoDuroLayout = new javax.swing.GroupLayout(subPanelDiscoDuro);
        subPanelDiscoDuro.setLayout(subPanelDiscoDuroLayout);
        subPanelDiscoDuroLayout.setHorizontalGroup(
            subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDiscoDuroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelDiscoDuroLayout.createSequentialGroup()
                        .addComponent(labelTipoDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelDiscoDuroLayout.createSequentialGroup()
                        .addComponent(labelCapacidadDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapacidadDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelDiscoDuroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVelocidadRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        subPanelDiscoDuroLayout.setVerticalGroup(
            subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelDiscoDuroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoDisco)
                    .addComponent(cmbTipoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadDisco)
                    .addComponent(txtCapacidadDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelDiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVelocidadRotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        subPanelFuente.setOpaque(false);

        jLabel2.setText("Watts:");

        javax.swing.GroupLayout subPanelFuenteLayout = new javax.swing.GroupLayout(subPanelFuente);
        subPanelFuente.setLayout(subPanelFuenteLayout);
        subPanelFuenteLayout.setHorizontalGroup(
            subPanelFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelFuenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWatts, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        subPanelFuenteLayout.setVerticalGroup(
            subPanelFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelFuenteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(subPanelFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWatts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAtributosEspecificosLayout = new javax.swing.GroupLayout(panelAtributosEspecificos);
        panelAtributosEspecificos.setLayout(panelAtributosEspecificosLayout);
        panelAtributosEspecificosLayout.setHorizontalGroup(
            panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subPanelPlacaMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subPanelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subPanelMemoriaRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subPanelTarjetaRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subPanelDiscoDuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subPanelFuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelAtributosEspecificosLayout.setVerticalGroup(
            panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                .addComponent(subPanelPlacaMadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(subPanelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(subPanelMemoriaRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(subPanelTarjetaRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(subPanelDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelAtributosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtributosEspecificosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(subPanelFuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnRegistrarComponente.setText("Registrar componente");
        btnRegistrarComponente.addActionListener(this::btnRegistrarComponenteActionPerformed);

        javax.swing.GroupLayout paneAltaComponentesLayout = new javax.swing.GroupLayout(paneAltaComponentes);
        paneAltaComponentes.setLayout(paneAltaComponentesLayout);
        paneAltaComponentesLayout.setHorizontalGroup(
            paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAtributosEspecificos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                        .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                                .addComponent(labelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                                .addComponent(labelTipoComponente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                                .addComponent(labelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                                .addComponent(labelModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAltaComponentesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarComponente)))
                .addContainerGap())
        );
        paneAltaComponentesLayout.setVerticalGroup(
            paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAltaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneAltaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoComponente)
                    .addComponent(cmbTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAtributosEspecificos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarComponente)
                .addContainerGap())
        );

        panelBusquedaBajaComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda / baja Componentes"));

        labelComponenteId.setText("Componente ID:");

        btnBuscarComponente.setText("Buscar componente");
        btnBuscarComponente.addActionListener(this::btnBuscarComponenteActionPerformed);

        btnEliminarComponente.setText("Eliminar componente");
        btnEliminarComponente.addActionListener(this::btnEliminarComponenteActionPerformed);

        javax.swing.GroupLayout panelBusquedaBajaComponentesLayout = new javax.swing.GroupLayout(panelBusquedaBajaComponentes);
        panelBusquedaBajaComponentes.setLayout(panelBusquedaBajaComponentesLayout);
        panelBusquedaBajaComponentesLayout.setHorizontalGroup(
            panelBusquedaBajaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaBajaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaBajaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaBajaComponentesLayout.createSequentialGroup()
                        .addComponent(btnBuscarComponente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarComponente))
                    .addGroup(panelBusquedaBajaComponentesLayout.createSequentialGroup()
                        .addComponent(labelComponenteId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdComponenteOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBusquedaBajaComponentesLayout.setVerticalGroup(
            panelBusquedaBajaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaBajaComponentesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelBusquedaBajaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComponenteId)
                    .addComponent(txtIdComponenteOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelBusquedaBajaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarComponente)
                    .addComponent(btnEliminarComponente))
                .addGap(17, 17, 17))
        );

        tablaComponentes.setModel(new javax.swing.table.DefaultTableModel(
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
        panelTablaComponentes.setViewportView(tablaComponentes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBusquedaBajaComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneAltaComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablaComponentes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablaComponentes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneAltaComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusquedaBajaComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        modeloTabla.addColumn("Tipo Hardware");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Detalles Técnicos Específicos");

        tablaComponentes.setModel(modeloTabla);
        
        tablaComponentes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        tablaComponentes.getColumnModel().getColumn(0).setPreferredWidth(50);  
        tablaComponentes.getColumnModel().getColumn(1).setPreferredWidth(120); 
        tablaComponentes.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaComponentes.getColumnModel().getColumn(3).setPreferredWidth(90);  
        tablaComponentes.getColumnModel().getColumn(4).setPreferredWidth(180);  
        tablaComponentes.getColumnModel().getColumn(5).setPreferredWidth(380);  
    }
    
    //Llenar tabla
    private void llenarTabla() {
   
        modeloTabla.setRowCount(0);
        
        for (Componente c : this.empresa.getComponentes()) {
            String tipoHardware = c.soyUn(); 
            String detalles = "";
            
            if (tipoHardware.equalsIgnoreCase("placa madre")) {
                PlacaMadre pm = (PlacaMadre) c; 
                detalles = "Ranuras RAM: " + pm.getCantidadRanuras() + " | CPUs Compatibles ID: " + pm.getProcesadoresCompatibles().toString();

            } else if (tipoHardware.equalsIgnoreCase("procesador")) {
                Procesador p = (Procesador) c;
                detalles = "Velocidad: " + p.getVelocidadGhz() + " GHz | Caché: " + p.getMemoriaCacheMb() + " MB";

            } else if (tipoHardware.equalsIgnoreCase("memoria ram")) {
                MemoriaRam mr = (MemoriaRam) c;
                detalles = "Tecnología: " + mr.getTecnologia() + " | Vel: " + mr.getVelocidadMhz() + " MHz | Cap: " + mr.getCapacidadGb() + " GB";

            } else if (tipoHardware.equalsIgnoreCase("tarjeta de red")) {
                TarjetaRed tr = (TarjetaRed) c;
                detalles = "Vel. Transmisión: " + tr.getVelocidadTransmision() + " Gbps | MAC: " + tr.getMac();

            } else if (tipoHardware.equalsIgnoreCase("disco duro")) {
                DiscoDuro dd = (DiscoDuro) c;
                detalles = "Tipo: " + dd.getTipo() + " | Cap: " + dd.getCapacidadGb() + " GB | Rotación: " + dd.getVelocidadRotacion() + " RPM";

            } else if (tipoHardware.equalsIgnoreCase("fuente")) {
                Fuente f = (Fuente) c;
                detalles = "Potencia: " + f.getWatts() + " Watts";
            }
            
            modeloTabla.addRow(new Object[]{
                c.getId(),
                tipoHardware.toUpperCase(),
                c.getModelo(),
                "$ " + c.getPrecio(),
                c.getDescripcion(),
                detalles
            });
        }
    }
    
    //Buscar un componente 
    private void mostrarComponenteBuscado(Componente c) {
        
        modeloTabla.setRowCount(0);

        String tipoHardware = c.soyUn(); 
        String detalles = "";

        if (tipoHardware.equalsIgnoreCase("placa madre")) {
            PlacaMadre pm = (PlacaMadre) c; 
            detalles = "Ranuras RAM: " + pm.getCantidadRanuras() + " | CPUs Compatibles ID: " + pm.getProcesadoresCompatibles().toString();

        } else if (tipoHardware.equalsIgnoreCase("procesador")) {
            Procesador p = (Procesador) c;
            detalles = "Velocidad: " + p.getVelocidadGhz() + " GHz | Caché: " + p.getMemoriaCacheMb() + " MB";

        } else if (tipoHardware.equalsIgnoreCase("memoria ram")) {
            MemoriaRam mr = (MemoriaRam) c;
            detalles = "Tecnología: " + mr.getTecnologia() + " | Vel: " + mr.getVelocidadMhz() + " MHz | Cap: " + mr.getCapacidadGb() + " GB";

        } else if (tipoHardware.equalsIgnoreCase("tarjeta de red")) {
            TarjetaRed tr = (TarjetaRed) c;
            detalles = "Vel. Transmisión: " + tr.getVelocidadTransmision() + " bps | MAC: " + tr.getMac();

        } else if (tipoHardware.equalsIgnoreCase("disco duro")) {
            DiscoDuro dd = (DiscoDuro) c;
            detalles = "Tipo: " + dd.getTipo() + " | Cap: " + dd.getCapacidadGb() + " GB | Rotación: " + dd.getVelocidadRotacion() + " RPM";

        } else if (tipoHardware.equalsIgnoreCase("fuente")) {
            Fuente f = (Fuente) c;
            detalles = "Potencia: " + f.getWatts() + " Watts";
        }

        modeloTabla.addRow(new Object[]{
            c.getId(),
            tipoHardware.toUpperCase(),
            c.getModelo(),
            "$ " + c.getPrecio(),
            c.getDescripcion(),
            detalles
        });
    }
    
    //Paneles dinamicos 
    private void actualizarVisibilidadPaneles() {
        String seleccion = cmbTipoComponente.getSelectedItem().toString();
    
        subPanelPlacaMadre.setVisible(false);
        subPanelProcesador.setVisible(false);
        subPanelMemoriaRam.setVisible(false);
        subPanelTarjetaRed.setVisible(false);
        subPanelDiscoDuro.setVisible(false);
        subPanelFuente.setVisible(false);
        
        if (seleccion.equalsIgnoreCase("Placa Madre")) {
            subPanelPlacaMadre.setVisible(true);
        } else if (seleccion.equalsIgnoreCase("Procesador")) {
            subPanelProcesador.setVisible(true);
        } else if (seleccion.equalsIgnoreCase("Memoria RAM")) {
            subPanelMemoriaRam.setVisible(true);
        } else if (seleccion.equalsIgnoreCase("Tarjeta de Red")) {
            subPanelTarjetaRed.setVisible(true);
        } else if (seleccion.equalsIgnoreCase("Disco Duro")) {
            subPanelDiscoDuro.setVisible(true);
        } else if (seleccion.equalsIgnoreCase("Fuente")) {
            subPanelFuente.setVisible(true);
        }
        panelAtributosEspecificos.revalidate();
        panelAtributosEspecificos.repaint();
    }
    
    //Limpiar campos del formulario 
    private void limpiarCamposFormulario() {
        txtId.setText("");
        txtModelo.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        cmbTipoComponente.setSelectedIndex(0);
        txtRanuras.setText("");
        txtCpus.setText("");
        txtVelocidadGhz.setText("");
        txtCacheMb.setText("");
        cmbTecnologiaRam.setSelectedIndex(0);
        txtVelocidadMhz.setText("");
        txtCapacidad.setText("");
        txtVelocidadTransmision.setText("");
        txtMac.setText("");
        cmbTipoDisco.setSelectedIndex(0);
        txtCapacidadDisco.setText("");
        txtVelocidadRotacion.setText("");
        txtWatts.setText("");
        actualizarVisibilidadPaneles();
    }
    
    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpusActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnRegistrarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarComponenteActionPerformed
        // TODO add your handling code here:
        if (cmbTipoComponente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de componente de la lista.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtId.getText().trim().isEmpty() || txtModelo.getText().trim().isEmpty() || 
            txtPrecio.getText().trim().isEmpty() || txtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos generales (ID, Modelo, Precio y Descripción) son obligatorios.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String modelo = txtModelo.getText().trim();
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            String descripcion = txtDescripcion.getText().trim();
            String seleccion = cmbTipoComponente.getSelectedItem().toString();
            Componente nuevoComponente = null;
            if (seleccion.equalsIgnoreCase("Placa Madre")) {
                if (txtRanuras.getText().trim().isEmpty() || txtCpus.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la cantidad de ranuras y los IDs de CPUs compatibles.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int ranuras = Integer.parseInt(txtRanuras.getText().trim());                
                java.util.ArrayList<Integer> cpusCompatibles = new java.util.ArrayList<>();
                String cpusArray []= txtCpus.getText().trim().split(",");
                for (String idCpuStr : cpusArray) {
                    if (!idCpuStr.trim().isEmpty()) {
                        cpusCompatibles.add(Integer.parseInt(idCpuStr.trim()));
                    }
                }
                
                nuevoComponente = new PlacaMadre(id, modelo, precio, descripcion, ranuras, cpusCompatibles);
            } else if (seleccion.equalsIgnoreCase("Procesador")) {
                if (txtVelocidadGhz.getText().trim().isEmpty() || txtCacheMb.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la velocidad (GHz) y la memoria caché (MB).", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                double velocidad = Double.parseDouble(txtVelocidadGhz.getText().trim());
                int cache = Integer.parseInt(txtCacheMb.getText().trim());
                
                nuevoComponente = new Procesador(id, modelo, precio, descripcion, velocidad, cache);

            } else if (seleccion.equalsIgnoreCase("Memoria RAM")) {
                if (txtVelocidadMhz.getText().trim().isEmpty() || txtCapacidad.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la velocidad (MHz) y la capacidad de la memoria.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                String tecnologia = cmbTecnologiaRam.getSelectedItem().toString();
                int velocidadMhz = Integer.parseInt(txtVelocidadMhz.getText().trim());
                int capacidadGb = Integer.parseInt(txtCapacidad.getText().trim());
                
                nuevoComponente = new MemoriaRam(id, modelo, precio, descripcion, tecnologia, velocidadMhz, capacidadGb);

            } else if (seleccion.equalsIgnoreCase("Tarjeta de Red")) {
                if (txtVelocidadTransmision.getText().trim().isEmpty() || txtMac.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la velocidad de transmisión y la dirección MAC.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Double velTransmision = Double.parseDouble(txtVelocidadTransmision.getText().trim());
                String mac = txtMac.getText().trim();
                
                nuevoComponente = new TarjetaRed(id, modelo, precio, descripcion, velTransmision, mac);

            } else if (seleccion.equalsIgnoreCase("Disco Duro")) {
                if (txtCapacidadDisco.getText().trim().isEmpty() || txtVelocidadRotacion.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la capacidad y la velocidad de rotación (RPM) del disco.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                String tipoDisco = cmbTipoDisco.getSelectedItem().toString();
                int capacidadDiscoGb = Integer.parseInt(txtCapacidadDisco.getText().trim());
                int velocidadRotacion = Integer.parseInt(txtVelocidadRotacion.getText().trim());
                
                nuevoComponente = new DiscoDuro(id, modelo, precio, descripcion, velocidadRotacion, capacidadDiscoGb, tipoDisco );

            } else if (seleccion.equalsIgnoreCase("Fuente")) {
                if (txtWatts.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Complete la potencia en Watts de la fuente.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int watts = Integer.parseInt(txtWatts.getText().trim());
                
                nuevoComponente = new Fuente(id, modelo, precio, descripcion, watts);
            }

            if (nuevoComponente != null) {
                if(empresa.altaComponente(nuevoComponente)){
                    JOptionPane.showMessageDialog(this, "¡Componente registrado con éxito!", "Operación Exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    llenarTabla();
                    limpiarCamposFormulario();
                }else {
                   JOptionPane.showMessageDialog(this, "Ya existe un componente reigstrado con el ID: " + id +".", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el formato de los datos:\n" + "- Asegúrese de ingresar solo números enteros en campos como ID, Watts, Ranuras y Velocidades (MHz/RPM).\n" + "- Para los números decimales (Precio o GHz) use el punto (.) como separador numérico.",  "Error de Entrada", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarComponenteActionPerformed

    private void btnBuscarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComponenteActionPerformed
        // TODO add your handling code here:
        String idStr = txtIdComponenteOperacion.getText().trim();
        
        if (idStr.isEmpty()) {
            llenarTabla();
            return;
        }
        
        try {
            int idBusqueda = Integer.parseInt(idStr);
            Componente encontrado = this.empresa.buscarComponente(idBusqueda);
            
            if (encontrado != null) {
                mostrarComponenteBuscado(encontrado);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún componente con el ID " + idBusqueda + ".", "Sin resultados", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID numérico válido para realizar la búsqueda.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarComponenteActionPerformed

    private void cmbTipoComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoComponenteActionPerformed
        // TODO add your handling code here:
        actualizarVisibilidadPaneles();
    }//GEN-LAST:event_cmbTipoComponenteActionPerformed

    private void btnEliminarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarComponenteActionPerformed
        // TODO add your handling code here:
        String idStr = txtIdComponenteOperacion.getText().trim();
        
        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el ID del componente que desea dar de baja.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            int idEliminar = Integer.parseInt(idStr);            
            Componente aEliminar = this.empresa.buscarComponente(idEliminar);
            
            if (aEliminar != null) {
                int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar permanentemente el componente:\n" + "[" + aEliminar.soyUn().toUpperCase() + "] " + aEliminar.getModelo() + " (ID: " + idEliminar + ")?", "Confirmar Baja de Componente", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE
                );
                
                if (confirmacion == JOptionPane.YES_OPTION) {
                    this.empresa.eliminarComponente(idEliminar);
                    JOptionPane.showMessageDialog(this, "El componente ha sido eliminado con éxito del sistema.", "Operación Exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);                   
                    txtIdComponenteOperacion.setText("");
                    llenarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe ningún componente en el sistema con el ID ingresado.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID numérico válido para efectuar la baja.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarComponenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarComponente;
    private javax.swing.JButton btnEliminarComponente;
    private javax.swing.JButton btnRegistrarComponente;
    private javax.swing.JComboBox<String> cmbTecnologiaRam;
    private javax.swing.JComboBox<String> cmbTipoComponente;
    private javax.swing.JComboBox<String> cmbTipoDisco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCache;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelCapacidadDisco;
    private javax.swing.JLabel labelComponenteId;
    private javax.swing.JLabel labelCpus;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelInfoIdsCpus;
    private javax.swing.JLabel labelMac;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelRanuras;
    private javax.swing.JLabel labelTecnologia;
    private javax.swing.JLabel labelTipoComponente;
    private javax.swing.JLabel labelTipoDisco;
    private javax.swing.JLabel labelVelocidad;
    private javax.swing.JLabel labelVelocidadMhz;
    private javax.swing.JLabel labelVelocidadTransmision;
    private javax.swing.JPanel paneAltaComponentes;
    private javax.swing.JPanel panelAtributosEspecificos;
    private javax.swing.JPanel panelBusquedaBajaComponentes;
    private javax.swing.JScrollPane panelTablaComponentes;
    private javax.swing.JPanel subPanelDiscoDuro;
    private javax.swing.JPanel subPanelFuente;
    private javax.swing.JPanel subPanelMemoriaRam;
    private javax.swing.JPanel subPanelPlacaMadre;
    private javax.swing.JPanel subPanelProcesador;
    private javax.swing.JPanel subPanelTarjetaRed;
    private javax.swing.JTable tablaComponentes;
    private javax.swing.JTextField txtCacheMb;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCapacidadDisco;
    private javax.swing.JTextField txtCpus;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdComponenteOperacion;
    private javax.swing.JTextField txtMac;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRanuras;
    private javax.swing.JTextField txtVelocidadGhz;
    private javax.swing.JTextField txtVelocidadMhz;
    private javax.swing.JTextField txtVelocidadRotacion;
    private javax.swing.JTextField txtVelocidadTransmision;
    private javax.swing.JTextField txtWatts;
    // End of variables declaration//GEN-END:variables
}

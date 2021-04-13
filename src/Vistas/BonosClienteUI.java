package Vistas;

import Controladores.ClienteController;
import Modelo.Cliente;
import Vistas.modelos.BonosClienteTableModel;
import videoclub.Controladores;
import videoclub.VideoclubApp;


public class BonosClienteUI extends javax.swing.JPanel {

    private ClienteController clienteController;
    private Cliente cliente;

    /**
     * Creates new form BonosClienteUI
     */
    public BonosClienteUI() {
        initComponents();
        clienteController = Controladores.clienteController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jsp = new javax.swing.JScrollPane();
        tablaBonosDelCliente = new javax.swing.JTable();
        campoNombreCliente = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 380));
        setMinimumSize(new java.awt.Dimension(750, 380));
        setLayout(new java.awt.BorderLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Bonos del cliente");
        add(etiquetaTitulo, java.awt.BorderLayout.PAGE_START);

        panel.setMaximumSize(new java.awt.Dimension(750, 328));
        panel.setMinimumSize(new java.awt.Dimension(750, 328));

        tablaBonosDelCliente.setModel(new Vistas.modelos.BonosClienteTableModel());
        tablaBonosDelCliente.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaBonosDelCliente);

        campoNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoNombreCliente.setText("jLabel1");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addComponent(campoNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoNombreCliente)
                .addGap(18, 18, 18)
                .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        add(panel, java.awt.BorderLayout.CENTER);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        VideoclubApp.principal.agregarComponenteAlCentro(new ClienteUI());
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel campoNombreCliente;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaBonosDelCliente;
    // End of variables declaration//GEN-END:variables

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        campoNombreCliente.setText("Cliente: " + cliente.toString());
        ((BonosClienteTableModel) tablaBonosDelCliente.getModel()).setCliente(cliente);
    }
}
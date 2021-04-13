package Vistas;

import Controladores.AlquilerController;
import Controladores.ClienteController;
import Controladores.PeliculaController;
import Modelo.Cliente;
import Modelo.Ejemplar;
import Vistas.modelos.EjemplarTableModel;
import Vistas.modelos.PeriodoComboBoxModel;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import videoclub.Controladores;

public class AlquileresUI extends javax.swing.JPanel implements Observer {

    private AlquilerController alquilerController;
    private ClienteController clienteController;
    private PeliculaController peliculaController;

    /**
     * Creates new form AlquileresUI
     */
    public AlquileresUI() {
        initComponents();
        alquilerController = Controladores.alquilerController;
        alquilerController.addObserver(this);
        clienteController = Controladores.clienteController;
        peliculaController = Controladores.peliculaController;
        limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConSolapas = new javax.swing.JTabbedPane();
        solapaRegistrarAlquiler = new javax.swing.JPanel();
        etiquetaDniCliente = new javax.swing.JLabel();
        campoDniCliente = new javax.swing.JFormattedTextField();
        botonBuscarCliente = new javax.swing.JButton();
        etiquetaCodigoEjemplar = new javax.swing.JLabel();
        campoCodigoEjemplar = new javax.swing.JTextField();
        etiquetaBono = new javax.swing.JLabel();
        botonBuscarEjemplar = new javax.swing.JButton();
        campoPeriodo = new javax.swing.JComboBox();
        botonAlquilar = new javax.swing.JButton();
        botonCancelarAlquiler = new javax.swing.JButton();
        jsp2 = new javax.swing.JScrollPane();
        tablaEjemplaresAlquiler = new javax.swing.JTable();
        campoCliente = new javax.swing.JLabel();
        etiquetaDias = new javax.swing.JLabel();
        botonEliminarEjemplarAlquiler = new javax.swing.JButton();
        solapaAlquileresNoDevueltos = new javax.swing.JPanel();
        jsp = new javax.swing.JScrollPane();
        tablaAlquileresNoDevueltos = new javax.swing.JTable();
        botonDevolverAlquiler = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 380));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(750, 380));

        solapaRegistrarAlquiler.setMaximumSize(new java.awt.Dimension(753, 352));

        etiquetaDniCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        etiquetaDniCliente.setText("Ingrese el DNI del cliente");

        campoDniCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));

        botonBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        etiquetaCodigoEjemplar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaCodigoEjemplar.setText("Ingrese el código del ejemplar");

        etiquetaBono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaBono.setText("Seleccione periodo de alquiler");

        botonBuscarEjemplar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonBuscarEjemplar.setText("Buscar Ejemplar");
        botonBuscarEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEjemplarActionPerformed(evt);
            }
        });

        campoPeriodo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        campoPeriodo.setModel(new Vistas.modelos.PeriodoComboBoxModel());

        botonAlquilar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonAlquilar.setText("Alquilar");
        botonAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilarActionPerformed(evt);
            }
        });

        botonCancelarAlquiler.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonCancelarAlquiler.setText("Cancelar Alquiler");
        botonCancelarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarAlquilerActionPerformed(evt);
            }
        });

        tablaEjemplaresAlquiler.setModel(new Vistas.modelos.EjemplarTableModel());
        tablaEjemplaresAlquiler.getTableHeader().setReorderingAllowed(false);
        jsp2.setViewportView(tablaEjemplaresAlquiler);

        campoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoCliente.setText("jLabel1");

        etiquetaDias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaDias.setText("dias (periodos de los bonos comprados por el cliente)");

        botonEliminarEjemplarAlquiler.setText("Eliminar Ejemplar de Alquiler");
        botonEliminarEjemplarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEjemplarAlquilerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout solapaRegistrarAlquilerLayout = new javax.swing.GroupLayout(solapaRegistrarAlquiler);
        solapaRegistrarAlquiler.setLayout(solapaRegistrarAlquilerLayout);
        solapaRegistrarAlquilerLayout.setHorizontalGroup(
            solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                        .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                                .addComponent(etiquetaDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                                .addComponent(etiquetaBono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jsp2)
                            .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                                .addComponent(etiquetaCodigoEjemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCodigoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscarEjemplar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarEjemplarAlquiler))
                    .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                        .addComponent(botonAlquilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelarAlquiler)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        solapaRegistrarAlquilerLayout.setVerticalGroup(
            solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDniCliente)
                    .addComponent(campoDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addGap(31, 31, 31)
                .addComponent(campoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBono)
                    .addComponent(campoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminarEjemplarAlquiler)
                    .addGroup(solapaRegistrarAlquilerLayout.createSequentialGroup()
                        .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCodigoEjemplar)
                            .addComponent(campoCodigoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscarEjemplar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solapaRegistrarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAlquilar)
                            .addComponent(botonCancelarAlquiler))))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        panelConSolapas.addTab("Registrar Alquiler", solapaRegistrarAlquiler);

        solapaAlquileresNoDevueltos.setMaximumSize(new java.awt.Dimension(753, 352));
        solapaAlquileresNoDevueltos.setName("No Devueltos");

        tablaAlquileresNoDevueltos.setAutoCreateRowSorter(true);
        tablaAlquileresNoDevueltos.setModel(new Vistas.modelos.AlquileresNoDevueltosTableModel());
        tablaAlquileresNoDevueltos.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaAlquileresNoDevueltos);

        botonDevolverAlquiler.setText("Devolver Alquiler");
        botonDevolverAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverAlquilerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout solapaAlquileresNoDevueltosLayout = new javax.swing.GroupLayout(solapaAlquileresNoDevueltos);
        solapaAlquileresNoDevueltos.setLayout(solapaAlquileresNoDevueltosLayout);
        solapaAlquileresNoDevueltosLayout.setHorizontalGroup(
            solapaAlquileresNoDevueltosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solapaAlquileresNoDevueltosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDevolverAlquiler)
                .addGap(14, 14, 14))
        );
        solapaAlquileresNoDevueltosLayout.setVerticalGroup(
            solapaAlquileresNoDevueltosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solapaAlquileresNoDevueltosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(solapaAlquileresNoDevueltosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solapaAlquileresNoDevueltosLayout.createSequentialGroup()
                        .addComponent(botonDevolverAlquiler)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jsp, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelConSolapas.addTab("Peliculas Pendientes", solapaAlquileresNoDevueltos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConSolapas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConSolapas)
        );

        panelConSolapas.getAccessibleContext().setAccessibleName("No Devueltos");
    }// </editor-fold>//GEN-END:initComponents

    private void botonDevolverAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverAlquilerActionPerformed
        try {
            alquilerController.devolverAlquiler(tablaAlquileresNoDevueltos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonDevolverAlquilerActionPerformed

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        try {
            Cliente c = clienteController.buscarClientePorDni(((Number) campoDniCliente.getValue()).longValue());
            if (alquilerController.clientePuedeAlquilar(c)) {
                alquilerController.setCliente(c);
                campoCliente.setText("Cliente: " + c.toString());
                campoCliente.setVisible(true);
                campoCliente.setEnabled(true);

                etiquetaBono.setVisible(true);
                etiquetaBono.setEnabled(true);
                ((PeriodoComboBoxModel) campoPeriodo.getModel()).setPeriodos(clienteController.obtenerBonosDelCliente(c));
                campoPeriodo.setVisible(true);
                campoPeriodo.setEnabled(true);
                etiquetaDias.setVisible(true);
                etiquetaDias.setEnabled(true);

                tablaEjemplaresAlquiler.setVisible(true);
                tablaEjemplaresAlquiler.setEnabled(true);

                etiquetaCodigoEjemplar.setVisible(true);
                etiquetaCodigoEjemplar.setEnabled(true);
                campoCodigoEjemplar.setText("");
                campoCodigoEjemplar.setVisible(true);
                campoCodigoEjemplar.setEnabled(true);
                botonBuscarEjemplar.setVisible(true);
                botonBuscarEjemplar.setEnabled(true);

                botonEliminarEjemplarAlquiler.setVisible(true);
                botonEliminarEjemplarAlquiler.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonBuscarEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEjemplarActionPerformed
        try {
            Ejemplar e = peliculaController.buscarEjemplarPorCodigo(campoCodigoEjemplar.getText());
            if (alquilerController.ejemplarPuedeAlquilarse(e)) {
                alquilerController.agregarEjemplar(e);
                botonAlquilar.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarEjemplarActionPerformed

    private void botonAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilarActionPerformed
        try {
            alquilerController.setPeriodo((Integer) campoPeriodo.getSelectedItem());
            alquilerController.registrarNuevoAlquiler();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Se ha realizado con éxito la operación", "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAlquilarActionPerformed

    private void botonCancelarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarAlquilerActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonCancelarAlquilerActionPerformed

    private void botonEliminarEjemplarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEjemplarAlquilerActionPerformed
        try {
            alquilerController.eliminarEjemplarAlquiler(tablaEjemplaresAlquiler.getSelectedRows());
            if(alquilerController.getEjemplaresAlquiler().isEmpty())
                botonAlquilar.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarEjemplarAlquilerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlquilar;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonBuscarEjemplar;
    private javax.swing.JButton botonCancelarAlquiler;
    private javax.swing.JButton botonDevolverAlquiler;
    private javax.swing.JButton botonEliminarEjemplarAlquiler;
    private javax.swing.JLabel campoCliente;
    private javax.swing.JTextField campoCodigoEjemplar;
    private javax.swing.JFormattedTextField campoDniCliente;
    private javax.swing.JComboBox campoPeriodo;
    private javax.swing.JLabel etiquetaBono;
    private javax.swing.JLabel etiquetaCodigoEjemplar;
    private javax.swing.JLabel etiquetaDias;
    private javax.swing.JLabel etiquetaDniCliente;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JScrollPane jsp2;
    private javax.swing.JTabbedPane panelConSolapas;
    private javax.swing.JPanel solapaAlquileresNoDevueltos;
    private javax.swing.JPanel solapaRegistrarAlquiler;
    private javax.swing.JTable tablaAlquileresNoDevueltos;
    private javax.swing.JTable tablaEjemplaresAlquiler;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        ((EjemplarTableModel)tablaEjemplaresAlquiler.getModel()).setEjemplares(alquilerController.getEjemplaresAlquiler());
    }

    private void limpiarCampos() {
        alquilerController.setCliente(null);

        campoDniCliente.setValue(0);
        campoCliente.setVisible(false);
        campoCliente.setEnabled(false);

        etiquetaBono.setVisible(false);
        etiquetaBono.setEnabled(false);
        campoPeriodo.setVisible(false);
        campoPeriodo.setEnabled(false);
        etiquetaDias.setVisible(false);
        etiquetaDias.setEnabled(false);

        tablaEjemplaresAlquiler.setVisible(false);
        tablaEjemplaresAlquiler.setEnabled(false);
        botonEliminarEjemplarAlquiler.setVisible(false);
        botonEliminarEjemplarAlquiler.setEnabled(false);

        etiquetaCodigoEjemplar.setVisible(false);
        etiquetaCodigoEjemplar.setEnabled(false);
        campoCodigoEjemplar.setVisible(false);
        campoCodigoEjemplar.setEnabled(false);
        botonBuscarEjemplar.setVisible(false);
        botonBuscarEjemplar.setEnabled(false);

        botonAlquilar.setEnabled(false);
    }

}

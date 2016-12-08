/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Supervisor;

import DAO.ImplVentaDAO;
import DTO.*;
import java.util.ArrayList;
import Util.jTableCustom.Models.jTableModelEvento;
import javax.swing.JOptionPane;
import java.util.Calendar;
/**
 *
 * @author Agustin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private DTO.Usuario usuario;
    private DTO.Organizacion organizacion;
    private ArrayList<Evento> eventos;
    private jTableModelEvento tableModel = new Util.jTableCustom.Models.jTableModelEvento();
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    public void CargarDatos(DTO.Usuario usuario){
        this.usuario = usuario;
        this.jLabelNombreUsuario.setText(this.usuario.getNombre());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDespliegueDatos = new javax.swing.JPanel();
        jLabelMensajeBienvenida = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jSeparatorDespliegueContenido = new javax.swing.JSeparator();
        jPanelContent = new javax.swing.JPanel();
        jButtonGenerarReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateChooserComboFechaHasta = new datechooser.beans.DateChooserCombo();
        dateChooserComboFechaDesde = new datechooser.beans.DateChooserCombo();
        jLabelHasta = new javax.swing.JLabel();
        jLabelDesde = new javax.swing.JLabel();
        jLabelTituloDeAccion = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Ticket Administración");
        setSize(new java.awt.Dimension(0, 0));

        jLabelMensajeBienvenida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMensajeBienvenida.setText("Bienvenido");

        jLabelNombreUsuario.setText("{Usuario}");

        javax.swing.GroupLayout jPanelDespliegueDatosLayout = new javax.swing.GroupLayout(jPanelDespliegueDatos);
        jPanelDespliegueDatos.setLayout(jPanelDespliegueDatosLayout);
        jPanelDespliegueDatosLayout.setHorizontalGroup(
            jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDespliegueDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensajeBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanelDespliegueDatosLayout.setVerticalGroup(
            jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelMensajeBienvenida)
                .addComponent(jLabelNombreUsuario))
        );

        jButtonGenerarReporte.setText("Generar Reporte");
        jButtonGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarReporteActionPerformed(evt);
            }
        });

        jTable1.setModel(new Util.jTableCustom.Models.jTableModelVenta());
        jScrollPane1.setViewportView(jTable1);

        dateChooserComboFechaHasta.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserComboFechaHasta.setAutoScroll(false);
    dateChooserComboFechaHasta.setCalendarPreferredSize(new java.awt.Dimension(380, 260));
    dateChooserComboFechaHasta.setNothingAllowed(false);
    dateChooserComboFechaHasta.setLocale(new java.util.Locale("es", "CL", ""));
    dateChooserComboFechaHasta.setMaxDate(Calendar.getInstance());

    dateChooserComboFechaDesde.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserComboFechaDesde.setAutoScroll(false);
dateChooserComboFechaDesde.setCalendarPreferredSize(new java.awt.Dimension(380, 260));
dateChooserComboFechaDesde.setNothingAllowed(false);
dateChooserComboFechaDesde.setLocale(new java.util.Locale("es", "CL", ""));
dateChooserComboFechaDesde.setMaxDate(Calendar.getInstance()
    );

    jLabelHasta.setText("Hasta:");

    jLabelDesde.setText("Desde");

    jLabelTituloDeAccion.setText("Generar reporte de ventas");

    jLabelTotal.setText("Total: $");

    jTextField1.setEnabled(false);
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
    jPanelContent.setLayout(jPanelContentLayout);
    jPanelContentLayout.setHorizontalGroup(
        jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelContentLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloDeAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addComponent(jLabelDesde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooserComboFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelHasta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooserComboFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButtonGenerarReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                            .addComponent(jLabelTotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap())
    );
    jPanelContentLayout.setVerticalGroup(
        jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelContentLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelTituloDeAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabelDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateChooserComboFechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateChooserComboFechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonGenerarReporte)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelTotal))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelDespliegueDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparatorDespliegueContenido)
                        .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelDespliegueDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparatorDespliegueContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarReporteActionPerformed
        try {
           ArrayList<Venta> _ventas = new ImplVentaDAO().ReporteVentas();
           
           _ventas.forEach((_venta) -> {
               ((Util.jTableCustom.Models.jTableModelVenta)jTable1.getModel()).cargarDatos(_venta);
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error",  ERROR);
        }
    }//GEN-LAST:event_jButtonGenerarReporteActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboFechaDesde;
    private datechooser.beans.DateChooserCombo dateChooserComboFechaHasta;
    private javax.swing.JButton jButtonGenerarReporte;
    private javax.swing.JLabel jLabelDesde;
    private javax.swing.JLabel jLabelHasta;
    private javax.swing.JLabel jLabelMensajeBienvenida;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTituloDeAccion;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelDespliegueDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorDespliegueContenido;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

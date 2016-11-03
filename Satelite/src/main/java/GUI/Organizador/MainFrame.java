/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Organizador;

import DTO.*;
import java.util.ArrayList;
import javax.swing.JTable;
import Util.jTableModelEvento;
import javax.swing.table.DefaultTableModel;
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
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void CargarDatos(DTO.Usuario usuario){
        this.usuario = usuario;
        this.jLabelNombreUsuario.setText(this.usuario.getNombre());
        this.organizacion = new DAO.OrganizacionDAOImpl().RecuperarOrganizacion_RUN(this.usuario);
        this.jLabelNombreOrganizacion.setText(this.organizacion.getNombre());
        this.eventos = new DAO.OrganizacionDAOImpl().RecuperarEventos(organizacion);
        for (Evento evento : eventos) {
            ((Util.jTableModelEvento)jTableEventos.getModel()).addRow(evento);
        }
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
        jPanelContenido = new javax.swing.JPanel();
        jScrollPaneEventos = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonEliminarEvento = new javax.swing.JButton();
        jButtonNuevoEvento = new javax.swing.JButton();
        jLabelNombreOrganizacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Ticket Administración");
        setResizable(false);

        jLabelMensajeBienvenida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMensajeBienvenida.setText("Bienvenido");

        jLabelNombreUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanelDespliegueDatosLayout = new javax.swing.GroupLayout(jPanelDespliegueDatos);
        jPanelDespliegueDatos.setLayout(jPanelDespliegueDatosLayout);
        jPanelDespliegueDatosLayout.setHorizontalGroup(
            jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDespliegueDatosLayout.createSequentialGroup()
                .addComponent(jLabelMensajeBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDespliegueDatosLayout.setVerticalGroup(
            jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDespliegueDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelMensajeBienvenida)
                .addComponent(jLabelNombreUsuario))
        );

        jTableEventos.setModel(new Util.jTableModelEvento());
        jScrollPaneEventos.setViewportView(jTableEventos);

        jLabelTitulo.setText("Administrar Eventos de:");

        jButtonEliminarEvento.setText("Eliminar");
        jButtonEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEventoActionPerformed(evt);
            }
        });

        jButtonNuevoEvento.setText("Nuevo");
        jButtonNuevoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEventoActionPerformed(evt);
            }
        });

        jLabelNombreOrganizacion.setText("[Organización]");

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNombreOrganizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNuevoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEliminarEvento)))
                .addContainerGap())
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jButtonNuevoEvento)
                    .addComponent(jLabelNombreOrganizacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminarEvento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDespliegueDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorDespliegueContenido)
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarEventoActionPerformed

    private void jButtonNuevoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoEventoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarEvento;
    private javax.swing.JButton jButtonNuevoEvento;
    private javax.swing.JLabel jLabelMensajeBienvenida;
    private javax.swing.JLabel jLabelNombreOrganizacion;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelDespliegueDatos;
    private javax.swing.JScrollPane jScrollPaneEventos;
    private javax.swing.JSeparator jSeparatorDespliegueContenido;
    private javax.swing.JTable jTableEventos;
    // End of variables declaration//GEN-END:variables
}
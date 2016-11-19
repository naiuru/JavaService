/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.Organizador;

import DTO.Recinto;
import DTO.TipoGeneric;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Agus
 */
public class EventoFrame extends javax.swing.JDialog {

    private DTO.Evento evento = new DTO.Evento();
    private ArrayList<TipoGeneric> tipoEventos = new DAO.ImplTipoGenericsDAO().RecuperarTipoEventos();
    private ArrayList<Recinto> recintos = new DAO.ImplRecintoDAO().RecuperarRecinto_Todos();

    /** Creates new form NuevoEvento */
    public EventoFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        
        this.jDialogTipoEvento.setLocationRelativeTo(this);
        this.jDialogRecintos.setLocationRelativeTo(this);
        
        this.jDialogTipoEvento.pack();
        this.jDialogRecintos.pack();
        
        this.jListTiposEventos.setModel(new Util.jListModelTipoGenerics(this.tipoEventos));
        recintos.forEach((recinto) ->{
            ((Util.jTableCustom.Models.jTableModelRecinto)jTableRecintos.getModel()).cargarDatos(recinto);
        });
    }
     
    /**
     * Para eventos nuevos
     * @param organizacion 
     */
    public void CargarDatos(DTO.Organizacion organizacion){
        this.evento.setOrganizacion(organizacion);
    }
    
    
    /**
     * Para Eventos ya existentes
     * @param organizacion
     * @param evento 
     */
    public void CargarDatos(DTO.Organizacion organizacion, DTO.Evento evento){
        this.evento = evento;
        this.jButtonEventoAccion.setText("Modificar");
        this.setTitle("Modificar " + this.evento.getNombre() );
        this.jTextFieldEventoNombre.setText(this.evento.getNombre());
        this.jTextFieldEventoRecinto.setText(this.evento.getRecinto().getNombre());
        this.jSpinnerHora.setValue(this.evento.getFecha().get(Calendar.HOUR_OF_DAY));
        this.jSpinnerMinutos.setValue(this.evento.getFecha().get(Calendar.MINUTE));
        this.jTextFieldEventoTipo.setText(this.evento.getTipo().getDescripcion());
        this.jTextFieldEventoNombre.setText(this.evento.getNombre());
        
        tipoEventos.forEach((tipo)->{
            if (tipo.getCodigo() == this.evento.getTipo().getCodigo()) {
                jListTiposEventos.setSelectedIndex(this.tipoEventos.indexOf(tipo));
            }
        });
        
        recintos.forEach((recinto) -> {
            if (recinto.getCodigo() == this.evento.getRecinto().getCodigo()) {
                jTableRecintos.setRowSelectionInterval(recintos.indexOf(recinto), recintos.indexOf(recinto));
            }
        });
        
        
        this.CargarDatos(organizacion);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogTipoEvento = new javax.swing.JDialog();
        jPanelContenidoTipoEvento = new javax.swing.JPanel();
        jTextFieldBuscarTipoEvento = new javax.swing.JTextField();
        jButtonBuscarTipoEvento = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jScrollPaneTiposEventos = new javax.swing.JScrollPane();
        jListTiposEventos = new javax.swing.JList<>();
        jButtonTipoEventoListo = new javax.swing.JButton();
        jDialogRecintos = new javax.swing.JDialog();
        jPanelContenidoReicnto = new javax.swing.JPanel();
        jTextFieldBuscarRecinto = new javax.swing.JTextField();
        jButtonBuscarRecinto = new javax.swing.JButton();
        jSeparatorRecinto = new javax.swing.JSeparator();
        jScrollPaneRecinto = new javax.swing.JScrollPane();
        jTableRecintos = new javax.swing.JTable();
        jButtonListoRecintos = new javax.swing.JButton();
        jPanelContenidoEventoNuevo = new javax.swing.JPanel();
        jLabelEventoNombre = new javax.swing.JLabel();
        jLabelEventoTipo = new javax.swing.JLabel();
        jLabelEventoRecinto = new javax.swing.JLabel();
        jLabelEventoFecha = new javax.swing.JLabel();
        jTextFieldEventoNombre = new javax.swing.JTextField();
        jTextFieldEventoTipo = new javax.swing.JTextField();
        jTextFieldEventoRecinto = new javax.swing.JTextField();
        jButtonEventoTipo = new javax.swing.JButton();
        jButtonEventoRecinto = new javax.swing.JButton();
        dateChooserComboFecha = new datechooser.beans.DateChooserCombo();
        jLabelEventoHora = new javax.swing.JLabel();
        jSpinnerHora = new javax.swing.JSpinner();
        jSpinnerMinutos = new javax.swing.JSpinner();
        jLabelEventoHoraSeparador = new javax.swing.JLabel();
        jButtonEventoAccion = new javax.swing.JButton();

        jDialogTipoEvento.setModal(true);
        jDialogTipoEvento.setResizable(false);
        jDialogTipoEvento.setSize(new java.awt.Dimension(0, 0));

        jButtonBuscarTipoEvento.setText("Buscar");

        jListTiposEventos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneTiposEventos.setViewportView(jListTiposEventos);

        jButtonTipoEventoListo.setText("Listo");
        jButtonTipoEventoListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoEventoListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoTipoEventoLayout = new javax.swing.GroupLayout(jPanelContenidoTipoEvento);
        jPanelContenidoTipoEvento.setLayout(jPanelContenidoTipoEventoLayout);
        jPanelContenidoTipoEventoLayout.setHorizontalGroup(
            jPanelContenidoTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoTipoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoTipoEventoLayout.createSequentialGroup()
                        .addComponent(jButtonTipoEventoListo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelContenidoTipoEventoLayout.createSequentialGroup()
                        .addGroup(jPanelContenidoTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenidoTipoEventoLayout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscarTipoEvento))
                            .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneTiposEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelContenidoTipoEventoLayout.setVerticalGroup(
            jPanelContenidoTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoTipoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarTipoEvento))
                .addGap(4, 4, 4)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTiposEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTipoEventoListo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogTipoEventoLayout = new javax.swing.GroupLayout(jDialogTipoEvento.getContentPane());
        jDialogTipoEvento.getContentPane().setLayout(jDialogTipoEventoLayout);
        jDialogTipoEventoLayout.setHorizontalGroup(
            jDialogTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTipoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenidoTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogTipoEventoLayout.setVerticalGroup(
            jDialogTipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTipoEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenidoTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogRecintos.setModal(true);
        jDialogRecintos.setResizable(false);
        jDialogRecintos.setSize(new java.awt.Dimension(0, 0));

        jButtonBuscarRecinto.setText("Buscar");

        jTableRecintos.setModel(new Util.jTableCustom.Models.jTableModelRecinto());
        jScrollPaneRecinto.setViewportView(jTableRecintos);

        jButtonListoRecintos.setText("Listo");
        jButtonListoRecintos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoRecintosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoReicntoLayout = new javax.swing.GroupLayout(jPanelContenidoReicnto);
        jPanelContenidoReicnto.setLayout(jPanelContenidoReicntoLayout);
        jPanelContenidoReicntoLayout.setHorizontalGroup(
            jPanelContenidoReicntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoReicntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoReicntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoReicntoLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarRecinto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarRecinto))
                    .addComponent(jScrollPaneRecinto)
                    .addComponent(jSeparatorRecinto)
                    .addComponent(jButtonListoRecintos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelContenidoReicntoLayout.setVerticalGroup(
            jPanelContenidoReicntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoReicntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoReicntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarRecinto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPaneRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListoRecintos)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogRecintosLayout = new javax.swing.GroupLayout(jDialogRecintos.getContentPane());
        jDialogRecintos.getContentPane().setLayout(jDialogRecintosLayout);
        jDialogRecintosLayout.setHorizontalGroup(
            jDialogRecintosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRecintosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenidoReicnto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRecintosLayout.setVerticalGroup(
            jDialogRecintosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogRecintosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenidoReicnto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Nuevo Evento");
        setModal(true);
        setResizable(false);

        jLabelEventoNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventoNombre.setText("Nombre");

        jLabelEventoTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventoTipo.setText("Tipo");

        jLabelEventoRecinto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventoRecinto.setText("Recinto");

        jLabelEventoFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventoFecha.setText("Fecha");

        jTextFieldEventoTipo.setEnabled(false);

        jTextFieldEventoRecinto.setEnabled(false);

        jButtonEventoTipo.setText("Cambiar");
        jButtonEventoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventoTipoActionPerformed(evt);
            }
        });

        jButtonEventoRecinto.setText("Cambiar");
        jButtonEventoRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventoRecintoActionPerformed(evt);
            }
        });

        dateChooserComboFecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(222, 222, 222),
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
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserComboFecha.setAutoScroll(false);
    dateChooserComboFecha.setCalendarPreferredSize(new java.awt.Dimension(380, 260));
    dateChooserComboFecha.setNothingAllowed(false);
    dateChooserComboFecha.setFormat(0);
    dateChooserComboFecha.setLocale(new java.util.Locale("es", "CL", ""));

    jLabelEventoHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelEventoHora.setText("Hora");

    jSpinnerHora.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));

    jSpinnerMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

    jLabelEventoHoraSeparador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelEventoHoraSeparador.setText(":");

    jButtonEventoAccion.setText("Nuevo");
    jButtonEventoAccion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEventoAccionActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelContenidoEventoNuevoLayout = new javax.swing.GroupLayout(jPanelContenidoEventoNuevo);
    jPanelContenidoEventoNuevo.setLayout(jPanelContenidoEventoNuevoLayout);
    jPanelContenidoEventoNuevoLayout.setHorizontalGroup(
        jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelContenidoEventoNuevoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabelEventoRecinto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEventoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEventoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEventoFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEventoHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoEventoNuevoLayout.createSequentialGroup()
                    .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldEventoNombre)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoEventoNuevoLayout.createSequentialGroup()
                            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldEventoRecinto, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(jTextFieldEventoTipo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonEventoTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonEventoRecinto, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(dateChooserComboFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanelContenidoEventoNuevoLayout.createSequentialGroup()
                    .addComponent(jSpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelEventoHoraSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSpinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                    .addComponent(jButtonEventoAccion)))
            .addContainerGap())
    );
    jPanelContenidoEventoNuevoLayout.setVerticalGroup(
        jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelContenidoEventoNuevoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEventoNombre)
                .addComponent(jTextFieldEventoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(8, 8, 8)
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEventoTipo)
                .addComponent(jTextFieldEventoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonEventoTipo))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEventoRecinto)
                .addComponent(jTextFieldEventoRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonEventoRecinto))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabelEventoFecha)
                .addComponent(dateChooserComboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanelContenidoEventoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelEventoHora)
                .addComponent(jSpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEventoHoraSeparador)
                .addComponent(jSpinnerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonEventoAccion))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelContenidoEventoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelContenidoEventoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEventoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventoTipoActionPerformed
        try {
            jDialogTipoEvento.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonEventoTipoActionPerformed

    private void jButtonEventoAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventoAccionActionPerformed

        try{
            this.evento.setNombre(jTextFieldEventoNombre.getText());
            this.evento.setFecha(this.dateChooserComboFecha.getSelectedDate().getTime());
            this.evento.getFecha().set(Calendar.HOUR_OF_DAY, (int)jSpinnerHora.getValue());
            this.evento.getFecha().set(Calendar.MINUTE, (int)jSpinnerMinutos.getValue());
            this.evento.getFecha().set(Calendar.SECOND, 0);
            
            //Si es nuevo Evento
            if (this.evento.getCodigo() < 0) {
                new DAO.ImplEventoDAO().AgregarNuevoEvento(evento);
                JOptionPane.showMessageDialog(this,
                    "Evento agregado exitosamente",
                    "Agregado",
                    JOptionPane.PLAIN_MESSAGE);
            }else{
            //Si es evento existente
                new DAO.ImplEventoDAO().ModificarEvento(evento);
                JOptionPane.showMessageDialog(this,
                    "Evento modificado exitosamente",
                    "Modificado",
                    JOptionPane.PLAIN_MESSAGE);
                ((GUI.Organizador.MainFrame)this.getParent()).refrescarEventos();
            }
            
            ((GUI.Organizador.MainFrame)this.getParent()).refrescarEventos();
            this.dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                "Ha ocurrido un error: \n" +  e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEventoAccionActionPerformed

    private void jButtonTipoEventoListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoEventoListoActionPerformed
        this.jTextFieldEventoTipo.setText(jListTiposEventos.getSelectedValue());
        this.evento.setTipo(tipoEventos.get(jListTiposEventos.getSelectedIndex()));
        this.jDialogTipoEvento.setVisible(false);
    }//GEN-LAST:event_jButtonTipoEventoListoActionPerformed

    private void jButtonListoRecintosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoRecintosActionPerformed
        this.jTextFieldEventoRecinto.setText(
                jTableRecintos.getValueAt(jTableRecintos.getSelectedRow(), 1).toString()
        );
        this.evento.setRecinto(recintos.get(jTableRecintos.getSelectedRow()));
        this.jDialogRecintos.setVisible(false);
    }//GEN-LAST:event_jButtonListoRecintosActionPerformed

    private void jButtonEventoRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventoRecintoActionPerformed
        try{
            jDialogRecintos.setVisible(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButtonEventoRecintoActionPerformed

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
            java.util.logging.Logger.getLogger(EventoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EventoFrame dialog = new EventoFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboFecha;
    private javax.swing.JButton jButtonBuscarRecinto;
    private javax.swing.JButton jButtonBuscarTipoEvento;
    private javax.swing.JButton jButtonEventoAccion;
    private javax.swing.JButton jButtonEventoRecinto;
    private javax.swing.JButton jButtonEventoTipo;
    private javax.swing.JButton jButtonListoRecintos;
    private javax.swing.JButton jButtonTipoEventoListo;
    private javax.swing.JDialog jDialogRecintos;
    private javax.swing.JDialog jDialogTipoEvento;
    private javax.swing.JLabel jLabelEventoFecha;
    private javax.swing.JLabel jLabelEventoHora;
    private javax.swing.JLabel jLabelEventoHoraSeparador;
    private javax.swing.JLabel jLabelEventoNombre;
    private javax.swing.JLabel jLabelEventoRecinto;
    private javax.swing.JLabel jLabelEventoTipo;
    private javax.swing.JList<String> jListTiposEventos;
    private javax.swing.JPanel jPanelContenidoEventoNuevo;
    private javax.swing.JPanel jPanelContenidoReicnto;
    private javax.swing.JPanel jPanelContenidoTipoEvento;
    private javax.swing.JScrollPane jScrollPaneRecinto;
    private javax.swing.JScrollPane jScrollPaneTiposEventos;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparatorRecinto;
    private javax.swing.JSpinner jSpinnerHora;
    private javax.swing.JSpinner jSpinnerMinutos;
    private javax.swing.JTable jTableRecintos;
    private javax.swing.JTextField jTextFieldBuscarRecinto;
    private javax.swing.JTextField jTextFieldBuscarTipoEvento;
    private javax.swing.JTextField jTextFieldEventoNombre;
    private javax.swing.JTextField jTextFieldEventoRecinto;
    private javax.swing.JTextField jTextFieldEventoTipo;
    // End of variables declaration//GEN-END:variables

}
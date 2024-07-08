package Vista;

import Controlador.ControladorPrincipal;

public class frmPrincipal extends javax.swing.JFrame {

    private final ControladorPrincipal C;

    public frmPrincipal() {
        initComponents();
        C = new ControladorPrincipal(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();
        modulos = new javax.swing.JMenuBar();
        menuClinica = new javax.swing.JMenu();
        itemInicio = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();
        menuAtencion = new javax.swing.JMenu();
        itemNuevaCita = new javax.swing.JMenuItem();
        mantAtencion = new javax.swing.JMenuItem();
        menuPaciente = new javax.swing.JMenu();
        itemNuevoPaciente = new javax.swing.JMenuItem();
        mantPacientes = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenu();
        itemNuevoMedico = new javax.swing.JMenuItem();
        mantMedicos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuEspecialidad = new javax.swing.JMenuItem();
        mantEspecialidades = new javax.swing.JMenuItem();
        menuHistoria = new javax.swing.JMenu();
        itemHistoriaAtenciones = new javax.swing.JMenuItem();
        itemHistoriaPaciente = new javax.swing.JMenuItem();
        itemHistoriaMedico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(1144, 646));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.CardLayout());
        scroll.setViewportView(contenedor);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        modulos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        menuClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/hospital.png"))); // NOI18N
        menuClinica.setText("Clinica");

        itemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inicio.png"))); // NOI18N
        itemInicio.setText("Inicio");
        menuClinica.add(itemInicio);

        itemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir.png"))); // NOI18N
        itemCerrarSesion.setText("Cerrar sesion");
        menuClinica.add(itemCerrarSesion);

        modulos.add(menuClinica);

        menuAtencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/atencion.png"))); // NOI18N
        menuAtencion.setText("Atencion");
        menuAtencion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemNuevaCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        itemNuevaCita.setText("Nueva Cita");
        menuAtencion.add(itemNuevaCita);

        mantAtencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantAtencion.setText("Mantenimiento");
        menuAtencion.add(mantAtencion);

        modulos.add(menuAtencion);

        menuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/paciente.png"))); // NOI18N
        menuPaciente.setText("Pacientes");
        menuPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        itemNuevoPaciente.setText("Nuevo Paciente");
        menuPaciente.add(itemNuevoPaciente);

        mantPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantPacientes.setText("Mantenimiento");
        menuPaciente.add(mantPacientes);

        modulos.add(menuPaciente);

        menuDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/medico.png"))); // NOI18N
        menuDoctor.setText("Medicos");
        menuDoctor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemNuevoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        itemNuevoMedico.setText("Nuevo Medico");
        menuDoctor.add(itemNuevoMedico);

        mantMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantMedicos.setText("Mantenimiento");
        menuDoctor.add(mantMedicos);

        modulos.add(menuDoctor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/especialidades.png"))); // NOI18N
        jMenu1.setText("Especialidades");

        menuEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        menuEspecialidad.setText("Nueva Especialidad");
        jMenu1.add(menuEspecialidad);

        mantEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantEspecialidades.setText("Mantenimiento");
        jMenu1.add(mantEspecialidades);

        modulos.add(jMenu1);

        menuHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/historia.png"))); // NOI18N
        menuHistoria.setText("Historia");
        menuHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemHistoriaAtenciones.setText("Atenciones");
        menuHistoria.add(itemHistoriaAtenciones);

        itemHistoriaPaciente.setText("Paciente");
        menuHistoria.add(itemHistoriaPaciente);

        itemHistoriaMedico.setText("Medico");
        menuHistoria.add(itemHistoriaMedico);

        modulos.add(menuHistoria);

        setJMenuBar(modulos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        C.confirmarCierre();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="Registro el LookAndFeld FlatLaf">
        com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("MODELO");
        com.formdev.flatlaf.FlatDarculaLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel contenedor;
    public javax.swing.JMenuItem itemCerrarSesion;
    public javax.swing.JMenuItem itemHistoriaAtenciones;
    public javax.swing.JMenuItem itemHistoriaMedico;
    public javax.swing.JMenuItem itemHistoriaPaciente;
    public javax.swing.JMenuItem itemInicio;
    public javax.swing.JMenuItem itemNuevaCita;
    public javax.swing.JMenuItem itemNuevoMedico;
    public javax.swing.JMenuItem itemNuevoPaciente;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuItem mantAtencion;
    public javax.swing.JMenuItem mantEspecialidades;
    public javax.swing.JMenuItem mantMedicos;
    public javax.swing.JMenuItem mantPacientes;
    public javax.swing.JMenu menuAtencion;
    public javax.swing.JMenu menuClinica;
    public javax.swing.JMenu menuDoctor;
    public javax.swing.JMenuItem menuEspecialidad;
    public javax.swing.JMenu menuHistoria;
    public javax.swing.JMenu menuPaciente;
    public javax.swing.JMenuBar modulos;
    public javax.swing.JPanel panel;
    public javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}

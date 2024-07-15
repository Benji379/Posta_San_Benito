package Vista;

import Controlador.ControladorPrincipal;

public class FrmPrincipal extends javax.swing.JFrame {

    private final ControladorPrincipal C;
    
    public FrmPrincipal() {
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
        itemNuevaAtencion = new javax.swing.JMenuItem();
        mantAtencion = new javax.swing.JMenuItem();
        menuPaciente = new javax.swing.JMenu();
        itemNuevoPaciente = new javax.swing.JMenuItem();
        mantPacientes = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        nuevoTrabajador = new javax.swing.JMenuItem();
        mantTrabajador = new javax.swing.JMenuItem();
        menuEspecialidades = new javax.swing.JMenu();
        itemNuevaEspecialidad = new javax.swing.JMenuItem();
        mantEspecialidades = new javax.swing.JMenuItem();
        menuHistoria = new javax.swing.JMenu();
        itemDescargarHistoria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(1144, 646));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        //new Componentes.ScrollBarWin11UI().new ScrollPaneWin11()

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
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        modulos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        menuClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/hospital.png"))); // NOI18N
        menuClinica.setText("Clinica");

        itemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inicio.png"))); // NOI18N
        itemInicio.setText("Inicio");
        menuClinica.add(itemInicio);

        itemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir.png"))); // NOI18N
        itemCerrarSesion.setText("Cerrar sesion");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        menuClinica.add(itemCerrarSesion);

        modulos.add(menuClinica);

        menuAtencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/atencion.png"))); // NOI18N
        menuAtencion.setText("Atencion");
        menuAtencion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemNuevaAtencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        itemNuevaAtencion.setText("Nueva");
        menuAtencion.add(itemNuevaAtencion);

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

        menuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/trabajadores.png"))); // NOI18N
        menuEmpleados.setText("Trabajadores");
        menuEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nuevoTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        nuevoTrabajador.setText("Nuevo");
        menuEmpleados.add(nuevoTrabajador);

        mantTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantTrabajador.setText("Mantenimiento");
        menuEmpleados.add(mantTrabajador);

        modulos.add(menuEmpleados);

        menuEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/especialidades.png"))); // NOI18N
        menuEspecialidades.setText("Especialidades");

        itemNuevaEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        itemNuevaEspecialidad.setText("Nueva Especialidad");
        menuEspecialidades.add(itemNuevaEspecialidad);

        mantEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        mantEspecialidades.setText("Mantenimiento");
        menuEspecialidades.add(mantEspecialidades);

        modulos.add(menuEspecialidades);

        menuHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/historia.png"))); // NOI18N
        menuHistoria.setText("Historia");
        menuHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemDescargarHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/descargar.png"))); // NOI18N
        itemDescargarHistoria.setText("Descargar Historia Clinica");
        menuHistoria.add(itemDescargarHistoria);

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

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        C.cerrarSesion();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel contenedor;
    public javax.swing.JMenuItem itemCerrarSesion;
    public javax.swing.JMenuItem itemDescargarHistoria;
    public javax.swing.JMenuItem itemInicio;
    public javax.swing.JMenuItem itemNuevaAtencion;
    public javax.swing.JMenuItem itemNuevaEspecialidad;
    public javax.swing.JMenuItem itemNuevoPaciente;
    public javax.swing.JMenuItem mantAtencion;
    public javax.swing.JMenuItem mantEspecialidades;
    public javax.swing.JMenuItem mantPacientes;
    public javax.swing.JMenuItem mantTrabajador;
    public javax.swing.JMenu menuAtencion;
    public javax.swing.JMenu menuClinica;
    public javax.swing.JMenu menuEmpleados;
    public javax.swing.JMenu menuEspecialidades;
    public javax.swing.JMenu menuHistoria;
    public javax.swing.JMenu menuPaciente;
    public javax.swing.JMenuBar modulos;
    public javax.swing.JMenuItem nuevoTrabajador;
    public javax.swing.JPanel panel;
    public javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}

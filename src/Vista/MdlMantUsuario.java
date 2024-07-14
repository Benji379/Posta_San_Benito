package Vista;

import Controlador.ControladorMantUsuarios;
import static Procesos.Proceso.limitacionNumeros;

public class MdlMantUsuario extends javax.swing.JPanel {
    
    ControladorMantUsuarios C;
    
    public MdlMantUsuario() {
        initComponents();
        C = new ControladorMantUsuarios(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        jlbTittle = new javax.swing.JLabel();
        panelTabla = new Componentes.PanelCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jlbTittleTabla = new javax.swing.JLabel();
        panelDatos = new Componentes.PanelCustom();
        pDni = new javax.swing.JPanel();
        jlbDni = new javax.swing.JLabel();
        txtDni = new Componentes.TextFieldSuggestion();
        pNombres = new javax.swing.JPanel();
        jlbNombres = new javax.swing.JLabel();
        txtNombres = new Componentes.TextFieldSuggestion();
        pApellidoPaterno = new javax.swing.JPanel();
        jlbApellidoPaterno = new javax.swing.JLabel();
        txtApellidos = new Componentes.TextFieldSuggestion();
        pCargo = new javax.swing.JPanel();
        jlbCargo = new javax.swing.JLabel();
        comboCargo = new Componentes.ComboBoxSuggestion();
        pUsuario = new javax.swing.JPanel();
        jlbUsuario = new javax.swing.JLabel();
        txtUsuario = new Componentes.TextFieldSuggestion();
        pPassword = new javax.swing.JPanel();
        jlbPassword = new javax.swing.JLabel();
        txtPassword = new Componentes.TextFieldSuggestion();
        pEspecialidad = new javax.swing.JPanel();
        jlbApellidoMaterno = new javax.swing.JLabel();
        comboEspecialidad = new Componentes.ComboBoxSuggestion();
        pFecha = new javax.swing.JPanel();
        jlbFecha = new javax.swing.JLabel();
        txtFecha = new Componentes.TextFieldSuggestion();
        pBotones = new javax.swing.JPanel();
        btnEliminar = new Componentes.Button();
        btnLimpiar = new Componentes.Button();
        btnEditar = new Componentes.Button();
        btnFiltrar = new Componentes.Button();

        dateChooser.setTextField(txtFecha);
        dateChooser.setDateFormat(new java.text.SimpleDateFormat("dd/MM/yyyy"));

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 0, 45)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Mantenimiento de Usuarios");

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "ID", "DNI", "Nombres", "Apellidos", "Cargo", "Especialidad", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(173, 221, 219));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jlbTittleTabla.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbTittleTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittleTabla.setText("Lista de Usuarios");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTittleTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbTittleTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        pDni.setBackground(new java.awt.Color(255, 255, 255));

        jlbDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbDni.setText("DNI");

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDniLayout = new javax.swing.GroupLayout(pDni);
        pDni.setLayout(pDniLayout);
        pDniLayout.setHorizontalGroup(
            pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDniLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jlbDni, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pDniLayout.setVerticalGroup(
            pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDni, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelDatos.add(pDni);

        pNombres.setBackground(new java.awt.Color(255, 255, 255));
        pNombres.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbNombres.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pNombresLayout = new javax.swing.GroupLayout(pNombres);
        pNombres.setLayout(pNombresLayout);
        pNombresLayout.setHorizontalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pNombresLayout.setVerticalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelDatos.add(pNombres);

        pApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));

        jlbApellidoPaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbApellidoPaterno.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pApellidoPaternoLayout = new javax.swing.GroupLayout(pApellidoPaterno);
        pApellidoPaterno.setLayout(pApellidoPaternoLayout);
        pApellidoPaternoLayout.setHorizontalGroup(
            pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoPaternoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pApellidoPaternoLayout.setVerticalGroup(
            pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoPaternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelDatos.add(pApellidoPaterno);

        pCargo.setBackground(new java.awt.Color(255, 255, 255));
        pCargo.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbCargo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbCargo.setText("Cargo");

        comboCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "MEDICO", "COORDINADOR" }));
        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCargoLayout = new javax.swing.GroupLayout(pCargo);
        pCargo.setLayout(pCargoLayout);
        pCargoLayout.setHorizontalGroup(
            pCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCargoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jlbCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pCargoLayout.setVerticalGroup(
            pCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelDatos.add(pCargo);

        pUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pUsuario.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbUsuario.setText("Codigo");

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pUsuarioLayout = new javax.swing.GroupLayout(pUsuario);
        pUsuario.setLayout(pUsuarioLayout);
        pUsuarioLayout.setHorizontalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jlbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pUsuarioLayout.setVerticalGroup(
            pUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelDatos.add(pUsuario);

        pPassword.setBackground(new java.awt.Color(255, 255, 255));
        pPassword.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDatos.add(pPassword);

        pEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        pEspecialidad.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbApellidoMaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbApellidoMaterno.setText("Especialidad");

        comboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEspecialidadLayout = new javax.swing.GroupLayout(pEspecialidad);
        pEspecialidad.setLayout(pEspecialidadLayout);
        pEspecialidadLayout.setHorizontalGroup(
            pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspecialidadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jlbApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pEspecialidadLayout.setVerticalGroup(
            pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEspecialidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.add(pEspecialidad);

        pFecha.setBackground(new java.awt.Color(255, 255, 255));
        pFecha.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbFecha.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pFechaLayout = new javax.swing.GroupLayout(pFecha);
        pFecha.setLayout(pFechaLayout);
        pFechaLayout.setHorizontalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jlbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pFechaLayout.setVerticalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDatos.add(pFecha);

        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFiltrar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        limitacionNumeros(txtDni, evt, 8);
    }//GEN-LAST:event_txtDniKeyTyped

    private void comboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEspecialidadActionPerformed

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        C.carVisi();
    }//GEN-LAST:event_comboCargoActionPerformed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        C.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        C.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        C.editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        C.filtrar();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        C.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnEditar;
    public Componentes.Button btnEliminar;
    public Componentes.Button btnFiltrar;
    public Componentes.Button btnLimpiar;
    public Componentes.ComboBoxSuggestion comboCargo;
    public Componentes.ComboBoxSuggestion comboEspecialidad;
    public com.raven.datechooser.DateChooser dateChooser;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbApellidoMaterno;
    public javax.swing.JLabel jlbApellidoPaterno;
    public javax.swing.JLabel jlbCargo;
    public javax.swing.JLabel jlbDni;
    public javax.swing.JLabel jlbFecha;
    public javax.swing.JLabel jlbNombres;
    public javax.swing.JLabel jlbPassword;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JLabel jlbTittleTabla;
    public javax.swing.JLabel jlbUsuario;
    public javax.swing.JPanel pApellidoPaterno;
    public javax.swing.JPanel pBotones;
    public javax.swing.JPanel pCargo;
    public javax.swing.JPanel pDni;
    public javax.swing.JPanel pEspecialidad;
    public javax.swing.JPanel pFecha;
    public javax.swing.JPanel pNombres;
    public javax.swing.JPanel pPassword;
    public javax.swing.JPanel pUsuario;
    public Componentes.PanelCustom panelDatos;
    public Componentes.PanelCustom panelTabla;
    public javax.swing.JTable tabla;
    public Componentes.TextFieldSuggestion txtApellidos;
    public Componentes.TextFieldSuggestion txtDni;
    public Componentes.TextFieldSuggestion txtFecha;
    public Componentes.TextFieldSuggestion txtNombres;
    public Componentes.TextFieldSuggestion txtPassword;
    public Componentes.TextFieldSuggestion txtUsuario;
    // End of variables declaration//GEN-END:variables
}

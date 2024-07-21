package Vista;

import Controlador.ControladorMantPaciente;

public class MdlMantPaciente extends javax.swing.JPanel {
    
    private final ControladorMantPaciente C;
    
    public MdlMantPaciente() {
        initComponents();
        C = new ControladorMantPaciente(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTittle = new javax.swing.JLabel();
        panelTabla1 = new Componentes.PanelCustom();
        pOcupacion = new javax.swing.JPanel();
        jlbOcupacion = new javax.swing.JLabel();
        txtOcupacion = new Componentes.TextFieldSuggestion();
        pEscolaridad = new javax.swing.JPanel();
        jlbEscolaridad = new javax.swing.JLabel();
        comboEscolaridad = new Componentes.ComboBoxSuggestion();
        pEstadoCivil = new javax.swing.JPanel();
        jlbEstadoCivil = new javax.swing.JLabel();
        comboEstadoCivil = new Componentes.ComboBoxSuggestion();
        pNumHijos = new javax.swing.JPanel();
        jlbHijos = new javax.swing.JLabel();
        txtCantHijos = new javax.swing.JSpinner();
        pResidencia = new javax.swing.JPanel();
        jlbResidencia = new javax.swing.JLabel();
        txtResidencia = new Componentes.TextFieldSuggestion();
        pResidencia1 = new javax.swing.JPanel();
        btnLimpiar = new Componentes.Button();
        pResidencia2 = new javax.swing.JPanel();
        btnEditar = new Componentes.Button();
        pResidencia3 = new javax.swing.JPanel();
        btnEliminar = new Componentes.Button();
        pResidencia4 = new javax.swing.JPanel();
        btnBuscar = new Componentes.Button();
        pEstadoCivil1 = new javax.swing.JPanel();
        jlbOrdenarPor = new javax.swing.JLabel();
        comboOrdenar = new Componentes.ComboBoxSuggestion();
        panelTabla = new Componentes.PanelCustom();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jlbTittleTabla = new javax.swing.JLabel();

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 0, 45)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Matenimiento Paciente");

        panelTabla1.setBackground(new java.awt.Color(255, 255, 255));
        panelTabla1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        pOcupacion.setBackground(new java.awt.Color(255, 255, 255));
        pOcupacion.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbOcupacion.setText("Ocupacion");

        txtOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pOcupacionLayout = new javax.swing.GroupLayout(pOcupacion);
        pOcupacion.setLayout(pOcupacionLayout);
        pOcupacionLayout.setHorizontalGroup(
            pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOcupacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pOcupacionLayout.setVerticalGroup(
            pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOcupacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pOcupacion);

        pEscolaridad.setBackground(new java.awt.Color(255, 255, 255));
        pEscolaridad.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbEscolaridad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEscolaridad.setText("Escolaridad");

        comboEscolaridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INICIAL", "PRIMARIA", "SECUNDARIA", "TECNICO", "SUPERIOR" }));

        javax.swing.GroupLayout pEscolaridadLayout = new javax.swing.GroupLayout(pEscolaridad);
        pEscolaridad.setLayout(pEscolaridadLayout);
        pEscolaridadLayout.setHorizontalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEscolaridadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEscolaridadLayout.setVerticalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEscolaridadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pEscolaridad);

        pEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        pEstadoCivil.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbEstadoCivil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEstadoCivil.setText("Estado Civil");

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO" }));

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pEstadoCivil);

        pNumHijos.setBackground(new java.awt.Color(255, 255, 255));
        pNumHijos.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbHijos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbHijos.setText("# Hijos");

        txtCantHijos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        javax.swing.GroupLayout pNumHijosLayout = new javax.swing.GroupLayout(pNumHijos);
        pNumHijos.setLayout(pNumHijosLayout);
        pNumHijosLayout.setHorizontalGroup(
            pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumHijosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbHijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pNumHijosLayout.setVerticalGroup(
            pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        panelTabla1.add(pNumHijos);

        pResidencia.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbResidencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbResidencia.setText("Residencia");

        txtResidencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pResidenciaLayout = new javax.swing.GroupLayout(pResidencia);
        pResidencia.setLayout(pResidenciaLayout);
        pResidenciaLayout.setHorizontalGroup(
            pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidenciaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pResidenciaLayout.setVerticalGroup(
            pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pResidencia);

        pResidencia1.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia1.setPreferredSize(new java.awt.Dimension(180, 100));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pResidencia1Layout = new javax.swing.GroupLayout(pResidencia1);
        pResidencia1.setLayout(pResidencia1Layout);
        pResidencia1Layout.setHorizontalGroup(
            pResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pResidencia1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pResidencia1Layout.setVerticalGroup(
            pResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidencia1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTabla1.add(pResidencia1);

        pResidencia2.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia2.setPreferredSize(new java.awt.Dimension(180, 100));

        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pResidencia2Layout = new javax.swing.GroupLayout(pResidencia2);
        pResidencia2.setLayout(pResidencia2Layout);
        pResidencia2Layout.setHorizontalGroup(
            pResidencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pResidencia2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pResidencia2Layout.setVerticalGroup(
            pResidencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidencia2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTabla1.add(pResidencia2);

        pResidencia3.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia3.setPreferredSize(new java.awt.Dimension(180, 100));

        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pResidencia3Layout = new javax.swing.GroupLayout(pResidencia3);
        pResidencia3.setLayout(pResidencia3Layout);
        pResidencia3Layout.setHorizontalGroup(
            pResidencia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pResidencia3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pResidencia3Layout.setVerticalGroup(
            pResidencia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidencia3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTabla1.add(pResidencia3);

        pResidencia4.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia4.setPreferredSize(new java.awt.Dimension(180, 100));

        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pResidencia4Layout = new javax.swing.GroupLayout(pResidencia4);
        pResidencia4.setLayout(pResidencia4Layout);
        pResidencia4Layout.setHorizontalGroup(
            pResidencia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pResidencia4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pResidencia4Layout.setVerticalGroup(
            pResidencia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidencia4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTabla1.add(pResidencia4);

        pEstadoCivil1.setBackground(new java.awt.Color(255, 255, 255));
        pEstadoCivil1.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbOrdenarPor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbOrdenarPor.setText("Ordenar por");

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "DNI", "Nombres", "Apellido P", "Apellido M", "Sexo", "Procedencia", "Ocupacion", "Escolaridad", "Est Civil", "# Hijos", "G. Sanguíneo", "Rh", "Residencia", "Nacimiento", "Registro" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivil1Layout = new javax.swing.GroupLayout(pEstadoCivil1);
        pEstadoCivil1.setLayout(pEstadoCivil1Layout);
        pEstadoCivil1Layout.setHorizontalGroup(
            pEstadoCivil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivil1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEstadoCivil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbOrdenarPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivil1Layout.setVerticalGroup(
            pEstadoCivil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivil1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbOrdenarPor, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pEstadoCivil1);

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "DNI", "Nombres", "Apellido P", "Apellido M", "Sexo", "Procedencia", "Ocupacion", "Escolaridad", "Est Civil", "# Hijos", "G. Sanguíneo", "Rh", "Residencia", "Nacimiento", "Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(173, 221, 219));
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabla);

        jlbTittleTabla.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbTittleTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittleTabla.setText("Lista Pacientes");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTittleTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scroll)
                .addGap(20, 20, 20))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTittleTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        C.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        C.editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        C.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        C.buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        C.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        C.ordenarPor();
    }//GEN-LAST:event_comboOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnBuscar;
    public Componentes.Button btnEditar;
    public Componentes.Button btnEliminar;
    public Componentes.Button btnLimpiar;
    public Componentes.ComboBoxSuggestion comboEscolaridad;
    public Componentes.ComboBoxSuggestion comboEstadoCivil;
    public Componentes.ComboBoxSuggestion comboOrdenar;
    public javax.swing.JLabel jlbEscolaridad;
    public javax.swing.JLabel jlbEstadoCivil;
    public javax.swing.JLabel jlbHijos;
    public javax.swing.JLabel jlbOcupacion;
    public javax.swing.JLabel jlbOrdenarPor;
    public javax.swing.JLabel jlbResidencia;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JLabel jlbTittleTabla;
    public javax.swing.JPanel pEscolaridad;
    public javax.swing.JPanel pEstadoCivil;
    public javax.swing.JPanel pEstadoCivil1;
    public javax.swing.JPanel pNumHijos;
    public javax.swing.JPanel pOcupacion;
    public javax.swing.JPanel pResidencia;
    public javax.swing.JPanel pResidencia1;
    public javax.swing.JPanel pResidencia2;
    public javax.swing.JPanel pResidencia3;
    public javax.swing.JPanel pResidencia4;
    public Componentes.PanelCustom panelTabla;
    public Componentes.PanelCustom panelTabla1;
    public javax.swing.JScrollPane scroll;
    public javax.swing.JTable tabla;
    public javax.swing.JSpinner txtCantHijos;
    public Componentes.TextFieldSuggestion txtOcupacion;
    public Componentes.TextFieldSuggestion txtResidencia;
    // End of variables declaration//GEN-END:variables
}

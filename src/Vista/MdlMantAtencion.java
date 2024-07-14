package Vista;

import Controlador.ControladorMantAtencion;

public class MdlMantAtencion extends javax.swing.JPanel {

    ControladorMantAtencion C;

    public MdlMantAtencion() {
        initComponents();
        C = new ControladorMantAtencion(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        dateChooserInicio = new com.raven.datechooser.DateChooser();
        dateChooserFinal = new com.raven.datechooser.DateChooser();
        jlbTittle1 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlbTittle2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pInputMedico = new javax.swing.JPanel();
        jlbMedico = new javax.swing.JLabel();
        comboMedico = new Componentes.ComboBoxSuggestion();
        pFecha = new javax.swing.JPanel();
        jlbFecha = new javax.swing.JLabel();
        txtFecha = new Componentes.TextFieldSuggestion();
        btnFiltrarAtencionMedico = new Componentes.Button();
        btnFiltrarAtencionMedico1 = new Componentes.Button();
        jPanel3 = new javax.swing.JPanel();
        jlbTittle3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pInputMedico1 = new javax.swing.JPanel();
        jlbMedico1 = new javax.swing.JLabel();
        comboEspecialidades = new Componentes.ComboBoxSuggestion();
        pFecha1 = new javax.swing.JPanel();
        jlbFecha1 = new javax.swing.JLabel();
        txtFechaInicio = new Componentes.TextFieldSuggestion();
        pFecha2 = new javax.swing.JPanel();
        jlbFecha2 = new javax.swing.JLabel();
        txtFechaFinal = new Componentes.TextFieldSuggestion();
        btnFiltrarEspecialidad = new Componentes.Button();

        dateChooser.setTextField(txtFecha);
        dateChooser.setDateFormat(new java.text.SimpleDateFormat("dd/MM/yyyy"));

        dateChooserInicio.setTextField(txtFechaInicio);
        dateChooserInicio.setDateFormat(new java.text.SimpleDateFormat("dd/MM/yyyy"));

        dateChooserFinal.setTextField(txtFechaFinal);
        dateChooserFinal.setDateFormat(new java.text.SimpleDateFormat("dd/MM/yyyy"));

        jlbTittle1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jlbTittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle1.setText("MANTENIMIENTO ATENCION");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "ID", "Paciente", "Medico", "Especialidad", "Motivo", "Enfermedad", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        scrollPane.setViewportView(tabla);

        jlbTittle2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlbTittle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle2.setText("Atenciones de médico dirante un día");

        pInputMedico.setBackground(new java.awt.Color(255, 255, 255));

        jlbMedico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbMedico.setText("Medico");

        javax.swing.GroupLayout pInputMedicoLayout = new javax.swing.GroupLayout(pInputMedico);
        pInputMedico.setLayout(pInputMedicoLayout);
        pInputMedicoLayout.setHorizontalGroup(
            pInputMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMedicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pInputMedicoLayout.setVerticalGroup(
            pInputMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pInputMedico);

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

        jPanel2.add(pFecha);

        btnFiltrarAtencionMedico.setText("Filtrar");
        btnFiltrarAtencionMedico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFiltrarAtencionMedico.setPreferredSize(new java.awt.Dimension(120, 50));
        btnFiltrarAtencionMedico.setRippleColor(new java.awt.Color(153, 153, 153));
        btnFiltrarAtencionMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarAtencionMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrarAtencionMedico);

        btnFiltrarAtencionMedico1.setText("Limpiar");
        btnFiltrarAtencionMedico1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFiltrarAtencionMedico1.setPreferredSize(new java.awt.Dimension(120, 50));
        btnFiltrarAtencionMedico1.setRippleColor(new java.awt.Color(153, 153, 153));
        btnFiltrarAtencionMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarAtencionMedico1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrarAtencionMedico1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTittle2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbTittle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbTittle3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlbTittle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle3.setText("Atenciones por especialidad en un rango de fechas");

        pInputMedico1.setBackground(new java.awt.Color(255, 255, 255));

        jlbMedico1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbMedico1.setText("Especialidades");

        javax.swing.GroupLayout pInputMedico1Layout = new javax.swing.GroupLayout(pInputMedico1);
        pInputMedico1.setLayout(pInputMedico1Layout);
        pInputMedico1Layout.setHorizontalGroup(
            pInputMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMedico1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbMedico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pInputMedico1Layout.setVerticalGroup(
            pInputMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMedico1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMedico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(pInputMedico1);

        pFecha1.setBackground(new java.awt.Color(255, 255, 255));
        pFecha1.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbFecha1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbFecha1.setText("Fecha Inicio");

        txtFechaInicio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pFecha1Layout = new javax.swing.GroupLayout(pFecha1);
        pFecha1.setLayout(pFecha1Layout);
        pFecha1Layout.setHorizontalGroup(
            pFecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFecha1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pFecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jlbFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pFecha1Layout.setVerticalGroup(
            pFecha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFecha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(pFecha1);

        pFecha2.setBackground(new java.awt.Color(255, 255, 255));
        pFecha2.setPreferredSize(new java.awt.Dimension(197, 100));

        jlbFecha2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbFecha2.setText("Fecha Final");

        txtFechaFinal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pFecha2Layout = new javax.swing.GroupLayout(pFecha2);
        pFecha2.setLayout(pFecha2Layout);
        pFecha2Layout.setHorizontalGroup(
            pFecha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFecha2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pFecha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jlbFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pFecha2Layout.setVerticalGroup(
            pFecha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFecha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(pFecha2);

        btnFiltrarEspecialidad.setText("Filtrar");
        btnFiltrarEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFiltrarEspecialidad.setPreferredSize(new java.awt.Dimension(120, 50));
        btnFiltrarEspecialidad.setRippleColor(new java.awt.Color(153, 153, 153));
        btnFiltrarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEspecialidadActionPerformed(evt);
            }
        });
        jPanel4.add(btnFiltrarEspecialidad);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTittle3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTittle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTittle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTittle1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnFiltrarAtencionMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAtencionMedicoActionPerformed
        C.filtrarMedicos();
    }//GEN-LAST:event_btnFiltrarAtencionMedicoActionPerformed

    private void btnFiltrarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEspecialidadActionPerformed
        C.filtrarEspecialidades();
    }//GEN-LAST:event_btnFiltrarEspecialidadActionPerformed

    private void btnFiltrarAtencionMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAtencionMedico1ActionPerformed
        C.limpiar();
    }//GEN-LAST:event_btnFiltrarAtencionMedico1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnFiltrarAtencionMedico;
    public Componentes.Button btnFiltrarAtencionMedico1;
    public Componentes.Button btnFiltrarEspecialidad;
    public Componentes.ComboBoxSuggestion comboEspecialidades;
    public Componentes.ComboBoxSuggestion comboMedico;
    public com.raven.datechooser.DateChooser dateChooser;
    public com.raven.datechooser.DateChooser dateChooserFinal;
    public com.raven.datechooser.DateChooser dateChooserInicio;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JLabel jlbFecha;
    public javax.swing.JLabel jlbFecha1;
    public javax.swing.JLabel jlbFecha2;
    public javax.swing.JLabel jlbMedico;
    public javax.swing.JLabel jlbMedico1;
    public javax.swing.JLabel jlbTittle1;
    public javax.swing.JLabel jlbTittle2;
    public javax.swing.JLabel jlbTittle3;
    public javax.swing.JPanel pFecha;
    public javax.swing.JPanel pFecha1;
    public javax.swing.JPanel pFecha2;
    public javax.swing.JPanel pInputMedico;
    public javax.swing.JPanel pInputMedico1;
    public javax.swing.JScrollPane scrollPane;
    public javax.swing.JTable tabla;
    public Componentes.TextFieldSuggestion txtFecha;
    public Componentes.TextFieldSuggestion txtFechaFinal;
    public Componentes.TextFieldSuggestion txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}

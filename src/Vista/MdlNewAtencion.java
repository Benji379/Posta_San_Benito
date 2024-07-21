package Vista;

import Controlador.ControladorNewAtencion;

public class MdlNewAtencion extends javax.swing.JPanel {

    private final ControladorNewAtencion C;

    public MdlNewAtencion() {
        initComponents();
        C = new ControladorNewAtencion(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTittle = new javax.swing.JLabel();
        panelCustom1 = new Componentes.PanelCustom();
        pInputPaciente = new javax.swing.JPanel();
        jlbInputPaciente = new javax.swing.JLabel();
        comboPaciente = new Componentes.ComboBoxSuggestion();
        pInputEspecialidad = new javax.swing.JPanel();
        jlbEspecialidad = new javax.swing.JLabel();
        comboEspecialidad = new Componentes.ComboBoxSuggestion();
        pInputMedico = new javax.swing.JPanel();
        jlbMedico = new javax.swing.JLabel();
        comboMedico = new Componentes.ComboBoxSuggestion();
        pInputMotivoConsulta = new javax.swing.JPanel();
        jlbMotivoConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMotivoConsulta = new javax.swing.JTextArea();
        pInputEnfermedadActual = new javax.swing.JPanel();
        jlbEnfermedadActual = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEnfermedadActual = new javax.swing.JTextArea();
        pBoleta = new Componentes.PanelCustom();
        jlbSubTittle = new javax.swing.JLabel();
        pCodConsulta = new javax.swing.JPanel();
        jlbConsulta = new javax.swing.JLabel();
        txtCodConsulta = new javax.swing.JLabel();
        pPaciente = new javax.swing.JPanel();
        jlbPaciente = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JLabel();
        pPrecio = new javax.swing.JPanel();
        jlbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        pFecha = new javax.swing.JPanel();
        jlbFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnRegistrar = new Componentes.Button();
        btnEditar = new Componentes.Button();

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Atencion - 00000000");

        panelCustom1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        pInputPaciente.setBackground(new java.awt.Color(255, 255, 255));

        jlbInputPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbInputPaciente.setText("Paciente");

        javax.swing.GroupLayout pInputPacienteLayout = new javax.swing.GroupLayout(pInputPaciente);
        pInputPaciente.setLayout(pInputPacienteLayout);
        pInputPacienteLayout.setHorizontalGroup(
            pInputPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbInputPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pInputPacienteLayout.setVerticalGroup(
            pInputPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbInputPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCustom1.add(pInputPaciente);

        pInputEspecialidad.setBackground(new java.awt.Color(255, 255, 255));

        jlbEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEspecialidad.setText("Especialidad");

        javax.swing.GroupLayout pInputEspecialidadLayout = new javax.swing.GroupLayout(pInputEspecialidad);
        pInputEspecialidad.setLayout(pInputEspecialidadLayout);
        pInputEspecialidadLayout.setHorizontalGroup(
            pInputEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputEspecialidadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pInputEspecialidadLayout.setVerticalGroup(
            pInputEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputEspecialidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCustom1.add(pInputEspecialidad);

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

        panelCustom1.add(pInputMedico);

        pInputMotivoConsulta.setBackground(new java.awt.Color(255, 255, 255));
        pInputMotivoConsulta.setPreferredSize(new java.awt.Dimension(250, 200));

        jlbMotivoConsulta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbMotivoConsulta.setText("Motivo consulta");

        txtAreaMotivoConsulta.setColumns(20);
        txtAreaMotivoConsulta.setLineWrap(true);
        txtAreaMotivoConsulta.setRows(5);
        jScrollPane1.setViewportView(txtAreaMotivoConsulta);

        javax.swing.GroupLayout pInputMotivoConsultaLayout = new javax.swing.GroupLayout(pInputMotivoConsulta);
        pInputMotivoConsulta.setLayout(pInputMotivoConsultaLayout);
        pInputMotivoConsultaLayout.setHorizontalGroup(
            pInputMotivoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMotivoConsultaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputMotivoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlbMotivoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pInputMotivoConsultaLayout.setVerticalGroup(
            pInputMotivoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputMotivoConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelCustom1.add(pInputMotivoConsulta);

        pInputEnfermedadActual.setBackground(new java.awt.Color(255, 255, 255));
        pInputEnfermedadActual.setPreferredSize(new java.awt.Dimension(250, 200));

        jlbEnfermedadActual.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEnfermedadActual.setText("Enfermedad actual");

        txtAreaEnfermedadActual.setColumns(20);
        txtAreaEnfermedadActual.setLineWrap(true);
        txtAreaEnfermedadActual.setRows(5);
        jScrollPane2.setViewportView(txtAreaEnfermedadActual);

        javax.swing.GroupLayout pInputEnfermedadActualLayout = new javax.swing.GroupLayout(pInputEnfermedadActual);
        pInputEnfermedadActual.setLayout(pInputEnfermedadActualLayout);
        pInputEnfermedadActualLayout.setHorizontalGroup(
            pInputEnfermedadActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputEnfermedadActualLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pInputEnfermedadActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlbEnfermedadActual, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pInputEnfermedadActualLayout.setVerticalGroup(
            pInputEnfermedadActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputEnfermedadActualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEnfermedadActual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelCustom1.add(pInputEnfermedadActual);

        pBoleta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jlbSubTittle.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlbSubTittle.setText("Posta San Benito");
        pBoleta.add(jlbSubTittle);

        pCodConsulta.setPreferredSize(new java.awt.Dimension(277, 40));

        jlbConsulta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbConsulta.setText("Consulta:");

        txtCodConsulta.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCodConsulta.setText("N° 00000000");

        javax.swing.GroupLayout pCodConsultaLayout = new javax.swing.GroupLayout(pCodConsulta);
        pCodConsulta.setLayout(pCodConsultaLayout);
        pCodConsultaLayout.setHorizontalGroup(
            pCodConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCodConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCodConsultaLayout.setVerticalGroup(
            pCodConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCodConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCodConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pBoleta.add(pCodConsulta);

        pPaciente.setPreferredSize(new java.awt.Dimension(277, 40));

        jlbPaciente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPaciente.setText("Paciente:");

        txtPaciente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPaciente.setText("00000000");

        javax.swing.GroupLayout pPacienteLayout = new javax.swing.GroupLayout(pPaciente);
        pPaciente.setLayout(pPacienteLayout);
        pPacienteLayout.setHorizontalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPacienteLayout.setVerticalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pBoleta.add(pPaciente);

        pPrecio.setPreferredSize(new java.awt.Dimension(277, 40));

        jlbPrecio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPrecio.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPrecio.setText("S/000.0");

        javax.swing.GroupLayout pPrecioLayout = new javax.swing.GroupLayout(pPrecio);
        pPrecio.setLayout(pPrecioLayout);
        pPrecioLayout.setHorizontalGroup(
            pPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPrecioLayout.setVerticalGroup(
            pPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pBoleta.add(pPrecio);

        pFecha.setPreferredSize(new java.awt.Dimension(277, 40));

        jlbFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbFecha.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtFecha.setText("00/00/0000 00:00pm");

        javax.swing.GroupLayout pFechaLayout = new javax.swing.GroupLayout(pFecha);
        pFecha.setLayout(pFechaLayout);
        pFechaLayout.setHorizontalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pFechaLayout.setVerticalGroup(
            pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pBoleta.add(pFecha);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnRegistrar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pBoleta.add(btnRegistrar);

        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnEditar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pBoleta.add(btnEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlbTittle)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        C.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnEditar;
    public Componentes.Button btnRegistrar;
    public Componentes.ComboBoxSuggestion comboEspecialidad;
    public Componentes.ComboBoxSuggestion comboMedico;
    public Componentes.ComboBoxSuggestion comboPaciente;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jlbConsulta;
    public javax.swing.JLabel jlbEnfermedadActual;
    public javax.swing.JLabel jlbEspecialidad;
    public javax.swing.JLabel jlbFecha;
    public javax.swing.JLabel jlbInputPaciente;
    public javax.swing.JLabel jlbMedico;
    public javax.swing.JLabel jlbMotivoConsulta;
    public javax.swing.JLabel jlbPaciente;
    public javax.swing.JLabel jlbPrecio;
    public javax.swing.JLabel jlbSubTittle;
    public javax.swing.JLabel jlbTittle;
    public Componentes.PanelCustom pBoleta;
    public javax.swing.JPanel pCodConsulta;
    public javax.swing.JPanel pFecha;
    public javax.swing.JPanel pInputEnfermedadActual;
    public javax.swing.JPanel pInputEspecialidad;
    public javax.swing.JPanel pInputMedico;
    public javax.swing.JPanel pInputMotivoConsulta;
    public javax.swing.JPanel pInputPaciente;
    public javax.swing.JPanel pPaciente;
    public javax.swing.JPanel pPrecio;
    public Componentes.PanelCustom panelCustom1;
    public javax.swing.JTextArea txtAreaEnfermedadActual;
    public javax.swing.JTextArea txtAreaMotivoConsulta;
    public javax.swing.JLabel txtCodConsulta;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JLabel txtPaciente;
    public javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
//    public Modelo.Atencion getDatos() {
//        return C.recogerDatos();
//    }
}

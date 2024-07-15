package Vista;

import Controlador.ControladorHistoria;

public class MdlHistoria extends javax.swing.JPanel {

    private final ControladorHistoria C;

    public MdlHistoria() {
        initComponents();
        C = new ControladorHistoria(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pPaciente = new javax.swing.JPanel();
        jlbPaciente = new javax.swing.JLabel();
        comboPaciente = new Componentes.ComboBoxSuggestion();
        btnDescargar = new Componentes.Button();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HISTORIA CLINICA");

        pPaciente.setBackground(new java.awt.Color(255, 255, 255));
        pPaciente.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbPaciente.setText("DNI PACIENTE");

        javax.swing.GroupLayout pPacienteLayout = new javax.swing.GroupLayout(pPaciente);
        pPaciente.setLayout(pPacienteLayout);
        pPacienteLayout.setHorizontalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPacienteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(comboPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        pPacienteLayout.setVerticalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        btnDescargar.setText("Descargar");
        btnDescargar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(pPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        C.descargarHistoriaPdf();
    }//GEN-LAST:event_btnDescargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnDescargar;
    public Componentes.ComboBoxSuggestion comboPaciente;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jlbPaciente;
    public javax.swing.JPanel pPaciente;
    // End of variables declaration//GEN-END:variables
}

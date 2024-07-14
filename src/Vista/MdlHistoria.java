package Vista;

public class MdlHistoria extends javax.swing.JPanel {

    public MdlHistoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pEscolaridad = new javax.swing.JPanel();
        jlbEscolaridad = new javax.swing.JLabel();
        comboEscolaridad = new Componentes.ComboBoxSuggestion();
        btnEditar = new Componentes.Button();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HISTORIA CLINICA");

        pEscolaridad.setBackground(new java.awt.Color(255, 255, 255));
        pEscolaridad.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbEscolaridad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEscolaridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEscolaridad.setText("DNI PACIENTE");

        javax.swing.GroupLayout pEscolaridadLayout = new javax.swing.GroupLayout(pEscolaridad);
        pEscolaridad.setLayout(pEscolaridadLayout);
        pEscolaridadLayout.setHorizontalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEscolaridadLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(comboEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        pEscolaridadLayout.setVerticalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEscolaridadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        btnEditar.setText("Descargar");
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pEscolaridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(pEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Button btnEditar;
    private Componentes.ComboBoxSuggestion comboEscolaridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbEscolaridad;
    private javax.swing.JPanel pEscolaridad;
    // End of variables declaration//GEN-END:variables
}

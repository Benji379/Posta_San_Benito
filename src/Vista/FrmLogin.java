package Vista;

import Controlador.ControladorLogin;

public class FrmLogin extends javax.swing.JFrame {

    private final ControladorLogin C;
    
    public FrmLogin() {
        initComponents();
        C = new ControladorLogin(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new Componentes.Background();
        jlbTittle = new javax.swing.JLabel();
        btnIngresar = new Componentes.Button();
        jlbUsuario = new javax.swing.JLabel();
        txtUsuario = new Componentes.TextFieldSuggestion();
        jlbPassword = new javax.swing.JLabel();
        txtPassword = new Componentes.PasswordFieldSuggestion();
        labelOjito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Ricardo Palma - Login");
        setResizable(false);

        jlbTittle.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(51, 51, 51));
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("LOGIN");

        btnIngresar.setForeground(new java.awt.Color(51, 51, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnIngresar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jlbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jlbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbUsuario.setText("Usuario");

        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jlbPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbPassword.setText("Password");

        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        labelOjito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOjito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojoCerrado.png"))); // NOI18N
        labelOjito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelOjito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOjitoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jlbUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOjito)
                .addGap(10, 10, 10))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbTittle)
                .addGap(24, 24, 24)
                .addComponent(jlbUsuario)
                .addGap(10, 10, 10)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jlbPassword)
                .addGap(10, 10, 10)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelOjito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        C.ingresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void labelOjitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOjitoMouseClicked
        C.clickOjo();
    }//GEN-LAST:event_labelOjitoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnIngresar;
    public javax.swing.JLabel jlbPassword;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JLabel jlbUsuario;
    public javax.swing.JLabel labelOjito;
    public Componentes.Background panelFondo;
    public Componentes.PasswordFieldSuggestion txtPassword;
    public Componentes.TextFieldSuggestion txtUsuario;
    // End of variables declaration//GEN-END:variables
}

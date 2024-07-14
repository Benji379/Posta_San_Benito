package Vista;

import Controlador.ControladorNewEspecialidad;

public class MdlNewEspecialidad extends javax.swing.JPanel {

    private final ControladorNewEspecialidad C;    
    
    public MdlNewEspecialidad() {
        initComponents();
        C = new ControladorNewEspecialidad(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTittle = new javax.swing.JLabel();
        pEspecialidad = new javax.swing.JPanel();
        jlbEspecialidad = new javax.swing.JLabel();
        txtEspecialidad = new Componentes.TextFieldSuggestion();
        pCostoAtencion = new javax.swing.JPanel();
        jlbCostoXAtencion = new javax.swing.JLabel();
        txtCostoAtencion = new Componentes.TextFieldSuggestion();
        btnRegistrar = new Componentes.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("Nueva Especialidad");

        pEspecialidad.setBackground(new java.awt.Color(255, 255, 255));

        jlbEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEspecialidad.setText("Especialidad");

        txtEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pEspecialidadLayout = new javax.swing.GroupLayout(pEspecialidad);
        pEspecialidad.setLayout(pEspecialidadLayout);
        pEspecialidadLayout.setHorizontalGroup(
            pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspecialidadLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jlbEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pEspecialidadLayout.setVerticalGroup(
            pEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspecialidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pCostoAtencion.setBackground(new java.awt.Color(255, 255, 255));

        jlbCostoXAtencion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbCostoXAtencion.setText("Costo X atencion");

        txtCostoAtencion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pCostoAtencionLayout = new javax.swing.GroupLayout(pCostoAtencion);
        pCostoAtencion.setLayout(pCostoAtencionLayout);
        pCostoAtencionLayout.setHorizontalGroup(
            pCostoAtencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCostoAtencionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pCostoAtencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCostoAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCostoXAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pCostoAtencionLayout.setVerticalGroup(
            pCostoAtencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCostoAtencionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCostoXAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        btnRegistrar.setText("Registrar");
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setRippleColor(new java.awt.Color(153, 153, 153));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Nombre", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(173, 221, 219));
        jScrollPane1.setViewportView(tabla);
        tabla.getTableHeader().setReorderingAllowed(false);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(pCostoAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbTittle)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCostoAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        C.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnRegistrar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlbCostoXAtencion;
    public javax.swing.JLabel jlbEspecialidad;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JPanel pCostoAtencion;
    public javax.swing.JPanel pEspecialidad;
    public javax.swing.JTable tabla;
    public Componentes.TextFieldSuggestion txtCostoAtencion;
    public Componentes.TextFieldSuggestion txtEspecialidad;
    // End of variables declaration//GEN-END:variables
}

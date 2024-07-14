package Vista;

import Controlador.ControladorMantEspecialidad;
import Procesos.Proceso;

public class MdlMantEspecialidad extends javax.swing.JPanel {
    
    private final ControladorMantEspecialidad C;
    
    public MdlMantEspecialidad() {
        initComponents();
        C = new ControladorMantEspecialidad(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        scrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pBotones = new javax.swing.JPanel();
        btnEliminar = new Componentes.Button();
        btnLimpiar = new Componentes.Button();
        btnEditar = new Componentes.Button();
        btnFiltrar = new Componentes.Button();
        pInputs = new javax.swing.JPanel();
        pNombre = new javax.swing.JPanel();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new Componentes.TextFieldSuggestion();
        pCosto = new javax.swing.JPanel();
        jlbCosto = new javax.swing.JLabel();
        txtCosto = new Componentes.TextFieldSuggestion();
        pFecha = new javax.swing.JPanel();
        jlbFecha = new javax.swing.JLabel();
        txtFecha = new Componentes.TextFieldSuggestion();
        pEstado = new javax.swing.JPanel();
        jlbEstado = new javax.swing.JLabel();
        comboEstado = new Componentes.ComboBoxSuggestion();
        jlbTittle = new javax.swing.JLabel();

        dateChooser.setTextField(txtFecha);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Nombre", "Costo", "Estado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        scrollPane.setViewportView(tabla);
        tabla.getTableHeader().setReorderingAllowed(false);

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
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
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

        pNombre.setBackground(new java.awt.Color(255, 255, 255));

        jlbNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pNombreLayout = new javax.swing.GroupLayout(pNombre);
        pNombre.setLayout(pNombreLayout);
        pNombreLayout.setHorizontalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pNombreLayout.setVerticalGroup(
            pNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pCosto.setBackground(new java.awt.Color(255, 255, 255));

        jlbCosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbCosto.setText("Costo");

        txtCosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pCostoLayout = new javax.swing.GroupLayout(pCosto);
        pCosto.setLayout(pCostoLayout);
        pCostoLayout.setHorizontalGroup(
            pCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCostoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pCostoLayout.setVerticalGroup(
            pCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCostoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pFecha.setBackground(new java.awt.Color(255, 255, 255));

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
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
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

        pEstado.setBackground(new java.awt.Color(255, 255, 255));

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEstado.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DISPONIBLE", "INACTIVA" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pInputsLayout = new javax.swing.GroupLayout(pInputs);
        pInputs.setLayout(pInputsLayout);
        pInputsLayout.setHorizontalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pInputsLayout.setVerticalGroup(
            pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("MANTENIMIENTO ESPECIALIDADES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane)
                    .addComponent(jlbTittle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlbTittle)
                .addGap(20, 20, 20)
                .addComponent(pInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        Proceso.limitacionNumeros(txtCosto, evt, 5);
    }//GEN-LAST:event_txtCostoKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        C.clickTabla();
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnEditar;
    public Componentes.Button btnEliminar;
    public Componentes.Button btnFiltrar;
    public Componentes.Button btnLimpiar;
    public Componentes.ComboBoxSuggestion comboEstado;
    public com.raven.datechooser.DateChooser dateChooser;
    public javax.swing.JLabel jlbCosto;
    public javax.swing.JLabel jlbEstado;
    public javax.swing.JLabel jlbFecha;
    public javax.swing.JLabel jlbNombre;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JPanel pBotones;
    public javax.swing.JPanel pCosto;
    public javax.swing.JPanel pEstado;
    public javax.swing.JPanel pFecha;
    public javax.swing.JPanel pInputs;
    public javax.swing.JPanel pNombre;
    public javax.swing.JScrollPane scrollPane;
    public javax.swing.JTable tabla;
    public Componentes.TextFieldSuggestion txtCosto;
    public Componentes.TextFieldSuggestion txtFecha;
    public Componentes.TextFieldSuggestion txtNombre;
    // End of variables declaration//GEN-END:variables
}

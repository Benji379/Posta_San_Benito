package Vista;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class mdlInicio extends javax.swing.JPanel {

    public mdlInicio() {
        initComponents();
        slideshow1.initSlideshow(imagenCom(1), imagenCom(2), imagenCom(3), imagenCom(4), imagenCom(5));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new Componentes.PanelCustom();
        imagen1 = new Componentes.Imagen();
        txtCliente = new javax.swing.JTextField();
        slideshow1 = new Componentes.Slideshow();

        setBackground(new java.awt.Color(255, 255, 255));

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom1.setShadowColor(new java.awt.Color(0, 0, 0));

        imagen1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Img/logotipo.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        slideshow1.setColorPrincipal(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                    .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(344, 344, 344)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private JComponent imagenCom(int numImagen) {
        //<editor-fold defaultstate="collapsed" desc="Componente Banner">
        String direcionImagen = "/Img/banner" + numImagen + ".png";
        javax.swing.JPanel panelImagen = new JPanel();
        Componentes.Imagen img = new Componentes.Imagen();
        panelImagen.setBackground(new java.awt.Color(255, 255, 255));
        img.setImage(new javax.swing.ImageIcon(getClass().getResource(direcionImagen)));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
                panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImagenLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
        );
        panelImagenLayout.setVerticalGroup(
                panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImagenLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
        );
        return panelImagen;
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Imagen imagen1;
    private Componentes.PanelCustom panelCustom1;
    private Componentes.Slideshow slideshow1;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}

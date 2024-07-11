package Procesos;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class ProcesoInicio {

    public JComponent imagenCom(int numImagen) {
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

    public static ArrayList<Component> slides(int cant) {
        ArrayList<Component> listCom = new ArrayList<>();
        ProcesoInicio p = new ProcesoInicio();
        for (int i = 1; i <= cant; i++) {
            listCom.add(p.imagenCom(i));
        }
        return listCom;
    }
}

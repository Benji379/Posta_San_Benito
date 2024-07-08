package Procesos;

import java.awt.BorderLayout;
import javax.swing.AbstractButton;
import javax.swing.JPanel;

public class Proceso {

    public static void mostrarPanel(JPanel contenedor, JPanel panel) {
//        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(contenedor);
        contenedor.removeAll();
//        contenedor.setSize(0, 0);
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void ejecutar(AbstractButton componente, Accion accion) {
        componente.addActionListener((java.awt.event.ActionEvent evt) -> {
            accion.ejecutar();
        });
    }
}

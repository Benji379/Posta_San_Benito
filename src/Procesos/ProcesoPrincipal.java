package Procesos;

import Vista.FrmPrincipal;
import java.awt.Image;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ProcesoPrincipal {

    private final FrmPrincipal V;

    public ProcesoPrincipal(FrmPrincipal V) {
        this.V = V;
    }

    public void mostPnlCont(JMenuItem item, Class<? extends JPanel> panelClass) {
        item.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                JPanel panel = panelClass.getDeclaredConstructor().newInstance();
                V.scroll.getViewport().setViewPosition(new Point(0, 0));
                Proceso.mostrarPanel(V.contenedor, panel);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                System.out.println("Error: " + e.getMessage());
            }
        });
    }

    public void mostPnlEmergent(JMenuItem item, Class<? extends JPanel> panelClass, String titulo, int ancho, int largo) {
        item.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                JPanel panel = panelClass.getDeclaredConstructor().newInstance();
                V.scroll.getViewport().setViewPosition(new Point(0, 0));
                ventanaEmergente(panel, titulo, ancho, largo);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                System.out.println("Error: " + e.getMessage());
            }
        });
    }

    public void ventanaEmergente(JPanel panel, String titulo, int alto, int ancho) {
        JDialog dialog = new JDialog();
        panel.repaint();
        panel.revalidate();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(alto, ancho);
        dialog.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        dialog.setModal(true); // Hacer que el diálogo sea modal (bloquear otras interacciones)
        dialog.setContentPane(panel); // Establecer el JPanel recibido como contenido del JDialog
        dialog.setTitle(titulo);
//        dialog.setResizable(false);
        dialog.setDefaultCloseOperation(0);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                int result = Proceso.confirmacion("Confirmar cierre");
                if (result == 0) {
                    dialog.setVisible(false);
                }
            }
        });
        Image icon = V.getIconImage();
        dialog.setIconImage(icon);// Obtener el icono del JFrame y establecerlo en el JDialog
        dialog.setVisible(true); // Mostrar el JDialog
    }

}

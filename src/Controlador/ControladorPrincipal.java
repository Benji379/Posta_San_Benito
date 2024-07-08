package Controlador;

import Procesos.Proceso;
import Vista.frmPrincipal;
import Vista.mdlInicio;
import java.awt.Point;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControladorPrincipal {

    private final frmPrincipal C;

    public ControladorPrincipal(frmPrincipal C) {
        this.C = C;
    }

    public void init() {
        configFrame();
        initAccions();
    }

    private void initAccions() {
        initJMenus();
    }

    private void initJMenus() {
        mostPnlCont(C.itemInicio, new mdlInicio());
    }

    private void mostPnlCont(AbstractButton componente, JPanel panel) {
        Proceso.ejecutar(componente, () -> {
            C.scroll.getViewport().setViewPosition(new Point(0, 0));
            Proceso.mostrarPanel(C.contenedor, panel);
        });
    }

    private void configFrame() {
        C.setLocationRelativeTo(null);
        C.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/icono.png")));
        C.setTitle("Clinica Ricardo Palma - Administrador");
        C.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void confirmarCierre() {
        int confirma = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Deseas salir?", "Confirmar", confirma, JOptionPane.WARNING_MESSAGE);
        if (result == 0) {
            System.exit(0);
        }
    }

}

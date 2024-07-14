package Principal;

import Vista.FrmLogin;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class Main {

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Registro el LookAndFeld FlatLaf">
        try {
            com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("MODELO");
            com.formdev.flatlaf.FlatDarculaLaf.setup();
            UIDefaults ui = UIManager.getDefaults();
            ui.put("ScrollBarUI", Componentes.ScrollBarWin11UI.class.getCanonicalName());
        } catch (Exception e) {
            System.out.println("Error de LookAndFeld: " + e.getMessage());
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FrmLogin().setVisible(true);
        });
    }
}

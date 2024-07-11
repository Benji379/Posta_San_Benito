package Principal;

import Vista.FrmLogin;

public class Main {

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Registro el LookAndFeld FlatLaf">
        try {
            com.formdev.flatlaf.FlatLaf.registerCustomDefaultsSource("MODELO");
            com.formdev.flatlaf.FlatDarculaLaf.setup();
        } catch (Exception e) {
            System.out.println("Error de LookAndFeld: " + e.getMessage());
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FrmLogin().setVisible(true);
        });
    }
}

package Controlador;

import Vista.FrmLogin;
import Vista.FrmPrincipal;

public class ControladorLogin {

    private final FrmLogin V;

    public ControladorLogin(FrmLogin V) {
        this.V = V;
    }

    public void init() {
        V.setLocationRelativeTo(null);
        V.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/icono.png")));
    }

    public void ingresar() {
        FrmPrincipal abrir = new FrmPrincipal();
        V.setVisible(false);
        abrir.setVisible(true);
    }

    private int i = 0;
    public void clickOjo() {
        i++;
        if (i % 2 == 0) {
            V.labelOjito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojoCerrado.png")));
            V.txtPassword.setEchoChar('*');
        } else {
            V.labelOjito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojoAbierto.png")));
            V.txtPassword.setEchoChar((char) 0);
        }
    }
}

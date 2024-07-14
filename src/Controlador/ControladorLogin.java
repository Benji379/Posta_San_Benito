package Controlador;

import Procesos.ProcesoLogin;
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
        String usuario = V.txtUsuario.getText();
        String password = V.txtPassword.getText();
        boolean validar = ProcesoLogin.autenticar(usuario, password);
        if (validar) {
            FrmPrincipal abrir = new FrmPrincipal();
            V.setVisible(false);
            ProcesoLogin.abrirFrmPrincipal(abrir);
        }
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

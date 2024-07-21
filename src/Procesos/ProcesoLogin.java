package Procesos;

import Modelo.Usuario;
import Persistencias.DataUsuario;
import Vista.FrmPrincipal;

public class ProcesoLogin {

    public static Usuario USER;

    public static boolean autenticar(String usuario, String password) {
        DataUsuario data = new DataUsuario();
        boolean usuarioExiste = data.existeUsuarioPorCodigo(usuario);
        if (usuarioExiste) {
            USER = data.getUsuario(usuario);
            String passTemp = USER.getPassword();
            if (passTemp.equals(password)) {
                return true;
            } else {
                Proceso.error("Credenciales incorrectas");
            }
        } else {
            Proceso.error("Credenciales incorrectas");
        }
        return false;
    }

    //ADMINISTRADOR, MEDICO, COORDINADOR
    public static void abrirFrmPrincipal(FrmPrincipal frm) {
        String cargo = USER.getCargo();

        if (!cargo.equalsIgnoreCase("ADMINISTRADOR")) {
            frm.menuEmpleados.setVisible(false);
            frm.menuEspecialidades.setVisible(false);
            if (cargo.equalsIgnoreCase("MEDICO")) {
                frm.itemNuevoPaciente.setVisible(false);
            }
        }
        frm.setVisible(true);
    }

}

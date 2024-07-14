package Controlador;

import Procesos.ProcesoInicio;
import Procesos.ProcesoLogin;
import Vista.MdlInicio;
import javax.swing.ImageIcon;

public class ControladorInicio {

    private final MdlInicio C;

    public ControladorInicio(MdlInicio C) {
        this.C = C;
    }

    public void init() {
        C.slideshow.initSlideshow(ProcesoInicio.slides(5));
        String cargo = ProcesoLogin.USER.getCargo();
        C.txtCargo.setText(cargo);
        C.txtCodigo.setText(ProcesoLogin.USER.getCodigo());
        C.txtNombre.setText(ProcesoLogin.USER.getNombres() + " " + ProcesoLogin.USER.getApellidos());
        String img = "administrador";
        if (cargo.equalsIgnoreCase("ADMINISTRADOR")) {
            img = "administrador";
        } else if (cargo.equalsIgnoreCase("MEDICO")) {
            img = "medico_1";
        } else if (cargo.equalsIgnoreCase("COORDINADOR")) {
            img = "secretario";
        }
        C.fotoPerfil.setImage(new ImageIcon(getClass().getResource("/Img/" + img + ".png")));
    }

}

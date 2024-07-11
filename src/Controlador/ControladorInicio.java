package Controlador;

import Procesos.ProcesoInicio;
import Vista.MdlInicio;

public class ControladorInicio {

    private final MdlInicio C;

    public ControladorInicio(MdlInicio C) {
        this.C = C;
    }

    public void init() {
        C.slideshow.initSlideshow(ProcesoInicio.slides(5));
    }

}

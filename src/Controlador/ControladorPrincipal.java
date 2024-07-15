package Controlador;

import Procesos.Proceso;
import Procesos.ProcesoLogin;
import Procesos.ProcesoPrincipal;
import Vista.*;
import javax.swing.JFrame;

public class ControladorPrincipal {
    
    private final FrmPrincipal V;
    private ProcesoPrincipal p;

    public ControladorPrincipal(FrmPrincipal V) {
        this.V = V;
    }

    public void init() {
        p = new ProcesoPrincipal(V);
        configFrame();
        initAccions();
        Proceso.mostrarPanel(V.contenedor, new MdlInicio());
    }

    private void initAccions() {
        initJMenus();
    }

    private void initJMenus() {
        p.mostPnlCont(V.itemInicio, MdlInicio.class);
        p.mostPnlCont(V.nuevoTrabajador, MdlNewUsuarios.class);
        p.mostPnlCont(V.mantTrabajador, MdlMantUsuario.class);
        p.mostPnlCont(V.itemNuevoPaciente, MdlNewPaciente.class);
        p.mostPnlCont(V.mantPacientes, MdlMantPaciente.class);
        p.mostPnlCont(V.mantAtencion, MdlMantAtencion.class);
        p.mostPnlEmergent(V.itemDescargarHistoria, MdlHistoria.class, "Descargar historia clinica", 310, 290);
        p.mostPnlEmergent(V.itemNuevaAtencion, MdlNewAtencion.class, "Atencion", 1090, 610);
        p.mostPnlEmergent(V.itemNuevaEspecialidad, MdlNewEspecialidad.class, "Nueva Especialidad", 385, 491);
        p.mostPnlEmergent(V.mantEspecialidades, MdlMantEspecialidad.class, "Mantenimiento Especialidad", 785, 605);
    }

    private void configFrame() {
        V.setLocationRelativeTo(null);
        V.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/icono.png")));
        V.setTitle("Posta San Benito - " + ProcesoLogin.USER.getCargo());
        V.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void confirmarCierre() {
        int result = Proceso.confirmacion("Confirmar cierre");
        if (result == 0) {
            System.exit(0);
        }
    }

    public void cerrarSesion() {
        int result = Proceso.confirmacion("Confirmar cierre");
        if (result == 0) {
            V.setVisible(false);
            FrmLogin lo = new FrmLogin();
            lo.setVisible(true);
        }
    }

}

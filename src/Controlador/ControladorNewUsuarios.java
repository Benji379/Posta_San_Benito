package Controlador;

import Modelo.Usuario;
import Persistencias.DataUsuario;
import Procesos.Proceso;
import Procesos.ProcesoUsuario;
import Vista.MdlNewUsuarios;

public class ControladorNewUsuarios {

    private final MdlNewUsuarios V;
    private DataUsuario data;

    public ControladorNewUsuarios(MdlNewUsuarios V) {
        this.V = V;
    }

    public void init() {
        data = new DataUsuario();
        limpiar();
    }

    public void carVisi() {
        int nCargo = V.comboCargo.getSelectedIndex();
        if (nCargo == 1) {
            V.pEspecialidad.setVisible(true);
        } else {
            V.pEspecialidad.setVisible(false);
        }
        autoRellenarTxtCod();
    }

    private Usuario obtenerDatos() {
        String dniUsuario = V.txtDni.getText();
        String nombres = Proceso.mayuscula(V.txtNombres.getText());
        String apellidos = Proceso.mayuscula(V.txtApellidos.getText());
        String password = V.txtPassword.getText();
        String cargo = V.comboCargo.getSelectedItem().toString();
        Object selectEspecialidad = V.comboEspecialidad.getSelectedItem();
        String especialidad = "";
        if (selectEspecialidad != null) {
            especialidad = cargo.equalsIgnoreCase("MEDICO") ? selectEspecialidad.toString() : "GENERAL";
        }
        String fecha = Procesos.Proceso.FECHA_ACTUAL();
        String codigoUsuario = ProcesoUsuario.generarCodigo(dniUsuario, cargo);
        Usuario us = new Usuario(codigoUsuario, dniUsuario, nombres, apellidos, especialidad, cargo, password, fecha);
        return us;
    }

    public void registrar() {
        Usuario us = obtenerDatos();
        boolean valido = ProcesoUsuario.valido(us);
        if (valido) {
            if (data.existeUsuarioPorDni(us.getDni())) {
                Proceso.error("Usuario existe");
            } else {
                int confirmacion = Proceso.confirmacion("Confirmar registro");
                if (confirmacion == 0) {
                    data.registrar(us);
                    limpiar();
                    Proceso.mensaje("Registro Exitoso", "check.png");
                }
            }
        } else {
            ProcesoUsuario.error("Rellene todos los datos");
        }
    }

    private void consultar() {
        ProcesoUsuario.rellenarTablaRegistro(V.tabla);
        V.comboEspecialidad.removeAllItems();
        ProcesoUsuario.rellenarComboEspecialidad(V.comboEspecialidad);
    }

    private void limpiar() {
        consultar();
        V.txtApellidos.setText("");
        V.txtDni.setText("");
        V.txtNombres.setText("");
        V.txtPassword.setText("");
        V.txtUsuario.setText("");
        V.comboCargo.setSelectedIndex(0);
//        V.comboEspecialidad.setSelectedIndex(0);
    }

    public void autoRellenarTxtCod() {
        V.txtUsuario.setText(ProcesoUsuario.generarCodigo(obtenerDatos().getDni(), obtenerDatos().getCargo()));
    }

}

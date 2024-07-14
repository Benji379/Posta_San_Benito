package Controlador;

import Modelo.Especialidad;
import Persistencias.DataEspecialidad;
import Procesos.Proceso;
import Procesos.ProcesoEspecialidad;
import Vista.MdlNewEspecialidad;

public class ControladorNewEspecialidad {

    private final MdlNewEspecialidad V;
    private DataEspecialidad data;

    public ControladorNewEspecialidad(MdlNewEspecialidad V) {
        this.V = V;
    }

    public void init() {
        data = new DataEspecialidad();
        limpiar();
    }

    private void limpiar() {
        consultar();
        V.txtCostoAtencion.setText("");
        V.txtEspecialidad.setText("");
    }

    private void consultar() {
        ProcesoEspecialidad.rellenarTablaRegistro(V.tabla);
    }

    public void registrar() {
        try {
            Especialidad espe = recogerDatos();
            boolean valido = Proceso.validoSinEspacios(espe.getEspecialidad());
            if (valido) {
                boolean existe = data.existeEspecialidad(espe.getEspecialidad());
                if (existe) {
                    Proceso.error("Especilidad existente");
                } else {
                    int confirmacion = Proceso.confirmacion("Confirmar registro");
                    if (confirmacion == 0) {
                        data.registrar(espe);
                        limpiar();
                        Proceso.mensaje("Registro Exitoso", "check.png");
                    }
                }
            } else {
                Proceso.error("Rellene todos los campos");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Especialidad recogerDatos() {
        try {
            String nombreEspecialidad = Proceso.mayuscula(V.txtEspecialidad.getText());
            double costo = Double.parseDouble(V.txtCostoAtencion.getText());
            String estado = "DISPONIBLE"; //Por default predefino DISPONIBLE
            String fecha = Proceso.FECHA_ACTUAL();
            Especialidad es = new Especialidad(nombreEspecialidad, costo, estado, fecha);
            return es;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            Proceso.error("Ingrese un costo válido");
        }
        return null;
    }

}

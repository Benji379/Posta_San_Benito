package Controlador;

import Modelo.Paciente;
import Persistencias.DataPaciente;
import Procesos.Proceso;
import Procesos.ProcesoPaciente;
import Vista.MdlNewPaciente;
import javax.swing.table.DefaultTableModel;

public class ControladorNewPaciente {

    private final MdlNewPaciente V;
    private DataPaciente data;

    public ControladorNewPaciente(MdlNewPaciente V) {
        this.V = V;
    }

    public void init() {
        data = new DataPaciente();
        limpiar();
    }

    public void limpiar() {
        consultar();
        Proceso.vaciarTextFields(
                V.txtApellidoMaterno,
                V.txtApellidoPaterno,
                V.txtDni,
                V.txtFechaNacimiento,
                V.txtNombres,
                V.txtOcupacion,
                V.txtResidencia
        );
        V.txtCantHijos.setValue(0);
    }

    public void registrar() {
        Paciente pa = recogerDatos();
        if (pa != null) {
            boolean validarLlenos = ProcesoPaciente.validar(pa);
//            boolean validarLlenos = true;
            if (validarLlenos) {
                boolean dniValido = pa.getDni().length() == 8;
                if (dniValido) {
                    boolean existe = data.existePaciente(pa.getDni());
                    if (!existe) {
                        int confirmar = Proceso.confirmacion("Confirmar registro");
                        if (confirmar == 0) {
                            data.registrar(pa);
                            limpiar();
                        }
                    } else {
                        Proceso.error("El paciente ya está registrado");
                    }
                } else {
                    Proceso.error("Ingrese un dni válido");
                }
            } else {
                Proceso.error("Rellene todos los campos");
            }
        }

    }

    private void consultar() {
        DefaultTableModel modelo = ProcesoPaciente.getModeloRegistro(V.tabla);
        V.tabla.setModel(modelo);
    }

    public Paciente recogerDatos() {
        try {
            Paciente pa = new Paciente();
            pa.setDni(V.txtDni.getText());
            pa.setNombres(V.txtNombres.getText());
            pa.setApellidoPaterno(V.txtApellidoPaterno.getText());
            pa.setApellidoMaterno(V.txtApellidoMaterno.getText());
            pa.setSexo(V.comboSexo.getSelectedItem().toString());
            pa.setProcedencia(V.comboProcedencia.getSelectedItem().toString());
            pa.setOcupacion(V.txtOcupacion.getText());
            pa.setEscolaridad(V.comboEscolaridad.getSelectedItem().toString());
            pa.setEstadoCivil(V.comboEstadoCivil.getSelectedItem().toString());
            pa.setHijos(Integer.parseInt(V.txtCantHijos.getValue().toString()));
            pa.setGrupoSanguineo(V.comboGrupoSanguineo.getSelectedItem().toString());
            pa.setRh(V.comboRh.getSelectedItem().toString());
            pa.setResidencia(V.txtResidencia.getText());
            pa.setFechaNacimiento(V.txtFechaNacimiento.getText());
            pa.setFecha(Proceso.FECHA_ACTUAL());
            return pa;
        } catch (NumberFormatException e) {
            Proceso.error("Ingrese un número válido");
        }
        return null;
    }

}

package Controlador;

import Modelo.Atencion;
import Persistencias.DataAtencion;
import Persistencias.DataEspecialidad;
import Procesos.Proceso;
import Procesos.ProcesoAtencion;
import Vista.MdlNewAtencion;

public class ControladorNewAtencion {

    private final MdlNewAtencion V;
    private DataAtencion data;

    public ControladorNewAtencion(MdlNewAtencion V) {
        this.V = V;
        V.btnEditar.setVisible(false);
    }

    public void init() {
        data = new DataAtencion();
        limpiar();
        initCombos();
        V.txtAreaEnfermedadActual.setText("");
        V.txtAreaMotivoConsulta.setText("");
    }

    public void registrar() {
        Atencion at = recogerDatos();
        boolean validar = ProcesoAtencion.validarIngreso(at);
        if (validar) {
            int confirmar = Proceso.confirmacion("Confirmar registro");
            if (confirmar == 0) {
                data.registrar(at);
                Proceso.mensaje("Registro exitoso");
                limpiar();
            }
        } else {
            Proceso.error("Campos sin completar");
        }

    }

    private void limpiar() {
        V.jlbTittle.setText("Atencion - " + ProcesoAtencion.idActual());
    }

    private void consultarCombos() {
        ProcesoAtencion.rellenarCombo(V.comboPaciente, V.comboEspecialidad);
        ProcesoAtencion.rellenarComboMedicos(V.comboMedico);
    }

    private void initCombos() {
        consultarCombos();
        initAccionesCombo();
    }

    private void initAccionesCombo() {
        V.comboPaciente.addActionListener((java.awt.event.ActionEvent evt) -> {
            printResultado();
        });
        V.comboEspecialidad.addActionListener((java.awt.event.ActionEvent evt) -> {
            printResultado();
        });
        V.comboMedico.addActionListener((java.awt.event.ActionEvent evt) -> {
            printResultado();
        });
    }

    public Atencion recogerDatos() {
        String idAtencion = ProcesoAtencion.idActual();
        String paciente = Proceso.evitarNull(V.comboPaciente.getSelectedItem());
        String especialidad = Proceso.evitarNull(V.comboEspecialidad.getSelectedItem());
        String medico = Proceso.evitarNull(V.comboMedico.getSelectedItem());
        String motivoConsulta = V.txtAreaMotivoConsulta.getText();
        String enfermedadActual = V.txtAreaEnfermedadActual.getText();
        String hora = Proceso.getTime();
        java.util.Date fecha = Proceso.fecha(Proceso.FECHA_ACTUAL());
        Atencion at = new Atencion(idAtencion, paciente, medico, especialidad, motivoConsulta, enfermedadActual, fecha, hora);
        return at;
    }

    private void printResultado() {
        Atencion at = recogerDatos();
        String consulta = at.getIdAtencion();
        String fecha = Proceso.getDateTime();
        String dniCliente = at.getDniCliente();
        String precio = String.valueOf(new DataEspecialidad().getEspecialidad(at.getEspecialidad()).getCostoAtencion());

        V.txtPrecio.setText("S/" + precio);
        V.txtFecha.setText(fecha);
        V.txtPaciente.setText(dniCliente);
        V.txtCodConsulta.setText(consulta);
    }

}

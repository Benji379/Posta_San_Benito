package Controlador;

import Busquedas.BusquedaTabla;
import Modelo.Atencion;
import Persistencias.DataAtencion;
import Procesos.Proceso;
import Procesos.ProcesoAtencion;
import Vista.MdlMantAtencion;
import Vista.MdlNewAtencion;
import java.text.ParseException;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class ControladorMantAtencion {

    private final MdlMantAtencion V;
    private DefaultTableModel modelo;
    private int filaSeleccionada;
    private DataAtencion data;

    public ControladorMantAtencion(MdlMantAtencion V) {
        this.V = V;
    }

    public void init() {
        data = new DataAtencion();
        limpiar();

    }

    public void limpiar() {
        filaSeleccionada = -1;
        consultar();
        V.txtFecha.setText(Proceso.FECHA_ACTUAL());
        V.txtFechaInicio.setText(Proceso.FECHA_ACTUAL());
        V.txtFechaFinal.setText(Proceso.FECHA_ACTUAL());
    }

    private void consultar() {
        modelo = ProcesoAtencion.modeloAtencion(V.tabla);
        V.tabla.setModel(modelo);
        ProcesoAtencion.rellenarComboEspecialidades(V.comboEspecialidades);
        ProcesoAtencion.rellenarComboMedicos(V.comboMedico);
    }

    public void filtrarMedicos() {
        DefaultTableModel modeloFiltro = BusquedaTabla.filtro_BusquedaBinaria(datosFiltrarMedico(), modelo);
        V.tabla.setModel(modeloFiltro);
    }

    private HashMap<Integer, Object> datosFiltrarMedico() {
        HashMap<Integer, Object> datos = new HashMap<>();
        datos.put(3, V.comboMedico.getSelectedItem());
        datos.put(7, V.txtFecha.getText());
        return datos;
    }

    private HashMap<Integer, Object> datosFiltrarEspecialidades() {
        HashMap<Integer, Object> datos = new HashMap<>();
        datos.put(4, V.comboEspecialidades.getSelectedItem());
        return datos;
    }

    public void filtrarEspecialidades() {
        try {
            String fechaInicio = V.txtFechaInicio.getText();
            String fechaFinal = V.txtFechaFinal.getText();
            DefaultTableModel modeloFiltro = BusquedaTabla.filtro_BusquedaPorFechas(modelo, fechaInicio, fechaFinal, 7, datosFiltrarEspecialidades());
            V.tabla.setModel(modeloFiltro);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            int confirmar = Proceso.confirmacion("Confirmar eliminacion");
            if (confirmar == 0) {
                String idAtencion = V.tabla.getValueAt(filaSeleccionada, 1).toString();
                data.eliminar(idAtencion);
                limpiar();
                Proceso.mensaje("Atencion eliminada con exito");
            }
        } else {
            Proceso.error("Seleccione una fila");
        }
    }

    public void clickTabla() {
        filaSeleccionada = V.tabla.getSelectedRow();
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            String idAtencion = V.tabla.getValueAt(filaSeleccionada, 1).toString();
            String idPaciente = V.tabla.getValueAt(filaSeleccionada, 2).toString();
            String idDoctor = V.tabla.getValueAt(filaSeleccionada, 3).toString();
            String especialidad = V.tabla.getValueAt(filaSeleccionada, 4).toString();
            String motivo = V.tabla.getValueAt(filaSeleccionada, 5).toString();
            String enfermedad = V.tabla.getValueAt(filaSeleccionada, 6).toString();
            String fecha = V.tabla.getValueAt(filaSeleccionada, 7).toString();
            MdlNewAtencion pe = new MdlNewAtencion();
            pe.btnEditar.setVisible(true);
            pe.btnEditar.addActionListener((java.awt.event.ActionEvent evt) -> {
                int confirmar = Proceso.confirmacion("Confirmar edicion");
                if (confirmar == 0) {
                    ControladorNewAtencion co = new ControladorNewAtencion(pe);
                    Atencion nueva = co.recogerDatos();
                    nueva.setIdAtencion(idAtencion);
                    JDialog parentWindow = (JDialog) javax.swing.SwingUtilities.windowForComponent(pe);
                    parentWindow.setVisible(false);
                    data.editar(nueva);
                    limpiar();
                    Proceso.mensaje("Atencion editada");
                }
            });
            pe.btnRegistrar.setVisible(false);
            pe.comboPaciente.setSelectedItem(idPaciente);
            pe.comboMedico.setSelectedItem(idDoctor);
            pe.comboEspecialidad.setSelectedItem(especialidad);
            pe.txtAreaEnfermedadActual.setText(enfermedad);
            pe.txtAreaMotivoConsulta.setText(motivo);
            pe.txtFecha.setText(fecha);
            pe.jlbTittle.setText("Atencion - " + idAtencion);
            pe.txtCodConsulta.setText("N° " + idAtencion);
            Proceso.ventanaEmergente(pe, "Modificar Atencion", 1090, 610);
        } else {
            Proceso.error("Seleccione una fila");
        }

    }

}

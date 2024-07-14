package Controlador;

import Busquedas.BusquedaTabla;
import Procesos.Proceso;
import Procesos.ProcesoAtencion;
import Vista.MdlMantAtencion;
import java.text.ParseException;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class ControladorMantAtencion {

    private final MdlMantAtencion V;
    private DefaultTableModel modelo;

    public ControladorMantAtencion(MdlMantAtencion V) {
        this.V = V;
    }

    public void init() {
        limpiar();
    }

    public void limpiar() {
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

}

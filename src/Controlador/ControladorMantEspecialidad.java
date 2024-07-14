package Controlador;

import Busquedas.BusquedaTabla;
import Modelo.Especialidad;
import Persistencias.DataEspecialidad;
import Procesos.Proceso;
import Procesos.ProcesoEspecialidad;
import Vista.MdlMantEspecialidad;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class ControladorMantEspecialidad {

    private final MdlMantEspecialidad V;
    private DataEspecialidad data;
    private int filaSeleccionada;
    private DefaultTableModel modelo;

    public ControladorMantEspecialidad(MdlMantEspecialidad V) {
        this.V = V;
    }

    public void init() {
        data = new DataEspecialidad();
        limpiar();
        V.dateChooser.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
    }

    public void filtrar() {
        DefaultTableModel modeloFiltro = BusquedaTabla.filtro_BusquedaBinaria(datosFiltrar(), modelo);
        V.tabla.setModel(modeloFiltro);
    }

    private HashMap<Integer, Object> datosFiltrar() {
        HashMap<Integer, Object> datos = new HashMap<>();
        datos.put(1, V.txtNombre.getText());
        datos.put(2, V.txtCosto.getText());
        datos.put(3, V.comboEstado.getSelectedItem());
        datos.put(4, V.txtFecha.getText());
        return datos;
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            Especialidad es = recogerDatos();
            if (es != null) {
                int confirmacion = Proceso.confirmacion("Confirmar edicion");
                if (confirmacion == 0) {
                    data.editar(es);
                    limpiar();
                    Proceso.mensaje("Actualizacion con éxito", "check.png");
                }
            }
        } else {
            Proceso.error("Selecciona una fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            int confirmacion = Proceso.confirmacion("Confirmar eliminacion");
            if (confirmacion == 0) {
                String nombreEspecialidad = V.tabla.getValueAt(filaSeleccionada, 1).toString();
                data.eliminar(nombreEspecialidad);
                limpiar();
                Proceso.mensaje("Eliminacion con éxito", "check.png");
            }
        } else {
            Proceso.error("Selecciona una fila");
        }
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        V.txtNombre.setEditable(true);
        V.txtNombre.setText("");
        V.txtCosto.setText("");
        V.comboEstado.setSelectedIndex(0);
        V.txtFecha.setText("");
    }

    public void clickTabla() {
        filaSeleccionada = V.tabla.getSelectedRow();
        String nombreEspecialidad = V.tabla.getValueAt(filaSeleccionada, 1).toString();
        String costo = V.tabla.getValueAt(filaSeleccionada, 2).toString();
        String estado = V.tabla.getValueAt(filaSeleccionada, 3).toString();
        String fecha = V.tabla.getValueAt(filaSeleccionada, 4).toString();
        V.txtNombre.setText(nombreEspecialidad);
        V.txtCosto.setText(costo);
        V.comboEstado.setSelectedItem(estado);
        V.txtFecha.setText(fecha);
        V.txtNombre.setEditable(false);
        V.dateChooser.setSelectedDate(Proceso.fecha(fecha));
    }

    private void consultar() {
        modelo = ProcesoEspecialidad.rellenarTablaMantenimiento(V.tabla);
        V.tabla.setModel(modelo);
    }

    private Especialidad recogerDatos() {
        try {
            String especialidad = V.txtNombre.getText();
            double costo = Double.parseDouble(V.txtCosto.getText());
            String estado = V.comboEstado.getSelectedItem().toString();
            String fecha = V.txtFecha.getText();
            Especialidad es = new Especialidad(especialidad, costo, estado, fecha);
            return es;
        } catch (NumberFormatException e) {
            Proceso.error("Costo inválido");
        }
        return null;
    }

}

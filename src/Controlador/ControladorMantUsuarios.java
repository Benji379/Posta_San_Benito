package Controlador;

import Busquedas.BusquedaTabla;
import Modelo.Usuario;
import Persistencias.DataUsuario;
import Procesos.Proceso;
import Procesos.ProcesoUsuario;
import Vista.MdlMantUsuario;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class ControladorMantUsuarios {

    private final MdlMantUsuario V;
    private int filaSeleccionada;
    private DefaultTableModel modelo;
    private DataUsuario data;

    public ControladorMantUsuarios(MdlMantUsuario V) {
        this.V = V;
    }

    public void init() {
        limpiar();
        data = new DataUsuario();
    }

    public void limpiar() {
        filaSeleccionada = -1;
        consultar();
        V.txtDni.setText("");
        V.txtApellidos.setText("");
        V.txtUsuario.setText("");
        V.txtPassword.setText("");
        V.txtFecha.setText("");
        V.txtNombres.setText("");
        V.txtDni.setEditable(true);
        V.txtUsuario.setEditable(true);
        V.comboCargo.setSelectedIndex(0);
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            Usuario us = obtenerDatos();
            boolean valido = ProcesoUsuario.valido(us);
            if (valido) {
                int confirmacion = Proceso.confirmacion("Confirmar registro");
                if (confirmacion == 0) {
                    data.editar(us);
                    limpiar();
                    Proceso.mensaje("Datos editados", "check.png");
                }
            } else {
                ProcesoUsuario.error("Rellene todos los datos");
            }
        } else {
            Proceso.error("Seleccione una fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            int confirmar = Proceso.confirmacion("Confirmar eliminacion");
            if (confirmar == 0) {
                String codigo = V.tabla.getValueAt(filaSeleccionada, 1).toString();
                data.eliminar(codigo);
                limpiar();
                Proceso.mensaje("Eliminacion exitosa", "check.png");
            }
        } else {
            Proceso.error("Seleccione una fila");
        }
    }

    public void filtrar() {
        DefaultTableModel modeloFiltro = BusquedaTabla.filtro_BusquedaBinaria(datosFiltrar(), modelo);
        V.tabla.setModel(modeloFiltro);
    }

    private HashMap<Integer, Object> datosFiltrar() {
        HashMap<Integer, Object> datos = new HashMap<>();
        datos.put(1, V.txtUsuario.getText());
        datos.put(2, V.txtDni.getText());
        datos.put(3, V.txtNombres.getText());
        datos.put(4, V.txtApellidos.getText());
        String cargo = V.comboCargo.getSelectedItem().toString();
        datos.put(5, cargo);
        datos.put(6, V.txtFecha.getText());
        return datos;
    }

    public void clickTabla() {
        filaSeleccionada = V.tabla.getSelectedRow();
        String codigo = V.tabla.getValueAt(filaSeleccionada, 1).toString();
        String dni = V.tabla.getValueAt(filaSeleccionada, 2).toString();
        String nombres = V.tabla.getValueAt(filaSeleccionada, 3).toString();
        String apellidos = V.tabla.getValueAt(filaSeleccionada, 4).toString();
        String cargo = V.tabla.getValueAt(filaSeleccionada, 5).toString();
        String fecha = V.tabla.getValueAt(filaSeleccionada, 6).toString();
        V.txtUsuario.setText(codigo);
        V.txtDni.setText(dni);
        V.txtNombres.setText(nombres);
        V.txtApellidos.setText(apellidos);
        V.comboCargo.setSelectedItem(cargo);
        V.txtPassword.setText(data.getUsuario(codigo).getPassword());
        V.txtFecha.setText(fecha);
        V.dateChooser.setSelectedDate(Proceso.fecha(fecha));
        V.txtDni.setEditable(false);
        V.txtUsuario.setEditable(false);
    }

    private void consultar() {
        modelo = ProcesoUsuario.rellenarTablaMant(V.tabla);
        V.tabla.setModel(modelo);
    }

  
    private Usuario obtenerDatos() {
        String dniUsuario = V.txtDni.getText();
        String nombres = Proceso.mayuscula(V.txtNombres.getText());
        String apellidos = Proceso.mayuscula(V.txtApellidos.getText());
        String password = V.txtPassword.getText();
        String cargo = V.comboCargo.getSelectedItem().toString();
        String fecha = Procesos.Proceso.FECHA_ACTUAL();
        String codigoUsuario = ProcesoUsuario.generarCodigo(dniUsuario, cargo);
        Usuario us = new Usuario(codigoUsuario, dniUsuario, nombres, apellidos, cargo, password, fecha);
        return us;
    }
}

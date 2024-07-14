package Procesos;

import Modelo.Especialidad;
import Modelo.Usuario;
import Persistencias.DataEspecialidad;
import Persistencias.DataUsuario;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesoUsuario extends Proceso {

    public static String generarCodigo(String dniUsuario, String cargo) {
        String letra = "U";
        if (cargo.equalsIgnoreCase("administrador")) {
            letra = "AD";
        } else if (cargo.equalsIgnoreCase("medico")) {
            letra = "ME";
        } else if (cargo.equalsIgnoreCase("coordinador")) {
            letra = "CO";
        }
        String codigo = letra + dniUsuario;
        return codigo;
    }

    public static boolean valido(Usuario u) {
        boolean validar = validoSinEspacios(
                u.getDni(), u.getApellidos(), u.getCargo(), u.getCodigo(), u.getEspecialidad(),
                u.getFecha(), u.getNombres(), u.getPassword()) && u.getDni().length() == 8;
        return validar;
    }

    public static void rellenarTablaRegistro(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DataUsuario dataUsuario = new DataUsuario();
        ArrayList<Usuario> listaUsuarios = dataUsuario.getData();
        int cont = 0;
        for (Usuario us : listaUsuarios) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                us.getCodigo(),
                us.getDni(),
                us.getCargo(),
                us.getEspecialidad(),
                us.getFecha()
            });
        }
        tabla.setModel(modelo);
    }

    public static void rellenarComboEspecialidad(JComboBox combo) {
        ArrayList<Especialidad> lista = new DataEspecialidad().getData();
//        combo.removeAllItems();
        combo.addItem("GENERAL");
        for (Especialidad es : lista) {
            if (es.getEstado().equalsIgnoreCase("disponible")) {
                combo.addItem(es.getEspecialidad());
            }
        }
    }

    public static DefaultTableModel rellenarTablaMant(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DataUsuario dataUsuario = new DataUsuario();
        ArrayList<Usuario> listaUsuarios = dataUsuario.getData();
        int cont = 0;
        for (Usuario us : listaUsuarios) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                us.getCodigo(),
                us.getDni(),
                us.getNombres(),
                us.getApellidos(),
                us.getCargo(),
                us.getEspecialidad(),
                us.getFecha()
            });
        }
        return modelo;
//        tabla.setModel(modelo);
    }
}

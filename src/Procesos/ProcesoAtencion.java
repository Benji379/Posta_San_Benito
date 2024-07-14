package Procesos;

import java.util.ArrayList;
import Modelo.*;
import Persistencias.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesoAtencion {

    public static void rellenarCombo(JComboBox comboPacientes, JComboBox comboEspecialidades) {
        ArrayList<Paciente> listaPacientes = new DataPaciente().getData();
        ArrayList<Especialidad> listaEspecialidades = new DataEspecialidad().getData();

        //rellenarComboPacientes
        comboPacientes.removeAllItems();
        for (Paciente pa : listaPacientes) {
            comboPacientes.addItem(pa.getDni());
        }

        //rellenar comboEspecialidades
        comboEspecialidades.removeAllItems();
        for (Especialidad es : listaEspecialidades) {
            comboEspecialidades.addItem(es.getEspecialidad());
        }
    }

    public static void rellenarComboEspecialidades(JComboBox comboEspecialidades) {
        ArrayList<Especialidad> listaEspecialidades = new DataEspecialidad().getData();

        //rellenar comboEspecialidades
        comboEspecialidades.removeAllItems();
        for (Especialidad es : listaEspecialidades) {
            comboEspecialidades.addItem(es.getEspecialidad());
        }
    }

    public static void rellenarComboMedicos(JComboBox comboMedicos) {
        ArrayList<Usuario> listaUsuarios = new DataUsuario().getData();

        comboMedicos.removeAllItems();
        for (Usuario us : listaUsuarios) {
            String cargoTemp = us.getCargo();
            if (cargoTemp.equalsIgnoreCase("MEDICO")) {
                comboMedicos.addItem(us.getCodigo());
            }
        }
    }

    public static void rellenarComboMedicos(String especialidad, JComboBox comboMedicos) {
        ArrayList<Usuario> listaUsuarios = new DataUsuario().getData();

        comboMedicos.removeAllItems();
        for (Usuario us : listaUsuarios) {
            String cargoTemp = us.getCargo();
            String especialidadTemp = us.getEspecialidad();
            if (cargoTemp.equalsIgnoreCase("MEDICO") && (especialidadTemp.equalsIgnoreCase(especialidad) || especialidadTemp.equalsIgnoreCase("GENERAL"))) {
                comboMedicos.addItem(us.getCodigo());
            }
        }
    }

    public static String idActual() {
        int idActual = 0;
        try {
            idActual = new DataAtencion().getData().size();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int valorActualId = idActual + 1;
        String nuevaID = String.format("%08d", valorActualId);
        return nuevaID;
    }

    public static boolean validarIngreso(Atencion at) {
        boolean valido = Proceso.validoSinEspacios(
                at.getDniCliente(),
                at.getEnfermedadActual(),
                at.getEspecialidad(),
                at.getHora(),
                at.getIdAtencion(),
                at.getIdMedico(),
                at.getMotivoConsulta()
        );
        return valido;
    }

    public static DefaultTableModel modeloAtencion(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Atencion> lista = new DataAtencion().getData();
        int cont = 0;
        for (Atencion at : lista) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                at.getIdAtencion(),
                at.getDniCliente(),
                at.getIdMedico(),
                at.getEspecialidad(),
                at.getMotivoConsulta(),
                at.getEnfermedadActual(),
                Proceso.formatDate(at.getFecha()),
                at.getHora()
            });
        }
        return modelo;
    }

}

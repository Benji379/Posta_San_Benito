package Procesos;

import Modelo.Especialidad;
import Persistencias.DataEspecialidad;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesoEspecialidad extends Proceso {

    public static void rellenarTablaRegistro(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Especialidad> lista = new DataEspecialidad().getData();
        int cont = 0;
        for (Especialidad es : lista) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                es.getEspecialidad(),
                "S/"+es.getCostoAtencion()
            });
        }
    }
    public static DefaultTableModel rellenarTablaMantenimiento(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Especialidad> lista = new DataEspecialidad().getData();
        int cont = 0;
        for (Especialidad es : lista) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                es.getEspecialidad(),
                es.getCostoAtencion(),
                es.getEstado(),
                es.getFecha()
            });
        }
        return modelo;
    }
    
}

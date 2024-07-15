package Ordenamientos;

import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrdenamientoTabla {

    public static void ordenarTabla(JTable tabla, int numColumna, boolean asc) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        Object[][] filaDatos = new Object[modelo.getRowCount()][modelo.getColumnCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                filaDatos[i][j] = modelo.getValueAt(i, j);
            }
        }
        modelo.setRowCount(0);
        Arrays.sort(filaDatos, (Object[] ob1, Object[] ob2) -> {
            Comparable<Object> colum1 = (Comparable<Object>) ob1[numColumna];
            Comparable<Object> colum2 = (Comparable<Object>) ob2[numColumna];
            return colum1.compareTo(colum2);
        });

        if (!asc) {
            for (int i = 0; i < filaDatos.length / 2; i++) {
                Object[] auxiliar = filaDatos[i];
                filaDatos[i] = filaDatos[filaDatos.length - i - 1];
                filaDatos[filaDatos.length - i - 1] = auxiliar;
            }
        }

        for (Object[] fila : filaDatos) {
            modelo.addRow(fila);
        }
    }
}

package Test;

import Busquedas.BusquedaTabla;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;

public class TestFiltro {

    public static void main(String[] args) {
        // Setup inicial de la GUI
        JFrame frame = new JFrame("Test de Filtrado de Tabla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Crear el modelo de la tabla original
        DefaultTableModel modeloOriginal = new DefaultTableModel();
        modeloOriginal.setColumnIdentifiers(new String[]{"ID", "Nombre", "Edad", "Salario"});
        modeloOriginal.addRow(new Object[]{1, "Alice", 30, 70000});
        modeloOriginal.addRow(new Object[]{2, "Bob", 25, 50000});
        modeloOriginal.addRow(new Object[]{3, "Charlie", 35, 80000});
        modeloOriginal.addRow(new Object[]{4, "Diana", 28, 62000});
        modeloOriginal.addRow(new Object[]{5, "Evan", 40, 91000});

        // Crear la JTable
        JTable tabla = new JTable(modeloOriginal);
        JScrollPane scrollPane = new JScrollPane(tabla);
        frame.add(scrollPane);

        // Filtrar los datos usando búsqueda binaria y actualizar la tabla
        HashMap<Integer, Object> filtros = new HashMap<>();
        filtros.put(1, "Charlie");  // Filtrar por nombre
//        DefaultTableModel modeloFiltrado = BusquedaTabla.filtro_BusquedaBinaria(filtros, modeloOriginal);
//        tabla.setModel(modeloFiltrado);
        DefaultTableModel modeloFiltrado2 = BusquedaTabla.filtro_BusquedaBinaria(filtros, modeloOriginal);
        tabla.setModel(modeloFiltrado2);

        frame.setVisible(true);
    }
}

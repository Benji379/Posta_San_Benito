package Ordenamientos;

import javax.swing.*;
import javax.swing.table.TableModel;

public class AlgoritmosSort {

    /**
     * Método de ordenamiento por Selección
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void seleccion(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < rowCount; j++) {
                // Comparar los valores en la columna especificada
                if (((Comparable) model.getValueAt(j, column)).compareTo(model.getValueAt(minIndex, column)) < 0) {
                    minIndex = j;  // Actualizar el índice del valor mínimo
                }
            }
            // Intercambiar las filas
            swapRowsSeleccion(model, i, minIndex);
        }
    }

    /**
     * Método de ordenamiento por Inserción
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void insercion(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        for (int i = 1; i < rowCount; i++) {
            Object key = model.getValueAt(i, column);
            int j = i - 1;
            // Desplazar los elementos mayores hacia la derecha
            while (j >= 0 && ((Comparable) model.getValueAt(j, column)).compareTo(key) > 0) {
                swapRowsInsercion(model, j + 1, j);
                j--;
            }
        }
    }
    
    /**
     * Método de ordenamiento por Burbuja
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void burbuja(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < rowCount; i++) {
                // Comparar los valores adyacentes en la columna especificada
                if (((Comparable) model.getValueAt(i - 1, column)).compareTo(model.getValueAt(i, column)) > 0) {
                    // Intercambiar las filas
                    swapRowsBurbuja(model, i - 1, i);
                    swapped = true;
                }
            }
        } while (swapped);  // Repetir hasta que no haya intercambios
    }

    /**
     * Método de ordenamiento Shell Sort
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void shellSort(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        // Inicializar el tamaño del intervalo
        for (int gap = rowCount / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < rowCount; i++) {
                Object temp = model.getValueAt(i, column);
                int j;
                // Realizar inserción con intervalos
                for (j = i; j >= gap && ((Comparable) model.getValueAt(j - gap, column)).compareTo(temp) > 0; j -= gap) {
                    swapRowsShellSort(model, j, j - gap);
                }
            }
        }
    }

    /**
     * Método de ordenamiento Merge Sort
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void mergeSort(JTable table, int column) {
        TableModel model = table.getModel();
        mergeSortRecursive(model, column, 0, model.getRowCount() - 1);
    }

    // Método recursivo para el Merge Sort
    private static void mergeSortRecursive(TableModel model, int column, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(model, column, left, mid);
            mergeSortRecursive(model, column, mid + 1, right);
            merge(model, column, left, mid, right);
        }
    }

    // Método para fusionar las sublistas en el Merge Sort
    private static void merge(TableModel model, int column, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        Object[] leftArray = new Object[leftSize];
        Object[] rightArray = new Object[rightSize];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < leftSize; ++i) {
            leftArray[i] = model.getValueAt(left + i, column);
        }
        for (int j = 0; j < rightSize; ++j) {
            rightArray[j] = model.getValueAt(mid + 1 + j, column);
        }

        int i = 0, j = 0;
        int k = left;
        while (i < leftSize && j < rightSize) {
            // Fusionar los arreglos temporales en el arreglo original
            if (((Comparable) leftArray[i]).compareTo(rightArray[j]) <= 0) {
                model.setValueAt(leftArray[i], k, column);
                i++;
            } else {
                model.setValueAt(rightArray[j], k, column);
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de leftArray
        while (i < leftSize) {
            model.setValueAt(leftArray[i], k, column);
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray
        while (j < rightSize) {
            model.setValueAt(rightArray[j], k, column);
            j++;
            k++;
        }
    }

    // Métodos para intercambiar las filas en el modelo de la tabla con nombres únicos
    private static void swapRowsSeleccion(TableModel model, int row1, int row2) {
        swapRowsHelper(model, row1, row2);
    }

    private static void swapRowsInsercion(TableModel model, int row1, int row2) {
        swapRowsHelper(model, row1, row2);
    }

    private static void swapRowsBurbuja(TableModel model, int row1, int row2) {
        swapRowsHelper(model, row1, row2);
    }

    private static void swapRowsShellSort(TableModel model, int row1, int row2) {
        swapRowsHelper(model, row1, row2);
    }

    private static void swapRowsHelper(TableModel model, int row1, int row2) {
        int columnCount = model.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            Object temp = model.getValueAt(row1, i);
            model.setValueAt(model.getValueAt(row2, i), row1, i);
            model.setValueAt(temp, row2, i);
        }
    }

    /**
     * Método de ordenamiento QuickSort
     *
     * @param table La JTable a ordenar
     * @param column El índice de la columna según la cual se ordenará la tabla
     */
    public static void quicksort(JTable table, int column) {
        TableModel model = table.getModel();
        quicksortRecursive(model, column, 0, model.getRowCount() - 1);
    }

    // Método recursivo para el QuickSort
    private static void quicksortRecursive(TableModel model, int column, int low, int high) {
        if (low < high) {
            int pi = partition(model, column, low, high);
            quicksortRecursive(model, column, low, pi - 1);
            quicksortRecursive(model, column, pi + 1, high);
        }
    }

    // Método para realizar la partición en el QuickSort
    private static int partition(TableModel model, int column, int low, int high) {
        Object pivot = model.getValueAt(high, column);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (((Comparable) model.getValueAt(j, column)).compareTo(pivot) <= 0) {
                i++;
                swapRowsQuicksort(model, i, j);
            }
        }
        swapRowsQuicksort(model, i + 1, high);
        return i + 1;
    }

    private static void swapRowsQuicksort(TableModel model, int row1, int row2) {
        swapRowsHelper(model, row1, row2);
    }

}

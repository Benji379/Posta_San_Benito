package Ordenamientos;

import javax.swing.*;
import javax.swing.table.TableModel;

public class AlgoritmosSort {

    /**
     * M�todo de ordenamiento por Selecci�n
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
     */
    public static void seleccion(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < rowCount; j++) {
                // Comparar los valores en la columna especificada
                if (((Comparable) model.getValueAt(j, column)).compareTo(model.getValueAt(minIndex, column)) < 0) {
                    minIndex = j;  // Actualizar el �ndice del valor m�nimo
                }
            }
            // Intercambiar las filas
            swapRowsSeleccion(model, i, minIndex);
        }
    }

    /**
     * M�todo de ordenamiento por Inserci�n
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
     */
    public static void insercion(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        for (int i = 1; i < rowCount; i++) {
            int j = i;
            // Desplazar los elementos mayores hacia la derecha
            while (j > 0 && ((Comparable) model.getValueAt(j - 1, column)).compareTo(model.getValueAt(j, column)) > 0) {
                // Intercambiar las filas
                swapRowsInsercion(model, j - 1, j);
                j--;
            }
        }
    }

    /**
     * M�todo de ordenamiento por Burbuja
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
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
     * M�todo de ordenamiento Shell Sort
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
     */
    public static void shellSort(JTable table, int column) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        // Inicializar el tama�o del intervalo
        for (int gap = rowCount / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < rowCount; i++) {
                int j = i;
                // Realizar inserci�n con intervalos
                while (j >= gap && ((Comparable) model.getValueAt(j - gap, column)).compareTo(model.getValueAt(j, column)) > 0) {
                    swapRowsShellSort(model, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    /**
     * M�todo de ordenamiento Merge Sort
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
     */
    public static void mergeSort(JTable table, int column) {
        TableModel model = table.getModel();
        mergeSortRecursive(model, column, 0, model.getRowCount() - 1);
    }

    // M�todo recursivo para el Merge Sort
    private static void mergeSortRecursive(TableModel model, int column, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(model, column, left, mid);
            mergeSortRecursive(model, column, mid + 1, right);
            merge(model, column, left, mid, right);
        }
    }

    // M�todo para fusionar las sublistas en el Merge Sort
    private static void merge(TableModel model, int column, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        Object[][] leftArray = new Object[leftSize][model.getColumnCount()];
        Object[][] rightArray = new Object[rightSize][model.getColumnCount()];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < leftSize; ++i) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                leftArray[i][j] = model.getValueAt(left + i, j);
            }
        }
        for (int i = 0; i < rightSize; ++i) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                rightArray[i][j] = model.getValueAt(mid + 1 + i, j);
            }
        }

        int i = 0, j = 0;
        int k = left;
        while (i < leftSize && j < rightSize) {
            if (((Comparable) leftArray[i][column]).compareTo(rightArray[j][column]) <= 0) {
                for (int l = 0; l < model.getColumnCount(); l++) {
                    model.setValueAt(leftArray[i][l], k, l);
                }
                i++;
            } else {
                for (int l = 0; l < model.getColumnCount(); l++) {
                    model.setValueAt(rightArray[j][l], k, l);
                }
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de leftArray
        while (i < leftSize) {
            for (int l = 0; l < model.getColumnCount(); l++) {
                model.setValueAt(leftArray[i][l], k, l);
            }
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray
        while (j < rightSize) {
            for (int l = 0; l < model.getColumnCount(); l++) {
                model.setValueAt(rightArray[j][l], k, l);
            }
            j++;
            k++;
        }
    }

    // M�todos para intercambiar las filas en el modelo de la tabla con nombres �nicos
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
     * M�todo de ordenamiento QuickSort
     *
     * @param table La JTable a ordenar
     * @param column El �ndice de la columna seg�n la cual se ordenar� la tabla
     */
    public static void quicksort(JTable table, int column) {
        TableModel model = table.getModel();
        quicksortRecursive(model, column, 0, model.getRowCount() - 1);
    }

    // M�todo recursivo para el QuickSort
    private static void quicksortRecursive(TableModel model, int column, int low, int high) {
        if (low < high) {
            int pi = partition(model, column, low, high);
            quicksortRecursive(model, column, low, pi - 1);
            quicksortRecursive(model, column, pi + 1, high);
        }
    }

    // M�todo para realizar la partici�n en el QuickSort
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

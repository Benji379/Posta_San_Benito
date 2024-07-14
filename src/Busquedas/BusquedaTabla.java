package Busquedas;

import Modelo.ArbolBinario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class BusquedaTabla {

    public static DefaultTableModel filtro_BusquedaBinaria(HashMap<Integer, Object> filtros, DefaultTableModel modeloOriginal) {
        ArrayList<ArrayList<Object>> datos = extraerDatos(modeloOriginal);
        ArbolBinario arbol = new ArbolBinario();
        for (ArrayList<Object> fila : datos) {
            arbol.insertar(fila);
        }
        ArrayList<ArrayList<Object>> datosFiltrados = arbol.filtrar(filtros);
        return crearModeloDesdeDatos(datosFiltrados, modeloOriginal);
    }

    public static DefaultTableModel filtro_BusquedaSecuencial(HashMap<Integer, Object> filtros, DefaultTableModel modeloOriginal) {
        ArrayList<ArrayList<Object>> datos = extraerDatos(modeloOriginal);
        ArbolBinario arbol = new ArbolBinario();
        for (ArrayList<Object> fila : datos) {
            arbol.insertar(fila);
        }
        ArrayList<ArrayList<Object>> datosFiltrados = arbol.filtrar(filtros);  // Utiliza la misma función filtrar para búsqueda secuencial
        return crearModeloDesdeDatos(datosFiltrados, modeloOriginal);
    }

    private static ArrayList<ArrayList<Object>> extraerDatos(DefaultTableModel modelo) {
        ArrayList<ArrayList<Object>> datos = new ArrayList<>();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            ArrayList<Object> fila = new ArrayList<>();
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fila.add(modelo.getValueAt(i, j));
            }
            datos.add(fila);
        }
        return datos;
    }

    private static DefaultTableModel crearModeloDesdeDatos(ArrayList<ArrayList<Object>> datosFiltrados, DefaultTableModel modeloOriginal) {
        DefaultTableModel nuevoModelo = new DefaultTableModel();
        for (int i = 0; i < modeloOriginal.getColumnCount(); i++) {
            nuevoModelo.addColumn(modeloOriginal.getColumnName(i));
        }
        for (ArrayList<Object> fila : datosFiltrados) {
            nuevoModelo.addRow(new Vector<>(fila));
        }
        return nuevoModelo;
    }
     public static DefaultTableModel filtro_BusquedaPorFechas(DefaultTableModel modeloOriginal, String fechaInicio, String fechaFinal, int columnaFecha, HashMap<Integer, Object> filtros) throws ParseException {
        ArrayList<ArrayList<Object>> datos = extraerDatos(modeloOriginal);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date inicio = sdf.parse(fechaInicio);
        Date fin = sdf.parse(fechaFinal);
        ArrayList<ArrayList<Object>> datosFiltrados = new ArrayList<>();

        for (ArrayList<Object> fila : datos) {
            Date fecha = sdf.parse((String) fila.get(columnaFecha));
            boolean cumpleFechas = !fecha.before(inicio) && !fecha.after(fin);
            boolean cumpleFiltros = true;
            
            for (Integer columna : filtros.keySet()) {
                if (!fila.get(columna).equals(filtros.get(columna))) {
                    cumpleFiltros = false;
                    break;
                }
            }

            if (cumpleFechas && cumpleFiltros) {
                datosFiltrados.add(fila);
            }
        }

        return crearModeloDesdeDatos(datosFiltrados, modeloOriginal);
    }
    
}

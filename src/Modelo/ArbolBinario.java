package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class ArbolBinario {

    Nodo raiz;

    public void insertar(ArrayList<Object> datos) {
        raiz = insertarRecursivo(raiz, datos, 0);
    }

    private Nodo insertarRecursivo(Nodo nodo, ArrayList<Object> datos, int col) {
        if (nodo == null) {
            nodo = new Nodo(datos);
            return nodo;
        }
        int nextCol = (col + 1) % datos.size();
        if (Math.random() > 0.5) {  // Insertar de forma aleatoria para mantener un árbol balanceado
            nodo.izquierda = insertarRecursivo(nodo.izquierda, datos, nextCol);
        } else {
            nodo.derecha = insertarRecursivo(nodo.derecha, datos, nextCol);
        }
        return nodo;
    }

    public ArrayList<ArrayList<Object>> filtrar(HashMap<Integer, Object> filtros) {
        ArrayList<ArrayList<Object>> resultados = new ArrayList<>();
        filtrarRecursivo(raiz, resultados, filtros, 0);
        return resultados;
    }

    private void filtrarRecursivo(Nodo nodo, ArrayList<ArrayList<Object>> resultados, HashMap<Integer, Object> filtros, int col) {
        if (nodo == null) {
            return;
        }

        boolean coincide = cumpleFiltros(nodo.datos, filtros);
        if (coincide) {
            resultados.add(nodo.datos);
        }

        filtrarRecursivo(nodo.izquierda, resultados, filtros, (col + 1) % nodo.datos.size());
        filtrarRecursivo(nodo.derecha, resultados, filtros, (col + 1) % nodo.datos.size());
    }

    private boolean cumpleFiltros(ArrayList<Object> datos, HashMap<Integer, Object> filtros) {
        for (Integer clave : filtros.keySet()) {
            Object valorFiltro = filtros.get(clave);
            Object valorDato = datos.get(clave);

            // Si el filtro está vacío, no aplicar ningún filtro para esa columna
            if (valorFiltro instanceof String && ((String) valorFiltro).isEmpty()) {
                continue; // Salta a la siguiente iteración del bucle, no aplicar filtro
            }

            if (valorFiltro instanceof String) {
                String filtroStr = ((String) valorFiltro).toLowerCase();
                if (valorDato instanceof String) {
                    // Compara como String conteniendo subcadena
                    if (!((String) valorDato).toLowerCase().contains(filtroStr)) {
                        return false;
                    }
                } else if (valorDato instanceof Number) {
                    // Compara como valor numérico (aproximación)
                    try {
                        double datoNum = ((Number) valorDato).doubleValue();
                        double filtroNum = Double.parseDouble(filtroStr);
                        if (datoNum != filtroNum) {
                            return false;
                        }
                    } catch (NumberFormatException e) {
                        return false; // Si el filtro no es un número válido, siempre retorna false
                    }
                }
            } else if (valorFiltro instanceof Number && valorDato instanceof Number) {
                // Comparación directa de números
                if (!valorFiltro.equals(valorDato)) {
                    return false;
                }
            } else {
                // Otros casos: asegúrate de que ambos objetos son exactamente iguales
                if (!valorFiltro.equals(valorDato)) {
                    return false;
                }
            }
        }
        return true;
    }

    class Nodo {

        ArrayList<Object> datos;
        Nodo izquierda, derecha;

        Nodo(ArrayList<Object> datos) {
            this.datos = datos;
        }
    }
}

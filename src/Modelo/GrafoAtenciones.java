package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class GrafoAtenciones {

    private final Atencion[][] MATRIZ_ATENCIONES;
    private final int TAMANIO;
    private final HashMap<String, int[]> MAPA_INDICES;

    public GrafoAtenciones(int size) {
        this.TAMANIO = size;
        this.MATRIZ_ATENCIONES = new Atencion[size][size];
        this.MAPA_INDICES = new HashMap<>();
    }

    public void agregarNodo(Atencion atencion) {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (MATRIZ_ATENCIONES[i][j] == null) {
                    MATRIZ_ATENCIONES[i][j] = atencion;
                    MAPA_INDICES.put(atencion.getIdAtencion(), new int[]{i, j});
                    return;
                }
            }
        }
    }

    public void eliminarNodo(String idAtencion) {
        int[] indices = MAPA_INDICES.get(idAtencion);
        if (indices != null) {
            MATRIZ_ATENCIONES[indices[0]][indices[1]] = null;
            MAPA_INDICES.remove(idAtencion);
        }
    }

    public Atencion getNodo(String idAtencion) {
        int[] indices = MAPA_INDICES.get(idAtencion);
        if (indices != null) {
            return MATRIZ_ATENCIONES[indices[0]][indices[1]];
        }
        return null;
    }

    public ArrayList<Atencion> getNodos() {
        ArrayList<Atencion> nodos = new ArrayList<>();
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (MATRIZ_ATENCIONES[i][j] != null) {
                    nodos.add(MATRIZ_ATENCIONES[i][j]);
                }
            }
        }
        return nodos;
    }

    public void actualizarNodo(Atencion atencion) {
        int[] indices = MAPA_INDICES.get(atencion.getIdAtencion());
        if (indices != null) {
            MATRIZ_ATENCIONES[indices[0]][indices[1]] = atencion;
        }
    }
}

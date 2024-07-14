package Persistencias;

import Modelo.Atencion;
import Pilas.PilaAtencion;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataAtencion {

    private static final String FILE_PATH = "data/atenciones.bin";
    private final HashMap<String, Atencion> MAPA_ATENCIONES;
    private final LinkedList<Atencion> LISTA_ATENCIONES;
    private final PilaAtencion PILA_ATENCIONES;

    public DataAtencion() {
        this.MAPA_ATENCIONES = new HashMap<>();
        this.LISTA_ATENCIONES = new LinkedList<>();
        this.PILA_ATENCIONES = new PilaAtencion();
        cargarDatos();
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Atencion atencion;
            while ((atencion = (Atencion) ois.readObject()) != null) {
                MAPA_ATENCIONES.put(atencion.getIdAtencion(), atencion);
                LISTA_ATENCIONES.add(atencion);
                PILA_ATENCIONES.push(atencion);
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Atencion atencion : LISTA_ATENCIONES) {
                oos.writeObject(atencion);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public ArrayList<Atencion> getData() {
        return new ArrayList<>(LISTA_ATENCIONES);
    }

    public void registrar(Atencion atencion) {
        if (!MAPA_ATENCIONES.containsKey(atencion.getIdAtencion())) {
            MAPA_ATENCIONES.put(atencion.getIdAtencion(), atencion);
            LISTA_ATENCIONES.add(atencion);
            PILA_ATENCIONES.push(atencion);
            guardarDatos();
        }
    }

    public void editar(Atencion atencion) {
        if (MAPA_ATENCIONES.containsKey(atencion.getIdAtencion())) {
            Atencion antiguaAtencion = MAPA_ATENCIONES.get(atencion.getIdAtencion());
            PILA_ATENCIONES.push(antiguaAtencion);
            MAPA_ATENCIONES.put(atencion.getIdAtencion(), atencion);
            int index = LISTA_ATENCIONES.indexOf(antiguaAtencion);
            if (index != -1) {
                LISTA_ATENCIONES.set(index, atencion);
            }
            guardarDatos();
        }
    }

    public void eliminar(String idAtencion) {
        if (MAPA_ATENCIONES.containsKey(idAtencion)) {
            Atencion atencionAEliminar = MAPA_ATENCIONES.get(idAtencion);
            PILA_ATENCIONES.push(atencionAEliminar);
            LISTA_ATENCIONES.remove(atencionAEliminar);
            MAPA_ATENCIONES.remove(idAtencion);
            guardarDatos();
        }
    }

    public Atencion getAtencion(String idAtencion) {
        return MAPA_ATENCIONES.get(idAtencion);
    }

    public void deshacerUltimaOperacion() {
        if (!PILA_ATENCIONES.isEmpty()) {
            Atencion atencionDeshacer = PILA_ATENCIONES.pop();
            if (MAPA_ATENCIONES.containsKey(atencionDeshacer.getIdAtencion())) {
                editar(atencionDeshacer);
            } else {
                registrar(atencionDeshacer);
            }
        }
    }

}

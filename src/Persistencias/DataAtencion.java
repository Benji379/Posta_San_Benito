package Persistencias;

import Modelo.Atencion;
import Modelo.GrafoAtenciones;
import Pilas.PilaAtencion;
import java.io.*;
import java.util.ArrayList;

public class DataAtencion {

    private static final String FILE_PATH = "data/atenciones.bin";
    private final GrafoAtenciones grafoAtenciones;
    private final PilaAtencion pilaAtenciones;
    private final int SIZE = 100; // Tamaño de la matriz

    public DataAtencion() {
        this.grafoAtenciones = new GrafoAtenciones(SIZE);
        this.pilaAtenciones = new PilaAtencion();
        cargarDatos();
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Atencion atencion;
            while ((atencion = (Atencion) ois.readObject()) != null) {
                grafoAtenciones.agregarNodo(atencion);
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Atencion atencion : grafoAtenciones.getNodos()) {
                oos.writeObject(atencion);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public ArrayList<Atencion> getData() {
        return grafoAtenciones.getNodos();
    }

    public void registrar(Atencion atencion) {
        if (grafoAtenciones.getNodo(atencion.getIdAtencion()) == null) {
            grafoAtenciones.agregarNodo(atencion);
            guardarDatos();
        }
    }

    public void editar(Atencion nuevaAtencion) {
        if (grafoAtenciones.getNodo(nuevaAtencion.getIdAtencion()) != null) {
            grafoAtenciones.actualizarNodo(nuevaAtencion);
            guardarDatos();
        }
    }

    public void eliminar(String idAtencion) {
        if (grafoAtenciones.getNodo(idAtencion) != null) {
            grafoAtenciones.eliminarNodo(idAtencion);
            guardarDatos();
        }
    }

    public Atencion getAtencion(String idAtencion) {
        return grafoAtenciones.getNodo(idAtencion);
    }

    public void deshacerUltimaOperacion() {
        if (!pilaAtenciones.isEmpty()) {
            Atencion atencionDeshacer = pilaAtenciones.pop();
            if (grafoAtenciones.getNodo(atencionDeshacer.getIdAtencion()) != null) {
                editar(atencionDeshacer);
            } else {
                registrar(atencionDeshacer);
            }
        }
    }
}

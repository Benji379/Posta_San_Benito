package Persistencias;

import Modelo.Especialidad;
import Pilas.PilaEspecialidad;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataEspecialidad {

    private static final String FILE_PATH = "data/especialidades.bin";
    private final HashMap<String, Especialidad> MAPA_ESPECIALIDADES;
    private final LinkedList<Especialidad> LISTA_ESPECIALIDADES;
    private final PilaEspecialidad PILA_ESPECIALIDADES;

    public DataEspecialidad() {
        this.MAPA_ESPECIALIDADES = new HashMap<>();
        this.LISTA_ESPECIALIDADES = new LinkedList<>();
        this.PILA_ESPECIALIDADES = new PilaEspecialidad();
        cargarDatos();
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Especialidad especialidad;
            while ((especialidad = (Especialidad) ois.readObject()) != null) {
                MAPA_ESPECIALIDADES.put(especialidad.getEspecialidad(), especialidad);
                LISTA_ESPECIALIDADES.add(especialidad);
                PILA_ESPECIALIDADES.push(especialidad);
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Especialidad especialidad : LISTA_ESPECIALIDADES) {
                oos.writeObject(especialidad);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Especialidad> getData() {
        return new ArrayList<>(LISTA_ESPECIALIDADES);
    }

    public void registrar(Especialidad especialidad) {
        if (!MAPA_ESPECIALIDADES.containsKey(especialidad.getEspecialidad())) {
            MAPA_ESPECIALIDADES.put(especialidad.getEspecialidad(), especialidad);
            LISTA_ESPECIALIDADES.add(especialidad);
            PILA_ESPECIALIDADES.push(especialidad);
            guardarDatos();
        }
    }

    public void editar(Especialidad especialidad) {
        if (MAPA_ESPECIALIDADES.containsKey(especialidad.getEspecialidad())) {
            Especialidad antiguaEspecialidad = MAPA_ESPECIALIDADES.get(especialidad.getEspecialidad());
            PILA_ESPECIALIDADES.push(antiguaEspecialidad);
            MAPA_ESPECIALIDADES.put(especialidad.getEspecialidad(), especialidad);
            int index = LISTA_ESPECIALIDADES.indexOf(antiguaEspecialidad);
            if (index != -1) {
                LISTA_ESPECIALIDADES.set(index, especialidad);
            }
            guardarDatos();
        }
    }

    public void eliminar(String especialidadNombre) {
        if (MAPA_ESPECIALIDADES.containsKey(especialidadNombre)) {
            Especialidad especialidadAEliminar = MAPA_ESPECIALIDADES.get(especialidadNombre);
            PILA_ESPECIALIDADES.push(especialidadAEliminar);
            LISTA_ESPECIALIDADES.remove(especialidadAEliminar);
            MAPA_ESPECIALIDADES.remove(especialidadNombre);
            guardarDatos();
        }
    }

    public Especialidad getEspecialidad(String especialidadNombre) {
        return MAPA_ESPECIALIDADES.get(especialidadNombre);
    }

    public void deshacerUltimaOperacion() {
        if (!PILA_ESPECIALIDADES.isEmpty()) {
            Especialidad especialidadDeshacer = PILA_ESPECIALIDADES.pop();
            if (MAPA_ESPECIALIDADES.containsKey(especialidadDeshacer.getEspecialidad())) {
                editar(especialidadDeshacer);
            } else {
                registrar(especialidadDeshacer);
            }
        }
    }

    public boolean existeEspecialidad (String especialidad) {
        return MAPA_ESPECIALIDADES.containsKey(especialidad);
    }

    public static void main(String[] args) {
        // Crear instancia de DataEspecialidad
        DataEspecialidad gestionEspecialidades = new DataEspecialidad();

        // Creando y registrando nuevas especialidades
        Especialidad esp1 = new Especialidad("Cardiología", 300, "Activa", "01/01/2020");
        Especialidad esp2 = new Especialidad("Dermatología", 200, "Activa", "02/02/2020");

        System.out.println("Registrando especialidades...");
        gestionEspecialidades.registrar(esp1);
        gestionEspecialidades.registrar(esp2);

        // Mostrando datos después del registro
        System.out.println("Datos después de registro:");
        gestionEspecialidades.getData().forEach(especialidad -> System.out.println(especialidad.getEspecialidad() + " - " + especialidad.getCostoAtencion()));

        // Editando una especialidad
        System.out.println("\nEditando la especialidad de Dermatología...");
        esp2.setCostoAtencion(250);  // Cambiando el costo de atención
        esp2.setEstado("Inactiva");  // Cambiando el estado
        gestionEspecialidades.editar(esp2);

        // Mostrando datos después de la edición
        System.out.println("Datos después de edición:");
        gestionEspecialidades.getData().forEach(especialidad -> System.out.println(especialidad.getEspecialidad() + " - " + especialidad.getCostoAtencion() + " - " + especialidad.getEstado()));

        // Eliminando una especialidad
        System.out.println("\nEliminando la especialidad de Cardiología...");
        gestionEspecialidades.eliminar("Cardiología");

        // Mostrando datos después de eliminar
        System.out.println("Datos después de eliminar:");
        gestionEspecialidades.getData().forEach(especialidad -> System.out.println(especialidad.getEspecialidad() + " - " + especialidad.getCostoAtencion()));

        // Deshaciendo la última operación (eliminar)
        System.out.println("\nDeshaciendo la eliminación de la especialidad de Cardiología...");
        gestionEspecialidades.deshacerUltimaOperacion();

        // Mostrando datos después de deshacer
        System.out.println("Datos después de deshacer la eliminación:");
        gestionEspecialidades.getData().forEach(especialidad -> System.out.println(especialidad.getEspecialidad() + " - " + especialidad.getCostoAtencion()));

        // Obteniendo una especialidad específica
        System.out.println("\nObteniendo datos de la especialidad de Dermatología:");
        Especialidad dermatologia = gestionEspecialidades.getEspecialidad("Dermatología");
        if (dermatologia != null) {
            System.out.println(dermatologia.getEspecialidad() + " - " + dermatologia.getCostoAtencion() + " - " + dermatologia.getEstado());
        }
    }

}

package Persistencias;

import Modelo.Paciente;
import Pilas.PilaPaciente;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataPaciente {

    private static final String FILE_PATH = "data/pacientes.bin";
    private final HashMap<String, Paciente> MAPA_PACIENTES;
    private final LinkedList<Paciente> LISTA_PACIENTES;
    private final PilaPaciente PILA_PACIENTES;

    public DataPaciente() {
        this.MAPA_PACIENTES = new HashMap<>();
        this.LISTA_PACIENTES = new LinkedList<>();
        this.PILA_PACIENTES = new PilaPaciente();
        cargarDatos();
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Paciente paciente;
            while ((paciente = (Paciente) ois.readObject()) != null) {
                MAPA_PACIENTES.put(paciente.getDni(), paciente);
                LISTA_PACIENTES.add(paciente);
                PILA_PACIENTES.push(paciente);
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Paciente paciente : LISTA_PACIENTES) {
                oos.writeObject(paciente);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Paciente> getData() {
        return new ArrayList<>(LISTA_PACIENTES);
    }

    public void registrar(Paciente paciente) {
        if (!MAPA_PACIENTES.containsKey(paciente.getDni())) {
            MAPA_PACIENTES.put(paciente.getDni(), paciente);
            LISTA_PACIENTES.add(paciente);
            PILA_PACIENTES.push(paciente);
            guardarDatos();
        }
    }

    public void editar(Paciente paciente) {
        if (MAPA_PACIENTES.containsKey(paciente.getDni())) {
            Paciente antiguoPaciente = MAPA_PACIENTES.get(paciente.getDni());
            PILA_PACIENTES.push(antiguoPaciente);
            MAPA_PACIENTES.put(paciente.getDni(), paciente);
            int index = LISTA_PACIENTES.indexOf(antiguoPaciente);
            if (index != -1) {
                LISTA_PACIENTES.set(index, paciente);
            }
            guardarDatos();
        }
    }

    public void eliminar(String dni) {
        if (MAPA_PACIENTES.containsKey(dni)) {
            Paciente pacienteAEliminar = MAPA_PACIENTES.get(dni);
            PILA_PACIENTES.push(pacienteAEliminar);
            LISTA_PACIENTES.remove(pacienteAEliminar);
            MAPA_PACIENTES.remove(dni);
            guardarDatos();
        }
    }

    public Paciente getPaciente(String dni) {
        return MAPA_PACIENTES.get(dni);
    }

    public void deshacerUltimaOperacion() {
        if (!PILA_PACIENTES.isEmpty()) {
            Paciente pacienteDeshacer = PILA_PACIENTES.pop();
            if (MAPA_PACIENTES.containsKey(pacienteDeshacer.getDni())) {
                editar(pacienteDeshacer);
            } else {
                registrar(pacienteDeshacer);
            }
        }
    }

    public boolean existePaciente(String dni) {
        return MAPA_PACIENTES.containsKey(dni);
    }

}

package Pilas;

import Modelo.Paciente;

public class PilaPaciente {

    // Clase interna NodoPaciente
    private class NodoPaciente {
        Paciente paciente;
        NodoPaciente siguiente;

        public NodoPaciente(Paciente paciente) {
            this.paciente = paciente;
            this.siguiente = null;
        }
    }

    private NodoPaciente cima;

    public PilaPaciente() {
        this.cima = null;
    }

    public void push(Paciente paciente) {
        NodoPaciente nuevoNodo = new NodoPaciente(paciente);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public Paciente pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        Paciente paciente = cima.paciente;
        cima = cima.siguiente;
        return paciente;
    }

    public Paciente peek() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        return cima.paciente;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public int size() {
        int count = 0;
        NodoPaciente temp = cima;
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }
}

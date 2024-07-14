package Pilas;

import Modelo.Especialidad;

public class PilaEspecialidad {

    // Clase interna NodoEspecialidad
    private class NodoEspecialidad {
        Especialidad especialidad;
        NodoEspecialidad siguiente;

        public NodoEspecialidad(Especialidad especialidad) {
            this.especialidad = especialidad;
            this.siguiente = null;
        }
    }

    private NodoEspecialidad cima;

    public PilaEspecialidad() {
        this.cima = null;
    }

    public void push(Especialidad especialidad) {
        NodoEspecialidad nuevoNodo = new NodoEspecialidad(especialidad);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public Especialidad pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        Especialidad especialidad = cima.especialidad;
        cima = cima.siguiente;
        return especialidad;
    }

    public Especialidad peek() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        return cima.especialidad;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public int size() {
        int count = 0;
        NodoEspecialidad temp = cima;
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }
}

package Pilas;

import Modelo.Atencion;

public class PilaAtencion {

    // Clase interna NodoAtencion
    private class NodoAtencion {
        Atencion atencion;
        NodoAtencion siguiente;

        public NodoAtencion(Atencion atencion) {
            this.atencion = atencion;
            this.siguiente = null;
        }
    }

    private NodoAtencion cima;

    public PilaAtencion() {
        this.cima = null;
    }

    public void push(Atencion atencion) {
        NodoAtencion nuevoNodo = new NodoAtencion(atencion);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public Atencion pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        Atencion atencion = cima.atencion;
        cima = cima.siguiente;
        return atencion;
    }

    public Atencion peek() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        return cima.atencion;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public int size() {
        int count = 0;
        NodoAtencion temp = cima;
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }
}

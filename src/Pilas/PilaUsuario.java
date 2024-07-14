package Pilas;

import Modelo.Usuario;

public class PilaUsuario {

    // Clase interna NodoUsuario
    private class NodoUsuario {

        Usuario usuario;
        NodoUsuario siguiente;

        public NodoUsuario(Usuario usuario) {
            this.usuario = usuario;
            this.siguiente = null;
        }
    }

    private NodoUsuario cima;  // Referencia al nodo superior de la pila
    private NodoUsuario finalCola;  // Referencia al nodo final de la cola

    public PilaUsuario() {
        this.cima = null;
        this.finalCola = null;
    }

    // Métodos de Pila
    public void push(Usuario usuario) {
        NodoUsuario nuevoNodo = new NodoUsuario(usuario);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        if (finalCola == null) {
            finalCola = nuevoNodo;
        }
    }

    public Usuario pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        Usuario usuario = cima.usuario;
        cima = cima.siguiente;
        if (cima == null) {
            finalCola = null;  // Si la pila queda vacía, la cola también está vacía
        }
        return usuario;
    }

    // Métodos de Cola
    public void enqueue(Usuario usuario) {
        NodoUsuario nuevoNodo = new NodoUsuario(usuario);
        if (finalCola == null) {
            cima = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    public Usuario dequeue() {
        if (cima == null) {
            System.out.println("La cola está vacía");
            return null;
        }
        Usuario usuario = cima.usuario;
        cima = cima.siguiente;
        if (cima == null) {
            finalCola = null;  // Si la cola queda vacía, la pila también está vacía
        }
        return usuario;
    }

    // Método para observar el usuario en la cima de la pila sin retirarlo (peek)
    public Usuario peek() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        return cima.usuario;
    }

    // Método para verificar si la pila/cola está vacía
    public boolean isEmpty() {
        return cima == null;
    }

    // Método para contar los elementos en la pila/cola
    public int size() {
        int count = 0;
        NodoUsuario temp = cima;
        while (temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }
}

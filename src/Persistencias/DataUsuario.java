package Persistencias;

import Modelo.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataUsuario {

    private static final String FILE_PATH = "data/usuarios.bin"; // Ruta del archivo
    private final HashMap<String, Usuario> MAPA_USUARIOS; // HashMap para acceso rápido por código
    private final LinkedList<Usuario> LISTA_USUARIOS; // Lista enlazada de usuarios
    private final Pilas.PilaUsuario PILA_USUARIOS; // Pila de usuarios para manejar historial de operaciones

    public DataUsuario() {
        this.MAPA_USUARIOS = new HashMap<>();
        this.LISTA_USUARIOS = new LinkedList<>();
        this.PILA_USUARIOS = new Pilas.PilaUsuario();
        cargarDatos();
    }

    // Carga los usuarios desde el archivo
    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Usuario usuario;
            while ((usuario = (Usuario) ois.readObject()) != null) {
                MAPA_USUARIOS.put(usuario.getCodigo(), usuario);
                LISTA_USUARIOS.add(usuario);
                PILA_USUARIOS.push(usuario);  // Cargamos los usuarios en la pila también
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Guarda todos los usuarios en el archivo
    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Usuario usuario : LISTA_USUARIOS) {
                oos.writeObject(usuario);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Usuario> getData() {
        return new ArrayList<>(LISTA_USUARIOS);
    }

    public void registrar(Usuario usuario) {
        if (!MAPA_USUARIOS.containsKey(usuario.getCodigo())) {
            MAPA_USUARIOS.put(usuario.getCodigo(), usuario);
            LISTA_USUARIOS.add(usuario);
            PILA_USUARIOS.push(usuario); // Añadir usuario a la pila al registrar
            guardarDatos();
        }
    }

    public void editar(Usuario usuario) {
        if (MAPA_USUARIOS.containsKey(usuario.getCodigo())) {
            Usuario antiguoUsuario = MAPA_USUARIOS.get(usuario.getCodigo());
            PILA_USUARIOS.push(antiguoUsuario); // Guardar estado anterior en la pila antes de editar
            MAPA_USUARIOS.put(usuario.getCodigo(), usuario);
            int index = LISTA_USUARIOS.indexOf(antiguoUsuario);
            if (index != -1) {
                LISTA_USUARIOS.set(index, usuario);
            }
            guardarDatos();
        }
    }

    public void eliminar(String codigoUsuario) {
        if (MAPA_USUARIOS.containsKey(codigoUsuario)) {
            Usuario usuarioAEliminar = MAPA_USUARIOS.get(codigoUsuario);
            PILA_USUARIOS.push(usuarioAEliminar); // Guardar estado antes de eliminar
            LISTA_USUARIOS.remove(usuarioAEliminar);
            MAPA_USUARIOS.remove(codigoUsuario);
            guardarDatos();
        }
    }

    public Usuario getUsuario(String codigoUsuario) {
        return MAPA_USUARIOS.get(codigoUsuario);
    }

    // Método para deshacer la última operación realizada
    public void deshacerUltimaOperacion() {
        if (!PILA_USUARIOS.isEmpty()) {
            Usuario usuarioDeshacer = PILA_USUARIOS.pop();
            if (MAPA_USUARIOS.containsKey(usuarioDeshacer.getCodigo())) {
                editar(usuarioDeshacer); // Restaurar usuario anterior
            } else {
                registrar(usuarioDeshacer); // Restaurar usuario eliminado
            }
        }
    }

    public boolean existeUsuarioPorDni(String dni) {
        return LISTA_USUARIOS.stream().anyMatch(usuario -> usuario.getDni().equals(dni));
    }

    public boolean existeUsuarioPorCodigo(String codigo) {
        return MAPA_USUARIOS.containsKey(codigo);
    }
}

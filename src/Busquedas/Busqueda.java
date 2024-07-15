package Busquedas;

import Modelo.Paciente;
import java.util.List;

public class Busqueda {

    public static Paciente busquedaBinariaPaciente(List<Paciente> lista, String dniPaciente, int bajo, int alto) {
        if (alto >= bajo) {
            int medio = bajo + (alto - bajo) / 2;
            Paciente medioPaciente = lista.get(medio);

            if (medioPaciente.getDni().equals(dniPaciente)) {
                return medioPaciente;
            }

            if (medioPaciente.getDni().compareTo(dniPaciente) > 0) {
                return busquedaBinariaPaciente(lista, dniPaciente, bajo, medio - 1);
            }

            return busquedaBinariaPaciente(lista, dniPaciente, medio + 1, alto);
        }
 
        return null; // Paciente no encontrado
    }

    public static Paciente busquedaSecuencialPaciente(List<Paciente> lista, String nombreCliente, int indice) {
        if (indice < lista.size()) {
            Paciente actual = lista.get(indice);
            if (actual.getNombres().equalsIgnoreCase(nombreCliente)) {
                return actual;
            }
            return busquedaSecuencialPaciente(lista, nombreCliente, indice + 1);
        }

        return null; // Paciente no encontrado
    }
}

package Controlador;

import Modelo.*;
import Persistencias.*;
import Procesos.HistoriaClinicaPDF;
import Procesos.Proceso;
import Vista.MdlHistoria;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ControladorHistoria {

    private final MdlHistoria V;

    public ControladorHistoria(MdlHistoria V) {
        this.V = V;
    }

    public void init() {
        rellenarCombo(V.comboPaciente);
    }

    private static void rellenarCombo(JComboBox comboPacientes) {
        ArrayList<Paciente> listaPacientes = new DataPaciente().getData();

        //rellenarComboPacientes
        comboPacientes.removeAllItems();
        for (Paciente pa : listaPacientes) {
            comboPacientes.addItem(pa.getDni());
        }
    }

    public void descargarHistoriaPdf() {
        int cantidadItems = V.comboPaciente.getItemCount();
        if (cantidadItems > 0) {
            String dniCliente = V.comboPaciente.getSelectedItem().toString();
            ArrayList<HistoriaPdf> historia = parseHistoriaPdf(atencionesCliente(dniCliente));
            int cantidadHistoria = historia.size();
            if (cantidadHistoria > 0) {
                String nombre = "HISTORIA CLINICA_" + dniCliente;
//            java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(V);
                String direccionDescarga = Componentes.CustomFileChooser.chooseFile(null, nombre, "pdf", "Archivos pdf");
                if (direccionDescarga != null) {
                    generarPdf(historia, direccionDescarga);
                    Proceso.mensaje(nombre + ".pdf" + " a sido descargado", "icono.png");
                    Proceso.abrirArchivo(direccionDescarga);
                }
            } else {
                Proceso.error("El paciente aún no a sido antendido");
            }
        }else{
            Proceso.error("No hay pacientes registrados");
        }
    }

    private void generarPdf(ArrayList<HistoriaPdf> historia, String direccionDescarga) {
        try {
            // Llamar al método para generar el PDF
            String direccionImagen = "logotipo.png"; // Ajustar al path de la imagen
            Color colorFondoEncabezados = new DeviceRgb(204, 238, 237); // Ejemplo de color de fondo de encabezados
            Color colorBordes = new DeviceRgb(121, 121, 121); // Ejemplo de color de bordes

            // Llama al método que genera el PDF con varias historias clínicas
            HistoriaClinicaPDF.generarCitaPdf(historia, direccionDescarga, direccionImagen, colorFondoEncabezados, colorBordes,
                    600, 500, 0.2f);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private ArrayList<Atencion> atencionesCliente(String dniCliente) {
        ArrayList<Atencion> lista = new ArrayList<>();
        for (Atencion at : new DataAtencion().getData()) {
            String dniTemp = at.getDniCliente();
            if (dniTemp.equalsIgnoreCase(dniCliente)) {
                lista.add(at);
            }
        }
        return lista;
    }

    private ArrayList<HistoriaPdf> parseHistoriaPdf(ArrayList<Atencion> anteciones) {
        ArrayList<HistoriaPdf> lista = new ArrayList<>();
        for (Atencion at : anteciones) {
            Paciente pa = new DataPaciente().getPaciente(at.getDniCliente());
            Usuario us = new DataUsuario().getUsuario(at.getIdMedico());
            lista.add(new HistoriaPdf(at, pa, us));
        }
        return lista;
    }

}

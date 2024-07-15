package Test;

import Modelo.HistoriaPdf;
import Modelo.Atencion;
import Modelo.Paciente;
import Modelo.Usuario;
import Procesos.Proceso;
import com.itextpdf.kernel.colors.DeviceRgb;
import java.util.ArrayList;

public class TestPdf {

    public static void main(String[] args) {
        try {
            // Crear una lista de historias clínicas para generar en el PDF
            ArrayList<HistoriaPdf> historias = new ArrayList<>();

            // Supongamos que tenemos datos de ejemplo para 3 pacientes
            for (int i = 0; i < 3; i++) {
                HistoriaPdf historia = new HistoriaPdf();
                Atencion atencion = new Atencion();
                Paciente paciente = new Paciente();
                Usuario doctor = new Usuario();

                // Configuración de datos de ejemplo
                atencion.setEnfermedadActual("GOLA");
                atencion.setDniCliente("asdsda");
                atencion.setMotivoConsulta("asdsddas");
                paciente.setDni("12345678" + i);
                paciente.setNombres("Nombre" + i);
                paciente.setApellidoPaterno("Apellido" + i);
                paciente.setFechaNacimiento("1990-01-01");
                atencion.setIdAtencion("0000000" + i);
                atencion.setFecha(Procesos.Proceso.fecha(Proceso.FECHA_ACTUAL()));
                atencion.setHora("10:00 AM");
                atencion.setMotivoConsulta("Consulta de rutina");
                atencion.setEnfermedadActual("Ninguna enfermedad significativa.");
                doctor.setCodigo("DR" + i);
                doctor.setNombres("Dr. Ejemplo" + i);

                // Setear objetos al objeto historia
                historia.setAtencion(atencion);
                historia.setPaciente(paciente);
                historia.setDoctor(doctor);

                // Añadir la historia clínica a la lista
                historias.add(historia);
            }

            // Llamar al método para generar el PDF
            String direccionDescarga = "GENERADO.pdf"; // Ajustar al path deseado
            String direccionImagen = "logotipo.png"; // Ajustar al path de la imagen
            DeviceRgb colorFondoEncabezados = new DeviceRgb(204, 229, 255); // Color azul claro
            DeviceRgb colorBordes = new DeviceRgb(0, 0, 0); // Color negro

            // Llama al método que genera el PDF con varias historias clínicas
            HistoriaClinicaPDF.generarCitaPdf(historias, direccionDescarga, direccionImagen, colorFondoEncabezados, colorBordes,
                    100, 100, 0.5f);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

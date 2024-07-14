package Procesos;

import Modelo.Paciente;
import Persistencias.DataPaciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesoPaciente extends Proceso {

    public static DefaultTableModel getModeloRegistro(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Paciente> lista = new DataPaciente().getData();
        int cont = 0;
        for (Paciente pa : lista) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                pa.getDni(),
                pa.getNombres(),
                pa.getApellidoPaterno() + " " + pa.getApellidoMaterno(),
                pa.getFecha()
            });
        }
        return modelo;
    }
    public static DefaultTableModel getModeloRegistroMant(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Paciente> lista = new DataPaciente().getData();
        int cont = 0;
        for (Paciente pa : lista) {
            cont++;
            modelo.addRow(new Object[]{
                cont,
                pa.getDni(),
                pa.getNombres(),
                pa.getApellidoPaterno(),
                pa.getApellidoMaterno(),
                pa.getSexo(),
                pa.getProcedencia(),
                pa.getOcupacion(),
                pa.getEscolaridad(),
                pa.getEstadoCivil(),
                pa.getHijos(),
                pa.getGrupoSanguineo(),
                pa.getRh(),
                pa.getResidencia(),
                pa.getFechaNacimiento(),
                pa.getFecha()
            });
        }
        return modelo;
    }

    public static boolean validar(Paciente pa) {
        boolean validoSinEspacio = validoSinEspacios(
                pa.getApellidoMaterno(), pa.getApellidoPaterno(), pa.getDni(),
                pa.getFecha(), pa.getFechaNacimiento(), pa.getNombres(),
                pa.getOcupacion(), pa.getResidencia());
        return validoSinEspacio;
    }
    
    public static int opcBuscar(){
         // Define los botones que se mostrarán en el diálogo
        Object[] options = {"DNI", "Nombres"};

        // Crea el showOptionDialog
        int choice = JOptionPane.showOptionDialog(
                null,                   
                "Seleccione una opción para filtrar:", 
                "FILTRAR POR",           
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                new Proceso().icono("buscar.png"),                 
                options,              
                options[0]             
        );

        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Filtrar por DNI");
        } else if (choice == JOptionPane.NO_OPTION) {
            System.out.println("Filtrar por Nombres");
        }
        return choice;
    }
    
}

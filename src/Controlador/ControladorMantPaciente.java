package Controlador;

import Busquedas.Busqueda;
import Modelo.Paciente;
import Persistencias.DataPaciente;
import Procesos.Proceso;
import Procesos.ProcesoPaciente;
import Vista.MdlMantPaciente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControladorMantPaciente {

    private final MdlMantPaciente V;
    private DataPaciente data;
    private DefaultTableModel modelo;
    private int filaSeleccionada;

    public ControladorMantPaciente(MdlMantPaciente V) {
        this.V = V;
    }

    public void init() {
        data = new DataPaciente();
        limpiar();
    }

    public void limpiar() {
        consultar();
        filaSeleccionada = -1;
        V.txtResidencia.setText("");
        V.txtOcupacion.setText("");
        V.txtCantHijos.setValue(0);
        V.jlbTittle.setText("Matenimiento Paciente");
    }

    public void editar() {
        if (filaSeleccionada > -1) {
            Paciente pa = recogerDatos();
            if (pa != null) {
                boolean sinVacio = Proceso.validoSinEspacios(pa.getOcupacion(), pa.getResidencia());
                if (sinVacio) {
                    int confirmar = Proceso.confirmacion("Confirmar edicion");
                    if (confirmar == 0) {
                        data.editar(pa);
                        limpiar();
                    }
                } else {
                    Proceso.error("Rellene todos los campos");
                }
            }
        } else {
            Proceso.error("Seleccione una fila");
        }
    }

    public void eliminar() {
        if (filaSeleccionada > -1) {
            String dniPaciente = V.tabla.getValueAt(filaSeleccionada, 1).toString();
            int confirmar = Proceso.confirmacion("Confirmar eliminacion");
            if (confirmar == 0) {
                data.eliminar(dniPaciente);
                limpiar();
                Proceso.mensaje("Paciente Eliminado");
            }
        } else {
            Proceso.error("Seleccione una fila");
        }
    }

    public void buscar() {
        try {
            int opc = ProcesoPaciente.opcBuscar();
            List<Paciente> listaPacientes = data.getData(); // Aseg�rate de tener acceso a la lista
            switch (opc) {
                case 0:
                    String dniBuscar = Proceso.input("Ingresa dni").toString();
                    System.out.println(dniBuscar);
                    Paciente pa = Busqueda.busquedaBinariaPaciente(listaPacientes, dniBuscar, 0, listaPacientes.size() - 1);
                    Proceso.mensaje(pa.toString(), "pacienteIcon.png");
                    break;
                case 1:
                    String nombreBuscar = Proceso.input("Ingresa nombre a buscar").toString();
                    Paciente p = Busqueda.busquedaSecuencialPaciente(listaPacientes, nombreBuscar, 0);
                    Proceso.mensaje(p.toString(), "pacienteIcon.png");
                    break;
            }
        } catch (Exception e) {
            Proceso.error("Usuario inv�lido");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void clickTabla() {
        filaSeleccionada = V.tabla.getSelectedRow();
        String dniPaciente = V.tabla.getValueAt(filaSeleccionada, 1).toString();
        String ocupacion = V.tabla.getValueAt(filaSeleccionada, 7).toString();
        String escolaridad = V.tabla.getValueAt(filaSeleccionada, 8).toString();
        String estadoCivil = V.tabla.getValueAt(filaSeleccionada, 9).toString();
        Object cantHijos = V.tabla.getValueAt(filaSeleccionada, 10);
        String residencia = V.tabla.getValueAt(filaSeleccionada, 13).toString();
        V.jlbTittle.setText("Paciente - " + dniPaciente);
        V.txtCantHijos.setValue(cantHijos);
        V.txtOcupacion.setText(ocupacion);
        V.txtResidencia.setText(residencia);
        V.comboEscolaridad.setSelectedItem(escolaridad);
        V.comboEstadoCivil.setSelectedItem(estadoCivil);
    }

    private Paciente recogerDatos() {
        try {
            String dniPaciente = V.tabla.getValueAt(filaSeleccionada, 1).toString();
            Paciente pa = data.getPaciente(dniPaciente);
            pa.setEscolaridad(V.comboEscolaridad.getSelectedItem().toString());
            pa.setOcupacion(V.txtOcupacion.getText());
            pa.setResidencia(V.txtResidencia.getText());
            pa.setHijos(Integer.parseInt(V.txtCantHijos.getValue().toString()));
            pa.setEstadoCivil(V.comboEstadoCivil.getSelectedItem().toString());
            return pa;
        } catch (NumberFormatException e) {
            Proceso.error("Ingrese una cantidad v�lida");
        }
        return null;
    }

    private void consultar() {
        modelo = ProcesoPaciente.getModeloRegistroMant(V.tabla);
        V.tabla.setModel(modelo);
    }

    public void ordenarPor() {
        int co = V.comboOrdenar.getSelectedIndex();

        switch (co) {
            case 1:
                Ordenamientos.AlgoritmosSort.burbuja(V.tabla, co);
                break;
            case 2:
                Ordenamientos.AlgoritmosSort.insercion(V.tabla, co);
                break;
            case 3:
                Ordenamientos.AlgoritmosSort.mergeSort(V.tabla, co);
                break;
            case 4:
                Ordenamientos.AlgoritmosSort.seleccion(V.tabla, co);
                break;
            case 5:
                Ordenamientos.AlgoritmosSort.shellSort(V.tabla, co);
                break;
            default:
                Ordenamientos.OrdenamientoTabla.ordenarTabla(V.tabla, co, true);
                break;
        }
    }
}

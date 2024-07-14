package Modelo;

import java.io.Serializable;
import java.util.Date;

public class Atencion implements Serializable {

    private static final long serialVersionUID = 1l;

    private String idAtencion;
    private String dniCliente;
    private String idMedico;
    private String especialidad;
    private String motivoConsulta;
    private String enfermedadActual;
    private Date fecha;
    private String hora;
    
    public Atencion() {
    }

    public Atencion(String idAtencion, String dniCliente, String idMedico, String especialidad, String motivoConsulta, String enfermedadActual, Date fecha, String hora) {
        this.idAtencion = idAtencion;
        this.dniCliente = dniCliente;
        this.idMedico = idMedico;
        this.motivoConsulta = motivoConsulta;
        this.especialidad = especialidad;
        this.enfermedadActual = enfermedadActual;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(String idAtencion) {
        this.idAtencion = idAtencion;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}

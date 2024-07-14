package Modelo;

import java.io.Serializable;

public class Especialidad implements Serializable {

    private static final long serialVersionUID = 1l;
    
    private String especialidad;
    private double costoAtencion;
    private String estado;
    private String fecha;

    public Especialidad() {
    }

    public Especialidad(String especialidad, double costoAtencion, String estado, String fecha) {
        this.especialidad = especialidad;
        this.costoAtencion = costoAtencion;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getCostoAtencion() {
        return costoAtencion;
    }

    public void setCostoAtencion(double costoAtencion) {
        this.costoAtencion = costoAtencion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

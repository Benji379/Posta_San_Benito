package Modelo;

import java.io.Serializable;

public class Paciente implements Serializable {

    private static final long serialVersionUID = 1l;

    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String procedencia;
    private String ocupacion;
    private String escolaridad;
    private String estadoCivil;
    private int hijos;
    private String grupoSanguineo;
    private String Rh;
    private String residencia;
    private String fechaNacimiento;
    private String fecha;

    public Paciente() {

    }

    public Paciente(String dni, String nombres, String apellidoPaterno, String apellidoMaterno, String sexo, String procedencia, String ocupacion, String escolaridad, String estadoCivil, int hijos, String grupoSanguineo, String Rh, String residencia, String fechaNacimiento, String fecha) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.procedencia = procedencia;
        this.ocupacion = ocupacion;
        this.escolaridad = escolaridad;
        this.estadoCivil = estadoCivil;
        this.hijos = hijos;
        this.grupoSanguineo = grupoSanguineo;
        this.Rh = Rh;
        this.residencia = residencia;
        this.fechaNacimiento = fechaNacimiento;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacionPrevia) {
        this.ocupacion = ocupacionPrevia;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String Rh) {
        this.Rh = Rh;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        String texto = "";
        String v = " - ";//la viñeta
        texto += "\n<html><b>       PACIENTE - " + dni + "</b></html>";
        texto += "\n " + v + " DNI\t: " + dni;
        texto += "\n " + v + " Nombres\t: " + nombres;
        texto += "\n " + v + " Apellido Paterno\t: " + apellidoPaterno;
        texto += "\n " + v + " Apellido Materno\t: " + apellidoMaterno;
        texto += "\n " + v + " Sexo\t: " + sexo;
        texto += "\n " + v + " Procedencia\t: " + procedencia;
        texto += "\n " + v + " Ocupacion\t: " + procedencia;
        texto += "\n " + v + " Escolaridad\t: " + escolaridad;
        texto += "\n " + v + " Estado Civil\t: " + estadoCivil;
        texto += "\n " + v + " Cantidad Hijos\t: " + hijos;
        texto += "\n " + v + " Grupo Sanguineo\t: " + grupoSanguineo;
        texto += "\n " + v + " Residencia\t: " + residencia;
        texto += "\n " + v + " Fecha Nacimiento\t: " + fechaNacimiento;
        texto += "\n " + v + " Fecha registro\t: " + fecha;

        return texto;
    }

}

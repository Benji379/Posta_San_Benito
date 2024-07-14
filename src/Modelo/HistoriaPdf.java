package Modelo;

public class HistoriaPdf {
    
    private Atencion atencion;
    private Paciente paciente;
    private Usuario doctor;

    public HistoriaPdf() {
    }

    public HistoriaPdf(Atencion atencion, Paciente paciente, Usuario doctor) {
        this.atencion = atencion;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Usuario getDoctor() {
        return doctor;
    }

    public void setDoctor(Usuario doctor) {
        this.doctor = doctor;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
}

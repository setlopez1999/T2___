package Entidades;

/**
 * @author Set Lopez
 */
public class CITA {
    
    
    private String fecha;
    private String hora;
    private MEDICO medico;
    private PACIENTE paciente;
    private ESPECIALIDAD especialidad;

    public CITA(MEDICO medico, PACIENTE paciente, ESPECIALIDAD especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
    }
    public String getTexto(){
        //nombre - tel - fecha - hora
        String t = paciente.getNombre()+ "                                   "
                + "                                 ";
        t = t.substring(0,30)+ paciente.getDni()+""
                + "                        " ;
        t = t.substring(0,40)+"| "+ fecha+" |                 ";
        t= t.substring(0,56)+hora;
        return t;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public MEDICO getMedico() {
        return medico;
    }
    public void setMedico(MEDICO medico) {
        this.medico = medico;
    }

    public PACIENTE getPaciente() {
        return paciente;
    }
    public void setPaciente(PACIENTE paciente) {
        this.paciente = paciente;
    }

    public ESPECIALIDAD getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(ESPECIALIDAD especialidad) {
        this.especialidad = especialidad;
    }
}
package Entidades;
import java.util.List;
/**
 *
 * @author Set Lopez
 */
public class MEDICO {
    private String nombre;
    private String CMP;
    private List<ESPECIALIDAD> especialidad;
    
    public MEDICO(String nombre, String CMP, List<ESPECIALIDAD> especialidad) {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidad = especialidad;
    }
    
    
    public String getTexto(){
        String t = nombre+ "                                             "
                + "               ";
        t = t.substring(0,50) + CMP;
        return t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public List<ESPECIALIDAD> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<ESPECIALIDAD> especialidad) {
        this.especialidad = especialidad;
    }
    
    
}

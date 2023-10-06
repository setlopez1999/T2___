package Entidades;

/**
 *
 * @author Set Lopez
 */
public class PACIENTE {
    
    private String dni;
    private String nombre;
    private String telefono;
    private int sexoBiologico;

    
    public PACIENTE(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getTexto(){
        String t = nombre+"                                       "
                + "                              ";
        t = t.substring(0,50)+ " | " + dni;
        return t;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    
}

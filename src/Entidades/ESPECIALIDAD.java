package Entidades;

/**
 *
 * @author Set Lopez
 */
public class ESPECIALIDAD {
    private String nombre;

    public ESPECIALIDAD(String nombre) {
        this.nombre = nombre;
    }

    public String getTexto(){
        String t = nombre;
        return t;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

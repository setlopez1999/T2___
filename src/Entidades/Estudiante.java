/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class Estudiante {
    private String nombre;
    private String codigo;
    private String asistencia;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asistencia = "";
    }
    
    public String getTexto(){
        String texto = codigo + "                                  ";
        texto = texto.substring(0,10)+ "|" + nombre+
                "                                                        "
                + "                                                       ";
        texto = texto.substring(0,63) + "| "+asistencia;
        return texto;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
    
    
}

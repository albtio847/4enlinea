
package com.cuatroenlinea.modelo;

/**
 *
 * @author Laura Orozco
 */
import java.io.Serializable;

public class Persona implements Serializable{
    private String cedula;
    private String nombre;
    private Byte edad;

    public Persona(String cedula, String nombre, Byte edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
 
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

/**
 *
 * @author wilver
 */
public class PersonaBean {
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTipo()
    {
        if(edad<40)
            return "joven";
        else if(edad>0)
            return "no joven";
        else
            return "Error: valor ingresado no valido";
    }
    public boolean getEsJoven()
    {
        if(edad<40)
            return true;
        else 
            return false;
    }
    
}

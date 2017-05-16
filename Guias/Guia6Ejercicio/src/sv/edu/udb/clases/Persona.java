/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean genero;
    private String departamento;
    
    public Persona()
    {
    
    }
    
    public Persona(String nombre, String apellido,int edad, boolean genero, String departamento)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.genero=genero;
        this.departamento=departamento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!="")
            this.nombre = nombre;
        else
            sendErrorMessage("Debe de ingresar un nombre");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido!="")
            this.apellido = apellido;
        else
            sendErrorMessage("Debe de ingresar un apellido");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0 )
            this.edad = edad;
        else
            sendErrorMessage("Debe de ingresar una edad valida");
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }    
    
    public void sendErrorMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showInformationMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showData()
    {
        showInformationMessage("Bienvenido "+ getNombre() +" "+ getApellido() + " usted tiene "+ getEdad()+ " y vive en "+ getDepartamento());
    }
}

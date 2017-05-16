/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import javafx.beans.binding.StringBinding;
import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Computer {
    private int ramGB;
    private int discoDuroGB;
    private String marcaProcesador;
    private double velocidadProcesadorGHz;
    private String marca;
    private String modelo;
    
    public Computer()
    {
    }
    
    public Computer(int ramGB, int discoDuroGB, String marcaProcesador, double velocidadProcesadorGHz, String marca, String modelo)
    {
        this.ramGB=ramGB;
        this.discoDuroGB=discoDuroGB;
        this.marcaProcesador=marcaProcesador;
        this.velocidadProcesadorGHz=velocidadProcesadorGHz;
        this.marca=marca;
        this.modelo=modelo;
    }
    public int getRamGB() {
        return ramGB;
    }
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }
    public int getDiscoDuroGB() {
        return discoDuroGB;
    }
    public void setDiscoDuroGB(int discoDuroGB) {
        this.discoDuroGB = discoDuroGB;
    }
    public String getMarcaProcesador() {
        return marcaProcesador;
    }
    public void setMarcaProcesador(String marcaProcesador) {
        this.marcaProcesador = marcaProcesador;
    }
    public double getVelocidadProcesadorGHz() {
        return velocidadProcesadorGHz;
    }
    public void setVelocidadProcesadorGHz(double velocidadProcesadorGHz) {
        this.velocidadProcesadorGHz = velocidadProcesadorGHz;
    }
   public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public void getAllAttributeData()
    {

    }
    public void setAllAttributeData()
    {
        
    }
    
    //metodo para mostrar mensaje de error
    public void MostrarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo para mostrar un mensaje informativo
    public void MostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    //metodo por medio del cual se puede pedir información
    public String PedirDatos(String mensaje)
    {
        return JOptionPane.showInputDialog(null, mensaje, "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
    }


}

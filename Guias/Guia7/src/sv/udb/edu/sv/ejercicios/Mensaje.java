/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.sv.ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Mensaje {
    public static void MostrarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo para mostrar un mensaje informativo
    public static void MostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}

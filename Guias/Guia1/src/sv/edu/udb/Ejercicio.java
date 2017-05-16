/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Ejercicio {
    public static void main(String[] args) {
        //El try catch lo utilizamos para el manejo de exepciones, especialmente la entrada de la edad, ya que puede que no ingrese un número
        try
        {
            //creamos e inicalizamos las variables, en el caso del integer se inicializa automaticamente en 0 por se un entero
            String nombre="", mensaje="";
            int edad;
            //solicitamos que ingrese la informacion
            nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre","Ingreso de datos",JOptionPane.QUESTION_MESSAGE );
            edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad ","Ingreso de datos",JOptionPane.QUESTION_MESSAGE));
            
            mensaje= edad<0?"Su edad no puede ser un número negativo":"Su nombre es: " + nombre +"\n Su edad es:  "+ edad;
            
            JOptionPane.showMessageDialog(null, mensaje, "Mostrar Resultado", (edad<0?JOptionPane.ERROR_MESSAGE:JOptionPane.INFORMATION_MESSAGE));
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally
        {
        
        }
        
    }
    
}

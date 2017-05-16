/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class mainComputerControl {
    public static void main(String[] args) {
        try {
            Object[] possiblesOpciones = { "Computadora de escritorio", 
                "Laptop", 
                "Mini-Laptop"
            };
            
            Object selectedValue = JOptionPane.showInputDialog(null,
            "Qué tipo de computadora desea ingresar?", "Input",
            JOptionPane.QUESTION_MESSAGE, null,
            possiblesOpciones, possiblesOpciones[0]);
            Computer computadora;
            if(selectedValue.toString()=="Computadora de escritorio")
            {
                computadora=new DesktopComputer();
                computadora.setAllAttributeData();
                computadora.getAllAttributeData();
            }
            else if(selectedValue.toString()=="Laptop")
            {
                computadora=new LaptopComputer();
                computadora.setAllAttributeData();
                computadora.getAllAttributeData();
            }
            else if(selectedValue.toString()=="Mini-Laptop")
            {
                computadora=new MiniLaptopComputer();
                computadora.setAllAttributeData();
                computadora.getAllAttributeData();
            }
                
        } catch (Exception e) {
            MostrarMensajeError(e.getMessage());
        }
        
    }
    //metodo para mostrar mensaje de error
    public static void MostrarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            
            String nombreEmpleado;
            String dui;
            int totalHorasTrabajadas;
            double sueldoBase,sueldoLiquido, descuentoISSS,descuentoAFP, descuentoRenta;
           
            nombreEmpleado=PedirDatos("Ingrese el nombre del empleado");
            dui=PedirDatos("Ingrese el Dui del empleado en formato 00000000-0");
            totalHorasTrabajadas=Integer.parseInt(PedirDatos("Ingrese el número exacto de horas trabajadas"));
            if(totalHorasTrabajadas<0)
                throw new Exception("No puede ingresar número de horas trabajadas con valor negativo");
            else if(totalHorasTrabajadas<=159)
                sueldoBase=totalHorasTrabajadas*9.25;
            else
            {
                sueldoBase=159*9.25;
                sueldoBase+=(totalHorasTrabajadas-159)*13.25;
            }
            NumberFormat formatter = new DecimalFormat("#0.00");  
            descuentoAFP=sueldoBase*(6.88/100);
            descuentoISSS=sueldoBase*(5.25/100);
            descuentoRenta=sueldoBase*(10.0/100);
            
            sueldoLiquido=sueldoBase-descuentoAFP-descuentoISSS-descuentoRenta;
            StringBuilder resultado=new StringBuilder();
            resultado.append("Nombre: ").append(nombreEmpleado).append("\n");
            resultado.append("DUI: ").append(dui).append("\n");
            resultado.append("Total de horas trabajadas: ").append(totalHorasTrabajadas).append("\n");
            resultado.append("Descuento de ISSS: ").append(formatter.format(descuentoISSS)).append("\n");
            resultado.append("Descuento de AFP: ").append(formatter.format(descuentoAFP)).append("\n");
            resultado.append("Descuento de renta: ").append(formatter.format(descuentoRenta)).append("\n");
            resultado.append("Sueldo liquido ").append(formatter.format(sueldoLiquido)).append("\n");
            MostrarMensaje(resultado.toString());
            
        } catch (Exception e) {
            MostrarMensajeError(e.getMessage());
        }
        
        
        
    }
    //metodo para pedir datos.
    public static String PedirDatos(String mensaje)
    {
        return JOptionPane.showInputDialog(null, mensaje, "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
    }
    //metodo para mensaje de error
    public static void MostrarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo para mostrar mensaje
    public static void MostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}

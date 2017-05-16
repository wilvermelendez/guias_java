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
public class Ejercicio01Matriz01 {
    public static void main(String[] args) {
        try {
            int numeroEmpledos=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de empleados a procesar","Ingreso de datos",JOptionPane.QUESTION_MESSAGE));
            String listaEmpleados[][]=new String[numeroEmpledos][2];
            String nombreEmpleado;
            float salarioEmpleado;
            for(int i=0;i<numeroEmpledos;i++)
            {
                nombreEmpleado=JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado " +(i+1),"Ingreso de datos",JOptionPane.QUESTION_MESSAGE);
                salarioEmpleado=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el salario del empleado "+ (i+1),"Ingreso de datos",JOptionPane.QUESTION_MESSAGE));
                if(salarioEmpleado<0)
                    throw new Exception("Error el salario no puede ser valor negativo");
                listaEmpleados[i][0]=nombreEmpleado;
                listaEmpleados[i][1]=String.valueOf(salarioEmpleado);
            }
            System.out.println("Numero de empleados "+ numeroEmpledos);
            for(String[] data:listaEmpleados)
            {
                System.out.println("Nombre: "+ data[0]);
                System.out.println("Salario: "+ data[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }
    }
}

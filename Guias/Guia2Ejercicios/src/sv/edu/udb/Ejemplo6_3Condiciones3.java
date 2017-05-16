/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo6_3Condiciones3 {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese un número entre 0 y 12");
            int mes=reader.nextInt();
            if (mes<1 || mes>12)
                throw new Exception("Error le número debe estar entre 1 y 12");
            switch(mes)
            {
                case 1:
                    System.out.println("Mes de Enero");
                    break;
                case 2:
                    System.out.println("Mes de Febrero");
                    break;
                case 3:
                    System.out.println("Mes de Marzo");
                    break;
                case 4:
                    System.out.println("Mes de Abril");
                    break;
                case 5:
                    System.out.println("Mes de Mayo");
                    break;
                case 6:
                    System.out.println("Mes de Junio");
                    break;
                case 7:
                    System.out.println("Mes de Julio");
                    break;
                case 8:
                    System.out.println("Mes de Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;
                default:
                    System.out.println("Mes Invalido");

            }    
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
        
    }
}

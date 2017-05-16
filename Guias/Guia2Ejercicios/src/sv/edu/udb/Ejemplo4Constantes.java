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
public class Ejemplo4Constantes {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            final float pi=3.14159265F;
            System.out.println("Ingrese el valor del radio");
            float radio=reader.nextFloat();
            double area=pi*radio*radio;
            System.out.println("Area circunferencia = " + area);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
        
        
    }
}

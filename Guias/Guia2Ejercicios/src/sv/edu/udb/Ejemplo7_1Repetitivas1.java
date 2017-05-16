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
public class Ejemplo7_1Repetitivas1 {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            long factorial=1;
            int i=1;
            System.out.println("FACTORIAL DE UN NUMERO DO-WHILE");
            System.out.println("Ingrese el número a procesar");
            int n=reader.nextInt();
            do{
                factorial=factorial*i;
                i++;
            }while(i<n+1);
            System.out.println("Factorial de "+ n + " es " +factorial);   
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
    }
}

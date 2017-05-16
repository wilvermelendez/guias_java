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
public class Ejemplo6_1Condiciones1 {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese su resultado en el TOEFL entre 0 y 100:");
            int TOEFLGrade=reader.nextInt();
            if(TOEFLGrade<0 || TOEFLGrade>100)
                throw new Exception("La puntuación debe estar entre 0 y 1000.");
            if (TOEFLGrade>=550) {
                System.out.println("\"Paper Based\" TOEFL Test passed");
            } else {
                System.out.println("\"Paper Based\" TOEFL Test failed");
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
        
    }
}

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
public class Ejemplo6_2Condiciones2 {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese su puntuación entre 0 y 100");
            int studentsGrade=reader.nextInt();
            if(studentsGrade<0 || studentsGrade>100)
                throw new Exception("La puntuación debe estar entre 0 y 100.");
            if (studentsGrade>=90) {
                System.out.println("Student's Grade is A");
            } else if(studentsGrade>=80) {
                System.out.println("Student's Grade is B");
            } else if(studentsGrade>=70) {
                System.out.println("Student's Grade is C");
            }else if(studentsGrade>=60) {
                System.out.println("D");
            }else{
                System.out.println("D");
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
    }
}

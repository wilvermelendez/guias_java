/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.util.Scanner;

/**
 *
 * @author wilver
 */
public class Ejercicio2Notas {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            String nombre;
            float nota1, nota2, nota3, promedio;
            System.out.println("CALCULO DE PROMEDIO");
            System.out.println("Ingrese el nombre del alumno");
            nombre=reader.nextLine();
            System.out.println("Ingrese las notas solicitadas a continuacion en rango de 0-10");
            System.out.println("Ingrese nota 1");
            nota1=reader.nextFloat();
            if(nota1<0||nota1>10)
                throw new Exception("La nota 1 esta fuera de rango");
            System.out.println("Ingrese nota 2");
            nota2=reader.nextFloat();
            if(nota2<0||nota2>10)
                throw new Exception("La nota 2 esta fuera de rango");
            System.out.println("Ingrese nota 3");
            nota3=reader.nextFloat();
            if(nota3<0||nota3>10)
                throw new Exception("La nota 3 esta fuera de rango");
            
            promedio=(nota1+nota2+nota3)/3;
            System.out.println("Nombre: "+ nombre);
            System.out.println("Nota 1: "+ nota1);
            System.out.println("Nota 2: "+ nota2);
            System.out.println("Nota 3: "+ nota3);
            System.out.println("Promedio: "+ promedio);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
    }
}

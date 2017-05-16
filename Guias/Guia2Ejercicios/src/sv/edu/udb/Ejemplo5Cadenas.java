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
public class Ejemplo5Cadenas {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("Ingrese valor de cadena01");
            String cadena01=reader.nextLine();
            System.out.println("Ingrese valor de cadena02");
            String cadena02=reader.nextLine();
            System.out.println("Ingrese valor de cadena03");
            String cadena03=reader.nextLine();
            System.out.println("Ingrese valor de cadena04");
            String cadena04=reader.nextLine();
            System.out.println("Ingrese valor de cadena05");
            String cadena05=reader.nextLine();
            System.out.println("Ingrese valor de cadena06");
            String cadena06= cadena01 +" " + cadena02 +" " +cadena03+" " +cadena04+" " + cadena05;
            String cadena07=cadena06 +" Java Avanzado Ciclo 01-"+2015;

            System.out.println(cadena06);
            System.out.println(cadena07);
            String cadena08=cadena05.substring(0,5);
            System.out.println(cadena08);
            System.out.println("Cadena 06:"+cadena06);
            System.out.println("Longitud de cadena 06: "+ cadena06.length());
            System.out.println("El caracter 4 de la cadena 06 es: "+ cadena06.charAt(4));
            cadena07=cadena07.substring(23,36)+ "- Programacion Orientada a Objetos";
            System.out.println(cadena07);
            System.out.println(cadena07==cadena06);
            String cadena09=cadena06.substring(11,22);
            System.out.println(cadena09.equals("Computacion"));
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
                
    }
}

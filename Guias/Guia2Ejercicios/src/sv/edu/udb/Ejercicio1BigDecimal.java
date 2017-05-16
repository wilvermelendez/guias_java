/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author wilver
 */
public class Ejercicio1BigDecimal {
    public static void main(String[] args) {
        try {
            /*Para que sirve BigDecimal Todos los tipos de datos como 
            float y double hacen los cálculos en base binaria es decir base 2,
            lo que hace que los porcesos sean más rápidos pero eso implica que fata precisión
            para cálculos financieros por ejemplo, BigDecimal es una clase creada para solventar problema de precision 
            financiera, para cálculos más exactos y precisos/
            */
           
            Scanner reader=new Scanner(System.in);
            int num1=2147483647;
            System.out.printf("num1 = %d\n",num1+1);
            double piDouble=3.1415926535897932384626433832795028841971;
            float piFloat=(float)3.1415926535897932384626433832795028841971;
            BigDecimal piBD=new BigDecimal("3.1415926535897932384626433832795028841971");
            System.out.printf("BigDecimal =%1.35g\n",piBD);
            System.out.printf("Double =%1.35g\n",piDouble);
            System.out.printf("BigDecimal to double =%1.35g\n",piBD.doubleValue());
            System.out.printf("Float =%1.35g\n",piFloat);
            
            System.out.println("Ejemplo personal de BigDecimal");
            double unCentavo = 0.01;
            double suma=unCentavo+unCentavo+unCentavo+unCentavo+unCentavo+unCentavo;
            System.out.println("Suma Double "+ suma);
            
            BigDecimal unCentavoBD = new BigDecimal("0.01");
            BigDecimal sumaBD=unCentavoBD.add(unCentavoBD).add(unCentavoBD).add(unCentavoBD).add(unCentavoBD).add(unCentavoBD);
            System.out.println("Suma BigDecimal "+ sumaBD);
            
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage().toString());
        }
        
    }
}

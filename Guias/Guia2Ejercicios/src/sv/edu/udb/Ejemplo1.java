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
public class Ejemplo1 {
    public static void main(String[] args) {
        try
        {
            Scanner reader=new Scanner(System.in);
            System.out.println("ingrese un número entero");
            int var01=reader.nextInt();
            System.out.println("ingrese un número LONG");
            long var02=reader.nextLong();
            System.out.println("ingrese un número FLOAT");
            float var03=reader.nextFloat();
            System.out.println("ingrese un número DOUBLE");
            double var04=reader.nextDouble();
            //System.out.println("ingrese un  char unicode ejemplo \\u0022");
            
            char var05='\u0032';
            System.out.println("ingrese un char");
            String charData= reader.next();
            if(charData.length()>1)
            {
                throw new Exception("Solo debe de ingresar un carácter");
            }
            char var06=charData.charAt(0);
            System.out.println("ingrese un boolean");
            boolean var07=reader.nextBoolean();

            System.out.println("var01 = "+ var01);
            System.out.println("var02 = "+ var02);
            System.out.println("var03 = " + var03);
            System.out.println("var04 = "+ var04);
            System.out.println("var05 = "+var05);
            System.out.println("var06 = " + var06);
            System.out.println("var07 = "+ var07);
            System.exit(0);
        }
        catch (Exception ex)
        {
            System.out.println("Error: " + ex.getMessage().toString());
        }
    }
    
}

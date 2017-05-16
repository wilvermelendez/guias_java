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
public class Ejemplo2 {
    public static void main(String[] args) {
        try
        {
            Scanner reader=new Scanner(System.in);
            float x1=2, y1=4, c1=-2;
            float x2=-3, y2=5,c2=10;
            System.out.println("Ingrese el valor de x1");
            x1=reader.nextInt();
            System.out.println("Ingrese el valor de x2");
            x2=reader.nextInt();
            System.out.println("Ingrese el valor de y1");
            y1=reader.nextInt();
            System.out.println("Ingrese el valor de y2");
            y2=reader.nextInt();
            System.out.println("Ingrese el valor de c1");
            c1=reader.nextInt();
            System.out.println("Ingrese el valor de c2");
            c2=reader.nextInt();

            float x=(c1*y2 -c2*y1)/(x1*y2-x2*y1);
            float y=(x1*c2-x2*c1)/(x1*y2-x2*y1);

            System.out.println("x = "+ x);
            System.out.println("y = "+y);
            System.exit(0);
        }
        catch(Exception ex)
        {
            System.out.println("Eror: "+ ex.getMessage().toString());
        }
    }
    
}

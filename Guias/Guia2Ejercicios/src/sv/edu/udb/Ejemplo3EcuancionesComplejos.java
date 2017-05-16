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
public class Ejemplo3EcuancionesComplejos {
    public static void main(String[] args) {
        try {
            Scanner reader=new Scanner(System.in);
            System.out.println("ECUACIONES DE COMPLEJOS");
            float a=4, b=8, c=12, d=-15, e=10, f=0,g=12, h=-6, i=-5, j=7,k=35,l=-3;
            System.out.println("Ingrese valor para a");
            a=reader.nextFloat();
            System.out.println("Ingrese valor para b");
            b=reader.nextFloat();
            System.out.println("Ingrese valor para c");
            c=reader.nextFloat();
            System.out.println("Ingrese valor para d");
            d=reader.nextFloat();
            System.out.println("Ingrese valor para e");
            e=reader.nextFloat();
            System.out.println("Ingrese valor para f");
            f=reader.nextFloat();
            System.out.println("Ingrese valor para g");
            g=reader.nextFloat();
            System.out.println("Ingrese valor para h");
            h=reader.nextFloat();
            System.out.println("Ingrese valor para i");
            i=reader.nextFloat();
            System.out.println("Ingrese valor para j");
            j=reader.nextFloat();
            System.out.println("Ingrese valor para k");
            k=reader.nextFloat();
            System.out.println("Ingrese valor para l");
            l=reader.nextFloat();
        
            float det1, det2, var1, var2, var3, var4, div, div_real1, div_img1, div_real2,div_img2, x_real, x_img, y_real, y_img, angulo,angulo_grados;

            det1=((a*i)-(b*j))-((g*c)-(h*d));
            det2=((a*j)+(b*i))-((g*d)+(h*c));
            var1=((e*i)-(f*j))-((k*c)-(l*d));
            var2=((e*j)+(f*i))-((k*d) +(l*c));
            var3=((a*k)-(b*l))-((g*e)-(h*f));
            var4=((a*l)+(b*k))-((g*f)+(h*e));

            div=((float)Math.pow(det1,2)+(float)Math.pow(det2,2));
            div_real1=((var1*det1)+(var2*det2));
            div_img1=((var1*det2*-1)+(var2*det1));
            div_real2=((var3*det1)+(var4*det2));
            div_img2=((var3*det2*-1)+(var4*det1));

            x_real=(div_real1/div);
            x_img=(div_img1/div);
            y_real=(div_real2/div);
            y_img=(div_img2/div);

            float magnitudx=(float)Math.sqrt((float)Math.pow(x_real,2)+(float)Math.pow(x_img, 2));
            float magnitudy=(float)Math.sqrt((float)Math.pow(y_real,2)+(float)Math.pow(y_img, 2));
            System.out.println("*** Solucion forma polar ****");
            System.out.print("Variable X: magnitud =" + magnitudx);

            angulo=(float)Math.atan(x_img/x_real);
            angulo_grados=(float)Math.toDegrees(angulo);
            System.out.println(" Angulo "+ angulo_grados + "(Grados)");
            System.out.print("Variable Y: magnitud = "+magnitudy);

            angulo=(float)Math.atan(y_img/y_real);
            angulo_grados=(float)Math.toDegrees(angulo);
            System.out.println(" Angulo = "+ angulo_grados +"(Grados)");
        
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage().toString());
        }

    }   
    
    
}

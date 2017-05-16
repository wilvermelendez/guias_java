/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Fraction {
    private int numerador;
    private int denominador;
    
    private Fraction()
    {
        numerador=0;
        denominador=1;
    }
    public Fraction(int n, int d)
    {
        if(d!=0)
        {
            numerador=n;
            denominador=d;
        }
        else
        {
            System.out.println("Error, denominador de fracción no puede ser 0");
        }    
    }
    Fraction Sumar(Fraction objeto)
    {
        Fraction Temporal=new Fraction();
        Temporal.numerador=numerador*objeto.denominador+objeto.numerador*denominador;
        
        Temporal.denominador=denominador*objeto.denominador;
        
        return Temporal;
    }
    
    Fraction Dividir(Fraction objeto)
    {
        Fraction Temporal= new Fraction();
        Temporal.numerador=numerador*objeto.denominador;
        Temporal.denominador=denominador*objeto.numerador;
        return Temporal;
    }
    Fraction Multiplicar(Fraction objeto)
    {
        Fraction Temporal= new Fraction();
        Temporal.numerador=numerador*objeto.numerador;
        Temporal.denominador=denominador*objeto.denominador;
        return Temporal;
    }
    Fraction Restar(Fraction objeto)
    {
        Fraction Temporal=new Fraction();
        Temporal.numerador=numerador*objeto.denominador-objeto.numerador*denominador;
        Temporal.denominador=denominador*objeto.denominador;
        return Temporal;
    }
    
    String Obtener()
    {
        return (numerador+ "/"+ denominador);
    }
    public static void main(String[] args) {
        int numerador, denominador;
        numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numerador", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese denominador", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE));
        
        Fraction fraction1=new Fraction(numerador, denominador);
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numerador", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese denominador", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE));
        
        
        Fraction fraction2=new Fraction(numerador, denominador);
        
        System.out.print(fraction1.Obtener() +" + " + fraction2.Obtener()+" : ");
        Fraction fraction3=fraction1.Sumar(fraction2);
        System.out.println(fraction3.Obtener());
        
        System.out.print(fraction1.Obtener() +" - "+fraction2.Obtener() +": ");
        fraction3=fraction1.Restar(fraction2);
        System.out.println(fraction3.Obtener());
        
        System.out.print(fraction1.Obtener() +" * "+fraction2.Obtener() +": ");
        fraction3=fraction1.Multiplicar(fraction2);
        System.out.println(fraction3.Obtener());
        
        System.out.print(fraction1.Obtener() +" / "+fraction2.Obtener() +": ");
        fraction3=fraction1.Dividir(fraction2);
        System.out.println(fraction3.Obtener());
        
    }
            
}

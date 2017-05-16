/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.ejemplos;

/**
 *
 * @author wilver
 */
public class Ejemplo3_try {
    public static void main(String[] args) {
        try {
            int b=0;
            int a=23/b;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice en un array: "+ e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error no se permite la división entre 0"+ e.getMessage());
        }
        
    }
}

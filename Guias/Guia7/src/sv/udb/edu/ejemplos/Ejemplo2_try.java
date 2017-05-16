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
public class Ejemplo2_try {
    public static void main(String[] args) {
        try {
            int [] array= new int[20];
            array[-3]=24;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice en un array: "+ e.getMessage());
        }
        
    }
}

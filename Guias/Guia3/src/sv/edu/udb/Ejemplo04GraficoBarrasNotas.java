/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

/**
 *
 * @author wilver
 */
public class Ejemplo04GraficoBarrasNotas {
    public static void main(String[] args) {
        try {
            int array[]={0,0,0,0,0,0,3,12,6,2,1};
            System.out.println("Distribucion de Notas");
            for(int contador=0;contador<array.length;contador++)
            {
                if(contador==10)
                    System.out.printf("%5d:",100);
                else
                    System.out.printf("%02d-%02d: ",contador*10,contador*10+9);
                for(int asteriscos=0;asteriscos<array[contador];asteriscos++)
                    System.out.print("*");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }
    }
}

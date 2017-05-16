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
public class Ejemplo04Matriz04 {
    public static void main(String[] args) {
        try {
            int i,j,k=0,filas=0;
            int b[][]={{0},{1,2},{3,4,5},{6,7,8,9}};
            for(i=0;i<4;i++)
            {
                filas++;
                for(j=0;j<filas;j++)
                    System.out.print(b[i][j] + " ");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }       
    }
}

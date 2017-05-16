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
public class Ejemplo05Matriz05 {
    public static void main(String[] args) {
        try {
            int a[][]={{1,2},{3,4}};
            int b[][]={{5,6},{7,8}};
            int resultado[][]=new int[2][2];
            int i, j;
            resultado[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
            resultado[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
            resultado[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
            resultado[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++)
                    System.out.print(resultado[i][j]+" ");
                System.out.println("");
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }
        
    }
   
}

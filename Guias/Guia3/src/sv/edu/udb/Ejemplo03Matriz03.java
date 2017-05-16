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
public class Ejemplo03Matriz03 {
    public static void main(String[] args) {
        try {
            long[] arreglo=new long[100];
            int nElementos=0, j;
            long busquedaLlave;
            arreglo[0]=71;
            arreglo[1]=100;
            arreglo[2]=46;                    
            arreglo[3]=53;
            arreglo[4]=22;
            arreglo[5]=75;
            arreglo[6]=10;
            arreglo[7]=64;
            arreglo[8]=47;
            arreglo[9]=33;
            
            nElementos=10;
            for(j=0;j<nElementos; j++)
                System.out.print(arreglo[j] + " ");
            System.out.println("");
             
            busquedaLlave=53;
            for(j=0;j<nElementos;j++)
                if(arreglo[j]==busquedaLlave)
                    break;
            if(j==nElementos)
                System.out.println("No se encontro llave "+ busquedaLlave);
            else
                System.out.println("Se encontro llave "+ busquedaLlave);
            busquedaLlave=64;
            for(j=0;j<nElementos;j++)
                if(arreglo[j]==busquedaLlave)
                    break;
            for(int k=j;k<nElementos-1;k++)
                arreglo[k]=arreglo[k+1];
            nElementos--;
            for(j=0;j<nElementos;j++)
                System.out.print(arreglo[j] +" ");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }
    }
}

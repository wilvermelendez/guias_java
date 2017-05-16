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
public class ImplementaEnum {
    public static void main(String[] args) {
        TipoArbol miTipoArbol=TipoArbol.CAOBA;
        System.out.println("Los posibles tipos de madera son: ");
        for(TipoArbol tmp:miTipoArbol.values())
        {
            System.out.print( tmp.toString()+"\t");
        }
    }
    
}

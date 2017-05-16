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
public class Ejemplo4_try {
    public static void main(String[] args) {
        try {
            String s=null;
            s.equals("QQQQ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice en un array: "+ e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error no se permite la división entre 0"+ e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Error: e " +e);
            System.out.println("Error message: " +e.getMessage() );
            System.out.println("Error causes: " +e.getCause() );
            System.out.println("Error localized: " +e.getLocalizedMessage() );
            System.out.println("Error Trace: e " +e.getStackTrace());
            System.out.println("Error Suppressed: e " +e.getSuppressed());
        }
        
    }
}

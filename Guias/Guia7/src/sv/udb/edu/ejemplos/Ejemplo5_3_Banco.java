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
public class Ejemplo5_3_Banco {
    public static void main(String[] args) {
        Ejemplo5_2_VerificarCuenta verificarCuenta= new Ejemplo5_2_VerificarCuenta(101);
        System.out.println("Depositando $500");
        verificarCuenta.deposito(500.00);
        
        try {
            System.out.println("\nRetirando $100...");
            verificarCuenta.retiro(100.00);
            System.out.println("\nRetirando $600...");
            verificarCuenta.retiro(600.00);
        } catch (Ejemplo5_1_FondoInsuficientes e) {
            System.out.println("Lo lamentamos pero ne quedan fondos suficientes $"+ e.getAmount());
            e.printStackTrace();
        }
    }
}

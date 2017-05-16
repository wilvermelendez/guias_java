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
public class Ejemplo5_2_VerificarCuenta {
    private double balance;
    private int numero;
    
    public Ejemplo5_2_VerificarCuenta(int numero)
    {
        this.numero=numero;
    }
    public void deposito(double amount)
    {
        balance+=amount;
    }
    public void retiro(double amount) throws Ejemplo5_1_FondoInsuficientes
    {
        if (amount <=balance)
        {
            balance-=amount;
        }
        else
        {
            double needs=amount-balance;
            throw new Ejemplo5_1_FondoInsuficientes(needs);
        }
    }
    public double getBalance()
    {
        return balance;
    }
    
    public int getNumber()
    {
        return numero;
    }
}

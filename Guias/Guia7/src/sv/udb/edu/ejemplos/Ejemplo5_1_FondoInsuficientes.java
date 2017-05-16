package sv.udb.edu.ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wilver
 */
public class Ejemplo5_1_FondoInsuficientes extends Exception{
    private double monto;
    public Ejemplo5_1_FondoInsuficientes(double monto)
    {
        this.monto=monto;
    }
    
    public double getAmount()
    {
        return monto;
    }
}

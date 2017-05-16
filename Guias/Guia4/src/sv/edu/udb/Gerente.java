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
public class Gerente extends Empleado {
    
    private double bono;
    public Gerente(String n, double s, int anio, int mes, int dia)
    {
        super(n,s,anio,mes,dia);
        this.bono=0;
    }
    public double getSalario()
    {
        double salarioBase=super.getSalario();
        return salarioBase+this.bono;
    }
    public void setBono(double b)
    {
        this.bono=b;
    }
}

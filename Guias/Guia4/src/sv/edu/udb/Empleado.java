/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author wilver
 */
public class Empleado {

    /**
     * @return the nombre
     */
    private String nombre;
    private double salario;
    private Date fechaContratacion;
    
    public Empleado(String n, double s, int anio, int mes, int dia)
    {
        this.nombre=n;
        this.salario=s;
        GregorianCalendar calendario= new GregorianCalendar(anio, mes-1, dia);
        this.fechaContratacion=calendario.getTime();
    }
    
     public String getNombre() {
        return nombre;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }
    /**
     * @return the fechaContratacion
     */
    public Date getFechaContratacion() {
        return fechaContratacion;
    }

   public void aumentarSalario(double porcentaje)
   {
       double aumento=this.salario*porcentaje/100;
       this.salario+=aumento;
   }
}

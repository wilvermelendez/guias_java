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
public class ImplementaEquipo {
    public static void main(String[] args) {
        Equipo objetoEquipo=Equipo.BARCA;
        System.out.println("Los posibles tipos de Equipo son: ");
        for(Equipo tmp:objetoEquipo.values())
        {
            System.out.println("El Equipo :"+ tmp.toString()+" en el puesto "+tmp.getPuestoLiga() +" de la liga");
        }
    }
}

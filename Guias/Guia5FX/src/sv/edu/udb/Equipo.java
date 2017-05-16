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
public enum Equipo {
    BARCA("FC Barcelona",2),REAL_MADRID("Real Madrid",1),
    SEVILLA("Atletico Madrid",4),VILLAREAL("Sevilla",3);
    
    private String nombreClub;
    private int puestoLiga;
    
    private Equipo(String nombreClub, int puestoLiga)
    {
        this.nombreClub=nombreClub;
        this.puestoLiga=puestoLiga;
    }
    
    public String getNombreClub()
    {
        return nombreClub;
    }
    
    public int getPuestoLiga()
    {
        return puestoLiga;
    }
    
}

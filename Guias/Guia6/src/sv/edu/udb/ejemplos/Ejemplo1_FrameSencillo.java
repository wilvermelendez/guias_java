/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos;

import javax.swing.JFrame;

/**
 *
 * @author wilver
 */
public class Ejemplo1_FrameSencillo extends JFrame {
    public Ejemplo1_FrameSencillo()
    {   
        super("Mi Primer Frame");
        setSize(300, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        Ejemplo1_FrameSencillo sf=new Ejemplo1_FrameSencillo();
    }
}

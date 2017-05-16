package sv.edu.udb.ejemplos;


import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wilver
 */
public class Ejemplo2_1_ShowColors {
 
    public static void main(String[] args) {
        JFrame frame= new JFrame("Using Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Ejemplo2_0_ColorPanel colorJPanel= new Ejemplo2_0_ColorPanel();
        frame.add(colorJPanel);
        frame.setSize(400,180);
        frame.setVisible(true);
        
    }
}

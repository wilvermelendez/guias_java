/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class SumaApplet extends Applet {

    private double resultado;
    public void init() {
        
        String primeroOperando;
        String segundoOperando;
        double numero01;
        double numero02;
    
        primeroOperando=JOptionPane.showInputDialog("Digitar el primer valor");
        segundoOperando=JOptionPane.showInputDialog("Digitar el segundo valor");
        
        numero01=Double.parseDouble(primeroOperando);
        numero02=Double.parseDouble(segundoOperando);
        resultado=numero01 +numero02;
        
    }

    public void paint (Graphics g)
    {
        g.drawRect(15, 10, 270, 20);
        g.drawString("La suma es "+ resultado, WIDTH, WIDTH);
    }
}

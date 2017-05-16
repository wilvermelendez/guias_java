/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author wilver
 */
public class Ejemplo2_0_ColorPanel extends JPanel {
    public void paitComponet(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(new Color(255,0,0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Curregnt RGB: "+ g.getColor(),130,40 );
        
        g.setColor(new Color(0.50f,0.75f,0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Curregnt RGB: "+ g.getColor(),130,65 );
        
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Curregnt RGB: "+ g.getColor(),130,90 );
        
        Color color=Color.MAGENTA;
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
        g.drawString("RGB Values: "+ color.getRed()
                +", "+color.getGreen()
                +", "+ color.getBlue(), 130,115);
    }
}

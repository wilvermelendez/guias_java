/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author wilver
 */
public class MiApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void paint(Graphics g) {
        g.drawString("Hola, este es mi primer Applet en JAva", 50,100);
    }
}

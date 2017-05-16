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
public class ParametrosApplet extends Applet {

    String n;
    String a;
    public void init() {
        n=getParameter("nombre");
        a=getParameter("edad");
        if(n==null)
            n=" ";
        if(a==null)
            a=" ";
    }
    public void paint(Graphics g)
    {
        g.drawString(n+ " es un estudiante especializado en ingeniería", 20, 40);
        g.drawString(n+ "tiene "+a+ " años ", 20, 60);
    }
}

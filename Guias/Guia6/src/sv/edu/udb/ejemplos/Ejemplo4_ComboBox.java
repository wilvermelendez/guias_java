/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wilver
 */
public class Ejemplo4_ComboBox {
    private JTextField tf;
    private JComboBox combo;
    private JFrame v;
    
    public Ejemplo4_ComboBox()
    {
        tf= new JTextField(20);
        JLabel etiqueta= new JLabel("Selecciona a que carrera pertenece: ");
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        combo= new JComboBox();
        combo.addItem("Computacion");
        combo.addItem("Mecatronica");
        combo.addItem("Telecomunicaciones");
        
        combo.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText(combo.getSelectedItem().toString());
            }
        });
        
        v= new JFrame("Ejemplo Utilizando JComboBox");
        v.getContentPane().add(etiqueta);
        v.getContentPane().setLayout(new FlowLayout());
        v.getContentPane().add(combo);
        v.getContentPane().add(tf);
        
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ejemplo4_ComboBox();
    }
}

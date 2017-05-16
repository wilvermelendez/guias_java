/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos;

import javax.swing.*;

/**
 *
 * @author wilver
 */
public class Conversor extends JFrame{
    private JLabel jlbGradosC;
    private JTextField jtfGradosC;
    private JLabel jlbGradosF;
    private JTextField jtfGradosF;
    private JButton jbtAceptar;
    
    public Conversor()
    {
        setSize(300,200);
        setTitle("Conversion de temperaturas");
        initComponents();
    }
    private void initComponents()
    {
        jlbGradosC= new JLabel();
        jtfGradosC=new JTextField();
        
    }
}

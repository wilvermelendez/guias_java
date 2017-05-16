/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author wilver
 */
public class Ejemplo3_CasillVerificacion extends JFrame{
    private JTextField campo;
    private JCheckBox negrita, cursiva;
    
    public Ejemplo3_CasillVerificacion()
    {
        super("Prueba de JCheckBox");
        
        Container contenedor= getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        campo= new JTextField("Observe el cambio en el estilo de  tipo de letra",25);
        
        campo.setFont(new Font("Serif", Font.PLAIN,14));
        contenedor.add(campo);
        
        negrita= new JCheckBox("Negrita");
        contenedor.add(negrita);
        
        cursiva= new JCheckBox("Cursiva");
        contenedor.add(cursiva);
        
        ManejadorCasillaVerificacion manejador= new ManejadorCasillaVerificacion();
        negrita.addItemListener(manejador);
        cursiva.addItemListener(manejador);
        
        setSize(300,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ejemplo3_CasillVerificacion aplicacion=new Ejemplo3_CasillVerificacion();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class ManejadorCasillaVerificacion implements ItemListener
    {
        private int valNegrita=Font.PLAIN;
        private int valCursiva=Font.PLAIN;
        
        public void itemStateChanged(ItemEvent evento)
        {
            if(evento.getSource()==negrita)
                valNegrita=negrita.isSelected()?Font.BOLD:Font.PLAIN;
            
            if(evento.getSource()==cursiva)
                valCursiva=cursiva.isSelected()?Font.ITALIC:Font.PLAIN;
            
            campo.setFont(new Font("Serif", valNegrita+ valCursiva,14));
        }
    }
}

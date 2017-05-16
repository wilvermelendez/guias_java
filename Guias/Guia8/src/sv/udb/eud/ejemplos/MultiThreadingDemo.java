/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.eud.ejemplos;

/**
 *
 * @author wilver
 */
public class MultiThreadingDemo implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Estado activo");
    }
    public static void main(String[] args) {
        MultiThreadingDemo objeto= new MultiThreadingDemo();
        Thread tobjeto=new Thread(objeto);
        tobjeto.start();
    }
}

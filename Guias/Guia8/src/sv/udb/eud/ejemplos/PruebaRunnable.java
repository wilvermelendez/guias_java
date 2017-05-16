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
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    
    RunnableDemo(String name)
    {
        threadName=name;
        System.out.println("Creando "+ threadName);
    }
    @Override
    public void run()
    {
        System.out.println("Ejecutando "+ threadName);
        try {
            for(int i=4; i>0;i--)
            {
                System.out.println("Hilo: "+ threadName+", "+i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Hilo "+ threadName+" Interrumpido");
        }       
        System.out.println("Hilo "+ threadName+" Saliendo.");
    }
    
    
    public void start()
    {
        System.out.println("Iniciando "+ threadName);
        if(t==null)
        {
            t=new Thread(this, threadName);
            t.start();
        }
    }
}

public class PruebaRunnable {
        public static void main(String[] args) {
        RunnableDemo r1= new RunnableDemo("Hilo-1");
        r1.start();
        RunnableDemo r2= new RunnableDemo("Hilo-2");
        r2.start();
    }
}

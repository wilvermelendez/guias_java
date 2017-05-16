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

class PrintDemo
{
    public void printCount()
    {
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("CUENTA ---"+ i);
            }
        } catch (Exception e) {
            System.out.println("Hilo interrupido");
        }
    }
}
class ThreadDemo extends Thread
{
    private Thread t;
    private String threadName;
    PrintDemo PD;
    
    ThreadDemo(String name, PrintDemo pd)
    {
        threadName=name;
        PD=pd;
    }
    @Override
    public void run()
    {
        synchronized(PD)
        {
            PD.printCount();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Error en el sleep"+ e.toString());
            }
        }
        System.out.println("Finalizando hilo "+ threadName+".");
    }
    @Override
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
public class Pruebathread {
    public static void main(String[] args) {
        PrintDemo PD= new PrintDemo();
    
        ThreadDemo T1= new ThreadDemo("Hilo - 1", PD);
        ThreadDemo T2= new ThreadDemo("Hilo - 2", PD);
        T1.start();
        T2.start();
        
        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println("Interrumpido");
        }
    }
    
   
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Ejercicio1 {
    //método principal de control donde se genera un numero ciclico hasta que el usuario ya no quiera procesar
    public static void main(String[] args) {
        try {
            boolean continuar=true;
            int numeroDatos=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos registros desea procesar?", "Ingrese datos",JOptionPane.QUESTION_MESSAGE));
            if (numeroDatos<0)
                throw new Exception("No se permite el ingreso de números negativos");
            int [] datos=new int[numeroDatos];
            while(continuar)
            {
                continuar=Procesar(datos, numeroDatos);
            }
            
            
        } catch (Exception e) {
            MostrarMensajeError(e.getMessage());
        }
    }
    //Metodo donde se eligen las opciones posibles 
    public static boolean Procesar(int [] datos, int numeroDatos){
        //Opciones a mostrar en el JOptionPane
        Object[] possiblesOpciones = { "Ingresar listado de datos", 
                "Mostrar datos horizontal", 
                "Sumar N números",
                "Restar N números",
                "Dividir dos números",
                "Multiplicar N números"
            };
            Object selectedValue = JOptionPane.showInputDialog(null,
            "Qué proceso desea realizar?", "Input",
            JOptionPane.QUESTION_MESSAGE, null,
            possiblesOpciones, possiblesOpciones[0]);
            
            if(selectedValue.toString()=="Ingresar listado de datos")
            {
                for(int i=0; i<numeroDatos; i++)
                {
                    datos[i]=Integer.parseInt(PedirDatos("Ingrese el dato para la posición "+ i));
                }
            }
            else if(selectedValue.toString()=="Mostrar datos horizontal")
            {
                StringBuilder datosHorizontal=new StringBuilder();
                for(int dato:datos)
                    datosHorizontal.append(dato).append(", ");
                
                if(datosHorizontal.length()>0)
                    datosHorizontal.setLength(datosHorizontal.length()-2);
                
                MostrarMensaje(datosHorizontal.toString());
            }
            else if(selectedValue.toString()=="Sumar N números")
            {
                if(ExistenDatos(datos))
                {
                    int suma=calcular(datos, "Sumar");
                    MostrarMensaje("La suma de las posiciones ingresada es: " +suma);
                }
                
            }
            else if(selectedValue.toString()=="Restar N números")
            {
                if(ExistenDatos(datos))
                {
                    int resta=calcular(datos, "Restar");
                    MostrarMensaje("La resta de las posiciones ingresada es: " +resta);
                }
            }
            else if(selectedValue.toString()=="Dividir dos números")
            {
                if(ExistenDatos(datos))
                {
                    int [] listaPosiciones=new int[2];
                    int i=0, ifin=2;
                    while(i<ifin)
                    {
                        int posicion=Integer.parseInt(PedirDatos("Ingrese la posicion del "+(i==0?"Dividendo":"Divisor")+"." ));
                        if(posicion<0)
                            MostrarMensajeError("No se permite ingresar números negativos");
                        else if(posicion>datos.length-1)
                            MostrarMensajeError("la posición esta fuera de limite.");
                        else
                        {
                            listaPosiciones[i]=posicion;
                            i++;
                        }
                    }
                    //double division=datos[listaPosiciones[0]]/datos[listaPosiciones[1]];
                    double division=Dividir(datos[listaPosiciones[0]], datos[listaPosiciones[1]]);
                    MostrarMensaje("La División de las posiciones ingresada es: " +division);
                    
                }
            }
            else if(selectedValue.toString()=="Multiplicar N números")
            {
                if(ExistenDatos(datos))
                {
                    int multiplicacion=calcular(datos, "Multiplicar");
                    MostrarMensaje("La multiplicación de las posiciones ingresada es: " +multiplicacion);
                }
            }
            
            int continuar=JOptionPane.showConfirmDialog(null,"Desea continuar con otra opción?", "Ingrese opcion",JOptionPane.YES_OPTION);
            if(continuar==JOptionPane.YES_OPTION)
                return true;
            else
                return false;
    }
    //metodo para mostrar mensaje de error
    public static void MostrarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo para mostrar un mensaje informativo
    public static void MostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    //metodo por medio del cual se puede pedir información
    public static String PedirDatos(String mensaje)
    {
        return JOptionPane.showInputDialog(null, mensaje, "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
    }
    
    //metodo para verificar si existen datos en el vector
    public static boolean ExistenDatos(int[] datos)
    {
        if(datos.length>0)
        {
            return true;
        }
        else
        {
            MostrarMensajeError("No hay datos posibles a procesar.");
            return false;
        }
    }
    //metodo que selecciona el metodo correspondiente segun la accion
    public static int calcular(int[] datos, String accion)
    {
        int total=0;
        int cantidadDeNumeros=Integer.parseInt(PedirDatos("Ingrese cantidad de numeros a "+accion+" entre 2 y "+datos.length));
        if(cantidadDeNumeros<2)
            MostrarMensajeError("No se permite ingresar un número menor que 2");
        else if(cantidadDeNumeros>datos.length)
            MostrarMensajeError("No se permiten "+accion+" más números que la cantidad disponible, disponibilidad máxima: "+datos.length);

        int [] listaPosiciones=new int[cantidadDeNumeros];
        int i=0;
        while(i<cantidadDeNumeros)
        {
            int posicion=Integer.parseInt(PedirDatos("Ingrese la posicion " + (i+1) +" de "+cantidadDeNumeros+", para "+accion+"." ));
            if(posicion<0)
                MostrarMensajeError("No se permite ingresar números negativos");
            else if(posicion>datos.length-1)
                MostrarMensajeError("la posición esta fuera de limite.");
            else
            {
                listaPosiciones[i]=posicion;
                i++;
            }
        }
        if(accion=="Multiplicar")
            total=1;
        else if (accion=="Restar")
            
            total=datos[listaPosiciones[0]];
        
        int ciclo=0;
        for(int p:listaPosiciones)
        {
            switch(accion)
            {
                case "Sumar":
                {
                    //total+=datos[p];
                    total=Sumar(total, datos[p] );
                    break;
                }
                case "Restar":
                {
                    if(ciclo==0)
                        total=datos[p];
                    else
                        total=Restar(total, datos[p]);//total-=datos[p];
                    
                    break;
                }
                case "Multiplicar":
                {
                    //total*=datos[p];
                    total=Multiplicar(total, datos[p]);
                            
                    break;
                }
            }
            ciclo++;
        }
        return total;
    }
    //metodo para sumar 
    public static int Sumar(int total, int numero)
    {
        return total+numero;
    }
    //metodo para restar
    public static int Restar(int total, int numero)
    {
        return total-numero;
    }
    //metodo para multiplicar
    public static int Multiplicar(int total, int numero)
    {
        return total*numero;
    }
    //metodo para dividir
    public static double Dividir(double dividendo, double divisor)
    {
        return dividendo/divisor;
    }
}

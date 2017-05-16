/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

/**
 *
 * @author wilver
 */
public class LenguajeBean {
    
    private String nombre;
    private String lenguaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public String getComentarios()
    {
        if(lenguaje.equals("Java"))
            return "Uno de los mejores lenguajes Orientados a objetos";
        else if(lenguaje.equals("C++"))
            return "DEmasiado complejo";
        else if(lenguaje.equals("C#"))
            return "Microsoft";
        else if(lenguaje.equals("PHP"))
            return "Demasiado WEB";
        else if(lenguaje.equals("Perl"))
            return "Bien, si te gusta el código comprensible";
        else
            return "No conozco el lenguaje "+ lenguaje;
    }
    
}

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
public class Ejemplo02Matriz02 {
    public static void main(String[] args) {
        try {
            int dias_del_mes[]={31,28,31,30,31,30,31,31,30,31,30,31};
            System.out.println("Abril tiene " +dias_del_mes[3] + " días");
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage().toString());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.ejemplos.AuthorJdbc;

import java.sql.*;
/**
 *
 * @author wilver
 */
public class GestionDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_authors", "root","1234");
            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Nombre Driver: "+ dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("URL Conexion DB: "+ dbmd.getURL());
            System.out.println("Nombre de base de datos: mysql");
            System.out.println("Nombre Usuario DB: "+dbmd.getUserName());
            System.out.println("Gestor DB: "+dbmd.getDatabaseProductName());
            System.out.println("Version Gestor DB: "+dbmd.getDatabaseProductVersion());
            String [] tabTypes={"TABLE"};
            System.out.println("");
            System.out.println("Nombre de tablas");
            System.out.println("------------------");
            ResultSet tablesRS=dbmd.getTables(null, null,null, tabTypes);
            while(tablesRS.next())
                System.out.println(tablesRS.getString("Table_Name"));
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
    }
}

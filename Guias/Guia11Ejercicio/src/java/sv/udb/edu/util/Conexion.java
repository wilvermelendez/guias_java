/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilver
 */
public class Conexion {
    protected Connection con=null;
    protected PreparedStatement pstmt=null;
    public Conexion()
    {
        
    }
    
    protected void conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root","1234");
            
        } catch (Exception e) {
        }
    }
    protected void desconectar()
    {
        try {
            con.close();
        } catch (Exception e) {
        }
    }
}

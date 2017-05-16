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
    Connection con=null;
    PreparedStatement pstmt=null;
    public Conexion()
    {
        
    }
    
    private void conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root","1234");
            
        } catch (Exception e) {
        }
    }
    private void desconectar()
    {
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
    public boolean ejecutar(String query)
    {
        boolean resultado=false;
        try {
            conectar();
            pstmt=con.prepareStatement(query);
            int res=pstmt.executeUpdate();
            if(res>0)
            {
                resultado=true;
            }
            desconectar();
        } catch (Exception e) {
            resultado=false;
        }
        return resultado;
    }
    
    public boolean login(String usuario, String passwordEncriptado)
    {
        boolean resultado=false;
        try {
            String query="SELECT * FROM db_employees.users where user='"+usuario+"' and password='"+passwordEncriptado+"';";
            conectar();
            pstmt=con.prepareStatement(query);
            ResultSet res=pstmt.executeQuery(query);
            if(res!=null)
            {
                while(res.next())
                {
                    resultado=true;
                }
            }
            desconectar();
        } catch (Exception e) {
            resultado=false;
        }
        return resultado;
    }
    
    public ArrayList<Empleado> listarEmpleados()
    {
        
        ResultSet rs=null;
        ArrayList<Empleado> empleados= new ArrayList<Empleado>();
        try {
            String query="SELECT * FROM db_employees.employees;";
            conectar();
            pstmt=con.prepareStatement(query);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                Empleado empleado= new Empleado(rs.getString("lname_txt"), rs.getString("fname_txt"));
                empleados.add(empleado);
            }
            desconectar();
        } catch (Exception e) {
        }
        return empleados;
    }
   
    
    public boolean insertarEmpleado(Empleado empleado)
    {
        boolean resultado=false;
        try {
            String query="INSERT INTO employees(lname_txt,fname_txt,address1,address2,city,state,zip,phone) "
                + "VALUES ("
                + "'"+empleado.getlName()+"',"
                + "'"+empleado.getfName()+"',"
                + "'"+empleado.getAddress1()+"',"
                + "'"+empleado.getAddress2()+"',"
                + "'"+empleado.getCity()+"',"
                + "'"+empleado.getState()+"',"
                + "'"+empleado.getZip()+"',"
                + "'"+empleado.getPhone()+"');";
            conectar();
            pstmt=con.prepareStatement(query);
            int result=pstmt.executeUpdate();
            if(result>0)            
            {
                resultado=true;
            }
            desconectar();   
        } catch (Exception e) {
        }
        return resultado;
    }
}

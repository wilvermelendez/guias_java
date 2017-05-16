/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.util;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wilver
 */
public class Empleado extends Conexion {

    private String fName;
    private String lName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private int employee_num;
    
    public Empleado()
    {
    
    }
    public Empleado(String fName,String lName, int employee_num)
    {
        this.fName=fName;
        this.lName=lName;
        this.employee_num=employee_num;
    }
    public Empleado(String fName,String lName, String address1,String address2,String city, String state,String zip, String phone)
    {
        this.fName=fName;
        this.lName=lName;
        this.address1=address1;
        this.address2=address2;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
        
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getEmployee_num() {
        return employee_num;
    }

    public void setEmployee_num(int employee_num) {
        this.employee_num = employee_num;
    }
    
    public List<Empleado> listarEmpleados()
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
                Empleado empleado= new Empleado(rs.getString("lname_txt"), rs.getString("fname_txt"), rs.getInt("employee_num"));
                empleados.add(empleado);
            }
            desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
        return empleados;
    }
   
    
    public boolean insertarEmpleado()
    {
        boolean resultado=false;
        try {
            String query="INSERT INTO employees(lname_txt,fname_txt,address1,address2,city,state,zip,phone) "
                + "VALUES ("
                + "'"+this.getlName()+"',"
                + "'"+this.getfName()+"',"
                + "'"+this.getAddress1()+"',"
                + "'"+this.getAddress2()+"',"
                + "'"+this.getCity()+"',"
                + "'"+this.getState()+"',"
                + "'"+this.getZip()+"',"
                + "'"+this.getPhone()+"');";
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
    
    
    public boolean actualizarEmpleado()
    {
        boolean resultado=false;
        try {
            String query="UPDATE employees SET "
                + "lname_txt='"+this.getlName()+"',"
                + "fname_txt='"+this.getfName()+"',"
                + "address1='"+this.getAddress1()+"',"
                + "address2='"+this.getAddress2()+"',"
                + "city='"+this.getCity()+"',"
                + "state='"+this.getState()+"',"
                + "zip='"+this.getZip()+"',"
                + "phone='"+this.getPhone()+"'"
                + "WHERE employee_num="+this.getEmployee_num()+";";
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
    
    public Empleado consultarEmpleado()
    {    
        ResultSet rs=null;
        Empleado empleado=new Empleado();
        try {
            String query="SELECT * FROM db_employees.employees WHERE employee_num=" +this.getEmployee_num()+";";
            conectar();
            pstmt=con.prepareStatement(query);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                empleado.employee_num=rs.getInt("employee_num");
                empleado.fName=rs.getString("fname_txt");
                empleado.lName=rs.getString("lname_txt");
                empleado.address1=rs.getString("address1");
                empleado.address2=rs.getString("address2");
                empleado.city=rs.getString("city");
                empleado.state=rs.getString("state");
                empleado.zip=rs.getString("zip");
                empleado.phone=rs.getString("phone");
            }
            desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
        return empleado;
    }
    
    public boolean eliminarEmpleado()
    {    
        boolean resultado=false;
        Empleado empleado=new Empleado();
        try {
            String query="DELETE FROM db_employees.employees WHERE employee_num=" +this.getEmployee_num()+";";
            conectar();
            pstmt=con.prepareStatement(query);
            int result=pstmt.executeUpdate();
            if(result>0)            
            {
                resultado=true;
            }
            desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
        return resultado;
    }
}

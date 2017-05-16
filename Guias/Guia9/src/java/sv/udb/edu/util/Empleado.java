/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.util;

/**
 *
 * @author wilver
 */
public class Empleado {

    private String fName;
    private String lName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    
    public Empleado()
    {
    
    }
    public Empleado(String fName,String lName)
    {
        this.fName=fName;
        this.lName=lName;
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
    
}

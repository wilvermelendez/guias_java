/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.managedbean;

import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sv.edu.udb.util.JsfUtil;

/**
 *
 * @author wilver
 */
@ManagedBean
@RequestScoped
public class Login {

    private String nombre;
    private String password;
    
    public Login() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validar()
    {
        if(getNombre().equals("Wilver") && getPassword().equals("1234"))
        {
            //JsfUtil.addSuccessError(ResourceBundle.getBundle("/Bundle").getString("LoginCorrecto"));
            JsfUtil.addSuccessError("Ingreso de Usuario exitoso");
            return "bienvenido";
        }
        else
        {
            JsfUtil.addErrorMessage("Usuario o password incorrecto");
            return null;
        }
    }
}

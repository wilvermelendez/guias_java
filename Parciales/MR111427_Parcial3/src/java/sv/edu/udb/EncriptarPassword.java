/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 *
 * @author wilver
 */
public class EncriptarPassword {
    
    private String password;
    //Creamos constructores
    public EncriptarPassword() {
    }
    
    public EncriptarPassword(String password) {
        this.password = password;
    }
    //fin constructores
    //se crean getter and setter
    public String getPassword() {
        return hashPassword(password);
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // fin getter and setter
    // metodo utilizado para encriptar MD5
    public static String hashPassword(String password)
    {
        String PasswordEncriptado="";
        try {
            MessageDigest passwordHash= MessageDigest.getInstance("MD5");
            passwordHash.update(password.getBytes());
            byte[] hashedPassword=passwordHash.digest();
            BigInteger phData=new BigInteger(1,hashedPassword);
            PasswordEncriptado=phData.toString(16);
        } catch (Exception e) {
         
        }
        return PasswordEncriptado;
    }
    //fin metodo encriptado
}

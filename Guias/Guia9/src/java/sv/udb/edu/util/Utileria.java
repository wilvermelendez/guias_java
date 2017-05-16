/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.util;
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 *
 * @author wilver
 */
public class Utileria {
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
    
    
}

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
public class GestionTablaAutores {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_authors", "root","1234");
            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("\n\t\t\t BASE DE DATOS db_authors\n");
            String[] tabTypes={"TABLE"};
            System.out.println("\t\t\t Campos de la tabla: ");
            ResultSet rs=dbmd.getTables(null,null,null,tabTypes);
            while(rs.next())
                System.out.println(rs.getString("Table_NAme"));
           
            System.out.println("----------------------------------------------------");
            System.out.println("Nombre Columna Tipo de Dato   Tamaño del campo LLave primaria Autoincremento");
            ResultSet rsPimaria=dbmd.getPrimaryKeys(null, null, "authors");
            String llavePrimaria="";
            while(rsPimaria.next())
                llavePrimaria=rsPimaria.getString("COLUMN_NAME");
            
            ResultSet rsColumnas=dbmd.getColumns(null, null, "authors", null);
            while(rsColumnas.next())
            {
                String nombreColumna=rsColumnas.getString(4);
                String tipoColumna=rsColumnas.getString(6);
                String tamanoCampo=rsColumnas.getString(7);
                String autoIncremental=rsColumnas.getString(23);
                int longitud=nombreColumna.length();
                int i=16-longitud;
                
                if(nombreColumna.equals(llavePrimaria))
                {
                    System.out.print(nombreColumna);
                    for(int j=1; j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(tipoColumna+ "\t\t\t "+ tamanoCampo +"\t\tYES\t\t"+autoIncremental);
                    
                }
                else
                {
                    System.out.print(nombreColumna);
                    for(int j=1; j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(tipoColumna+ "\t\t\t "+ tamanoCampo +"\t\tNO\t\t"+autoIncremental);
                }
            }
            
            System.out.println("---------------------------------------------------------------");
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}

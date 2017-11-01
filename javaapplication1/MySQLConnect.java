/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author priya
 */
public class MySQLConnect {
   
    
 
    
    public static void main(String[] args){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvestigationBureau","root","");
            JOptionPane.showMessageDialog(null, "Connection Established");
            System.out.println("Connection Established");
            //String s = "Sneha";
           // String query = "Insert into test (name) values ('"+s+"')";
           // System.out.println(query);
           // ((Connection)conn).createStatement().execute(query);
           // ((Connection)conn).close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           // System.out.println(e);
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author MOOLA
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection onn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","Pro@2003");
             return onn;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}

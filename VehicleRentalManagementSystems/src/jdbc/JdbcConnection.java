/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class JdbcConnection {
 
    static String  UrL = "jdbc:mysql://localhost:3306/rentalvehicle";
    static  String User = "root";
    static String Password  = "root";
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getConnection(UrL,User,Password);
            
            System.out.println("Succesfully Connected!!!!!!......");
            
            
        } catch (ClassNotFoundException classNotFoundException) { 
            System.out.println("Connection Failed");
            classNotFoundException.printStackTrace();
        } catch (SQLException exception) {
            System.out.println("Failed to Connect to Database");
            exception.printStackTrace();
        } 
        return connection;
    }
}

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    //singlton design pattern
    //for decrease performance on connection
    //to call object just once
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
   // private  static DBConnection instance ;

//    public static DBConnection getInstance() {
//        
//        return instance;
//    }
    private static String URL="jdbc:mysql://localhost:3306/store_system";
    private static String USER="root";
    private static String PASSWORD="";
    public DBConnection(){
     try { 
           // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASSWORD);
            stmt=con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
   public Connection getconnection() {      
        try { 
           // Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex);
        }
   return con;
    }
}
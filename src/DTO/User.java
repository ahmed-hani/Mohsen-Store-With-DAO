/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DB_Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ahmed
 */
public class User {
    private String account_name;
    private String  password;
    private String type;
     private String user_name;

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public User(String account_name, String password, String type, String user_name) {
        this.account_name = account_name;
        this.password = password;
        this.type = type;
        this.user_name = user_name;
    }

    public User() {
    }
//   
//     public boolean Add() throws Exception {
//        Connection conn= new DBConnection().getconnection();
//
//            PreparedStatement add=conn.prepareStatement("insert into users values (?,?,?,?)");
//        add.setString(1, account_name);
//        add.setString(2, password);
//        add.setString(3, type);
//        add.setString(4, user_name);
//        
//       
//        
//        add.execute();
//        return true;
//    }
//
//    public boolean Edite() throws Exception {
//        Connection conn= new DBConnection().getconnection();
//                PreparedStatement edite=conn.prepareStatement("UPDATE users SET PASSWORD=?,TYPE=?,USERNAME=? WHERE ACCOUNT_NAME=?");
//        edite.setString(1, password);
//        edite.setString(2, type);
//        edite.setString(3, user_name);
//       
//       
//        edite.setString(4, account_name);
//        edite.execute();
//        return true;
//    }
//
//    public boolean Delete() throws Exception {
//        Connection conn= new DBConnection().getconnection();
//        PreparedStatement delete = conn.prepareStatement("DELETE FROM users WHERE ACCOUNT_NAME=?");
//        delete.setString(1, account_name);
//        delete.execute();
//        return true;
//    }
    
}

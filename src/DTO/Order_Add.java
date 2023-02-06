/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DB_Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ahmed
 */
public class Order_Add {
    
private int id;
private String product_name;
private int quantity;
private int cost;
private String date;
private int product_id;
private int client_id;
private String client_name;

  

    public Order_Add(int id, int product_id, int quantity, int cost, String date,int client_id) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.cost = cost;
        this.date = date;
        this.client_id=client_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Order_Add() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

     public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
   
   


//   public boolean Add() throws Exception {
//        Connection conn=new DBConnection().getconnection();
//            PreparedStatement add=conn.prepareStatement("insert into orders_add values (?,?,?,?,?)");
//        add.setInt(1, id);
//        add.setInt(2, product_id);
//        add.setInt(3, quantity);
//        add.setInt(4, cost);
//        add.setString(5,  date);
//        add.execute();
//        return true;
//    }
//
//    public boolean Edite() throws Exception {
//        Connection conn= new DBConnection().getconnection();
//                PreparedStatement edite=conn.prepareStatement("UPDATE `orders_add` SET `PRODUCT_NAME`=? ,`QUANTITY`=? ,`COST`=? ,`DATE`=? WHERE `ID`=?");
//        edite.setInt(1, product_id);
//        edite.setInt(2, quantity);
//        edite.setInt(3, cost);
//        edite.setString(4,  date);
//        edite.setInt(5, id);
//        edite.execute();
//        return true;
//    }
//
//    public boolean Delete() throws Exception {
//        Connection conn= new DBConnection().getconnection();
//        PreparedStatement delete = conn.prepareStatement("DELETE FROM orders_add WHERE id=?");
//        delete.setInt(1, id);
//        delete.execute();
//        return true;
//    }
     public boolean AutoNum() throws Exception {
        Connection conn= new DBConnection().getconnection();
        PreparedStatement get = conn.prepareStatement("SELECT MAX(`ID`) FROM `orders_add`");
        get.setInt(1, id);
        get.execute();
        return true;
    }
// public  LinkedList<Product> getData() throws Exception { 
//     LinkedList<Product> data = new LinkedList<Product>();
//        Connection conn= new DBConnection().getconnection();
//     Statement st=conn.createStatement();
//     ResultSet rs=st.executeQuery("SELECT `ID`, `PRODUCT_NAME`, `QUANTITY`, `PRICE` FROM `product`");
//     while(rs.next()){
//       data.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)) );
//     }
//      return data;
//    }
  
}

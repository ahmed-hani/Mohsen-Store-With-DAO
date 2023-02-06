/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB_Connection.DBConnection;
import DTO.Order_Add;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class OrderAddDao implements DAO<Order_Add>{
 Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;
    @Override
    public int Add(Order_Add item) throws SQLException{
       
con=new DBConnection().getconnection();
             pstmt=con.prepareStatement("insert into orders_add values (?,?,?,?,?)");
        pstmt.setInt(1, item.getId());
        pstmt.setInt(2, item.getProduct_id());
        pstmt.setInt(3, item.getQuantity());
        pstmt.setInt(4, item.getCost());
        pstmt.setString(5, item.getDate() );
        int result=pstmt.executeUpdate();

        return result;   
    }

    @Override
    public Order_Add GetById(int id) throws SQLException{
        Order_Add ord=null;
        con=new DBConnection().getconnection();
        String sql="";
        
        return ord;
    }

    @Override
    public List<Order_Add> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Update(Order_Add item) throws SQLException{
      
con=new DBConnection().getconnection();

             pstmt=con.prepareStatement("UPDATE `orders_add` SET `PRODUCT_NAME`=? ,`QUANTITY`=? ,`COST`=? ,`DATE`=? WHERE `ID`=?");
        pstmt.setInt(5, item.getId());
        pstmt.setInt(1, item.getProduct_id());
        pstmt.setInt(2, item.getQuantity());
        pstmt.setInt(3, item.getCost());
        pstmt.setString(4, item.getDate() );
       int result=pstmt.executeUpdate();

        return result;
    }

    @Override
    public int Delete(Order_Add item) throws SQLException{
      
       con=new DBConnection().getconnection();

             pstmt=con.prepareStatement("DELETE FROM orders_add WHERE id=?");
        pstmt.setInt(1, item.getId());
       int result=pstmt.executeUpdate();

        return result;     
    }
    
}

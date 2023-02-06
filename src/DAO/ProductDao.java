/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB_Connection.DBConnection;
import DTO.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class ProductDao implements DAO<Product>{
     Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;
    

public ProductDao(){
  try {
            con = new DBConnection().getconnection();
            stmt = con.createStatement();
            stmt1=con.createStatement();
            //stocks = new Stocks();
        } catch (Exception e) {
            e.printStackTrace();
        }
}


//    @Override
//    public boolean AddAll(List items) {
//        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public List<Product> GetAll() throws SQLException{
         con= new DBConnection().getconnection();
         String sql="select* from product ";
         List<Product>products=new ArrayList<Product>();
         stmt=con.createStatement();
         rs=stmt.executeQuery(sql);
         while(rs.next()){
          int pr_id= rs.getInt("ID");
       String product_name=rs.getString("PRODUCT_NAME");
       int quantity=rs.getInt("QUANTITY");
       int category_id=rs.getInt("CATEGORY_ID");
       int price=rs.getInt("PRICE");
       Product pr=new Product(pr_id,product_name,quantity,category_id,price);
       products.add(pr);
         }
         return products;
    } 

    @Override
    public int Update(Product item) throws SQLException{
       
        con= new DBConnection().getconnection();
                 pstmt=con.prepareStatement("UPDATE product SET PRODUCT_NAME=?,QUANTITY=?,CATEGORY_ID=?,PRICE=? WHERE ID=?");
        pstmt.setString(1, item.getProduct_name());
        pstmt.setInt(2, item.getQuantity());
        pstmt.setInt(3, item.getCategory_id());
        pstmt.setInt(4,item.getPrice());
        pstmt.setInt(5, item.getId());
        
       int result=pstmt.executeUpdate(); 
        return result;
        
    }

    @Override
    public int Delete(Product item) throws SQLException{
        
        con= new DBConnection().getconnection();
         pstmt = con.prepareStatement("DELETE FROM product WHERE ID=?");
        pstmt.setInt(1, item.getId());
      int result = pstmt.executeUpdate();
       
        
        return result;
        
    }

    @Override
    public int Add(Product item) throws SQLException{
        
         con = new DBConnection().getconnection();
         pstmt=con.prepareStatement("insert into product values (?,?,?,?,?)");
        pstmt.setInt(1, item.getId());
        pstmt.setString(2, item.getProduct_name());
        pstmt.setInt(3, item.getQuantity());
        pstmt.setInt(4, item.getCategory_id());
        pstmt.setInt(5, item.getPrice());
        int result=pstmt.executeUpdate(); 
       
       return result;
    }

    @Override
    public Product GetById(int id) throws SQLException{
         Product pr=null;
       
        con = new DBConnection().getconnection();       
        String sql="select* from product WHERE ID=?";
        pstmt=con.prepareStatement(sql);
        pstmt.setInt(1, id);
        rs=pstmt.executeQuery();
        if(rs.next()){
       int pr_id= rs.getInt("ID");
       String product_name=rs.getString("PRODUCT_NAME");
       int quantity=rs.getInt("QUANTITY");
       int category_id=rs.getInt("CATEGORY_ID");
       int price=rs.getInt("PRICE");
        pr=new Product(pr_id,product_name,quantity,category_id,price);
        }
       
        return pr;
    }

public int UpdateQuantity(Product item)throws SQLException{
   
   
    con = new DBConnection().getconnection();   
    pstmt=con.prepareStatement("UPDATE `product` SET `QUANTITY`=? WHERE `PRODUCT_NAME`=?");
        
        pstmt.setInt(1, item.getQuantity());
        pstmt.setString(2, item.getProduct_name());
       
      int  result= pstmt.executeUpdate();
   
    
return result;
}

 
}
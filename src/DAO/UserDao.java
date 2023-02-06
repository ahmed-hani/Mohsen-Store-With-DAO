/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB_Connection.DBConnection;
import DTO.User;
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
public class UserDao implements DAO<User>{
 Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs1=null;
    Statement stmt1=null;
    ResultSet rs = null;
    @Override
    public int Add(User item) throws SQLException{
        
con= new DBConnection().getconnection();
             pstmt=con.prepareStatement("insert into users values (?,?,?,?)");
        pstmt.setString(1, item.getAccount_name());
        pstmt.setString(2, item.getPassword());
        pstmt.setString(3, item.getType());
        pstmt.setString(4, item.getUser_name());
        
       int result= pstmt.executeUpdate();
       
        return result;  
    }

    @Override
    public User GetById(int id) throws SQLException{
        User user=null;
         con=new DBConnection().getconnection();
        String sql="select* from users WHERE ACCOUNT_NAME=?";
        pstmt=con.prepareStatement(sql);
        pstmt.setInt(1, id);
        rs=pstmt.executeQuery();
        if(rs.next()){
        String account_name=rs.getString("ACCOUNT_NAME");
        String passw0rd=rs.getString("PASSWORD");
        String type=rs.getString("TYPE");
        String username=rs.getString("USERNAME");
         user=new User(account_name,passw0rd,type,username);
       
        }
        return user;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> GetAll() throws SQLException{
        con=new DBConnection().getconnection();
        List<User>users=new ArrayList<User>();
        String sql="select* from users ";
        stmt=con.createStatement();
        rs=stmt.executeQuery(sql);
        while(rs.next()){
        String account_name=rs.getString("ACCOUNT_NAME");
        String passw0rd=rs.getString("PASSWORD");
        String type=rs.getString("TYPE");
        String username=rs.getString("USERNAME");
        User user=new User(account_name,passw0rd,type,username);
        users.add(user);
        }
        return users;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Update(User item) throws SQLException{
 
con= new DBConnection().getconnection();
             pstmt=con.prepareStatement("UPDATE users SET PASSWORD=?,TYPE=?,USERNAME=? WHERE ACCOUNT_NAME=?");
        pstmt.setString(4, item.getAccount_name());
        pstmt.setString(1, item.getPassword());
        pstmt.setString(2, item.getType());
        pstmt.setString(3, item.getUser_name());
        
       int result= pstmt.executeUpdate();
       
        return result; 
    }

    @Override
    public int Delete(User item) throws SQLException{

con= new DBConnection().getconnection();
             pstmt=con.prepareStatement("DELETE FROM users WHERE ACCOUNT_NAME=?");
        pstmt.setString(1, item.getAccount_name());
       int result= pstmt.executeUpdate();
       
        return result; 
    }
    
}

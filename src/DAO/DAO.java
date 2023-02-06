/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ahmed
 */
// <T> THIS IS GENERICS 
public interface DAO <T>{
    // CRUD OPERATION
    // CREATE
    int Add(T item) throws SQLException; 
  //  boolean AddAll(List<T> items);
    //READ
    T GetById(int id)throws SQLException;
    List<T> GetAll()throws SQLException;
    //UPDATE
    int Update(T item)throws SQLException;
    //DELETE
    int Delete(T item)throws SQLException;
    
    
}

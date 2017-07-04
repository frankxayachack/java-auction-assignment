/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.User;
import utils.ConnectionManager;

/**
 *
 * @author sengx
 */
public class AuthenMethods {
    ConnectionManager db = new ConnectionManager();
    Connection conn;

    public AuthenMethods() {
        conn = db.getConnection();
    }
    
        public boolean checkUser(String user, String pass) {
        String sql = "SELECT * FROM UserTBL WHERE username=? AND password=?";
        boolean status = false;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return status;
    }
    
    public User getUser(String user, String pass) {
        String sql = "SELECT * FROM UserTBL WHERE username=? AND password=?";
        User temp = null;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String Username= rs.getString(2);
                temp= new User(id,Username);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        return temp;
    }
    
}

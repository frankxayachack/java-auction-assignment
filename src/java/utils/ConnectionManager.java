/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sengx
 */
public class ConnectionManager {
    public static Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Classwork7;user=sa;password=password";
            conn = DriverManager.getConnection(url);
        }catch(Exception e){
            System.out.println(e);
        }
        
        return conn;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

/**
 *
 * @author Duc Le
 */
public class DbHelper {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/qlsach?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    private static final String PWD = "";
    
    private static Connection con = null;
    
    public static Connection getConnection() {
        if (con == null) {            
            try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PWD);            
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
            
        return con;
    }
}

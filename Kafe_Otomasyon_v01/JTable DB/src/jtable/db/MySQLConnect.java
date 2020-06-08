package jtable.db;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Ramazan
 */
public class MySQLConnect {
    Connection conn=null;
    
    public static Connection ConnectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://MYSQL5017.Smarterasp.net/db_9fdd64_ramazan", "9fdd64_ramazan", "15591100rmz");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
    
}

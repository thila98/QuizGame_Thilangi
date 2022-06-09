/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Thilangi
 */
public class connectionProvider {

    /**
     * get connection from mysql database
     * @return
     */
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quick_quiz", "root", "");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}

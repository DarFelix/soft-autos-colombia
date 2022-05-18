
package com.iudigital.util;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Darwin Felix
*/


public class ConnectionUtil {

   private static final String URL = "jdbc:mysql://localhost:3306/autos-col?zeroDateTimeBehavior=convertToNull&serverTimezone=America/Bogota&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Felix135+";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
 

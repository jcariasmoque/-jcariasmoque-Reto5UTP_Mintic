/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juank
 */
public class JDBCUtilities {

   

    public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:sqlite:C:/sqlite/ProyectosConstruccion.db";
        return DriverManager.getConnection(url);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projekt.DBConnector;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 
@author fatih*/
public class DBConnector {

        public static Connection getConnection() throws SQLException {

        //  Database credentials
        String url = "jdbc:mysql://172.104.152.221:3306/Außenklima";
        String user = "admin";
        String pass = "FraUAS2023.";

        // JDBC driver name and database URL
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);


        } catch (SQLException e) {
            System.out.println("KEINE Verbindung");
        }
        return con;
    }

}
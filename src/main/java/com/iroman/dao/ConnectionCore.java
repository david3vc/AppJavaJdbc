package com.iroman.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCore {
    public Connection getConnection(){
        // Attributes
        String hostName = "dpg-cr54raij1k6c73931srg-a.oregon-postgres.render.com";
        String port = "5432";
        String dbName = "restaurant_management_db_xez2";
        String userName = "developer";
        String passWord = "n9ZEbcP4Amhn1VfODmAujKoemNS8xx7G";

        // process


        try{
            // Load driver
            Class.forName("org.postgresql.Driver");

            // url connection
            String url = "jdbc:postgresql://" + hostName + ":" + port + "/" + dbName;

            // result
            return DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e){
            System.out.println("ConnectionCore::getConnection::Error:" + e.getMessage());
        }

        return null;
    }
}

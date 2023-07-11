package com.example.factory;

import java.io.*;
import java.sql.*;
import java.util.*;

//design-pattern : Factory Method
// Factory-class
public class MySqlConnectionFactory {

    static Properties props = new Properties(); // Externalize configuration properties from code

    static {
        try {
            props.load(MySqlConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Factory-Method
    public static Connection getConnection() {
        try {
            // step-1 : register the driver
            Class.forName(props.getProperty("db.driver"));
            // step-2 : create a connection
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

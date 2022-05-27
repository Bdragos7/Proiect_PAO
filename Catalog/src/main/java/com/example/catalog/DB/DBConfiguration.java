package com.example.catalog.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {

    private static final String DATABSE_URL = "jdbc:mysql://localhost:3325/catalog_pao";
    private static final String USER = "root";
    private static final String PASSWORD = "pao";

    private static Connection databaseConnection;


    private DBConfiguration() {
    }

    public static Connection getDatabaseConnection()    {
        try {
            if(databaseConnection == null || databaseConnection.isClosed()) {
                databaseConnection = DriverManager.getConnection(DATABSE_URL, USER, PASSWORD);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return databaseConnection;
    }

    public static void closedatabaseConnection()    {
        try {
            if(databaseConnection != null && !databaseConnection.isClosed()) {
                databaseConnection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
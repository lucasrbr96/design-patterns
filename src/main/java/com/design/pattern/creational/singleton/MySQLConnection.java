package com.design.pattern.creational.singleton;

public class MySQLConnection{

    private static MySQLConnection connection;
    private String connectionString;

    //constructor private - prevent building new ones
    private MySQLConnection(){
        connectionString = "jdbc:mysql://localhost:3306/myDatabase" + Math.random();
    }

    //if it already exists, returns the created one
    public static MySQLConnection getInstance(){
        if (connection == null) {
            connection = new MySQLConnection();
        }
        return connection;
    }

    public String getConnectionString() {
        return connectionString;
    }
}

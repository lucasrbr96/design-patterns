package com.design.pattern.creational.singleton;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       MySQLConnection mySQLConnection1 = MySQLConnection.getInstance();
       MySQLConnection mySQLConnection2 = MySQLConnection.getInstance();
       System.out.println(Objects.equals(mySQLConnection1, mySQLConnection2));
       System.out.println(mySQLConnection1.getConnectionString().equals(mySQLConnection2.getConnectionString()));
    }
}
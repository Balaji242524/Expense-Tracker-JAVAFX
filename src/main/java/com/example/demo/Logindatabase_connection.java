
    package com.example.demo;



import java.sql.Driver;
import java.lang.Class;
import java.sql.Connection;
import java.sql.DriverManager;

    public class Logindatabase_connection {
        public  Connection databaselink;
        public  Connection getConnection() throws ClassNotFoundException {
            String databaseName="budget_buddy";
            String databaseUser ="root";
            String databasePassword ="Balaji@2425";
            String url= "jdbc:mysql://localhost/budget_buddy" ;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaselink= DriverManager.getConnection(url,databaseUser,databasePassword);
                System.out.println("DB connection success");

            }
            catch (Exception e){
                e.printStackTrace();
            }
            return databaselink;
        }
    }

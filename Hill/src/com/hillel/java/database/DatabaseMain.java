package com.hillel.java.database;

import java.sql.*;

/**
 * Created by AKRAPIVNY on 29.06.2015.
 */
public class DatabaseMain {
    public static void main(String[] args) throws SQLException{
        System.setProperty("jdbc.drivers","org.postgresql.Driver");

        String connectinString = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(connectinString,"postgres","1krab1");

        Statement statement = connection.createStatement();
        String sql = "SELECT name, category, price FROM STORE";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
                String name =       resultSet.getString("name");
                String category =   resultSet.getString("category");
                Integer price =     resultSet.getInt("price");
            Product product = new Product(name, category, price);
            System.out.println(product);

        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}

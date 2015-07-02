package com.hillel.java.database;

import java.beans.*;
import java.sql.*;
import java.sql.Statement;

/**
 * Created by AKRAPIVNY on 29.06.2015.
 */
public class DatabaseMain {
    public static void main(String[] args) throws SQLException{
        System.setProperty("jdbc.drivers","org.postgresql.Driver");

        String connectinString = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(connectinString, "postgres", "1krab1");

        read(connection);
//        update(connection);
        update(connection, 34, "Mouse");
//        updateWithInjection(connection, 10, "Mouse' or' '=' ");
        delete(connection, "name1");
        delete(connection, "name2");
        delete(connection, "name3");

        read(connection);
        connection.close();

    }

    private static void delete (Connection connection, String name)  throws SQLException{
        String sql = "DELETE from store WHERE name=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.executeUpdate();
        System.out.println(statement.toString());
        statement.close();
    }


    private static void update(Connection connection, int price, String name)  throws SQLException{
        String sql = "UPDATE store set price =? WHERE name=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, price);
        statement.setString(2, name);
        statement.executeUpdate();
        System.out.println(statement.toString());
        statement.close();
    }


//    private static void update(Connection connection) throws SQLException {
    private static void updateWithInjection(Connection connection, int newPrice, String name) throws SQLException {
        Statement statement = connection.createStatement();
//        String sql = "UPDATE store set price = 30 WHERE name='Mouse' ";
        String sql = "UPDATE store set price = "+newPrice+"  WHERE name='"+name+"' ";
        System.out.println(sql);
        statement.executeUpdate(sql);
        statement.close();
    }

    private static void read(Connection connection) throws SQLException {
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
    }
}

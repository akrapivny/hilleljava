package com.hillel.java.database;

import Swing.NumberListener;

import javax.swing.*;
import java.sql.*;
import java.awt.*;

/**
 * Created by AKRAPIVNY on 02.07.2015.
 */
public class DbNavigationForm extends JFrame{
    private JTextField nameField;
    private JTextField categoryField;
    private JTextField priceField;
    private JButton NEXTButton;
    private JPanel panel;
    private final ResultSet resultSet;


    setContentPane(panel);
    pack();
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    //NumberListener listener = new NumberListener(textField);

    //NEXTButton.addActionListener(listener);



    public DbNavigationForm() throws SQLException{
        System.setProperty("jdbc.drivers","org.postgresql.Driver");

        String connectinString = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(connectinString, "postgres", "1krab1");

        String sql = "SELECT name, category, price FROM STORE";

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = statement.executeQuery(sql);

        //statement.close();


    }





}

package com.hillel.java.database;

import Swing.NumberListener;
import sun.misc.IOUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
    private JButton PREVIOUSButton;
    private JButton SAVEButton;
    private JButton ADDButton;
    private JButton DELETEButton;
    private JButton ImageButton;
    private JLabel ImageLabel;
    private final ResultSet resultSet;
    private Connection connection;
    private byte[] imageBytes;








    public DbNavigationForm() throws SQLException{
        System.setProperty("jdbc.drivers","org.postgresql.Driver");

        String connectinString = "jdbc:postgresql://localhost:5432/postgres";
        connection = DriverManager.getConnection(connectinString, "postgres", "1krab1");

        String sql = "SELECT name, category, price FROM STORE";

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = statement.executeQuery(sql);

        resultSet.next();
        readFromResultSet();
        initNextButton();
        initPreviousButton();
        initSaveButton();
        initAddButton();
        initDeleteButton();
        initImageButton();
        initClose();

        setContentPane(panel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }




    private void initClose() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    connection.close();
                } catch (SQLException ignored) {
                }
            }
        });
    }

    private void readFromResultSet() throws SQLException {
        nameField.setText(resultSet.getString(1));
        categoryField.setText(resultSet.getString(2));
        priceField.setText(Integer.toString(resultSet.getInt(3)));
    }

    private void updateResultSet() throws SQLException {
        resultSet.updateString(1, nameField.getText());
        resultSet.updateString(2, categoryField.getText());
        resultSet.updateInt(3, Integer.parseInt(priceField.getText()));
    }


    private void initImageButton() {
        ImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showDialog(null, "ok") == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        imageBytes = IOUtils.toByteArrays(new FileInputStream(file));
                        drawImage();
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load image", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }


    private void drawImage(){
        if (imageBytes !=null){
        try {
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
            ImageLabel.setIcon(new ImageIcon(image));

        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to draw image", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void initDeleteButton() {
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resultSet.deleteRow();
                    if (resultSet.next() || resultSet.previous()) {
                        readFromResultSet();
                    } else {
                        nameField.setText("");
                        categoryField.setText("");
                        priceField.setText("");
                    }

                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to delete element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }



    private void initAddButton() {
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resultSet.moveToInsertRow();
                    updateResultSet();
                    resultSet.insertRow();
                    //resultSet.moveToCurrentRow();
                    resultSet.last();
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to add element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }



    private void initSaveButton() {
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateResultSet();
                    resultSet.updateRow();
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to save previous element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    private void initPreviousButton() {
        PREVIOUSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!resultSet.isFirst() && !resultSet.isBeforeFirst()) {
                        resultSet.previous();
                        readFromResultSet();
                    }
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load previous element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }



    private void initNextButton() {
        NEXTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!resultSet.isLast() && !resultSet.isAfterLast() ) {
                        resultSet.next();
                        readFromResultSet();
                    }
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load next element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) throws SQLException{
        DbNavigationForm from = new DbNavigationForm();
    }




}

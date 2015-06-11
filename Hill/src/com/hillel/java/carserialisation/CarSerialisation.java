package com.hillel.java.carserialisation;

import com.hillel.java.serialisation.Car;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by AKRAPIVNY on 11.06.2015.
 */
public class CarSerialisation extends JFrame{
    private JPanel panel;
    private JButton addButton;
    private JTextField textField1;
    private JList list;
    private DefaultListModel listModel;

    public static void main(String[] args) {
        new CarSerialisation();
    }

    public CarSerialisation(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        pack();
        setVisible(true);

        //exitButton.addActionListener(quitAction);

    }

    private void init() {
        listModel = new DefaultListModel();
        list.setModel(listModel);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String carManufacturer = textField1.getText();
                Car car = new Car(carManufacturer);


                listModel.add(listModel.size(), car);
                textField1.setText("");

            }


        });

        initMenuBar();

    }

    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);
        JMenuItem saveItem = new JMenuItem("Save");
        menuFile.add(saveItem);
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hill/serializedCar1.dat"))) {
                    Object[] cars = listModel.toArray();
                    outputStream.writeObject(cars);
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null, "Save error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JMenuItem loadItem = new JMenuItem("Load");
        menuFile.add(loadItem);
        loadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hill/serializedCar1.dat"))) {
                    Object[] cars = (Object[]) inputStream.readObject();
                    listModel.clear();
                    for (Object car: cars) {
                        listModel.add(listModel.size(),car);
                        //throw new IOException();
                    }
                } catch (IOException | ClassNotFoundException e1) {
                    JOptionPane.showMessageDialog(null, "Load error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
}
package Swing;

import javax.swing.*;

/**
 * Created by AKRAPIVNY on 21.05.2015.
 */
public class FirstForm extends JFrame{
    private JPanel panel;
    private JButton exitButton;
    private JTextField textField;
    private JButton printButton;
    private JTextField outputtextField;

    public FirstForm(){
        setContentPane(panel);
        setSize(300, 300);
        setTitle("First form");
       // pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        QuitAction quitAction = new QuitAction();

        exitButton.addActionListener(quitAction);

        Printer printer = new Printer(textField,outputtextField);
        printButton.addActionListener(printer);

    }

    public static void main(String[] args) {
        new FirstForm();
    }
}

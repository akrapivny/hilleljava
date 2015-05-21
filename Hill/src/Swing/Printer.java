package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AKRAPIVNY on 21.05.2015.
 */
public class Printer implements ActionListener {


    private final JTextField textField;
    private final JTextField output;

    public Printer(JTextField field, JTextField outputtextField) {
        this.textField = field;
        this.output = outputtextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText(textField.getText());
        textField.setText("");
        //System.out.println(textField.getText());

    }
}
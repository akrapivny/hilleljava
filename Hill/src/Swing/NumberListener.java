package Swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by AKRAPIVNY on 21.05.2015.
 */
public class NumberListener implements ActionListener {

    private JTextField textField;
    private int firstOperand;

    public NumberListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();
        switch (command){
            case "+":
                firstOperand = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "=":
                int secondOperand= Integer.parseInt(textField.getText());
                textField.setText(Integer.toString(firstOperand + secondOperand));

                break;
            default:
                int n = Integer.parseInt(command);
                textField.setText(textField.getText()+n);

        }


    }
}

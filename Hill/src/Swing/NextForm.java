package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AKRAPIVNY on 25.05.2015.
 */
public class NextForm extends JFrame{
    private JButton exitButton;
    private JPanel panel1;
    private JList list1;
    private JButton addButton;
    private JScrollPane scrollPane;

    public NextForm()  {
        setContentPane(panel1);
         pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

             exitButton.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     //int result = JOptionPane.showConfirmDialog(null,"Do you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                     int result = JOptionPane.showConfirmDialog(panel1.getParent(),"Do you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                     if (result==JOptionPane.OK_OPTION) {
                         exit();
                     }
                 }

                 public void exit() {
                     System.exit(0);

                 }

             });




        DefaultListModel listModel = new DefaultListModel();
        list1.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.add(listModel.size(),"dgdfg");
                //pack();

            }
        });



 /*       ActionListener quitaction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        };
*/
    }

    public static void main(String[] args) {
        new NextForm();
    }
}

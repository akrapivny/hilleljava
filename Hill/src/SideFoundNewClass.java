import javax.swing.*;

/**
 * Created by ¿À≈ —≈… on 15.04.2015.
 */
public class SideFoundNewClass {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input perimetr ");
        double p = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Input area ");
        double s = Double.parseDouble(input);


        RectangleTask Rec1 = new RectangleTask(s, p);
        if (Rec1.hasSolution()) {
            Rec1.getRectangle();
            JOptionPane.showMessageDialog(null, Rec1.getRectangle().toString());
        } else {
            JOptionPane.showMessageDialog(null, "No solution");
        }

        RectangleTask Rec2 = new RectangleTask(s, p);
        if (Rec2.hasSolution()) {
            Rec2.getRectangle();
            JOptionPane.showMessageDialog(null, Rec2.getRectangle().toString());
        } else {
            JOptionPane.showMessageDialog(null, "No solution");
        }

        if (Rec1.equals(Rec2)) {
            JOptionPane.showMessageDialog(null, "Rectangles are equal");
        } else
            JOptionPane.showMessageDialog(null, "Rectangles are not equal");

    }
}



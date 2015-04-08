import javax.swing.*;

public class SideFoundClass {

    public static void main(String[] params) {
        String input = JOptionPane.showInputDialog("Input perimetr ");
        double p = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Input area ");
        double s = Integer.parseInt(input);
        double a;//сторона а
        double b;//сторона b
        double discriminant; //дискриминант

        discriminant = Math.pow((p / 2), 2) - 4 * s;

        if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "No result");
        } else if (discriminant > 0) {
            a = ((p / 2) + Math.sqrt(discriminant)) / 2;
            b = p / 2 - a;
            JOptionPane.showMessageDialog(null, "Rectangle sides: " + a + ", " + b);
        } else if (discriminant == 0) {
            a = p / 4;
            b = p / 4;
            JOptionPane.showMessageDialog(null, "Rectangle sides: " + a + ", " + b);

        }

        System.exit(0);
    }
}


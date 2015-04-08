import javax.swing.*;

public class SideFoundClass {

    public static void main(String[] params) {
        String input = JOptionPane.showInputDialog("Input perimetr ");
        double p = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Input area ");
        double s = Double.parseDouble(input);
        double a;//side à
        double b;//side b
        double discriminant; //diskriminant

        discriminant = Math.pow((p / 2), 2) - 4 * s;

        String resultstr;

        if (discriminant < 0) {
            resultstr = "No result";
        } else if (discriminant > 0) {
            a = ((p / 2) + Math.sqrt(discriminant)) / 2;
            b = p / 2 - a;
//            resultstr = "Rectangle sides: " + a + ", " + b;
            resultstr = "Rectangle sides: " + String.format("%2.2f",a) + " and " + String.format("%2.2f",b);
        } else {
            a = p / 4;
            b = p / 4;
//            resultstr = "Rectangle sides: " + a + ", " + b;
            resultstr = "Rectangle sides: " + String.format("%2.2f",a) + " and " + String.format("%2.2f",b);
        }
        JOptionPane.showMessageDialog(null, resultstr);
    }
}


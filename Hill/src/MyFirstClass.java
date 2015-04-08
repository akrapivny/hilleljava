import javax.swing.*;

public class MyFirstClass {
    public static void main (String[] params) {


        String input = JOptionPane.showInputDialog("Input perimetr ") ;
        double p = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Input area ") ;
        double s = Double.parseDouble(input);
        double a;//сторона а
        double b;//сторона b
        double discriminant; //дискриминант

        String resultstring;
        discriminant = Math.pow((p/2),2)-4*s;

        if (discriminant<0) {
            resultstring = "No result";
        } else if (discriminant>0) {
            a=((p/2)+Math.sqrt(discriminant))/2;
            b=p/2-a;
            resultstring = "Rectangle sides: " + a + ", " + b;
        } else  {
            a=p/4;
            b=p/4;
            resultstring = "Rectangle sides: " + a + ", " + b;
        }
        JOptionPane.showMessageDialog(null,resultstring) ;
        System. exit(0);
    }


}

import javax.swing.*;

/**
 * Created by KRAB on 15.04.2015.
 */
public class RectangleTask {
    double s;
    double p;
    double a;
    double b;
    boolean solution;

    public RectangleTask(Double s, Double p) {
        this.s = s;
        this.p = p;
    }

    public boolean hasSolution() {
        double discriminant; //diskriminant
        double a;
        double b;
        boolean result = true;

        discriminant = Math.pow((p / 2), 2) - 4 * s;

        if (discriminant < 0) {
            result = false;
            solution = false;
        } else {
            if (discriminant > 0) {
                a = ((p / 2) + Math.sqrt(discriminant)) / 2;
                b = p / 2 - a;

            } else {
                a = p / 4;
                b = p / 4;
            }
            this.a = a;
            this.b = b;
            solution = true;
        }
        return result;

    }

    public Rectangle getRectangle() {
        if (solution = false) {
            return null;
        } else {
            Rectangle Rec1 = new Rectangle(this.a, this.b);
            return Rec1;
        }
    }


}

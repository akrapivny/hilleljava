package com.hillel.java.inheritens;

/**
 * Created by KRAB on 22.04.2015.
 */
public class Rectanglae extends Shape {

    private int a;
    private int b;

    public Rectanglae(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle " + a + " x "+ b + "  "+ super.toString();
    }

    @Override
    public String getColor() {
        return "White";
    }
}

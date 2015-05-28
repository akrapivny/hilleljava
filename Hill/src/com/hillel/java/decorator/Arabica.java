package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class Arabica extends Beverage {

    @Override
    public int cost() {
        return 80;
    }

    @Override
    public String description() {
        return "Arabica";
    }
}

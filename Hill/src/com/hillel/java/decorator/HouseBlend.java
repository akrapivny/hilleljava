package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public int cost() {
        return 90;
    }

    @Override
    public String description() {
        return "HouseBlend";
    }
}

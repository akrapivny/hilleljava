package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class Robusta extends Beverage {

    @Override
    public int cost() {
        return 70;
    }

    @Override
    public String description() {
        return "Robusta";
    }
}

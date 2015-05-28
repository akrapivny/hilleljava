package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public abstract class BeveregeDecorator extends Beverage {
    Beverage beverage;

    public BeveregeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}

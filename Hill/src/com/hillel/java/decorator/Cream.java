package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class Cream extends BeveregeDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost()+10;
    }

    @Override
    public String description() {
        return beverage.description()+ ", cream";
    }
}

package com.hillel.java.advancebleOOP.duck;

import com.hillel.java.advancebleOOP.fly.FlyBehavior;
import com.hillel.java.advancebleOOP.fly.FlyNoWay;
import com.hillel.java.advancebleOOP.quck.QuackBehavior;
import com.hillel.java.advancebleOOP.quck.Silence;
import com.hillel.java.advancebleOOP.quck.quack;

/**
 * Created by KRAB on 24.04.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Silence());
    }

    @Override
    public String quak() {
        return "I can't quak";
    }

    @Override
    public String fly() {
        return "I can't fly";
    }

    @Override
    public String display() {
        return "Rubber duck";
    }
}

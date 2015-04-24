package com.hillel.java.advancebleOOP.duck;

import com.hillel.java.advancebleOOP.fly.FlyBehavior;
import com.hillel.java.advancebleOOP.fly.fly;
import com.hillel.java.advancebleOOP.quck.QuackBehavior;
import com.hillel.java.advancebleOOP.quck.quack;

/**
 * Created by KRAB on 24.04.2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new fly(), new quack());
    }

    @Override
    public String display() {
        return "Mallard duck";
    }

}

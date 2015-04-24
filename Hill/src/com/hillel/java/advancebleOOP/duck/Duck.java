package com.hillel.java.advancebleOOP.duck;

import com.hillel.java.advancebleOOP.fly.FlyBehavior;
import com.hillel.java.advancebleOOP.quck.QuackBehavior;

/**
 * Created by KRAB on 24.04.2015.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public String fly() {
        return flyBehavior.fly();
    }

    public String quak() {
        return quackBehavior.quack() ;
    }

    public String swim() {
        return "I'm swiming";
    }

    public abstract String display();
}

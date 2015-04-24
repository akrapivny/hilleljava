package com.hillel.java.advancebleOOP.duck;

import com.hillel.java.advancebleOOP.fly.FlyNoWay;
import com.hillel.java.advancebleOOP.quck.quack;

/**
 * Created by KRAB on 24.04.2015.
 */
public class DecoyDuck extends Duck{

public DecoyDuck(){
    super(new FlyNoWay(), new quack());
}

    @Override
    public String fly() {
        return "I can't fly";
    }

    @Override
    public String display() {
        return "Decoy duck";
    }
}

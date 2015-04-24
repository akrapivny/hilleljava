package com.hillel.java.advancebleOOP.quck;

/**
 * Created by KRAB on 24.04.2015.
 */
public class Silence implements QuackBehavior {
    @Override
    public String quack() {
        return "<silence>";
    }
}

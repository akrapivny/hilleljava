package com.hillel.java.rpggame.hero;

/**
 * Created by KRAB on 25.04.2015.
 */
public class humanHero extends Hero {

    @Override
    public String attack() {
        return "Human attack";
    }

    @Override
    public String display() {
        return "Human";
    }

}

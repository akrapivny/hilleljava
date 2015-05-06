package com.hillel.java.javaintro.comparison;

/**
 * Created by KRAB on 06.05.2015.
 */
public class CheapVine extends Vine {
    public CheapVine(int year, int price) {
        super (year,price);
    }

    @Override
    public String taste() {
        return "sour";
    }
}
package com.hillel.java.javaintro.comparison;

import java.util.Comparator;

/**
 * Created by KRAB on 29.04.2015.
 */
public class VineCorporator implements Comparator<Vine>{

    @Override
    public int compare(Vine one, Vine other){
        return one.getPrice()-other.getPrice();
    }
}

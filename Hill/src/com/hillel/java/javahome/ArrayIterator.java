package com.hillel.java.javahome;

import java.util.Iterator;

/**
 * Created by KRAB on 24.04.2015.
 */
public class ArrayIterator implements Iterator {

    private ImprovedArray improvedArray;
    private int currentIndex;

    public ArrayIterator(ImprovedArray improvedArray) {
        this.improvedArray = improvedArray;
    }

    @Override
    public boolean hasNext() {
        return currentIndex<improvedArray.size();
    }

    @Override
    public Object next() {
        Object next = improvedArray.get(currentIndex);
        currentIndex++;
        return null;
    }
}

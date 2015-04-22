package com.hillel.java.inheritens;

import com.hillel.java.javahome.StringArray;

/**
 * Created by KRAB on 22.04.2015.
 */
public abstract class Shape extends Object implements Colored {
    public abstract int getArea();

    @Override
    public String toString(){
        return "area is " + getArea();
    }

}

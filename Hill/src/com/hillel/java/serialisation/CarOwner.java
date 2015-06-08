package com.hillel.java.serialisation;

import java.io.Serializable;

/**
 * Created by AKRAPIVNY on 08.06.2015.
 */
public class CarOwner implements Serializable{
    private static final long serialVersionUID=1L;

    String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}

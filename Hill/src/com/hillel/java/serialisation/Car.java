package com.hillel.java.serialisation;

import java.io.Serializable;

/**
 * Created by AKRAPIVNY on 04.06.2015.
 */
public class Car implements Serializable {
    private static final long serialVersionUID=1L;
    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

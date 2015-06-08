package com.hillel.java.serialisation;

import java.io.Serializable;

/**
 * Created by AKRAPIVNY on 04.06.2015.
 */
public class Car implements Serializable {
    private static final long serialVersionUID=3L;

    String manufacturer;

    transient int fuelConsuption;

    CarOwner owner;


    public Car(String manufacturer, int fuelConsuption, CarOwner owner) {
        this.manufacturer = manufacturer;
        this.fuelConsuption = fuelConsuption;
        this.owner = owner;
        System.out.println("in constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelConsuption=" + fuelConsuption +
                ", owner=" + owner +
                '}';
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }

    public String getManufacturer() {
        return manufacturer;
    }
}

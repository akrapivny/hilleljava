package com.hillel.java.serialisation;

import java.io.*;

/**
 * Created by AKRAPIVNY on 04.06.2015.
 */
public class SerialisationMain {
    public static void main(String[] args) {
    Car car /*= new Car("BMW")*/;

        //save(car);

        car = load();

        System.out.println(car);

    }

    private static Car load() {
        Car car=null;
        try (ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("hill/serializedCar.dat"))){
            car = (Car) outputStream.readObject();
        }   catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }

    private static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hill/serializedCar.dat"))){
            outputStream.writeObject(car);
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}

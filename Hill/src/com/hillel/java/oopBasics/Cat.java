package com.hillel.java.oopBasics;

import java.util.Arrays;

/**
 * Created by KRAB on 10.04.2015.
 */
public class Cat {

    static final int nawCount = 4;


    private String name;
    private int age;
    private Vaccine vaccines[] = new Vaccine[10];
    private int vaccineCout = 0;
    private String ownerName;

    //construktor kotorij java delaet sama.
    /*public com.hillel.java.oopBasics.Cat(){

    }*/

    //geter polya name
    public String getName() {
        return name;
    }

/*
    public String getOwnerName() {return ownerName;}
    public void setOwnerName(String ownerName);{
        this.ownerName=ownerName;
    }
*/

    public int getAge(){return age;}
    public void setAge(int age){
        if (age<0){
            throw new RuntimeException("Incorrect age value: " + age);
        }
        this.age = age;
    }

    //construktor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Cat() {

    }

    public String toString() {
        String result;
        result= "com.hillel.java.oopBasics.Cat ";
        result += name + " " + age + " years" + Arrays.toString(vaccines);
        return result;

    }

    public void acceptVaccine(Vaccine vaccine) {
        vaccines[vaccineCout] = vaccine;
        vaccineCout++;

    }

    public static int nawCat() {
        return 4;
    }

    //proverka sootvestviya objecta klasy
    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;//kastovanie
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }

    }

}


package com.hillel.java.inheritens;

/**
 * Created by KRAB on 22.04.2015.
 */
public class Person implements Comparable<Person>{
    private String name;


    public Person(){
        //super(); java pishet sama - vizov konstruktora proroditelya
        System.out.println("Create person");
    }


    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
            }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

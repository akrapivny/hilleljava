package com.hillel.java.dataStructure;

import com.hillel.java.inheritens.Person;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by KRAB on 08.05.2015.
 */
public class MapMain {
    public static void main(String[] args) {
        Person petro = new Person("Petro");
        Person taras = new Person("Taras");
        Person ivan = new Person("Ivan");

        Map<Person,String> studentToReason = new TreeMap<>();
        studentToReason.put(petro,"To become a programer");
        studentToReason.put(taras,"Become a programer");
        studentToReason.put(ivan, "Have a lot of free time");

        System.out.println("petro's reason is to: " + studentToReason.get(petro));
        System.out.println("ivan's reason is to: "+studentToReason.get(ivan));
        System.out.println(studentToReason.toString());


    }
}

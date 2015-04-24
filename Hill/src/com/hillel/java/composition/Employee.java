package com.hillel.java.composition;

import com.hillel.java.inheritens.*;
import com.hillel.java.javahome.StringArray;

/**
 * Created by KRAB on 24.04.2015.
 */
public class Employee implements Namable{
    String department;
    Person person;

    @Override
    public String getName(){
        return person.name;
    }
}

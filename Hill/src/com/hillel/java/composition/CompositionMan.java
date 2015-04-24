package com.hillel.java.composition;

import com.hillel.java.inheritens.*;

/**
 * Created by KRAB on 24.04.2015.
 */
public class CompositionMan {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.department="IT";
        employee.getName();

        Namable p = employee;
    }
}

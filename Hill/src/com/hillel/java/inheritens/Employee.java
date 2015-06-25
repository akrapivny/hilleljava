package com.hillel.java.inheritens;

/**
 * Created by KRAB on 22.04.2015.
 */
public class Employee extends Person {

    String department;

    //public Employee() {
    //    super();
    //    System.out.println("Create employee");
    //}

    public Employee(String name, String department) {
        super(name);
        this.department = department;
        System.out.println("Creating employee");

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

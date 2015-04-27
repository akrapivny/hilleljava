package com.hillel.java.inheritens;

import java.util.ArrayList;

/**
 * Created by KRAB on 22.04.2015.
 */
public class inheritanceMain {
    public static void main(String[] args) {
    /*    Circle circle = new Circle(10);
        Rectanglae rectanglae = new Rectanglae(10, 5);

        Colored c = circle;

        ArrayList<Colored> list = new ArrayList<Colored>();
        list.add(circle);
        list.add(rectanglae);
*/
        polymorf();
    }

    private static void polymorf() {
        Circle circle = new Circle(10);
        Rectanglae rectanglae = new Rectanglae(10, 5);

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(circle);
        list.add(rectanglae);

        printAreas(list);
        prints(list);
    }

    private static void prints(ArrayList<Shape> list) {
        for (Shape shape:list){//forech
            System.out.println(shape);
        }
    }

    private static void printAreas(ArrayList<Shape> list) {
        for (Shape shape:list){//forech
            System.out.println("area is " + shape.getArea());
        }
    }

    public static void overLoadedMethods() {
        Person person = new Employee("IVAN", "IT");
        register(person);//vizovet register po tipu peremennoy

        // register(new Employee("IVAN", "IT"));
        // register(new Person("PETRO"));
    }

    public static void generics() {
        //        ArrayList<Employee> list = new ArrayList<Employee>() //generic
        ArrayList<Person> list = new ArrayList<Person>(); //generic

        list.add(new Employee("Ivan", "IT"));
        list.add(new Person("Ivan"));

        //Employee employee = list.get(0);
        Employee employee = (Employee) list.get(0);
    }


    private static void inconvinieWay() {
        Employee employee = new Employee("sss", "ppp");
        Person employeeAsPerson = new Employee("sss1", "ppp1");
        Object employeeAsObject = new Employee("sss2", "ppp2");

        register(employee);
        register(employeeAsPerson);

        ArrayList array = new ArrayList();
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0);
        employeeAsPerson = (Person) array.get(1);
        employeeAsObject = array.get(2);

        employee = (Employee) employeeAsPerson;


        if (employeeAsPerson instanceof Employee) { //proverka tipa
            employee = (Employee) employeeAsPerson;
        }

        if (employee instanceof Person) {
            System.out.println("Realy");
        }



        /*
        ImprovedArray array = new ImprovedArray();
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);
        */
    }


    public static void register(Person person) {
        System.out.println("Registered " + person.getName());
    }

    public static void register(Employee employee) {
        System.out.println("Registered " + employee.getName());

    }

    private static void constructors() {
        // Person person= new Person("Ivan");

        Employee employee = new Employee("Petro", "IT");
    }

    private static void simpleExample() {
  /*      Person person= new Person();
        person.setName("Ivan");

        Employee employee= new Employee();
        employee.setName("Petro");
        employee.setDepartment("IT");*/
    }
}

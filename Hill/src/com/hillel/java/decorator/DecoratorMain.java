package com.hillel.java.decorator;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class DecoratorMain {
    public static void main(String[] args) {

        Beverage coffe = new Arabica();

        System.out.println(coffe.description());

        coffe = new Milk(coffe);

        System.out.println(coffe.description());

        coffe = new Cream(coffe);

        System.out.println(coffe.description());

    }
}

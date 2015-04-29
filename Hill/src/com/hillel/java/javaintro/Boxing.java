package com.hillel.java.javaintro;

/**
 * Created by KRAB on 29.04.2015.
 */
public class Boxing {
    public static void main(String[] args) {
        int i = 10;
        method(i);

        double d = 2.5;
        method(d);

        Integer i1=127;//порог значения
        Integer i2=127;

        System.out.println(i1+" == "+i2+" are equal "+ (i1==i2));//magic

        i1=128;
        i2=128;
        System.out.println(i1+" == "+i2+" are equal "+ (i1==i2));//magic

        i1 = new Integer(127);
        i2 = new Integer(127);
        System.out.println(i1+" == "+i2+" are equal "+ (i1==i2));//magic

        System.out.println(i1+" == "+i2+" are equal using equls "+ (i1.equals(i2)));//magic


    }

    public static void method(Object o) {
        if (o instanceof Integer) {
            System.out.println("It is integer");
        } else if (o instanceof Double) {
            System.out.println("It is double");
        } else
            System.out.println("Unexpected");


    }
}

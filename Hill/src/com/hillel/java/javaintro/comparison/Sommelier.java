package com.hillel.java.javaintro.comparison;

import java.util.*;

/**
 * Created by KRAB on 29.04.2015.
 */
public class Sommelier {
    public static void main(String[] args) {
        Vine bottle1 = new Vine(1995, 200);
        Vine bottle2 = new Vine(1995, 100);

        System.out.println("they are equal "+bottle1.equals(bottle2));
        System.out.println("i greater than 2 " + (bottle1.compareTo(bottle2)>0));

        //ArrayList<Vine> list = new ArrayList<>(); t/k/use interfase pravilnee
        List<Vine> list = new ArrayList<>();

        list.add(bottle1);
        list.add(bottle2);
        list.add(bottle1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Comparator<Vine> orderByPrice = new VineCorporator();
        Collections.sort(list,orderByPrice);
        System.out.println(list);
    }
}

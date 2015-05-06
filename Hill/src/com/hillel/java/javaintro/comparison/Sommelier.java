package com.hillel.java.javaintro.comparison;

import java.util.*;

/**
 * Created by KRAB on 29.04.2015.
 */
public class Sommelier {
    public static void main(String[] args) {

        List<Vine> store = new ArrayList<>();
        store.add(new Vine(1999, 200));
        store.add(new Vine(1995, 250));
        store.add(new Vine(1995, 240));
        store.add(new Vine(1999, 200));
        store.add(new ExpensiveVine(1965, 900));
        store.add(new ExpensiveVine(1964, 900));
        store.add(new CheapVine(2014, 50));
        store.add(new CheapVine(2014, 50));
        store.add(new CheapVine(2015, 50));


        print(store);

        Set<Vine> menu = new TreeSet<>();

        menu.addAll(store);
        System.out.println("Menu");

        print(menu);

        Set<Vine> orderByPrice = new TreeSet<>(new OrderByPriceYear());
        orderByPrice.addAll(store);

        System.out.println("Menu order by price");
        print(orderByPrice);

        // printTaste(lisr);
    }

    public static void print(Iterable<Vine> vines){
        for (Vine vine: vines){
            System.out.println(vine.toString());

    }}

    public static void printTaste(List<Vine> vines){
        for (Vine vine: vines){
            System.out.println(vine.taste());
        }

       /* Vine bottle1 = new Vine(1995, 200);
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

        Comparator<Vine> orderByPrice = new OrderByPriceYear();
        Collections.sort(list,orderByPrice);
        System.out.println(list);*/


    }

    }


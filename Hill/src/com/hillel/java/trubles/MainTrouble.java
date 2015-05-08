package com.hillel.java.trubles;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by KRAB on 08.05.2015.
 */
public class MainTrouble {
    public static void main(String[] args) {

        Set<Car> dreams = new TreeSet<>();

        Car ivanDream = new Car("BMW");
        Car petroDream = new Car("Audi");
        Car tarasDream = new Car("Merc");

        dreams.add(ivanDream);
        dreams.add(petroDream);
        dreams.add(tarasDream);

        System.out.println(dreams);
        System.out.println("petro dreams present " + dreams.contains(petroDream));
        dreams.remove(petroDream);
       // petroDream.setModel("Kailna");
        petroDream = new Car("Kailna");
        dreams.add(petroDream);
        System.out.println("petro dreams present " + dreams.contains(petroDream));
        System.out.println(dreams);

        //arrayCopyTrouble();
    }

    private static void arrayCopyTrouble() {
        int[] source = {8,5,2,1};
        int[] source1 = Arrays.copyOf(source, source.length);
        int[] source2;


        int[] copy=source;
        int[] sorted = sort(source);

        System.out.println("source1 " + Arrays.toString(source1));
        //System.out.println("source2 " + Arrays.toString(source2));
        System.out.println("source " + Arrays.toString(source));
        System.out.println("copy " + Arrays.toString(copy));
        System.out.println("sorted " + Arrays.toString(sorted));
    }

    public static int[] sort (int[] array){
        int[] sorted = Arrays.copyOf(array,array.length);
        Arrays.sort(sorted);
        return  sorted;
        //Arrays.sort(array);
        //return  array;
    }
}

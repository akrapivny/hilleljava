package com.hillel.java.oopBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by KRAB on 10.04.2015.
 */
public class NewClass {

    static String[] vetList = new String[10];
    static int registered=0;

    public static void main(String[] params) {
        String cat1name = "Tom";
        int cat1age = 2;
        String cat2name = "Murzik";
        int cat2age = 1;
        registerCat(cat1name,cat1age);
        printRegCat();


    }

public static void printRegCat(){
    System.out.println(Arrays.toString(vetList));
}

    public static void registerCat(String catName, int catAge){
        vetList[registered]=catName+" "+catAge;
        registered++;
    }


}

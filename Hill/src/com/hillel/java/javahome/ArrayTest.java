package com.hillel.java.javahome;

import java.util.Arrays;

/**
 * Created by KRAB on 14.04.2015.
 */
public class ArrayTest {

    public static void main(String[] args) {
        ImprovedArray myArray = new ImprovedArray();
        System.out.println(myArray.toString());
        System.out.println("Count of array element: "+myArray.size());
        System.out.println("Array element[5] value: "+ myArray.get(5));
        System.out.println("Add element with value: VALUE1");
        myArray.add("VALUE1");
        System.out.println("Add element with value: VALUE2");
        myArray.add("VALUE2");
        System.out.println("Count of array element: " + myArray.size());
        System.out.println("Array element[0] value: " + myArray.get(0));
        System.out.println("Array element[1] value: " + myArray.get(1));
        System.out.println("Array element[11] value: " + myArray.get(11));
        System.out.println(myArray.toString());
        ImprovedArray myArray2 =myArray;
        System.out.println("Equals with copy : "+ myArray.equals(myArray2));
        ImprovedArray myArray3 = new ImprovedArray();
        System.out.println("Equals with new array : "+ myArray.equals(myArray3));
        for (int j = 3; j <=13; j++) {
            System.out.println("Add element with value: VALUE"+j);
            myArray.add("VALUE"+j);
        }
        System.out.println("Count of array element: " + myArray.size());
        System.out.println(myArray.toString());
    }



}

package com.hillel.java.javahome;

import java.util.Arrays;

/**
 * Created by KRAB on 14.04.2015.
 */
public class ImprovedArray {

    int counter = 0;
    String[] myArray = new String[10];

    public void add(String value) {
        if (counter >= myArray.length) {
            myArray = Arrays.copyOf(myArray, counter + 1);
        }
        myArray[counter] = value;
        counter++;
    }

    public String get(int index) {
        if (index <= counter) {
            return myArray[index];
        } else return null;
    }

    public int size() {
        return counter;
    }

    public String toString() {
        String res = " ";
        String s;
        for (int j = 0; j <= myArray.length - 1; j++) {
            s = myArray[j];
            res = res + " ARRAY[" + j + "]=" + s + ", ";
        }
        return res;
    }

    public boolean equals(String[] arr1) {
        Boolean result = true;
        if (arr1.length == myArray.length) {
            for (int j = 0; j <= arr1.length - 1; j++) {
                if (arr1[j] != myArray[j]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

package com.hillel.java.javahome;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by KRAB on 10.04.2015.
 */
public class ArraySortClass {

    public static void main(String[] args) {

        double[] myArray = createRandomArray(5);
        System.out.println("Original random array "+ Arrays.toString(myArray));
        printSortArrayBubble(myArray);
        printSortArraySelect(myArray);
    }

    private static void printSortArrayBubble(double[] array) {
        double r;
        for (int j = 0; j <= array.length - 1; j++) {
            for (int k = 0; k <= array.length - 2; k++) {
                if (array[k] > array[k + 1]) {
                    r = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = r;
                }
            }
        }
        System.out.println("Array sorted by bubble"+Arrays.toString(array));
    }

    private static void printSortArraySelect(double[] array) {
        double r;
        double min;
        int minindex;
        for (int j = 0; j <= array.length - 1; j++) {
            min = array[j];
            minindex = j;
            for (int k = j; k <= array.length - 1; k++) {
                if (array[k] < min) {
                    min = array[k];
                    minindex = k;
                }
                array[minindex] = array[j];
                array[j] = min;
            }
        }
        System.out.println("Array sorted by select"+Arrays.toString(array));
    }

    public static double[] createRandomArray(int arraySize) {
        Random random = new Random();
        double[] a = new double[arraySize];
        for (int j = 0;
             j <= arraySize - 1; j++) {
            a[j] = random.nextDouble();
        }
        return a;
    }
}



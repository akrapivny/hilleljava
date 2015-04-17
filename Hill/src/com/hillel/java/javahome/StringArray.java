package com.hillel.java.javahome;

import java.util.Arrays;

/**
 * Created by KRAB on 17.04.2015.
 */
public class StringArray {

    private String[] array = new String[1];

    private int counter = 0;

    public void add(String value) {
        if (array.length == counter) {
            resize();
        }
        array[counter] = value;
        counter++;
    }

    public String get(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        return array[index];
    }

    public int size() {
        return counter;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof StringArray)) {
            return false;
        }
        StringArray other = (StringArray) obj;

        if (this.size() != other.size()) {
            return false;
        }

        for (int j = 0; j < size(); j++) {
            if (!(this.get(j)).equals(other.get(j))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String res = "[";
            for (int j = 0; j <size(); j++) {
            res +=get(j);
                if (j+1<size()) {
                    res +=", ";
                }
        }
        res +="]";
        return res;
    }


    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }
}

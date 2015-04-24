package com.hillel.java.javahome;

import com.hillel.java.oopBasics.ListInterface;
import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by KRAB on 17.04.2015.
 */
public class StringArray implements ListInterface {

    private Object[] array = new Object[1];

    private int counter = 0;

    public void add(Object value) {
        if (array.length == counter) {
            resize();
        }
        array[counter] = value;
        counter++;
    }

    public Object get(int index) {
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
        for (int j = 0; j < size(); j++) {
            res += get(j);
            if (j + 1 < size()) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }


    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    public String remove(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        Object result = array[index];
        for (int j = index; j < size() - 1; j++) {
            array[j] = array[j + 1];
        }
        counter--;
        return result.toString();
    }

    public void insert(int index, Object value) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        add(array[index]);
        for (int j = size() - 1; j > index; --j) {
            array[j] = array[j - 1];
        }
        array[index] = value;


    }

}

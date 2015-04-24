package com.hillel.java.oopBasics;

/**
 * Created by KRAB on 17.04.2015.
 */
public class Cell {
    private Object value;
    private Cell next;

    public Cell(Object value) {
        this.value = value;
    }

    public void setNext(Cell cell) {
        this.next = cell;
    }

    public Cell getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }
}

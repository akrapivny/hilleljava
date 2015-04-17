package com.hillel.java.oopBasics;

/**
 * Created by KRAB on 17.04.2015.
 */
public class Cell {
    private String value;
    private Cell next;

    public Cell(String value) {
        this.value = value;
    }

    public void setNext(Cell cell) {
        this.next = cell;
    }

    public Cell getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }
}

package com.hillel.java.oopBasics;


/**
 * Created by KRAB on 17.04.2015.
 */
public class LinkedCells {

    private Cell head;
    private int counter;
    private Cell tail;


    public void add(String value) {
        Cell next = new Cell(value);
        if (head == null) {
            head = next;
        }
        if (tail != null) {
            tail.setNext(next);
        }
        tail = next;
        counter++;
    }

    public int size() {
        return counter;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public String get(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("size: " + size() + ", index: " + index);
        }
        Cell currentCell = head;
        int currentIndex = 0;
        while (currentCell != null && currentIndex < index) {
            currentCell = currentCell.getNext();
            currentIndex++;
        }
        return currentCell.getValue();

    }

    public String toString() {
        String result = "[";
        Cell currentCell = head;
        while (currentCell != null) {
            result += currentCell.getValue();
            if (currentCell.getNext() != null) {
                result += ",";
            }
            currentCell = currentCell.getNext();
        }
        result += "]";
        return result;
    }


    public String remove(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        Cell currentCell = head;
        String result;

        if (index == 0) {
            result = currentCell.getValue();
            head=currentCell.getNext();

        } else {
            int currentIndex = 0;
            while (currentCell != null && currentIndex < index - 1) {
                currentCell = currentCell.getNext();
                currentIndex++;
            }
            result = currentCell.getValue();
            currentCell.setNext(currentCell.getNext().getNext());
        }
        counter--;
        return result;
    }

    public void insert(int index, String value) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        if (index == 0) {
            Cell newCell = new Cell(value);
            newCell.setNext(head);
            head = newCell;
        } else {
            Cell current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.getNext();
                currentIndex++;
            }
            Cell newCell = new Cell(value);
            newCell.setNext(current.getNext());
            current.setNext(newCell);
        }
        counter++;

    }


}

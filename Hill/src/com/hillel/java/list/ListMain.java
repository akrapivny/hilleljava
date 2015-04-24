package com.hillel.java.list;

import com.hillel.java.javahome.ImprovedArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KRAB on 24.04.2015.
 */
public class ListMain {
    public static void main(String[] args) {
        List list = new ArrayList();
        //List LinkedList = new LinkedList();

        ImprovedArray array = new ImprovedArray();

        array.add("sdffd");
        array.add("hjkhjkh");
        array.add("hjkhjkh");

        for (Object o : array) {
            System.out.println(o);
        }

    /*    list.add("sdffd");
        list.add("hjkhjkh");
        list.add("sdffd");

        for (Object o:list){
            System.out.println(o);*/
    }
}


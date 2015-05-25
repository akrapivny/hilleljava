package com.hillel.java.exception;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by AKRAPIVNY on 25.05.2015.
 */
public class JavaGroupName {
    public static void main(String[] args) throws UnknowStudentException{
        List<String> list = new ArrayList<>();
        list.add("Ivan1");
        list.add("Ivan2");
        list.add("Ivan3");
        list.add("Ivan4");

        JavaGroup group = new JavaGroup(list);

        try {
        group.addGrade("Ivan2", 5);

        } catch (UnknowStudentException e){
            System.out.println(e);
            throw e;

        }

        try {
            group.addGrade("Ivan",5);

        } catch (UnknowStudentException e){
            e.printStackTrace(System.out);
            throw e;

        }

        try {
        group.addGrade("Ivan3",5);

        } catch (UnknowStudentException e){
            System.out.println(e);
            throw e;

        }
    }
}

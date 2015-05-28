package com.hillel.java.exception;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by AKRAPIVNY on 25.05.2015.
 */
public class JavaGroupName {
//    public static void main(String[] args) {
    public static void main(String[] args) throws UnknowStudentException{
        List<String> list = new ArrayList<>();
        list.add("Ivan1");
        list.add("Ivan2");
        list.add("Ivan3");
        list.add("Ivan4");

        JavaGroup group = new JavaGroup(list);

        addGrade("Ivan1", 5, group);
        addGrade("Ivan2", 5, group);
        addGrade("Ivan0", 5, group);
        addGrade("Ivan2", 2, group);

        addGrade(null, 2, group);
/*
        try {
        group.addGrade("Ivan2",5);
        } catch (UnknowStudentException e){

        }

*/        System.out.println("end");
    }

    private static void addGrade(String name, Integer grade, JavaGroup group) {
        try {
            group.addGrade(name, grade);

        } catch (UnknowStudentException | GradeAlredyExistException e) {
            e.printStackTrace(System.out);
        } catch (RuntimeException e) {
            e.printStackTrace(System.out);

        }


    }
}

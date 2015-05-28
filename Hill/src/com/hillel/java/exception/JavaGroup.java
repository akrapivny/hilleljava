package com.hillel.java.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AKRAPIVNY on 25.05.2015.
 */
public class JavaGroup {
    private Map<String,Integer> namesToGrades = new HashMap<>();
    public JavaGroup(List<String> names) {
        for (String name : names){
            namesToGrades.put(name,null);
        }
    }

    public void addGrade(String name, Integer grade) throws UnknowStudentException {
        if (!namesToGrades.containsKey(name)) {

        throw new UnknowStudentException("Unknow student "+name);
        }
        Integer existedGrade = namesToGrades.get(name);
        if (existedGrade!=null) {
            throw new GradeAlredyExistException("name: "+ name + ", exist grade: "+existedGrade+", new grade: "+grade);
        }
        if (name == null) {throw new NullPointerException("name is null");}
    namesToGrades.put(name,grade);
    }



}

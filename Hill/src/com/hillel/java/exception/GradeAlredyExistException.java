package com.hillel.java.exception;

/**
 * Created by AKRAPIVNY on 28.05.2015.
 */
public class GradeAlredyExistException extends RuntimeException {
    public GradeAlredyExistException(String message) {
        super(message);
    }
}

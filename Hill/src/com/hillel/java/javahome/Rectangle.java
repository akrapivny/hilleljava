package com.hillel.java.javahome;

/**
 * Created by KRAB on 15.04.2015.
 */
public class Rectangle {
    Double sideA;
    Double sideB;

    public Rectangle(Double a, Double b){
        this.sideA = a;
        this.sideB = b;
    }

    public boolean equals(Rectangle r){
         Boolean result = false;
        if ((this.sideA.equals(r.sideA)) && (this.sideB.equals(r.sideB))) {result=true;}
        if ((this.sideA.equals(r.sideB)) && (this.sideB.equals(r.sideA))) {result=true;}

       // if ((this.sideA==r.sideA) &&  (this.sideB==r.sideB)) {result=true;}
       // if ((this.sideA==r.sideB) &&  (this.sideB==r.sideA)) {result=true;}
        return result;

    }

    public String toString(){
        return "com.hillel.java.javahome.Rectangle side A = "+this.sideA+", side B = "+this.sideB;

    }
}

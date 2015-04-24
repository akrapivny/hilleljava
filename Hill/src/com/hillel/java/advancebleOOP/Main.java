package com.hillel.java.advancebleOOP;

import com.hillel.java.advancebleOOP.duck.*;

/**
 * Created by KRAB on 24.04.2015.
 */
public class Main {
    public static void main(String[] args) {
//        MallardDuck mallardDuck = new MallardDuck();
//        RedHeadDuck redHeadDuck = new RedHeadDuck();
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        test(mallardDuck);
        test(redHeadDuck);
        test(rubberDuck);
        test(decoyDuck);
    }

    public static void test(Duck duck){
        System.out.println(duck.display());
        System.out.println(duck.fly());
        System.out.println(duck.swim());
        System.out.println(duck.quak());
        System.out.println();
    }
}

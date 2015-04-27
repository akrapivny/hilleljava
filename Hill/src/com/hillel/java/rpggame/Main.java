package com.hillel.java.rpggame;

import com.hillel.java.rpggame.hero.Hero;
import com.hillel.java.rpggame.hero.humanHero;
import com.hillel.java.rpggame.hero.orcHero;
import com.hillel.java.rpggame.hero.elfHero;

/**
 * Created by KRAB on 25.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        Hero humanHero = new humanHero();
        Hero orcHero = new orcHero();
        Hero elfHero = new elfHero();

        test(humanHero);
        test(orcHero);
        test(elfHero);

    }

    public static void test(Hero hero){
        System.out.println(hero.display());
        System.out.println(hero.attack());
    }


}

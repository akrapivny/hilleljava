/**
 * Created by KRAB on 10.04.2015.
 */
public class OOP {


    public static void main(String[] args) {
       // oopintro();

        Cat cat1 = new Cat("Tom", 2);
//        Cat cat2 = cat1;
        Cat cat2 = new Cat("Tom", 2);
        System.out.println("They are equal:= "+ (cat1==cat2));
        System.out.println("They are equal:= "+ cat1.equals(cat2));


    }

    private static void oopintro() {
    /*
       Cat cat1 = new Cat();
      // cat1.name = "Tom";
      // cat1.age = 2;
       cat1.init("Tom",2);

       Cat cat2 = new Cat();
      // cat2.name = "Mur";
      // cat2.age = 1;
       cat2.init("Mur",1);
      */

        Cat.nawCat();
        // Cat.nawCat=0;
        // System.out.println(Cat.nawCat());

        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Mur", 1);
        Vet vet = new Vet();


        vet.registerCat(cat1);
        vet.registerCat(cat2);

        vet.makeVaccine();

        vet.print();
    }
}

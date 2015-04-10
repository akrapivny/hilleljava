import java.util.Arrays;

/**
 * Created by KRAB on 10.04.2015.
 */
public class Cat {

    static int nawCount = 4;
    String name;
    int age;
    String vaccines[] = new String[10];
    int vaccineCout = 0;

    //construktor kotorij java delaet sama.
    /*public Cat(){

    }*/

    //construktor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        String result = "Cat ";
        result += name + " " + age + " years" + Arrays.toString(vaccines);
        return result;

    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCout] = vaccine;
        vaccineCout++;

    }

    public static int nawCat() {
        return 4;
    }

    //proverka sootvestviya objecta klasy
    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;//kastovanie
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }

    }

}


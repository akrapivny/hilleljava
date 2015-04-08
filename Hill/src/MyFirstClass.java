import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] params) {

        double a = 100;
        double b = 3;

        System.out.println(String.format("%2f", a / b));
        //   byte bb=(byte) 127;
        //   int i=bb;
        //  System.out.println(b);

        int r = 455;
        int result = r ^ 20;
        System.out.println(result);
        result = result ^ 20;
        System.out.println(result);

        //    Scanner scanner=new Scanner(System.in);//класс ввода с клавиатуры
        //
        // proverka
        //  int vvod=scanner.nextInt();//ждет ввода инта


        //case
        int n = 5;
        switch (n) {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            case 4:
                System.out.println("d");
                break;
            case 5:
                System.out.println("e");
                break;
            default:
                System.out.println("fignya");

        }
//terinarniy operator
        boolean kk = true;
        int oddoreven = kk ? 2 : 1;
        System.out.println(oddoreven);

//primer togo chto drobnie nelzya sravnivat ==
        if (1.1f + 2.2f == 3.3f) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

        //array

        //int[] intarray;
        //analog int intarray[];

        int[] intarray = {1, 2, 3, 4, 5};
        intarray = new int[5];

        //увеличение размера массива
        //intarray = Arrays.copyOf(intarray,20)

        int[] newintarray = {1, 2, 3, 4, 5};
        int i = newintarray[0];
        System.out.println(i);

        //printarray
        System.out.println(Arrays.toString(newintarray));
        System.out.println(newintarray.length);

        for (int j = 0; j < newintarray.length; j++) {
            int element = newintarray[j];
            System.out.println(element);
        //break прерывает цикл
        // continue прерывает итерацию

        }

        //цикл форич foreach
        for (int element:newintarray){
            System.out.println(element);
        }

        Scanner scanner2=new Scanner(System.in);

        //цикл с предусловием
        while (!scanner2.hasNextInt()) {
            scanner2.next();
        }
        int input =scanner2.nextInt();
        System.out.println("in="+ input );


        //цикл с постусловием

        do {

        } while (true);

        //генератор случайных чисел
        Random random = new Random();
        int randomNumber = random.nextInt(10);
    }


}

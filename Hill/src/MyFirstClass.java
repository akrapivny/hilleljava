import java.util.Scanner;

public class MyFirstClass {
    public static void main (String[] params) {

        double a=100;
        double b=3;

        System.out.println(String.format("%g",a/b));
     //   byte bb=(byte) 127;
     //   int i=bb;
      //  System.out.println(b);

        int r=455;
        int result = r^20;
        System.out.println(result);
        result=result^20;
        System.out.println(result);

    //    Scanner scanner=new Scanner(System.in);//класс ввода с клавиатуры
        //
        // proverka
      //  int vvod=scanner.nextInt();//ждет ввода инта


        //case
          int n=5;
        switch (n){
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

    }


}

import com.hillel.java.javahome.StringArray;

/**
 * Created by KRAB on 17.04.2015.
 */
public class StringArrayTest {

    public static void main(String[] args) {
        StringArray myArray = new StringArray();
        System.out.println("Empty array: " + myArray);
        System.out.println("Empty array size: " + myArray.size());

        myArray.add("first");
        System.out.println("One element: " + myArray);
        System.out.println("One array size: "+myArray.size());

        myArray.add("second");
        System.out.println("Two element: " + myArray);
        System.out.println("Two array size: "+myArray.size());

        System.out.println("First element: "+myArray.get(0));
        System.out.println("Second element: "+myArray.get(1));
        System.out.println("Third element: "+myArray.get(2));

    }

 //   @Test
 //   public void add(){System.out.println("Test is running"); }

}

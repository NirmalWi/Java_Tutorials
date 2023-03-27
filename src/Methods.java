import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Vector;

public class Methods {

    public static void main(String[] args) {
        //factorial();
        getObClass();
        breakLoop();
    }


    public static void factorial() {
        long factorial = 1;
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                factorial = 1;
            } else {
                factorial *= i;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
    }

    public static void getObClass() {

        Object testObject = new LinkedHashMap();

        if (testObject instanceof Vector)
            System.out.println("Object was an instance of the class java.util.Vector");
        else if (testObject instanceof ArrayList)
            System.out.println("Object was an instance of the class java.util.ArrayList");
        else
            System.out.println("Object was an instance of the " + testObject.getClass());
    }

    public static void breakLoop() {
        int[] intary = { 99,12,22,34,45,67,5678,8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;

        for ( ; i < intary.length; i++) {
            if (intary[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found the no: " + no + " at  index: " + i);
        } else {
            System.out.println(no + "not found  in the array");
        }
    }
}

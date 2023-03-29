import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Methods {

    enum Car {LAMBORGHINI,TATA,AUDI,FIAT,HONDA}

    enum Shop{
        BOOK(50),PENCIL(15),ERASER(10),BAG(100);

        private double price;
        Shop(double p) {
            price = p;
        }

        double getPrice(){
            return price;
        }
    }
    public static void main(String[] args) {
        //factorial();
        //getObClass();
        //breakLoop();
        //Continue();
        //enumTest();
        //enumTest2();
        forLoops();
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

        Object testObject = new HashMap();

        if (testObject instanceof Vector)
            System.out.println("Object was an instance of the class java.util.Vector");
        else if (testObject instanceof ArrayList)
            System.out.println("Object was an instance of the class java.util.ArrayList");
        else
            System.out.println("Object was an instance of the " + testObject.getClass());
    }

    public static void breakLoop() {
        int[] noArray = { 99,12,22,34,45,67,5678,8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;

        for ( ; i < noArray.length; i++) {
            if (noArray[i] == no) {
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

    public static void Continue() {
        StringBuffer str = new StringBuffer("hello how are you.");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'h')
                continue;
            count++;
        }

        System.out.println("Found " + count + " h's in the string.");
        System.out.println(str);
    }

    public static void enumTest(){
        Car c;
        c = Car.HONDA;
        switch(c) {
            case LAMBORGHINI:
                System.out.println("You choose lamborghini!");
                break;
            case TATA:
                System.out.println("You choose tata!");
                break;
            case AUDI:
                System.out.println("You choose fiat!");
                break;
            case FIAT:
                System.out.println("You choose honda!");
                break;
            case HONDA:
                System.out.println("You choose audi!");
                break;
            default:
                System.out.println("I don't know your car.");
                break;
        }
    }

    public static void enumTest2(){
        for (Shop s :Shop.values()) {
            System.out.println(s+" costs "+s.getPrice()+" Rupees.");
        }
    }

    public static void forLoops() {
        int[] noArray = { 1,2,3,4};

        System.out.println("Display an array using for loop");
        for (int i = 0; i < noArray.length; i++) {
            System.out.print(noArray[i] + " ");
        }

        System.out.println("\nDisplay an array using foreach loop");
        for (int no :noArray) {
            System.out.print(no+" ");
        }

        System.out.println();
        ArrayList<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        for (String str :list) {
            System.out.println(str);
        }
    }

}

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        //shortandsearch();
        bubbleSort();
        //stringMerge();
        //addArray();
        //arrayCopy();
        //arrayReverse();
        //reverse();
        //removeElements();
        //removeAll();
        //contains();
        //arrayEquals();
        //upperbound();
    }


    public static void shortandsearch() {

        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);         //Arrays.short() will short array elements

        for (int i = 0; i < array.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();


        int index = java.util.Arrays.binarySearch(array, 2);   //binarySearch() will accept two arguments which are array and key. It will return the key value index
        System.out.println("Found 2 at : " + index);
    }


    public static void bubbleSort() {

        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

        System.out.println("Array Before Bubble Sort : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array After Bubble Sort");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void stringMerge() {

        String a[] = {"N", "I", "R"};

        String b[] = {"M", "A", "L"};

        List list = new ArrayList(Arrays.asList(a));  //Arrays.asList() will accept String array and it will store in to Array list

        list.addAll(Arrays.asList(b));  //addAll methode add two array lists together

        System.out.println(list);

    }

    public static void addArray(){

        //another way to add two integer arrays

        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7,8};

        int[] b = new int[a1.length+ a2.length];
        int c=0;

        for (int i = 0; i < a1.length; i++) {
            b[i] = a1[i];
            c++;
        }

        for (int j = 0; j < a2.length; j++) {
            b[c++] = a2[j];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if(i != (b.length-1))
                System.out.print(", ");

        }
    }

    public static void arrayCopy() {

        String[] a = {"A","B","C","D"};
        String[] b = {"E","F","G","H","I","J","K","L",};

        System.arraycopy(a,0,b,2,4);
        //System.arraycopy methode accept 5 arguments, which is source array, source position,destination array, destination position and length of characters to be copied.

        for (String str:b) {
            System.out.print(str+" ");
        }
    }

    public static void arrayReverse(){
        ArrayList list = new ArrayList();

        list.add("N");  //we can add elements to the array using add keyword , add keyword is inbuilt methode in Arraylist
        list.add("I");
        list.add("R");
        list.add("M");
        list.add("A");
        list.add("L");

        System.out.println("Before reverse : "+list);

        Collections.reverse(list);  //Collections has a methode reverse, and it will reverse all the elements in the Arraylist

        System.out.println("After reverse : "+list);
    }

    public static void reverse() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array before reverse: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for(int i =0; i< numbers.length / 2;i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -1 -i];
            numbers[numbers.length -1 -i] = temp;
        }

        System.out.print("\nArray after reverse: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void removeElements() {

        ArrayList arrry = new ArrayList();

        arrry.clear();  //array.clear will clear all the elements inside the arraylist

        arrry.add(0, "0th ele");  //add will accept index value and element, then it will add that element to the specific index

        arrry.add( 1,"1st ele");

        arrry.add(2, "2nd ele");

        System.out.println("Array before removing an element : " + arrry);

        arrry.remove(1); //remove can remove the elements in the array list

        arrry.remove("0th ele");

        System.out.println("Array after removing an element : " + arrry);
    }

    public static void removeAll(){
        ArrayList ar1 = new ArrayList();
        ArrayList ar2 = new ArrayList();

        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);
        ar1.add(5);

        ar2.add(3);
        ar2.add(4);
        ar2.add(5);
        ar2.add(6);
        ar2.add(7);
        ar2.add(8);

        System.out.println("Array 1 : " +ar1);
        System.out.println("Array 2 : " +ar2);

        ar2.removeAll(ar1);   //removeAll will merge two array elements

        System.out.println("After merge : "+ar2);

    }

    public static void contains() {
        ArrayList arr1 = new ArrayList();

        ArrayList arr2 = new ArrayList();

        arr2.add(0, "A");

        arr2.add(1, "B");

        arr2.add(2, "C");

        arr2.add(3, "D");

        arr1.add(0, "A");

        arr1.add(1, "B");

        System.out.println("Array 1 elements : " + arr1);
        System.out.println("Array 2 elements : " + arr2);
        System.out.println("Array 1 contains String B ? : " + arr1.contains("A")); //contains() method checks whether a string contains a sequence of characters.
        System.out.println("Array 2 contains Array1 ? : " + arr1.contains(arr2));
    }


    public static void arrayEquals() {

        //two array equals

        int[] arr1 = {1,2,3,4,5,6};

        int[] arr2 = {1,2,3,4,5,6};

        int[] arr3 = {1,2,3,4};

        System.out.println("Is arr 1 equal to arr 2 ? " +Arrays.equals(arr1, arr2));  //Arrays.equals() accept two arrays and it will return true or false

        System.out.println("Is arr 1 equal to arr 3 ? " +Arrays.equals(arr1, arr3));


        if(Arrays.equals(arr1,arr2))
            System.out.println("Arr 1 == Arr 2");

        else
            System.out.println("Arr 1 != Arr 2");


        if(arr1 == arr3)
            System.out.println("Arr 1 == Arr 3");
        else
            System.out.println("Arr 1 != Arr 3");

    }

    public static void upperbound() {
        String[][] data = new String[2][6];

        System.out.println("Dimension 1: " + data.length);   //number of rows
        System.out.println("Dimension 2: " + data[0].length); //number of columns
    }

}

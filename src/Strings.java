import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        //compare();
        //lastIndex();
        //subString();
        //reverse();
        //indexof();
        //uppercase();
        //regionMatchesmain();
        //stringTime();
        //intern();
        //formating();
        //concatenat();
        //codePointBefore();
    }

    public static void compare() {

        /*-------------compareTo-------------*/

        System.out.println("compareTo methode");
        String str1 = "MIT";
        String str2 = "mit";
        String str3 = "mit";

        System.out.println(str1.compareTo(str2)); //The compareTo() method compares two strings lexicographically and return int value.
        System.out.println(str2.compareTo(str1));
        System.out.println(str2.compareTo(str3)); //The method returns 0 if the string is equal to the other string
        System.out.println(str1.compareToIgnoreCase(str2) + "\n"); //This will compare two strings lexicographically, ignoring lower case and upper case differences.


        /*-------------equals-------------*/

        System.out.println("equals methode");
        String s1 = "nirmal";
        String s2 = "nirmal";
        String s3 = new String("nirmal");

        System.out.println(s1.equals(s2)); //The equals() method compares the original content of the string. It compares values of string for equality,and returns true if the strings are equal.
        System.out.println(s2.equals(s3) + "\n");


        /*------------- == operator -------------*/

        System.out.println("== operator");
        String s4 = "nirmal";
        String s5 = "nirmal";
        String s6 = new String("nirmal");

        System.out.println(s4 == s5); //The == operator compares references not values.
        System.out.println(s5 == s6 + "\n");

    }

    public static void lastIndex() {

        /*-------------lastIndexOf -------------*/

        String strOrig = "MIT ESP, MIT esp";

        int lastIndex = strOrig.lastIndexOf("MIT"); //this will find the last MIT in strOring and assign the index value of M to lastIndex variable

        if (lastIndex == -1) {
            System.out.println("MIT not found");  //Check if MIT is in the strOrig
        } else {
            System.out.println("Last occurrence of MIT is at index " + lastIndex);
        }

        String t1 = "MIT ESP";
        int index = t1.lastIndexOf("E");
        System.out.println("Index of P " + index);

    }

    public static void subString() {

        /*-------------substring-------------*/

        String st = "Nirmal Widanage";

        System.out.println(st.substring(5)); //we can send begin index and this will remove before characters of that index
        System.out.println(st.substring(0, 3)); //also we can specify the index range we want to keep(beginIndex,endIndex)
        System.out.println(st.substring(0, 7) + st.substring(10));

    }


    public static void reverse() {
        String str = "Nirmal";

        //reverse function

        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("Before reverse: " + str);
        System.out.println("After reverse: " + reverse + "\n");


        //using for loop
        char[] str1 = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str1[i]);
        }

    }

    public static void indexof() {
        String strOrig = "Hello MIT";
        int intIndex = strOrig.indexOf("MIT");  //indexOf function will check the first letter of the given word and check it in Original String and return first letter index

        if (intIndex == -1) {
            System.out.println("MIT not found");
        } else {
            System.out.println("Found MIT at index " + intIndex);
        }

        String text = "The cat is on the table";
        System.out.print(text.contains("cat"));   //contains function will check the first letter of the given word and check it in Original String and return true or false

    }

    public static void uppercase() {
        String str = "string abc to uppercase ";

        String strUpper = str.toUpperCase();

        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: " + strUpper);
    }

    public static void regionMatchesmain() {
        String str1 = "Welcome to MIT";
        String str2 = "I work with MIT";

        boolean match = str1.regionMatches(11, str2, 12, 3);

        System.out.println("str 1 [11 -19] == " + "str 2 [12 - 21] :- " + match);

           /* @:- 11 is the index number in the source string from where comparison starts

              @:- str 2 is the destination string

              @:- 12 is the index number from where comparison should start in destination string

              @:- 9 is the number of characters to compare */

    }

    public static void stringTime() {

        long startTime = System.currentTimeMillis();  //get the current time in milli seconds

        for (int i = 0; i < 50000; i++) {     //creating two string literals for 50000 times
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for creation"
                + " of String literals : " + (endTime - startTime)
                + " milli seconds");

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {               //creating two string objects for 50000 times
            String s3 = new String("hello");
            String s4 = new String("hello");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation"
                + " of String objects : " + (endTime1 - startTime1)
                + " milli seconds");
    }

    public static void intern() {

        //-----------------intern()

        String variables[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }
        long startTime0 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time of String literals : " + (endTime0 - startTime0) + " ms");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with 'new' key word : " + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with intern(): " + (endTime2 - startTime2) + " ms");
    }

    public static void formating() {

        double num = 8.876987;

        System.out.format("%.3f\n", num);


        System.out.format(Locale.ITALIAN, "%-10.4f", num);

    }

    public static void concatenat() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            String result = "This is"
                    + "testing the"
                    + "difference" + "between"
                    + "String" + "and" + "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for string"
                + "concatenation using + operator : "
                + (endTime - startTime) + " ms");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation"
                + "using StringBuffer : "
                + (endTime1 - startTime1) + " ms");
    }

        public static void codePointBefore() {
            String str = "Welcome to MIT";

            System.out.println("String is = "+str);

            System.out.println("Unicode code point at position 11 in the string is = "+str.codePointBefore(11));
        }


}
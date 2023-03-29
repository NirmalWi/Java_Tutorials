public class Tasks {
    public static void main(String args[]) {
        ex1();
//        ex2();
//        ex3();
    }

    public static void ex1(){
        String word = "asb sscc ddd idssdi eersss";

        String words[] = word.split(" "); //split String into several words and store them in words String array

        String reverse[] = new String[words.length];

        System.out.println("Word\tCount Palindrome");

        for (int x = 0; x < words.length; x++) {

            reverse[x] = new StringBuffer(words[x]).reverse().toString();  //reverse all words in words array and assign them into reverse array

            int max = 0;
            String w = words[x]; //assign words array elements into String W variable


            for (int i = 0; i < w.length(); i++) {

                char ch = w.charAt(i); //get the letters in W word one by one and save it in ch variable

                int count = 0;

                for (int j = 0; j < w.length(); j++) {
                    if (w.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                }
            }
            System.out.println(words[x] + " \t  " + max + "   \t" + words[x].equalsIgnoreCase(reverse[x]));
        }
    }

    public static void ex2(){

        int[] t = {14, 9, 18, 13, 1, 12,0,23,9,4,1,14,1,7,5};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t.length; i++) {
            if (t[i] == 0) {
                sb.append(' ');
            } else {
                char c = (char) (t[i] + 96);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    public static void ex3(){
            String str1 = "addss 099";
            String str2 = "22309 dfd";
            String result = "";

            for (int i = 0; i < str1.length(); i++) {

                for (int j = 0; j < str2.length(); j++) {
                    char ch = str1.charAt(i);
                    if (str1.charAt(i) == str2.charAt(j) && result.indexOf(ch) == -1 && str1.charAt(i) != 32) {
                        result += ch;
                    }
                }
            }
            System.out.println("Output : " + result);
        }
}



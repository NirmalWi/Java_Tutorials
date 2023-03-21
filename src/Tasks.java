public class Tasks {
    public static void main(String args[]) {

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
}



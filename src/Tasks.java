public class Tasks {
    public static void main(String args[]) {

        String word = "asb sscc ddd idssdi eersss";

        String words[] = word.split(" ");

        String revese[] = new String[words.length];

        System.out.println("Word\tCount Palindrome");

        for (int x = 0; x < words.length; x++) {

            revese[x] = new StringBuffer(words[x]).reverse().toString();

            int maxCount = 0;
            String w = words[x];


            for (int i = 0; i < w.length(); i++) {

                char ch = w.charAt(i);

                int count = 0;

                for (int j = 0; j < w.length(); j++) {
                    if (w.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
            System.out.println(words[x] + " \t  " + maxCount + "   \t" + words[x].equalsIgnoreCase(revese[x]));
        }
    }
}



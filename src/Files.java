import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        //comparePaths();
        fileCreation();
    }

    public static void comparePaths() {
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/File/demo1.txt");

        if(file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }
    }

    public static void fileCreation(){
        try {
            File file = new File("C:\\Users\\Nirmalw\\Desktop\\myfile.txt");

            if(file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println ("Error, file already exists.");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }


}
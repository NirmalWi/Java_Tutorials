import java.io.*;
import java.util.Date;

import static java.lang.System.exit;

public class Files {
    public static void main(String[] args) throws Exception {
        //comparePaths();
        //fileCreation();
        //getDate();
        //fileExist();
        //setReadonly();
        //rename();
        //fileSize();
        //createTempFile();
        //copyFiles();
        //DeleteFileExample();
        //ReadFile();
        //WriteFiles();

    }

    public static void comparePaths() {
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/File/demo1.txt");

        if (file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }
    }

    public static void fileCreation() {
        try {
            File file = new File("C:\\Users\\Nirmalw\\Desktop\\myfile.txt");

            if (file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println("Error, file already exists.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getDate() {
        File file = new File("Main.java");    //this will get the last modification date of a file using file.lastModified() method of File class.
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }

    public static void fileExist() {
        File file = new File("C:/myfile.txt");
        System.out.println(file.exists());
    }

    public static void setReadonly() {
        File file = new File("C:\\Users\\Nirmalw\\Desktop\\myfile.txt");
        System.out.println(file.setReadOnly());   //file.setReadOnly will make file Read only
        System.out.println(file.canWrite());
    }

    public static void rename() {
        File oldName = new File("C:\\Users\\Nirmalw\\Desktop\\myfile.txt");
        File newName = new File("C:\\Users\\Nirmalw\\Desktop\\test.txt");

        if (oldName.renameTo(newName)) {
            System.out.println("renamed");
        } else {
            System.out.println("Error");
        }
    }

    public static void fileSize() {
        long size = 0;

        File file = new File("C:\\Users\\Nirmalw\\Desktop\\project.txt");

        if (!file.exists() || !file.isFile()) {            //check file is exists or not
            System.out.println("File doesn't exist");
            exit(0);
        }
        size = file.length();    // .length will return the file size of the File
        System.out.println("File size in bytes: " + size);

    }


    public static void createTempFile() throws IOException {

        File temp = File.createTempFile("pattern", ".suffix");

        temp.deleteOnExit(); //temp.deleteOnExit() method is called to indicate that the file should be deleted when the program exits.

        BufferedWriter out = new BufferedWriter(new FileWriter(temp));

        out.write("a String");

        System.out.println("temporary file created:");

        System.out.println("Temporary file created at: " + temp.getAbsolutePath());   //This will print the absolute path of the temporary file

        out.close(); //out.close() method is called to close the BufferedWriter object and flush any buffered data to the file.

    }

    public static void copyFiles() throws Exception {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.close();
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream(new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;

        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
    }

    public static void DeleteFileExample() {
        try {
            File file = new File("C:\\Users\\Nirmalw\\Desktop\\test.txt");
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ReadFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Nirmalw\\Desktop\\myfile.txt"));
            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteFiles() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Nirmalw\\Desktop\\myfile.txt"));
            out.write("aString");
            out.close();
            System.out.println("File created successfully");
        } catch (IOException e) {
        }
    }
}
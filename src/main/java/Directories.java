import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.apache.commons.io.FileUtils;

public class Directories {

    public static void main(String[] args){

        //createDirectories();
        //deleteDir(new File("C:\\Users\\Nirmalw\\Desktop\\file"));
        //dirInfo();
        //hidden();
        //showDir(1, new File("C:\\Users\\Nirmalw\\Desktop\\file"));
        //parentDir();
        //dirFiles();
        //dirSize();
        //currentDir();
        //rootDir();
        //searchFile();
        //dirContains();
        //dispayDir();

    }
    public static void createDirectories() {

        String directories = "C:\\Users\\Nirmalw\\Desktop\\file";

        File file = new File(directories);

        boolean result = file.mkdirs();  // mkdirs() method to create the directory hierarchy if it does not already exist.

        System.out.println("Status = " + result);
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        boolean result = dir.delete();
        if (result) {
            System.out.println("The directory is deleted.");
        }
        return result;
    }

    public static void dirInfo() {
        File file = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        if(file.isDirectory()){
            if(file.list().length > 0) {
                System.out.println("Directory is not empty!");
            } else {
                System.out.println("Directory is empty!");
            }
        } else {
            System.out.println("This is not a directory");
        }
    }

    public static void hidden(){
        File file = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        if(file.isHidden()) {
            System.out.println("This file is hidden");
        } else {
            System.out.println("This file is not hidden");
        }
    }

    public static void showDir(int indent, File file){
        for (int i = 1; i < indent; i++)
            System.out.print('-');

        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }

    public static void parentDir() {
        File file = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        String strParentDirectory = file.getParent();
        System.out.println("Parent directory is : " + strParentDirectory);
    }

    public static void dirFiles() {
        File dir = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        String[] children = dir.list();

        if (children == null) {
            System.out.println("does not exist or is not a directory");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    public static void dirSize() { //This Java program uses the Apache Commons IO library to calculate the size

        long size = FileUtils.sizeOfDirectory(new File("C:\\Users\\Nirmalw\\Desktop\\file"));
        //FileUtils.sizeOfDirectory() method from the Apache Commons IO library to calculate the size of this directory in bytes

        System.out.println("Size: " + size + " bytes");
    }

    public static void currentDir() {
        String curDir = System.getProperty("user.dir");
        System.out.println("You currently working in :" + curDir+ ": Directory");
    }

    public static void rootDir() {
        File[] roots = File.listRoots();
        System.out.println("Root directories in your system are:");

        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }

    public static void searchFile() {
        File dir = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.startsWith("t");
            }
        };

        String[] children = dir.list(filter);

        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        }
        else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    public static void dirContains() {
        File dir = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        String[] children = dir.list();

        if (children == null) {
            System.out.println( "Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    public static void dispayDir() {
        File dir = new File("C:\\Users\\Nirmalw\\Desktop\\file");
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println("NoOf Directories : "+files.length);

        if (files.length == 0) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i< files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }

}

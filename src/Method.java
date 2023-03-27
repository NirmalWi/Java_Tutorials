public class Method {
    public static void main(String[] args) {

        //call overload constructor
        MyClass t = new MyClass(20);

        //default constructor:
        new MyClass();

        //method
        t.info();

        //overload method with String argument
        t.info("overloaded method");

        //overload method with in argument
        t.info(13);
    }
}
class MyClass {
    MyClass() {
        System.out.println("Default Constructor.");
    }
    MyClass(int i) {
        System.out.println("Overload Constructor with parameter : " + i);
    }
    void info() {
        System.out.println("Method without parameters");
    }
    void info(String s) {
        System.out.println("Overload method with String parameter : "+s);
    }

    void info(int n){
        System.out.println("Overload method with int parameter : "+n);
    }
}
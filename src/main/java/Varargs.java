public class Varargs {
    static int  sumvarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for(i = 0; i< intArrays.length; i++) {
            sum += intArrays[i];
        }
        return(sum);
    }

    static void Test(int ... no) {
        System.out.print("vaTest(int ...): Number of args: " + no.length +" Contents: ");
        for(int n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    static void Test(boolean ... bl) {
        System.out.print("vaTest(boolean ...) Number of args: " + bl.length + " Contents: ");
        for(boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }

    static void Test(String msg, int ... no) {
        System.out.print("vaTest(String, int ...): " + msg +" Number of arguments: "+ no.length +" Contents: ");
        for(int  n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        Test(1, 2, 3);
        Test("Testing: ", 10, 20);
        Test(true, false, false);

        int sum = sumvarargs(10,12,33);
        System.out.println("The sum of the numbers is: " + sum);

    }
}

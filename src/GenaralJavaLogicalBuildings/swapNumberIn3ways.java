package GenaralJavaLogicalBuildings;

public class swapNumberIn3ways {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swap a = "+a +" and b = "+b);
        // all 3 methods applicable for both positive and negative integers
        swapNumberOption1(a, b);
        swapNumberOption2(a, b);
        swapNumberOption3(a, b);
    }

    private static void swapNumberOption1(int a, int b) {
        //with temp variable
        int t = a;
        a = b;
        b = t;
        System.out.println("after swap a = "+a+" and b = "+b);
    }

    private static void swapNumberOption2(int a, int b) {
        //without temp variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap a = "+a+" and b = "+b);
    }

    private static void swapNumberOption3(int a, int b) {
        //will be applicable only for non-zero values
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("after swap a = "+a+" and b = "+b);
    }
}

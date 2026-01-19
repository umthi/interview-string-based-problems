package stringBasedQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        findFibonacci(n);
    }

    private static void findFibonacci(int n) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        int i = 2;
        while (i < n) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
}

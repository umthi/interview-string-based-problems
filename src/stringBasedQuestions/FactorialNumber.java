package stringBasedQuestions;

public class FactorialNumber {
    // i have 6 characters to form a password so how many unique password can be created using that
    // for that we can use factorial of that number of characters
    // factorial is product of positive integers from 1 to that number
    public static void main(String[] args) {
        int n = 6;
        int factorialValue = factorialRecurse(n);
        System.out.println(factorialValue);
    }

    private static int findFactorial(int n) {
        int factorial = 1;
        if(n == 0)
            return 1; //0!=1
        for(int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static int factorialRecurse(int n) {
        if(n == 0 || n==1)
            return 1;
        return n * factorialRecurse(n-1);
    }
}

package GenaralJavaLogicalBuildings;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean result = isPrime(number);
        if(result)
            System.out.println("prime number");
        else
            System.out.println("not prime number");
    }

    private static boolean isPrime(int number) {
        // condition 1 : number > 1 (not prime bcz prime should have 2 factors)
        // condition 2 : 2 factors ( 1 and number itself) Eg 2,3 (divide by 1 and 2 or 3)

        if(number <= 1)
            return false;

        for(int i = 2; i < number; i++)  // not <= (remember)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}

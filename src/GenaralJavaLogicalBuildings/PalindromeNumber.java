package GenaralJavaLogicalBuildings;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean result = isPalindromeNumber(number);
        if(result) {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
    }

    private static boolean isPalindromeNumber(int num) {
        int rev = 0;
        int originalNumber = num;

        while(num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return originalNumber == rev;
    }
}

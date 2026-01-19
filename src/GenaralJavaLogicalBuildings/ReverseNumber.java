package GenaralJavaLogicalBuildings;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverseNumber = reverseNumber(number);
        System.out.println(reverseNumber);
    }

    private static int reverseNumber(int num) {
        //using algorithm
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }

    private static int reverseNumberUsingSb(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        // mostly question will be asked without using reverse method then go with above algorithm
        StringBuilder rev = sb.reverse();
        return Integer.parseInt(String.valueOf(rev));
    }
}

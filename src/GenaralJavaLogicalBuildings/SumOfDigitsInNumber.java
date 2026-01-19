package GenaralJavaLogicalBuildings;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int n = 12345604;
        int sum = sumOfDigitsInNumber(n);
        System.out.println(sum);
    }

    private static int sumOfDigitsInNumber(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}

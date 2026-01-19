package GenaralJavaLogicalBuildings;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        int n = 1234567890;
        int count = getCountOfNumber(n);
        System.out.println(count);
    }

    private static int getCountOfNumber(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}

package GenaralJavaLogicalBuildings;

import java.util.ArrayList;
import java.util.List;

public class countEvenAndOddNumber {
    public static void main(String[] args) {
        int n = 1234567890;
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        while (n != 0) {
            int num = n % 10;
            if(num % 2 == 0) {
                evenList.add(num);
            }
            else {
                oddList.add(num);
            }
            n = n / 10;
        }
        System.out.println("even count "+evenList);
        System.out.println("odd count "+oddList);
    }
}

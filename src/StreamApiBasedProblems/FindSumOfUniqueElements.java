package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.List;

public class FindSumOfUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 1, 1, 8, 8, 7, 3, 3};

        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

        List<Integer> list = Arrays.asList(10, 5, 7, 3, 20);
        int sum1 = list.stream().distinct().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }
}

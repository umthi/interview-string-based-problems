package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeIntArrayHighToLow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // we cant use sorted method in primitive type int, so we need to convert to Integer array
        int[] rev = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(rev));

        // need to store it in array then do below way
        Integer[] reversedArr = Arrays.stream(arr).boxed().sorted(
                Comparator.reverseOrder()
        ).toArray(Integer[] :: new);

        System.out.println();
        System.out.println(Arrays.toString(reversedArr));
    }
}

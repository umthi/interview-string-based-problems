package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectOnlyIntegerValuesInArray {
    public static void main(String[] args) {
        String[] arr = {"123", "abc", "456", "cde", "789"};
        List<Integer> list = Arrays.stream(arr).filter(x -> x.matches("[0-9]+"))
                .map(Integer :: valueOf).toList();
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}

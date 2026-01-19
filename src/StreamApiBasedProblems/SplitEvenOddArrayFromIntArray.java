package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitEvenOddArrayFromIntArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};


        List<Integer> arrList = Arrays.stream(arr).boxed().toList();

        //only to get even list
        List<Integer> even = arrList.stream().filter(x -> x%2==0).toList();
        System.out.println(even);

        //split even and odd list
        Map<Boolean, List<Integer>> evenOddMap = arrList.stream()
                .collect(Collectors.partitioningBy(x -> x%2 == 0, Collectors.toList()));
        System.out.println(evenOddMap);

        List<List<Integer>> evenOddList = evenOddMap.values().stream().toList();
        System.out.println(evenOddList);

        List<Integer> list = evenOddList.stream().flatMap(Collection::stream).toList();
        System.out.println(list);
    }
}

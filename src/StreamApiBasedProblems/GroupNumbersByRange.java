package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByRange {
    public static void main(String[] args) {
        int[] arr = {1,2,11,23,13,45,65,78,98,34,5};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Map<Integer, List<Integer>> numberRangeMap =
                list.stream().collect(Collectors.groupingBy(x -> x/10*10, Collectors.toList()));
        System.out.println(numberRangeMap);
    }
}

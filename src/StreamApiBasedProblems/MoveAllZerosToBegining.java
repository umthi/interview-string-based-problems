package StreamApiBasedProblems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MoveAllZerosToBegining {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 0, 6, 8, 2, 0};
        List<Integer> zeroList = Arrays.stream(arr).boxed().toList()
                .stream().filter(x -> x==0).toList();
        List<Integer> nonZeroList = Arrays.stream(arr).boxed().toList()
                .stream().filter(x -> x!=0).toList();

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zeroList);
        finalList.addAll(nonZeroList);
        System.out.println(finalList);

        //another way using partitioning
        Map<Boolean, List<Integer>> groupZeroList= Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.partitioningBy(x->x!=0));
        Collection<List<Integer>> values = groupZeroList.values();
        System.out.println(values);
        List<Integer> ans =values.stream().flatMap(Collection::stream).toList();
        //List<Integer> ans = values.stream().flatMap(x -> x.stream()).toList();
        System.out.println(ans);

        //do it in single line
        List<Integer> ansList = Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.partitioningBy(x -> x!=0))
                .values().stream().flatMap(Collection::stream).toList();
        System.out.println(ansList);
    }
}

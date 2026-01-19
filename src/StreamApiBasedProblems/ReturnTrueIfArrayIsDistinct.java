package StreamApiBasedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnTrueIfArrayIsDistinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5 ,6);
        boolean ans = list.stream().collect(Collectors.groupingBy(
                x -> x, Collectors.counting()
        )).values().stream().noneMatch(x -> x>1);
        System.out.println(ans);
    }
}

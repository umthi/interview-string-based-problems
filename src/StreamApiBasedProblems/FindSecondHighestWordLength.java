package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSecondHighestWordLength {
    public static void main(String[] args) {
        String str = "I am learning stream api in java";
        Arrays.stream(str.split(" ")).map(String :: length).sorted(Comparator.reverseOrder())
                .skip(1).findFirst().ifPresent(System.out::println);

        String[] arr = {"uma", "kani", "then", "uma", "mani", "kani"};
        Map<String, Long> wordsWithCount = Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(wordsWithCount);
    }
}

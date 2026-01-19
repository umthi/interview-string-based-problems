package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBasedOnMiddleLetter {
    public static void main(String[] args) {
        String[] str = {"uma", "suman", "kani", "mani", "then", "when"};

        Map<Character, List<String>> groupMiddle = Arrays.stream(str)
                .collect(Collectors.groupingBy(
                        s -> s.charAt(s.length()/2), Collectors.toList()
                ));
        System.out.println(groupMiddle);
    }
}

package StreamApiBasedProblems;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestLengthWordInSentence {
    public static void main(String[] args) {
        String str = "I am learning stream api in java";
        Optional<String> highestWord = Arrays.stream(str.split(" ")).max(Comparator.comparing(String :: length));
        highestWord.ifPresent(System.out::println);

        //if Stream is empty using Optional<string> return type of max function we can throw exception like below
        /*String ans = Arrays.stream(new String[]{}).max(Comparator.comparing(String :: length))
                .orElseThrow(() -> new IllegalArgumentException("no element found"));
        System.out.println(ans);*/

        // find second highest word in sentence,
        Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String :: length).reversed())
                .distinct().skip(1).findFirst().ifPresent(System.out::println);

        //find 3rd largest word in sentence
        Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String :: length).reversed())
                .distinct().skip(2).findFirst().ifPresent(System.out::println);
  }
}

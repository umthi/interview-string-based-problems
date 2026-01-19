package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfWordInSentence {
    public static void main(String[] args) {
        String str = "I am java developer learning stream api in java";
        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(
               word -> word, Collectors.counting()
        ));
        System.out.println(map);

        //count occurrence of char in a word
        String s = "umamaheswari";
        Map<String, Long> lettersCount = Arrays.stream(s.split("")).collect(Collectors.groupingBy(
                x -> x, Collectors.counting()
        ));
        System.out.println("lettersCount "+lettersCount);

        //another better performance way using hashmap
        Map<Character, Integer> hasMap = new HashMap<>();

        for(char c: s.toCharArray()) {
            hasMap.put(c, hasMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(hasMap);
    }
}

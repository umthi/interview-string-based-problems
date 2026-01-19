package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String str = "helloworld";
        //find first non repeating character
        Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst().ifPresent(System.out::print);

        System.out.println();

        // another way to find each letter and occurence
        Map<String, Long> charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap :: new, Collectors.counting()));

        System.out.println(charCount);

        //this way u can find letter occurred any times
        charCount.entrySet().stream().filter(
                m -> m.getValue() == 1
        ).map(Map.Entry::getKey).findFirst().ifPresent(System.out::print);

        System.out.println();
        //combine both and write in single line to find first letter occurred 2 times
        //By default, Collectors.groupingBy() uses a HashMap will not keep insertion order
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap :: new,  Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 2)
                .map(m -> m.getKey()).findFirst().ifPresent(System.out::print);
    }
}

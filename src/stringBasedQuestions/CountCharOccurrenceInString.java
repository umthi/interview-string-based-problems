package stringBasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharOccurrenceInString {
    public static void main(String[] args) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        //to get in sorter order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}


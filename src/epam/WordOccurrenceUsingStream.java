package epam;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrenceUsingStream {
    public static void main(String[] args) {
        String str = "This is my Life and this lifE is good";

        Map<String, Long> map = Arrays.stream(str.split(" "))
                .map(String :: toLowerCase)
                .collect(Collectors.groupingBy(
                        s -> s, Collectors.counting()
                ));
        System.out.println(map);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

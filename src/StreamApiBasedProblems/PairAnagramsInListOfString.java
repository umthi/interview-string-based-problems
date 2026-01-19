package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PairAnagramsInListOfString {
    public static void main(String[] args) {
        String[] str = {"pat", "pan", "tap", "nap", "meat", "tree", "team"};

        Map<String, List<String>> map = Arrays.stream(str).collect(Collectors.groupingBy(
                s->Arrays.stream(s.split("")).sorted().collect(Collectors.joining())
        ));
        System.out.println(map.values());

        //standard optimized way using char array
        Map<String, List<String>> map1 = Arrays.stream(str).collect(Collectors.groupingBy(
                s -> {
                    char[] c = s.toCharArray();
                    Arrays.sort(c);
                    return new String(c);
                }
        ));
        System.out.println(map1.values());
    }
}

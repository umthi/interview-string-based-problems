import java.util.*;
import java.util.stream.Collectors;


public class Test {

    public static void main(String[] args) {
        String[] str = {"pat", "pan", "tap", "nap", "meat", "tree", "team"};

        Map<String, List<String>> map = Arrays.stream(str).collect(Collectors.groupingBy(
                s -> String.valueOf(Arrays.stream(s.split("")).sorted().toList())
        ));
        System.out.println(map.values());
    }

}
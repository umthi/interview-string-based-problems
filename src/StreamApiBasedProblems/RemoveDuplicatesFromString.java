package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "umamaheswari";
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);

        System.out.println();
        // if u want to store it into string and print
        String ans = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(ans);
    }
}

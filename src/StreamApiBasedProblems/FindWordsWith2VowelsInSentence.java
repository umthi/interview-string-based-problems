package StreamApiBasedProblems;

import java.util.Arrays;

public class FindWordsWith2VowelsInSentence {
    public static void main(String[] args) {
        String str = "I am learning stream api in java";
        Arrays.stream(str.split(" ")).filter(word -> word.replaceAll(
                "[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}

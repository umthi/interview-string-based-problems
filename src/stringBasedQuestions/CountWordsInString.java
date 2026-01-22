package stringBasedQuestions;

import java.util.Collections;
import java.util.stream.Collectors;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "welcome to java world";
        String[] strArr = str.split(" ");
        System.out.println("number of words in provided sentence is "+strArr.length);

        //reverse each word in sentence
        String revString = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(revString);
    }
}

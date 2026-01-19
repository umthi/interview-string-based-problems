package stringBasedQuestions;

import java.util.Collections;
import java.util.stream.Collectors;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "welcome to java world";
        String[] strArr = str.split(" ");
        System.out.println("number of words in provided sentence is "+strArr.length);

        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }

        String result = String.join(" ", strArr);
        System.out.println(result);
    }
}

package stringBasedQuestions;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
       String str = "welcome to java world";

       Arrays.stream(str.split(" ")).filter(
               word -> word.replaceAll("[^aeiouAEIOU]", "").length() == 1
       ).forEach(System.out::println);
    }

}

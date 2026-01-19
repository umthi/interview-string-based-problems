package hwt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        //o(n log n) performance
        if (isAnagramBySort(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }

        //optimal o(n) performance
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }
    }

    private static boolean isAnagramBySort(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
        {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        //will add s1 characters with occurence to hashmap
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //will reduce occurance of characters
        for(char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);

            // s2 has character which is not present in s1
            if(map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}

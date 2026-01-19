package stringBasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharOccurrenceInString {
    public static void main(String[] args) {
        String str = "umamaheswariw";
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        int count = 1;

        for(int i=0 ; i < str.length()-1 ; i++)
        {
            if(charArr[i] == charArr[i+1]) {
                count++;
            }
            else {
                System.out.println(charArr[i] +" count is "+count );
                count = 1;
            }
        }

        //last elt step will not come in loop but it will be counted so print outside
        System.out.println(charArr[str.length()-1] +" count is "+count );


        //another way
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }
}


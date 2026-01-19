package stringBasedQuestions;

import java.util.Arrays;

public class RemoveDuplicatesFromStringArray {
    public static void main(String[] args) {
        String[] strArr = {"uma", "kani", "then", "uma", "kani", "mani"};
        String[] resultArr = new String[strArr.length];
        int index = 0;

        for(int i=0; i<strArr.length; i++) {
            boolean isDuplicate = false;

            for(int j=0; j<index; j++) {
                if(strArr[i].equals(resultArr[j])) {
                    isDuplicate = true;
                }
            }
            if(!isDuplicate && !strArr[i].isEmpty()) {
                resultArr[index++] = strArr[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(resultArr, index)));
    }
}

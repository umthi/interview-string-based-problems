package stringBasedQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateStringFromArray {
    public static void main(String[] args) {
        String[] arr = {"kani", "then", "uma", "kani", "then", "kani"};
        String[] resultArr = new String[arr.length];
        int index = 0;

        for (int i=0; i<arr.length; i++) {
            boolean isDuplicate = false;
            for(int j=i+1; j< arr.length-1; j++) {
                if(!arr[i].isEmpty() && arr[i].equals(arr[j])) {
                   isDuplicate = true;
                   arr[j] = "";
                }
            }

            if(!arr[i].isEmpty() && isDuplicate)
            {
                resultArr[index++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(resultArr, index)));
    }
}

package stringBasedQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class FindDistinctStringFromArray {
    public static void main(String[] args) {
        String[] strArr = {"uma", "kani", "then", "uma", "kani", "mani"};
        //String[] resultArr = findDistinctStringArray(strArr);
        String[] distinctArr = getDistinctArray(strArr);
        System.out.println(Arrays.toString(distinctArr));
        //System.out.println(Arrays.toString(resultArr));
    }

    private static String[] getDistinctArray(String[] strArr) {
        //distinct and asending order
        TreeSet<String> treeSet = new TreeSet<>();

        //distinct and reverse order
        //TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(String elt : strArr) {
            treeSet.add(elt);
        }
        return treeSet.toArray(new String[treeSet.size()]);
    }

    private static String[] findDistinctStringArray(String[] strArr) {
        int index = 0;
        String[] resultArr = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            boolean isDuplicate = false;
            for(int j = i+1; j < strArr.length-1; j++) {
                if(!strArr[j].isEmpty() && strArr[i].equalsIgnoreCase(strArr[j]))
                {
                    isDuplicate = true;
                    strArr[j] = "";
                }
            }
            if(!isDuplicate && !strArr[i].isEmpty())
            {
                resultArr[index++] = strArr[i];
            }
        }
        return Arrays.copyOf(resultArr, index); // this method will trim the array only contain filled elements
    }
}

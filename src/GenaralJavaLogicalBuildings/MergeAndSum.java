package GenaralJavaLogicalBuildings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeAndSum {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        // 1+2 => 3, 3+3=> 6, 6+4=> 10, 10+5=> 15 sum = 3+6+10+15=34

        int sum = 0;
        int totalSum = 0;

        for(int i=0; i< list.size(); i++) {
            sum = sum + list.get(i);
            if(i > 0) {
                totalSum = totalSum + sum;
            }
        }

        System.out.println(totalSum);
    }
}

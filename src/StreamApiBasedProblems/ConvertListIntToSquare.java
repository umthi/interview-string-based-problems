package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.List;

public class ConvertListIntToSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> sqaureList = list.stream().map(x -> x*x).toList();
        System.out.println(sqaureList);
    }
}

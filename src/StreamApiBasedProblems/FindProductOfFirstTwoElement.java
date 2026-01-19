package StreamApiBasedProblems;

import java.util.Arrays;

public class FindProductOfFirstTwoElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 1, 2, 3};
        int prod = Arrays.stream(arr).limit(2)
                        .reduce((a,b) -> a*b).getAsInt();

        System.out.println(prod);
    }
}

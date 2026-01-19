package StreamApiBasedProblems;

import java.util.stream.IntStream;

public class MultiplyAlternativeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 5, 7};
        System.out.println("length "+arr.length/2);
        int prod = IntStream.range(0, arr.length).filter(x-> x%2==0)
                .map(x -> arr[x])
                .reduce((a,b) -> a*b)
                .getAsInt();
        System.out.println(prod);

        //find prod of first and last element and vise versa
        IntStream.range(0, arr.length/2)
                .map(x -> arr[x]*arr[arr.length-1-x])
                .forEach(System.out::println);
    }
}

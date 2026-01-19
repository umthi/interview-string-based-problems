package epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kani", "then", "uma", "krish", "meena");

        System.out.println("using sequential stream");
        names.stream().forEach(System.out::println);

        System.out.println("using parallel stream");
        names.parallelStream().forEach(System.out::println);
    }
}


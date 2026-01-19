package StreamApiBasedProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3,4,1,2,5));

            System.out.println(list);
            //for desending order
            list.sort(Comparator.reverseOrder());
            System.out.println(list);

            //for reverse as is
            Collections.reverse(list);
            System.out.println(list);
    }
}

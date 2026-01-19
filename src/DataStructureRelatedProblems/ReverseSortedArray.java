package DataStructureRelatedProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSortedArray {
    public static void main(String[] args) {
        //here arr type is object and unsorted array
        Integer[] arr = {11, 1, 5, 7, 8, 9, 10};

        //for object type arr we can use below reverse order even for unsorted it will work
        //tc - O(n log n) space O(n)
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        //this is sorted array, if it is not sorted use quicksort first then do reverse
        int[] arr1 = {1, 5, 7, 8, 9, 10};

        //for primitive type follow below approach
        int[] reverseArr = reverseArr(arr1);
        System.out.println(Arrays.toString(reverseArr));
    }

    private static int[] reverseArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }
}

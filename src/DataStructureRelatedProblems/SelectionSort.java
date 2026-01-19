package DataStructureRelatedProblems;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 9, 8, 4, 5, 7};

        //in selection sort find min index and swap once for each step
        printSortedArray(arr);
    }

    private static void printSortedArray(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {  // n-1 step
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
               //dont swap inside loop then this will also act like bubblesort
                //instead find minIndex and swap only once
                if(arr[j] < arr[minIndex] ) {
                    minIndex = j;
                }
            }

            //swap only once here and added condition to avoid unnecessary swap when minindex and i is equal
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

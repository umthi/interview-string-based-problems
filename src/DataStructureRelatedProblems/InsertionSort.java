package DataStructureRelatedProblems;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 9, 8, 4, 5, 7};

        //this sort will select key elt and place that elt to the right place
        sortArrUsingInsertionSort(arr);
    }

    private static void sortArrUsingInsertionSort(int[] arr) {
        //it will start from 1st element as a key elt
        for(int i=1; i< arr.length; i++) {
            int key = arr[i];
            int j = i-1;   // left side comparision

            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}

package DataStructureRelatedProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 9, 8, 4, 5, 7};

        //in selection sort one loop for step other loop for comparition with adjusant elements
        getSortedArray(arr);
    }

    private static void getSortedArray(int[] arr) {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

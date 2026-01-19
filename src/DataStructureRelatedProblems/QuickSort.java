package DataStructureRelatedProblems;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] sortedArr = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotPoint = getPivotPoint(arr, low, high);
            //for left side sorting
            quickSort(arr, low, pivotPoint - 1);
            //for right side sorting
            quickSort(arr, pivotPoint + 1, high);
        }
        return arr;
    }

    private static int getPivotPoint(int[] arr, int low, int high) {
        int pivotElement = arr[high];
        int pivotPoint = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivotElement) {
                int temp = arr[i];
                arr[i] = arr[pivotPoint];
                arr[pivotPoint] = temp;
                pivotPoint++;
            }
        }

        //swap pointer element with pivot element which is high
        int temp = arr[high];
        arr[high] = arr[pivotPoint];
        arr[pivotPoint] = temp;

        return pivotPoint;
    }
}

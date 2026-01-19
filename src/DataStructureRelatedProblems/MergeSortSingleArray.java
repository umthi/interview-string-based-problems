package DataStructureRelatedProblems;

import java.util.Arrays;

public class MergeSortSingleArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] arr) {
        //this condition is main otherwise this method will call recursively infinite times
        if(arr.length <= 1) {
            return arr;
        }

        int mid = arr.length/2;

        // mid is 3 then 0 to 2 range
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        // mid is 3 then 3 to 5 range
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        //recursively calling merge sort to sort left and right side
        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        // calling merge to combine both sorted arrays
        int[] mergedArr = merge(leftArr, rightArr);
        return mergedArr;
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int[] finalArr = new int[leftArr.length+rightArr.length];

        int i=0; int j=0; int k=0;
        while(i < leftArr.length && j< rightArr.length) {
            if(leftArr[i] < rightArr[j])
            {
                finalArr[k++] = leftArr[i++];
            }
            else {
                finalArr[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            finalArr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            finalArr[k++] = rightArr[j++];
        }

        return finalArr;
    }
}

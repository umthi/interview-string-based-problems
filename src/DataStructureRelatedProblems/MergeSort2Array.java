package DataStructureRelatedProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort2Array {

    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int a = arr1.length;
        int b = arr2.length;
        int[] merge = new int[a+b];

        int i=0, j=0, k = 0;

        while (i < a && j < b) {
            if(arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            }
            else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < a) {
            merge[k++] = arr1[i++];
        }
        while (j < b) {
            merge[k++] = arr2[j++];
        }

        return merge;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3};
        int[] arr2 = {2,4,6,6,8,8};

        int[] ans = mergeSort(arr1, arr2);
        System.out.println(Arrays.toString(ans));

        //incase arrays not sorted we need to sort and pass
        int[] arr3 = {1,1,9, 7, 3,3};
        int[] arr4 = {2,4,6,6,8,8, 11, 1,3};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        int[] res = mergeSort(arr3, arr4);
        System.out.println(Arrays.toString(res));

        //alternative way if they ask stream
        System.out.println("merge two unsorted arrays using stream");
        int[] mergeArr = mergeSortUsingStream(arr3, arr4);
        System.out.println(Arrays.toString(mergeArr));
    }

    private static int[] mergeSortUsingStream(int[] arr3, int[] arr4) {
        return IntStream.concat(Arrays.stream(arr3), Arrays.stream(arr4))
                .sorted()
                .toArray();
    }
}

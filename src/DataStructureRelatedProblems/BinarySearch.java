package DataStructureRelatedProblems;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int elt = 90;

        // binary search only applicable for sorted array
        // if u have unsorted array go with linear search
        // Arrays.sort(arr);  // or use sort method then go for binary search
        if (!findElementUsingBinarySearch(arr, elt))
            System.out.println("no element found");
    }

    private static boolean findElementUsingBinarySearch(int[] arr, int elt) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {      // remember
            int mid = (low + high) / 2;

            if (elt == arr[mid]) {
                System.out.println("position of the element is " + mid);
                return true;
            } else if (elt > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}

package DataStructureRelatedProblems;

public class QuickSelectKthSmallestElt {

    private static int getKthSmallestElement(int[] arr, int key, int low, int high) {
        if(low < high) {  //needed for quick sort, here it is optional
            int pivotPoint = getPivotPoint(arr, low, high);

            if (pivotPoint == key) {
                return arr[pivotPoint];
            } else if (key > pivotPoint) {
                return getKthSmallestElement(arr, key, pivotPoint + 1, high);
            } else {
                return getKthSmallestElement(arr, key, low, pivotPoint - 1);
            }
        }
        throw new IllegalArgumentException("Kth is index out of bound");
    }

    private static int getPivotPoint(int[] arr, int low, int high) {
        int pivotElement = arr[high];
        int pivotPoint = low;

        for(int i=low; i<high; i++) {
            // for kth largest element just change this logic if(arr[i] > pivotElement)
            if(arr[i] < pivotElement) {
                int temp = arr[i];
                arr[i] = arr[pivotPoint];
                arr[pivotPoint] = temp;
                pivotPoint++;
            }
        }

        //swap pivot element as high to the pivot point
        int temp = arr[pivotPoint];
        arr[pivotPoint] = arr[high];
        arr[high] = temp;

        return pivotPoint;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,10,11,1,3,19,8,7};
        int key = 3;
        int ans = getKthSmallestElement(arr, key-1, 0, arr.length-1);
        System.out.println(ans);
    }
}

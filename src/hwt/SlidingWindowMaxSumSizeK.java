package hwt;

public class SlidingWindowMaxSumSizeK {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = MaxSumBySize(arr, k);
        System.out.println(maxSum);
    }

    private static int MaxSumBySize(int[] arr, int k) {
        int sum = 0;
        //calculating sum for first window
        for(int i=0; i<k; i++) {
            sum = sum + arr[i];
        }
        int maxSum = sum;

        //sliding window
        for(int i=k; i<arr.length; i++) {
            sum = (sum - arr[i-k]) + arr[i]; // removing old value and adding new value
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}

package hwt;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12};

        int n = arr.length+1;  // include missing number
        int expectedSum = n * (n+1)/2; // formula remember this
        int actualSum = 0;
        for(int num : arr) {
            actualSum = actualSum + num;
        }

        System.out.println(expectedSum - actualSum);
    }
}

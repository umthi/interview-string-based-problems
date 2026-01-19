package stringBasedQuestions;

public class FindSecondMaxNumber {
    public static void main(String[] args) {
        int[] arr = {-10, 1, -5, -3, -2, -8};
        int number = findSecondMaxNumber(arr);
        System.out.println(number);
    }

    private static int findSecondMaxNumber(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];  // don't go with 0 will not work for negative values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {  // only with this condition we cant get o/p when max value is the 1st elt
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}

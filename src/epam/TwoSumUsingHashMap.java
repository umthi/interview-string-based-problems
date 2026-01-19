package epam;

import java.util.*;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 7, 2};
        int target = 9;
        //for one pair
        // int[] sumArr = sumArr(arr, target);
        //System.out.println(Arrays.toString(sumArr));


        //Time complexity: O(n) and Space complexity: O(n)
        List<int[]> pairs = sumArr(arr, target);
        pairs.forEach(p -> System.out.println(Arrays.toString(p)));
    }

    private static List<int[]> sumArr(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> pairs = new ArrayList<>();

        for(int i=0; i< arr.length; i++) {
            int need = target - arr[i];
            if(map.containsKey(need))
            {
                //pairs.add(new int[]{need, arr[i]});  // for values to achieve target
                pairs.add(new int[]{map.get(need), i}); // for position
            }
                map.put(arr[i], i);
        }
        // return new int[0]; //if no pair found only one pair
        return pairs;
    }
}

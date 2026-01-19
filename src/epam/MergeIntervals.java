package epam;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time (1st pos start time and second pos end time)
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Step 2: Prepare result list
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];

        // Step 3: Loop and merge overlaps
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) {  // overlapping
                cur[1] = Math.max(cur[1], intervals[i][1]);
            } else {  // non-overlapping
                res.add(cur);
                cur = intervals[i];
            }
        }

        // Step 4: Add the last interval
        res.add(cur);

        // Step 5: Convert to array
        return res.toArray(new int[res.size()][]);
    }

    // 🧪 ParallelStream method for testing
    public static void main(String[] args) {
        // Example 1
        int[][] intervals1 = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println("Input: " + Arrays.deepToString(intervals1));
        int[][] merged1 = merge(intervals1);
        System.out.println("Merged: " + Arrays.deepToString(merged1));

        // Example 2
        int[][] intervals2 = {{1,4}, {4,5}};
        System.out.println("\nInput: " + Arrays.deepToString(intervals2));
        int[][] merged2 = merge(intervals2);
        System.out.println("Merged: " + Arrays.deepToString(merged2));

        // Example 3
        int[][] intervals3 = {{6,7}, {2,4}, {5,6}, {1,3}};
        System.out.println("\nInput: " + Arrays.deepToString(intervals3));
        int[][] merged3 = merge(intervals3);
        System.out.println("Merged: " + Arrays.deepToString(merged3));
    }
}


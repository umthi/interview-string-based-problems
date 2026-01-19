package epam;

import java.util.*;

public class MergeIntervalsWithNewIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {15, 18}, {4, 6}, {8, 10}};

        //if it is sorted ignore below sorting interval then complexity o(n+m)
        // since we sort 2 intervals complexity is O(n log n + m log m)
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        int[][] newIntervals = {{13, 14}, {2, 5}, {9, 12}};
        Arrays.sort(newIntervals, Comparator.comparing(a -> a[0]));

        int[][] finalInterval = addAllIntervals(intervals, newIntervals);

        int[][] mergedInterval = mergeIntervals(finalInterval);
        System.out.println(Arrays.deepToString(mergedInterval));
    }

    private static int[][] addAllIntervals(int[][] intervals, int[][] newIntervals) {
        int n = intervals.length;
        int m = newIntervals.length;
        List<int[]> finalInterval = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (intervals[i][0] < newIntervals[j][0]) {
                finalInterval.add(intervals[i++]);
            } else {
                finalInterval.add(newIntervals[j++]);
            }
        }

        while(i<n) {
            finalInterval.add(intervals[i++]);
        }

        while (j < m) {
            finalInterval.add(newIntervals[j++]);
        }

        return finalInterval.toArray(new int[finalInterval.size()][2]);
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<int[]> res = new ArrayList<>();

        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) {
                cur[1] = Math.max(intervals[i][1], cur[1]);
            } else {
                res.add(cur);
                cur = intervals[i];
            }
        }

        //last element
        res.add(cur);

        return res.toArray(new int[res.size()][2]);
    }
}


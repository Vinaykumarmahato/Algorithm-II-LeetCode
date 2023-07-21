package Day1.Day3.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    static class Solution {
        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            List<int[]> intersections = new ArrayList<>();
            int i = 0, j = 0;
            while (i < firstList.length && j < secondList.length) {
                int[] interval1 = firstList[i];
                int[] interval2 = secondList[j];
                int start = Math.max(interval1[0], interval2[0]);
                int end = Math.min(interval1[1], interval2[1]);
                if (start <= end) {
                    intersections.add(new int[]{start, end});
                }
                if (interval1[1] < interval2[1]) {
                    i++;
                } else {
                    j++;
                }
            }
            return intersections.toArray(new int[0][]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        int[][] result = solution.intervalIntersection(firstList, secondList);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [1, 2], [5, 5], [8, 10], [15, 23], [24, 24], [25, 25]
    }
}


package Day1.Day3;

public class Solution2 {
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = solution.findPeakElement(nums);
        System.out.println("Peak element is at index: " + peakIndex); // Output: Peak element is at index: 5
    }
}

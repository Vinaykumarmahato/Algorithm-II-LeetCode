package Day1.Day3;

public class Solution1 {
    static class Solution {
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = solution.findMin(nums);
        System.out.println("Minimum element in the rotated sorted array: " + min); // Output: Minimum element in the rotated sorted array: 0
    }
}

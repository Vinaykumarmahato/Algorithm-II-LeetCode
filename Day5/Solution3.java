package Day1.Day5;

public class Solution3 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0, end = 0, sum = 0, minLen = Integer.MAX_VALUE;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int result1 = solution.minSubArrayLen(target1, nums1);
        System.out.println("Minimum length of subarray with sum greater than or equal to " + target1 + ": " + result1);

        int target2 = 11;
        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int result2 = solution.minSubArrayLen(target2, nums2);
        System.out.println("Minimum length of subarray with sum greater than or equal to " + target2 + ": " + result2);
    }
}

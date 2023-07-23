package Day1.Day5;

public class Solution2 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int product = 1, left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left++];
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] nums1 = {10, 5, 2, 6};
        int k1 = 100;
        int result1 = solution.numSubarrayProductLessThanK(nums1, k1);
        System.out.println("Number of subarrays with product less than " + k1 + ": " + result1);

        int[] nums2 = {1, 2, 3};
        int k2 = 0;
        int result2 = solution.numSubarrayProductLessThanK(nums2, k2);
        System.out.println("Number of subarrays with product less than " + k2 + ": " + result2);
    }
}


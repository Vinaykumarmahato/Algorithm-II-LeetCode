package Day1;

class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        int left = 0, right = nums.length - 1;
        
        // Find first occurrence of target
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (left < nums.length && nums[left] == target) {
            result[0] = left;
        } else {
            return result;
        }
        
        // Find last occurrence of target
        right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        result[1] = right;
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        Solution1 solution = new Solution1();
        int[] range = solution.searchRange(nums, target);
        
        System.out.println("Range: [" + range[0] + ", " + range[1] + "]");
    }
}

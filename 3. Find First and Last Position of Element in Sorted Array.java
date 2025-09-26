class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1, ans = -1;
        int first = findFirst(nums, target, left, right, ans);
        int last = findLast(nums, target, left, right, ans);
        return new int[]{first, last};
    }
    
    public int findFirst(int[] nums, int target, int left, int right, int ans) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }

    public int findLast(int[] nums, int target, int left, int right, int ans) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
}

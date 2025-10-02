class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, window = 0;
        int max = 0;
        for(int right = 0; right<n; right++) {
            window += nums[right]; 
            while (window + k < right-left+1) {
                window -= nums[left];
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}

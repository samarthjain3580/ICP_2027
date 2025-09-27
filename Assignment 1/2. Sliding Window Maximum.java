class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];
        
        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++) {
            max = Math.max(nums[i], max);
        }
        arr[0] = max;

        for(int i=k; i<n; i++) {
            int left = i-k;
            int out = nums[left];
            int in = nums[i];

            if (out == max) {
                max = nums[left+1];
                for(int j=left+1; j<=i; j++) {
                    max = Math.max(max, nums[j]);
                }
            }
            else {
                max = Math.max(max, in);
            }
            arr[left+1] = max;
        }
        return arr;
    }
}

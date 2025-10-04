//TC: O(n)
//SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE; 
        int curr = 0;

        for(int i=0; i<nums.length; i++) {
            curr = Math.max(curr+nums[i], nums[i]);
            max = Math.max(max, curr);
        }

        return max;
    }
}

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

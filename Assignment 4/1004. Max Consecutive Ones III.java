//TC:O(n)
//SC:O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, window = 0;
        int max = 0;

        //initialize window
        for(int right = 0; right<n; right++) {
            window += nums[right]; 

            //condition when window size shrink
            while (window + k < right-left+1) {
                window -= nums[left];
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}

// Example 1:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

// Example 2:
// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

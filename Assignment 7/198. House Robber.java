//TC: O(n)
//SC: O(n)

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
		int[] arr = new int[nums.length];
		arr[0] = nums[0];
		arr[1] = Math.max(nums[0], nums[1]);
		for(int i=2;i<nums.length;i++) {
			int rob = nums[i]+arr[i-2];
			int dont_rob = arr[i-1];
			arr[i] = Math.max(rob, dont_rob);
		}
		return arr[arr.length-1];
    }
}

// Example 1:
// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.

// Example 2:
// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.
 

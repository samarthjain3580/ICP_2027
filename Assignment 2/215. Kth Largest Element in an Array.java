// Time Complexity : 57 sec
// Space Complexity : 57 MB

class Solution {
    public int findKthLargest(int[] nums, int k) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }
        int ans = 0;
        while (k>0) {
            ans = pq.poll();
            k--;
        }
        return ans;
    }
}

// Example 1:
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5

// Example 2:
// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4

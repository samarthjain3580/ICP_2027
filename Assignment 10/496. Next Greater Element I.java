// TC : O(N+M)
// SC : O(N+M)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];

        //finding nextGreater for nums2
        int nextGreater[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && nums2[i] >= nums2[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nextGreater.length; i++){
            map.put(nums2[i],nextGreater[i]);
        }

        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}

// Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

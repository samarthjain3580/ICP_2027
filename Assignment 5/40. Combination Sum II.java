class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> com = new ArrayList<>();
        backtracking(nums, 0, com, ans, target); 
        return ans;
    }

    public void backtracking(int[] nums, int idx, List<Integer> com, List<List<Integer>> ans, int target) {

        if (target == 0) {
            // if (!ans.contains(com)) {
                ans.add(new ArrayList<>(com));
                return;
            // }
        }

        for(int i=idx; i<nums.length;i++) {
            if(i>idx && nums[i] == nums[i-1]) continue;
            if (nums[i] > target) break;

            com.add(nums[i]);
            backtracking(nums, i+1, com, ans, target-nums[i]); // single inclusion
            com.remove(com.size()-1);
            
        }
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> com = new ArrayList<>();
        backtracking(n,1, com, ans, k); 
        return ans;
    }

    public void backtracking(int n,int idx, List<Integer> com, List<List<Integer>> ans, int k) {

        if (k == 0) {
            ans.add(new ArrayList<>(com));
            return;
        }

        for(int i=idx; i<=n;i++) {

            com.add(i);
            backtracking(n, i+1, com, ans, k-1); // single inclusion
            com.remove(com.size()-1);
            
        }                                                  
    }
}

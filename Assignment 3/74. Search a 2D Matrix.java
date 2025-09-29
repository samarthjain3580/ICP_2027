// TC : O(n*log(m))
// SC : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++) {
            int left = 0;
            int right = m-1;
            while(left <= right) {
                int mid = (left+right)/2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] > target) right = mid-1;
                else left = mid+1; 
            }
        }     
        return false;
    }
}

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

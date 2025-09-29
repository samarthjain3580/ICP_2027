// TC : O(log(m*n))
// SC : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n*m-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if (matrix[mid/m][mid%m] == target) return true;
            else if (matrix[mid/m][mid%m] > target) right = mid-1;
            else left = mid+1; 
        }   
        return false;
    }
}

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

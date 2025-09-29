// TC: O(m*n)
// SC: O(m*n)
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int total = (right + 1) * (bottom + 1);

        while (total > 0) {
            // left to right
            for (int i = left; i <= right && total> 0; i++) {
                list.add(matrix[top][i]);
                total--;
            }
            top++;

            // downwards
            for (int i = top; i <= bottom && total> 0; i++) {
                list.add(matrix[i][right]);
                total--;
            }
            right--;

            // right to left
            for (int i = right; i >= left && total> 0; i--) {
                list.add(matrix[bottom][i]);
                total--;
            }
            bottom--;

            // upwards
            for (int i = bottom; i >= top && total> 0; i--) {
                list.add(matrix[i][left]);
                total--;
            }
            left++;
        }
        
        return list;
    }
}


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

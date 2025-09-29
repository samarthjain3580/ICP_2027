import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int first_col = 0;
        int first_row = 0;
        int last_col = matrix[0].length - 1;
        int last_row = matrix.length - 1;
        int total= (last_col + 1) * (last_row + 1);

        while (total > 0) {
            // left to right
            for (int i = first_col; i <= last_col && total> 0; i++) {
                list.add(matrix[first_row][i]);
                total--;
            }
            first_row++;

            // downwards
            for (int i = first_row; i <= last_row && total> 0; i++) {
                list.add(matrix[i][last_col]);
                total--;
            }
            last_col--;

            // right to left
            for (int i = last_col; i >= first_col && total> 0; i--) {
                list.add(matrix[last_row][i]);
                total--;
            }
            last_row--;

            // upwards
            for (int i = last_row; i >= first_row && total> 0; i--) {
                list.add(matrix[i][first_col]);
                total--;
            }
            first_col++;
        }
        
        return list;
    }
}

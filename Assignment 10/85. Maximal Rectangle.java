// TC: O(M*N)
// SC: O(N)

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int max_area = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {

                if (matrix[i][j] == '1') {
                    arr[j]+=1;
                }
                else {
                    arr[j] = 0;
                }
            }
            int area = max(arr);
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }

    public int max(int[] arr) {
        int area = 0;
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<=n; i++) {
            int val = (i==n)?0:arr[i];
            while (!stack.isEmpty() && val < arr[stack.peek()]) {
                int nsr = i; // next smaller element on right
                int tbs = stack.pop(); // to be solved
                int nsl = stack.isEmpty()?-1:stack.peek();  //next smaller element on left 

                int width = nsr-nsl-1;
                area = Math.max(width*arr[tbs], area);
            }
            stack.push(i);
        }
        return area; 
    }
}

// Example 1:
// Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
// Output: 6
// Explanation: The maximal rectangle is shown in the above picture.
  
// Example 2:
// Input: matrix = [["0"]]
// Output: 0
  
// Example 3:
// Input: matrix = [["1"]]
// Output: 1
 

//TC: O(M∗N∗4^L)
//SC: O(L)
class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if (wordSearch(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordSearch(char[][] board, String word, int i, int j, int idx) {
        if (i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(idx)) {
            return false;
        } 

        if (idx == word.length()-1) return true;

        char temp = board[i][j];
        board[i][j] = '0';

        boolean found = wordSearch(board, word, i + 1, j, idx + 1) ||
                        wordSearch(board, word, i - 1, j, idx + 1) ||
                        wordSearch(board, word, i, j + 1, idx + 1) ||
                        wordSearch(board, word, i, j - 1, idx + 1);

        board[i][j] = temp;
        return found;

    }
}

// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true

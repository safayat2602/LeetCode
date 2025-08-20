class Solution {
    public void solveSudoku(char[][] board) {
        func(board);
    }

    public static boolean func(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (Isvalid(i, j, board, ch)) {
                            board[i][j] = ch;

                            if (func(board)) {
                                return true;
                            }

                            board[i][j] = '.';
                        }
                    }
                    return false; 
                }
            }
        }
        return true; 
    }

    public static boolean Isvalid(int row, int col, char[][] board, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == ch) return false;
        }
        return true;
    }
}

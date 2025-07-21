class Solution {
    public boolean isSafe(int row, int col, char[][] board, int n) {
        int currRow = row;
        int currCol = col;

        //check upper left part
        while (col >= 0 && row >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
            row--;
        }

        // left check
        row = currRow;
        col = currCol;
        while (col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
        }

        //lower left part check
        row = currRow;
        col = currCol;
        while (row < n && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }

        return true;
    }

    // public void addFinalList(char[][] board, List<List<String>> ansList, int n) {
    //     List<String> list = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         list.add(new String(board[i]));
    //     }
    //     ansList.add(list);
    //     return;

    // }

    public void placeQueens(int col, char[][] board, List<List<String>> ansList, int n) {
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ansList.add(list);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                placeQueens(col + 1, board, ansList, n);
                board[row][col] = '.';
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ansList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        placeQueens(0, board, ansList, n);
        return ansList;
    }
}
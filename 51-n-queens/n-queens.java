class Solution {
    // Approach-1

    // public boolean isSafe(int row, int col, char[][] board, int n) {
    //     int currRow = row;
    //     int currCol = col;

    //     //check upper left part
    //     while (col >= 0 && row >= 0) {
    //         if (board[row][col] == 'Q')
    //             return false;
    //         col--;
    //         row--;
    //     }

    //     // left check
    //     row = currRow;
    //     col = currCol;
    //     while (col >= 0) {
    //         if (board[row][col] == 'Q')
    //             return false;
    //         col--;
    //     }

    //     //lower left part check
    //     row = currRow;
    //     col = currCol;
    //     while (row < n && col >= 0) {
    //         if (board[row][col] == 'Q')
    //             return false;
    //         row++;
    //         col--;
    //     }

    //     return true;
    // }

    public void placeQueens(int col, char[][] board, List<List<String>> ansList, int n, int [] leftCheck, int [] upperLeftCheck,int [] lowerLeftCheck) {
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ansList.add(list);
            return;
        }

        for (int row = 0; row < n; row++) {

            //Approach-1

            // if(isSafe(row, col, board, n)) {
            //     board[row][col] = 'Q';
            //     placeQueens(col + 1, board, ansList,n);
            //     board[row][col] = '.';
            // }

            
            //Approach-2
            if (leftCheck[row]==0 && upperLeftCheck[row+col]==0 && lowerLeftCheck[(n-1)+(col-row)]==0) {
                board[row][col] = 'Q';
                leftCheck[row]=1;
                upperLeftCheck[row+col]=1;
                lowerLeftCheck[(n-1)+(col-row)]=1;
                placeQueens(col + 1, board, ansList,n,leftCheck,upperLeftCheck,lowerLeftCheck);
                board[row][col] = '.';
                leftCheck[row]=0;
                upperLeftCheck[row+col]=0;
                lowerLeftCheck[(n-1)+(col-row)]=0;
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        int [] leftCheck = new int[n];
        int [] upperLeftCheck = new int[(2*n)-1];
        int [] lowerLeftCheck = new int[(2*n)-1];
        List<List<String>> ansList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        placeQueens(0, board, ansList, n,leftCheck,upperLeftCheck,lowerLeftCheck);
        return ansList;
    }
}
class Solution {
    
    public boolean searchMatrix(int[][] mat, int target) {
        // Approach - 1
        // int rows = mat.length;
        // int cols = mat[0].length;
        // for(int i=0;i<rows;i++){
        //     if(binarySearch(mat[i],target))return true;
        // }

        // Approach - 2
        int n = mat.length;
        int row = 0;
        int col = mat[0].length-1;
        while(row < n && col >= 0){
            if(mat[row][col] == target)return true;
            else if(mat[row][col]> target)col--;
            else row++;
        }

        return false;
    }
}
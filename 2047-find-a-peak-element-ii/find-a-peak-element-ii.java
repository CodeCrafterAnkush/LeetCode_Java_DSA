class Solution {
    public int maxElement(int [][]mat,int rows, int mid){
        int row =0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<=rows;i++){
            if(max < mat[i][mid]){
                max = mat[i][mid];
                row = i;
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length-1;
        int cols =  mat[0].length-1;
        int ansArr[] = {-1,-1};
        int low = 0;
        int high =cols;
        while(low <= high){
            int mid = (low+high)/2;
            int row = maxElement(mat,rows,mid);
            int left = mid>0?mat[row][mid-1]:-1;
            int right = mid<cols?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                ansArr[0]=row;
                ansArr[1]=mid;
                return ansArr;
            }else if(mat[row][mid]<left){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return ansArr;
    }
}
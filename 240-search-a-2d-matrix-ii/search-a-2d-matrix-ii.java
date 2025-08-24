class Solution {
    // public boolean binarySearch(int arr[],int target){
    //     int low=0;
    //     int high = arr.length-1;
    //     while(low<=high){
    //         int mid =(low+high)/2;
    //         if(arr[mid]==target)return true;
    //         else if(arr[mid]<target)low = mid+1;
    //         else high = mid-1;
    //     }
    //     return false;
    // }
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
class Solution {
    public boolean binarySearch(int arr[],int target){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]<target)low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            if(binarySearch(mat[i],target))return true;
        }
        return false;
    }
}
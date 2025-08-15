class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]= new int[n][n];
        int top = 0;
        int buttom = n-1;
        int left =0;
        int right = n-1;
        int num =1;
        while(top<=buttom&&left <= right){
            for(int i=left;i<=right;i++){
                arr[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=buttom;i++){
                arr[i][right] = num;
                num++;
            }
            right--;
            if(top<=buttom){
                for(int i=right;i>=left;i--){
                    arr[buttom][i]=num;
                    num++;
                }
                buttom--;
            }
            if(left<=right){
                for(int i=buttom;i>=top;i--){
                    arr[i][left]=num;
                    num++;
                }
                left++;
            }
        }
        return arr;
    }
}
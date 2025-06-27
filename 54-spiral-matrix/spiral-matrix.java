class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int buttom = m-1;
        int left = 0;
        int right = n-1;

        while(top <= buttom && left <= right){
            for(int i=left;i<=right;i++){
                spiralList.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=buttom;i++){
                spiralList.add(matrix[i][right]);
            }
            right--;
            if(top<=buttom){
                for(int i=right;i>=left;i--){
                    spiralList.add(matrix[buttom][i]);
                }
                buttom --;
            }
            if(left<=right){
                for(int i=buttom;i>=top;i--){
                    spiralList.add(matrix[i][left]);
                }
                left++;
            }

        }

        return spiralList;

    }
}
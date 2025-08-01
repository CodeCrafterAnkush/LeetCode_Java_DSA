class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n= grid.length;
        for(int i=1;i<n;i++){
            List<Integer> list = new ArrayList<>();
            int row =0;
            int col =i;
            int idx = 0;
            while(row<n && col<n){
                list.add(grid[row][col]);
                row++;
                col++;
                idx++;
            }
            Collections.sort(list);
            row =0;
            col = i;
            idx = 0;
            while(row<n && col <n){
                grid[row][col]=list.get(idx);
                row++;
                col++;
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            int row =i;
            int col =0;
            int idx = 0;
            while(row<n && col<n){
                list.add(grid[row][col]);
                row++;
                col++;
                idx++;
            }
            Collections.sort(list,Collections.reverseOrder());
            row =i;
            col =0;
            idx = 0;
            while(row<n && col <n){
                grid[row][col]=list.get(idx);
                row++;
                col++;
                idx++;
            }
        }

        return grid;
    }
}
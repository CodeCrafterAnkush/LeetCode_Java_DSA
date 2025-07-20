class Solution {
    public int addRungs(int[] rungs, int dist) {
        int prev =0;
        int entries =0;
        for(int i=0;i<rungs.length;i++){
            // if(i==rungs.length-1) break;
            int curr =rungs[i];
            int diff =curr-prev;
            if(diff > dist){
                entries += (diff-1)/dist;
            }
            prev = curr;
        }

        return entries;
    }
}
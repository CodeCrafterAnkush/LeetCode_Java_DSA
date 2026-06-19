class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = curr;
        for(int i=0;i<gain.length;i++){
            curr +=gain[i];
            // System.out.println(curr);
            max = Math.max(curr,max);
        }

        return max;
    }
}
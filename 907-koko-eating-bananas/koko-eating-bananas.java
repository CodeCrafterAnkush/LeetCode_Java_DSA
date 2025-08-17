class Solution {
    public int countTime(int []banana, int bananaPerHour){
        int totalTime = 0;
        for(int i=0;i<banana.length;i++){
            totalTime += Math.ceil((double)banana[i]/bananaPerHour);
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        // int max = 0;
        // for(int i=0;i<piles.length;i++){
        //     max = Math.max(max,piles[i]);
        // }
        int low = 1;
        int high = piles[piles.length-1];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int totalTime =countTime(piles,mid);
            if(totalTime <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }
}
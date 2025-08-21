class Solution {
    public boolean isPossible(int arr[],int day,int k,int m){
        int count = 0;
        int bouquets = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                count++;
            }else{
                bouquets += (count/k);
                count = 0;
            }
        }
        bouquets += (count/k);
        count = 0;
        if(bouquets>=m)return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        // ________________TIME COMPLEXCiTY IS :- O((min to max +1)* bloomDay.length) BRUUT FORCE  
        if(bloomDay.length < (m*k))return -1;
        int max =0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max)max=bloomDay[i];
            if(bloomDay[i]<min)min = bloomDay[i];
        }
        // for(int i=min;i<=max;i++){
        //     if(isPossible(bloomDay,i,k,m)){
        //         return i;
        //     }
        // }
        //  BEST APPROACH TIME COMPLEXCITY O(log n)
        int low = min;
        int high = max;
        int ans =-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(isPossible(bloomDay,mid,k,m)){
                ans = mid;
                high = mid-1;
                // return mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
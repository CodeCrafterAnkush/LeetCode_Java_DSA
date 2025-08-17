class Solution {
    public int mySqrt(int n) {
        // return (int)Math.sqrt(x); 
        // -------OR-------
        

        // TIME COMPLEXITY is -- 0(√n)
        // if(n ==0)return 0;
        // int ans = 1;
        // for(long i=1;i<=n;i++){
        //     if(i*i<=n){
        //         ans = (int)i;
        //     }else{
        //         break;
        //     }
        // }
        // return ans;
        // _______OR_________

        //  TIME COMPLEXITY is -- 0(log n)
        if(n ==0)return 0;
        long low =1;
        long high =(long)n;
        int ans = 1;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid * mid <= n){
                ans = (int)mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }
}
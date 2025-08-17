class Solution {
    public int mySqrt(int n) {
        // return (int)Math.sqrt(x); 
        // -------OR-------
        

        // TIME COMPLEXITY is -- 0(√n)
        if(n ==0)return 0;
        int ans = 1;
        for(long i=1;i<=n;i++){
            if(i*i<=n){
                ans = (int)i;
            }else{
                break;
            }
        }
        return ans;
    }
}
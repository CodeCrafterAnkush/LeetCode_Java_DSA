class Solution {
    public int climbStairs(int n) {
        /*if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }*/
        int t1=0,t2=1,t3=0,temp=0;
        for(int i=0;i<n;i++){
            t3=t1+t2;
            temp=t1;
            t1=t2;
            t2=t3;
        }
        //int ways=climbStairs(n-1)+climbStairs(n-2); but this approach excide time limit
        return t3;
    }
}
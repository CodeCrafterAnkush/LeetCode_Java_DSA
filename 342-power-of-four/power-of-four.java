class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        // while(n%4==0){
        //     n/=4;
        // }
        // if(n==1)return true;
        // return false;
        // return(n & (n-1))==0 && (pow(n)%2)==0 ; 
        return ((n & (n-1))==0) && ((Math.log(n)/Math.log(2))%2 ==0);
    }
}
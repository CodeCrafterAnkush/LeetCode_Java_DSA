class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
        while(n%4==0){
            n/=4;
        }
        if(n==1)return true;
        return false;
        // return(n & (n-1))==0 && (pow(n)%2)==0 ; 
        // return ((n & (n-1))==0) && (Math.pow(4,n)%2 ==0);
    }
}
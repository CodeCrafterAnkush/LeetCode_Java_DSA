class Solution {
    // public int counter(int n){
    //     if(n < 1000) return 0;
    //     int length =(n+"").length();
    //     int remainder = length % 3;
    //     int questient = length/3;
    //     if(remainder == 0)return questient-1;
    //     return questient;
    // }
    public int countCommas(int n) {
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     count +=counter(i);
        // }
        if(n<1000)return 0;
        return n-999;
    }
}
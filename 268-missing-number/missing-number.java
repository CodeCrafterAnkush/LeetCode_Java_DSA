class Solution {
    public int missingNumber(int[] nums) {
        //method-1
        int n = nums.length;
        // int sum2=0;
        // int sum1 = (n*(n+1))/2;
        // for(int i=0;i<n;i++){
        //     sum2+=nums[i];
        // }
        // return sum1-sum2;

        // method-2
        int xor1 = 0;
        for(int i=1;i<=n;i++){
            xor1 ^= i;
        }
        int xor2=0;
        for(int i=0;i<n;i++){
            xor2 ^= nums[i];
        }
        return xor1 ^ xor2;
    }
}
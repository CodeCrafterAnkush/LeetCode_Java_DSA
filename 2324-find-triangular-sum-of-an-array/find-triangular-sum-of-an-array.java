class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        int n = nums.length;
        int ans =0;
        for(int i=1;i<=n;i++){
            int newN=n-i;
            for(int j=0;j<newN;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
            if(newN==1){
                ans = nums[0];
            }            
        }
        return ans;
    }
}
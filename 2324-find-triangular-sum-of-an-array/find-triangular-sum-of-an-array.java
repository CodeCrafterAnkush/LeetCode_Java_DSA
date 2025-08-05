class Solution {
    public int triangularSum(int[] nums) {
        // if(nums.length == 1)return nums[0];
        // if(nums.length == 2) return (nums[0]+nums[1])%10;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}
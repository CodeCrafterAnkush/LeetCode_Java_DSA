class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1)return 1;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx])
                maxIdx = i;
        }
        int maxVal = nums[maxIdx];
        int subArrCount =0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxVal){
                subArrCount++;
                maxLength = Math.max(subArrCount,maxLength);
            }else{
                subArrCount =0;
            }
        }
        return maxLength;
    }
}